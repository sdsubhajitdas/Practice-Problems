# https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/06/2019
'''


def main():
    n = int(input())
    scores = list(map(int, input().strip().split()))
    up, down = 0, 0
    up_score, down_score = scores[0], scores[0]

    for score in scores[1:]:
        up_score, up = (score, up+1) if (score > up_score) else (up_score, up)
        down_score, down = (score, down+1) if (score <
                                               down_score) else (down_score, down)

    print(up,down)

if __name__ == "__main__":
    main()
