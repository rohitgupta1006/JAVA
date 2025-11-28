import cv2
import mediapipe as mp
import numpy as np

mp_drawing = mp.solutions.drawing_utils
mp_pose = mp.solutions.pose

# Helper function to calculate angle
def calculate_angle(a, b, c):
    a = np.array(a)
    b = np.array(b)
    c = np.array(c)

    radians = np.arctan2(c[1]-b[1], c[0]-b[0]) - np.arctan2(a[1]-b[1], a[0]-b[0])
    angle = np.abs(radians*180.0/np.pi)

    if angle > 180.0:
        angle = 360 - angle
    return angle

# Pose logic
def detect_pose(landmarks):
    l_shldr = [landmarks[mp_pose.PoseLandmark.LEFT_SHOULDER.value].x,
               landmarks[mp_pose.PoseLandmark.LEFT_SHOULDER.value].y]
    r_shldr = [landmarks[mp_pose.PoseLandmark.RIGHT_SHOULDER.value].x,
               landmarks[mp_pose.PoseLandmark.RIGHT_SHOULDER.value].y]
    l_hip = [landmarks[mp_pose.PoseLandmark.LEFT_HIP.value].x,
             landmarks[mp_pose.PoseLandmark.LEFT_HIP.value].y]
    r_hip = [landmarks[mp_pose.PoseLandmark.RIGHT_HIP.value].x,
             landmarks[mp_pose.PoseLandmark.RIGHT_HIP.value].y]
    l_knee = [landmarks[mp_pose.PoseLandmark.LEFT_KNEE.value].x,
              landmarks[mp_pose.PoseLandmark.LEFT_KNEE.value].y]
    r_knee = [landmarks[mp_pose.PoseLandmark.RIGHT_KNEE.value].x,
              landmarks[mp_pose.PoseLandmark.RIGHT_KNEE.value].y]
    l_ankle = [landmarks[mp_pose.PoseLandmark.LEFT_ANKLE.value].x,
               landmarks[mp_pose.PoseLandmark.LEFT_ANKLE.value].y]
    r_ankle = [landmarks[mp_pose.PoseLandmark.RIGHT_ANKLE.value].x,
               landmarks[mp_pose.PoseLandmark.RIGHT_ANKLE.value].y]

    # Y positions
    shldr_y = (l_shldr[1] + r_shldr[1]) / 2
    hip_y = (l_hip[1] + r_hip[1]) / 2
    knee_y = (l_knee[1] + r_knee[1]) / 2
    ankle_y = (l_ankle[1] + r_ankle[1]) / 2

    # Angles
    l_leg_angle = calculate_angle(l_hip, l_knee, l_ankle)
    r_leg_angle = calculate_angle(r_hip, r_knee, r_ankle)
    hip_angle = calculate_angle(l_shldr, l_hip, l_knee)

    # Pose classification
    if abs(shldr_y - hip_y) < 0.05 and abs(hip_y - knee_y) < 0.05:
        return "🛏 Sleeping / Shavasana"
    elif l_leg_angle < 110 and r_leg_angle < 110 and hip_y < knee_y:
        return "🏋️ Squat"
    elif l_leg_angle < 90 and r_leg_angle > 160:
        return "🌳 Vrikshasana"
    elif l_leg_angle > 160 and r_leg_angle > 160:
        if hip_y - knee_y < 0.05:
            return "🧘 Sitting / Sukhasana"
        elif ankle_y - hip_y > 0.2:
            return "🧍 Standing / Tadasana"
        else:
            return "🤷 Transition / Unknown"
    elif hip_angle < 90:
        return "💨 Kapalbhati / Forward Bend"
    else:
        return "🤷 Unknown / Transitioning"

# Open webcam
cap = cv2.VideoCapture(0)

with mp_pose.Pose(min_detection_confidence=0.6,
                  min_tracking_confidence=0.6) as pose:
    while cap.isOpened():
        ret, frame = cap.read()
        if not ret:
            break

        image = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
        image.flags.writeable = False
        results = pose.process(image)

        image.flags.writeable = True
        image = cv2.cvtColor(image, cv2.COLOR_RGB2BGR)

        try:
            landmarks = results.pose_landmarks.landmark
            pose_name = detect_pose(landmarks)
            cv2.putText(image, f'Pose: {pose_name}', (10, 40),
                        cv2.FONT_HERSHEY_SIMPLEX, 1.2, (0, 255, 0), 3, cv2.LINE_AA)
        except:
            pass

        mp_drawing.draw_landmarks(image, results.pose_landmarks, mp_pose.POSE_CONNECTIONS)
        cv2.imshow('Yoga Pose Detection', image)

        if cv2.waitKey(10) & 0xFF == ord('q'):
            break

cap.release()
cv2.destroyAllWindows()
