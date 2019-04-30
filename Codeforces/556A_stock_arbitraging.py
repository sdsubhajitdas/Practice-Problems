# https://codeforces.com/contest/1150/problem/A
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    29/4/2019
'''


def main():
    n, m, r = map(int, input().split())
    s = list(map(int, input().split()))
    b = list(map(int, input().split()))

    min_s, max_b = min(s), max(b)

    if min_s >= max_b:
        print(r)
        return
    
    bought_count = r // min_s
    r = r - (bought_count * min_s)

    selling_price = bought_count * max_b
    r = r + selling_price

    print(r)
    
    

if __name__ == '__main__':
    main()
