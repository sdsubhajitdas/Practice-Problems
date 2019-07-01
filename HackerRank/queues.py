# https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=stacks-queues
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/07/2019
'''


def main():
    que = list()
    for _ in range(int(input())):
        inp = input().strip()
        q, data = 0, 0
        if(len(inp) == 1):
            q = int(inp)
        else:
            q, data = map(int, inp.split(' '))

        if(q == 1):
            que.append(data)
        elif(q == 2):
            que.pop(0)
        else:
            print(que[0])


if __name__ == "__main__":
    main()
