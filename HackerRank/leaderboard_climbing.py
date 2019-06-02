# https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    02/06/2019
'''


def main():
    n = int(input())
    scores = sorted(list(set(map(int, input().strip().split()))), reverse=True)
    m = int(input())
    alice = list(map(int, input().strip().split()))

    for score in alice:
        low, high = 0, len(scores)-1
        mid = 0
        if score < scores[-1]:
            print(high+2)
            continue
        elif score == scores[-1]:
            print(high+1)
            continue
            print(1)
            continue
        else:
            pos = 0
            while(low <= high):
                mid = (high+low)//2
                if scores[mid] > score:
                    low = mid+1
                    pos = low
                elif scores[mid] < score:
                    high = mid-1
                    pos = mid
                else:
                    pos = mid
                    break
        print(pos+1 if pos != 0 else 1)


if __name__ == "__main__":
    main()
