# https://www.codechef.com/AUG19B/problems/MSNSADM1
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    04/08/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        goals = list(map(int, input().strip().split()))
        fouls = list(map(int, input().strip().split()))
        results = [max(0, ((goal*20)-(foul*10)))
                   for goal, foul in zip(goals, fouls)]
        print(max(results))


if __name__ == "__main__":
    main()
