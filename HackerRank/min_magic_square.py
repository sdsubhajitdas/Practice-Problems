# https://www.hackerrank.com/challenges/magic-square-forming/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/06/2019
'''

def main():
    s = list()
    for _ in range(3):
        s.extend(list(map(int,input().strip().split())))
    all_n = [
            [8, 1, 6, 3, 5, 7, 4, 9, 2],
            [6, 1, 8, 7, 5, 3, 2, 9, 4],
            [4, 9, 2, 3, 5, 7, 8, 1, 6],
            [2, 9, 4, 7, 5, 3, 6, 1, 8],
            [8, 3, 4, 1, 5, 9, 6, 7, 2],
            [4, 3, 8, 9, 5, 1, 2, 7, 6],
            [6, 7, 2, 1, 5, 9, 8, 3, 4],
            [2, 7, 6, 9, 5, 1, 4, 3, 8]
        ]
    
    min_cost = 1000

    for n in all_n:
        n_cost = sum([abs(si-ni) for si,ni in zip(s,n)])
        min_cost = min(min_cost,n_cost)
    
    print(min_cost)

        

if __name__ == "__main__":
    main()
