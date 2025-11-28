import csv
class InvalidArrayError(Exception):
    def __init__(self, message="The 2D array is not valid."):
        self.message = message
        super().__init__(self.message)

array_2d = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

try:
    row_length = len(array_2d[0])
    for row in array_2d:
        if len(row) != row_length:
            raise InvalidArrayError("All rows must be of equal length!")

    with open("array_output.csv", "w", newline='') as file:
        writer = csv.writer(file)
        writer.writerows(array_2d)
    print("✅ Data written to array_output.csv")

    with open("array_output.csv", "r") as file:
        reader = csv.reader(file)
        print("✅ Data read from array_output.csv:")
        for row in reader:
            print(row)

except InvalidArrayError as e:
    print("❌ Custom Exception:", e)

except Exception as e:
    print("❌ General Error:", e)
