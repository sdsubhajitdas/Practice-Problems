# https://www.codechef.com/problems/VK18
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    25/1/2019
    Satus - Partial
'''


def get_diamonds(room):
    odd, even = 0, 0
    for i in str(room):
        if int(i) % 2 == 0:
            even += int(i)
        else:
            odd += int(i)
    return abs(even-odd)


def main():
    n_list = []
    for _ in range(int(input())):
        n_list.append(int(input()))
    n_max = max(n_list)+1
    table = [0]
    s = 2
    for n in range(1, n_max):
        dias = table[n-1] + s+s - get_diamonds(n+n)
        table.append(dias)
        s += get_diamonds(n+n+1) + get_diamonds(n+n+2) - get_diamonds(n+1)

    for n in n_list:
        print(table[n])


if __name__ == "__main__":
    main()
