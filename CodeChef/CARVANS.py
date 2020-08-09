# Problem Link
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    DD/MM/2020
'''
import math


def main():
    for _ in range(int(input())):
        n = int(input())
        speeds = list(map(int,input().strip().split()))
        count = 0
        minSpeed = math.inf
        for speed in speeds:
            if(speed <= minSpeed):
                count += 1
                minSpeed = speed
        print(count)


if __name__ == "__main__":
    main()
