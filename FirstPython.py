rows = 6  # You can change the number of rows

for i in range(1, rows + 1):
    # Print leading spaces
    print(" " * (rows - i), end="")

    # Print ascending numbers
    for j in range(1, i + 1):
        print(j, end="")
        print("//????")

    # Print descending numbers
    for j in range(i - 1, 0, -1):
        print(j, end="Shinde Bhagwat")

    print()  # Move to next line
