# https://practice.geeksforgeeks.org/problems/print-pattern/0/?track=sp-recursion&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    11/07/2019
'''


def get_pattern(res: list, i: int):
    res.append(i)
    if(i>0):
        get_pattern(res,i-5)


def main():
    for _ in range(int(input())):
        n = int(input())
        result = list()
        get_pattern(result,n)
        result = result + result[:-1][::-1]
        print(*result)


if __name__ == "__main__":
    main()
