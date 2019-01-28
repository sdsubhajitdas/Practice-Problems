# https://www.codechef.com/OCT18B/problems/MINDSUM
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
	28/1/2018
'''


def sum_digits(x):
    return sum(map(int, str(x)))


def main():
    for _ in range(int(input())):
        n, d = map(int, input().strip().split())

        que = [(n, 0)]
        min_track = dict()
        i = 0
        op_count = 0
        while len(que) != 0 and i <= 10000:
            i += 1
            n, op_count = que.pop(0)
            if n == 1:
                break
            if n > 1 and n <= 9:
                if n not in min_track.keys():
                    min_track[n] = op_count
                else:
                    min_track[n] = min(min_track[n], op_count)
            else:
                que.append((sum_digits(n), op_count+1))
            que.append((n+d, op_count+1))

        if n == 1:
            print(n, op_count)
        else:
            min_key = min(min_track.keys())
            print(min_key, min_track[min_key])


if __name__ == "__main__":
    main()
