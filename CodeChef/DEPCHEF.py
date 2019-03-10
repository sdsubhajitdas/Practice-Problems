# https://www.codechef.com/FEB19B/problems/DEPCHEF
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    3/2/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        attack = list(map(int, input().strip().split()))
        defense = list(map(int, input().strip().split()))

        max_def = -1

        for i in range(n):
            case_left, case_right, case_both = 0, 0, 0
            if i == 0:
                case_left = defense[i] - attack[-1]
                case_right = defense[i] - attack[i+1]
                case_both = defense[i] - attack[-1] - attack[i+1]
            elif i == n-1:
                case_left = defense[i] - attack[i-1]
                case_right = defense[i] - attack[0]
                case_both = defense[i] - attack[i-1] - attack[0]
            else:
                case_left = defense[i] - attack[i-1]
                case_right = defense[i] - attack[i+1]
                case_both = defense[i] - attack[i-1] - attack[i+1]

            if case_left > 0 and case_both > 0 and case_right > 0:
                max_def = max(max_def, defense[i])

        print(max_def)


if __name__ == "__main__":
    main()
