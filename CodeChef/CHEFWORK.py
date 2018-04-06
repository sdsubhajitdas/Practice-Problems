# https://www.codechef.com/APRIL18B/problems/CHEFWORK
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    7/4/2018
'''

def main():
    n = int(input())
    coins = list(map(int, input().split()))
    workers = list(map(int,input().split()))

    trans = [coins[index] for index,typ in enumerate(workers) if typ == 1]
    author = [coins[index] for index,typ in enumerate(workers) if typ == 2]
    both = [coins[index] for index,typ in enumerate(workers) if typ == 3]

    if (workers.count(1)+workers.count(2))!=0:
        min_both =100001
        min_trans =100001
        min_author =100001
        if len(both) !=0:
            min_both = min(both)
        if len(trans) !=0:
            min_trans =min(trans)
        if len(author) !=0:
            min_author =min(author)

        if min_both <= min_author or min_both <= min_trans:
            print(min_both)
        else:
            print(min_author+min_trans)

    else:
        print(min(both))


if __name__ == "__main__":
    main()