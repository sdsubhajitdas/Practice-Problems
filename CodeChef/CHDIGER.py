# https://www.codechef.com/MARCH19B/problems/CHDIGER
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    2/3/2018
'''


def get_digits(n):
    return list(map(int, str(n)))


def get_new_n(n, d, remove):
    n_new = list(str(n)+str(d))
    n_new.remove(str(remove))
    n_new = ''.join(n_new)
    return int(n_new)


def main():
    for _ in range(int(input())):
        n, d = map(int, input().split())

        while True:
            digits = sorted(get_digits(n), reverse=True)
            remove = False
            for remove_digit in digits:
                n_new = get_new_n(n, d, remove_digit)
                if n_new < n:
                    n = n_new
                    remove = True
                    break
            if not remove:
                break

        print(n)


if __name__ == "__main__":
    main()
