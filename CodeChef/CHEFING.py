# https://www.codechef.com/FEB19B/problems/CHEFING
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    3/2/2018
'''


def in_array(arr, ch):
    for st in arr:
        if ch not in st:
            return False
    return True


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list()
        total_set = set()
        for _ in range(n):
            s = input()
            arr.append(s)
            total_set = total_set.union(set(s))
        special_count = 0
        for ch in total_set:
            if in_array(arr, ch):
                special_count += 1
        
        print(special_count)


if __name__ == "__main__":
    main()
