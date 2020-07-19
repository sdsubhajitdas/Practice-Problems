# https://www.geeksforgeeks.org/replace-0-5-input-integer/
# https://www.geeksforgeeks.org/amazon-interview-experience-set-136-sde-t/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    19/07/2020
'''

# Function should return an integer value


def convertFive(n: int) -> int:
    copyN = n
    addExtra = 0
    decimalPlace = 1

    if(n == 0):
        return 5

    while(n != 0):
        if(n % 10 == 0):
            addExtra += 5*decimalPlace
        n = n//10
        decimalPlace *= 10

    return copyN + addExtra
