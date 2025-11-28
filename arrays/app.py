import streamlit as st
import openai
import os
from dotenv import load_dotenv
from PIL import Image

# Load API key
load_dotenv()
openai.api_key = os.getenv("OPENAI_API_KEY")

# Page settings
st.set_page_config(page_title="AI ChatGPT Clone", layout="wide")
st.title("🤖 ChatGPT Clone with Image Support")

# Session state for chat history
if "messages" not in st.session_state:
    st.session_state.messages = []

# Chat container
chat_container = st.container()

# Show previous messages
with chat_container:
    for message in st.session_state.messages:
        with st.chat_message(message["role"]):
            st.markdown(message["content"])
            if "image" in message:
                st.image(message["image"], caption="Uploaded Image", use_column_width=True)

# Input field
prompt = st.chat_input("Type your message...")

# Image uploader
uploaded_images = st.file_uploader("Upload image(s) if needed", type=["jpg", "jpeg", "png"], accept_multiple_files=True)

# When user sends a message
if prompt:
    st.session_state.messages.append({"role": "user", "content": prompt})
    
    # Save images
    image_paths = []
    if uploaded_images:
        for img_file in uploaded_images:
            img = Image.open(img_file)
            image_paths.append(img)
            st.session_state.messages[-1]["image"] = img

    # Construct the message history for GPT
    messages_for_gpt = [{"role": m["role"], "content": m["content"]} for m in st.session_state.messages]

    # Get GPT response
    with st.spinner("Thinking..."):
        try:
            response = openai.ChatCompletion.create(
                model="gpt-3.5-turbo",  # or gpt-4 if you have access
                messages=messages_for_gpt
            )
            reply = response.choices[0].message["content"]
        except Exception as e:
            reply = f"❌ Error: {str(e)}"

    # Show assistant response
    st.session_state.messages.append({"role": "assistant", "content": reply})
    with st.chat_message("assistant"):
        st.markdown(reply)
