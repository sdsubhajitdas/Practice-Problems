# https://practice.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates/0/?track=sp-recursion&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    11/07/2019
'''


def remove_duplicates(s: str, i: int):
    n = len(s)
    if(n == 1):
        return s
    if(i == n-1):
        return s[i] if(s[i] != s[i-1]) else ""
    if(i >= n):
        return ""

    add = ""
    if(s[i] != s[i+1]):
        add = s[i]
    if(i > 0 and s[i-1] == s[i]):
        add = ""
    return add + remove_duplicates(s, i+1)


def main():
    for _ in range(int(input())):
        s = input()
        s_new = remove_duplicates(s, 0)

        while(len(s) != len(s_new)):
            s = s_new
            s_new = remove_duplicates(s, 0)

        print(s_new)


if __name__ == "__main__":
    main()
