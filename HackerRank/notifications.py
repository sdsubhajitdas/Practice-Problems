# https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=sorting
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    26/06/2019
'''


def get_median(count: list, k: int) -> float:
    n = len(count)
    i = 0
    s = k//2
    while((s > 0)or(s>=0 and k%2==1)):
        s -= count[i]
        i += 1
    i -= 1
    if(k % 2 == 1):
        return i
    else:
        if(s <= -1):
            return i
        else:
            fi = i
            si = i+1
            while(count[si] == 0):
                si+=1
            return (fi+si)/2


def main():
    n, k = map(int, input().split())
    arr = list(map(int, input().strip().split()))
    count = [0]*201
    noti = 0
    for i in range(n):
        if(i < k):
            count[arr[i]] += 1
        else:
            median = 2*get_median(count, k)
            if(arr[i] >= median):
                noti += 1
            count[arr[i-k]] -= 1
            count[arr[i]] += 1

    print(noti)


if __name__ == "__main__":
    main()
