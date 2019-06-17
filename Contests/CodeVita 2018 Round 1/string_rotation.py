# https://www.programminggeek.in/2018/08/codevita-2018-round-1-question-string-rotation.html
'''
	Author - Subhajit Das
	University of Engineering and Management, Kolkata
    17/06/2019
'''


def left_rotation(word: str, mag: int):
    mag = mag % len(word)
    left = word[0:mag]
    right = word[mag:]
    return right + left


def right_rotation(word: str, mag: int):
    n = len(word)
    mag = mag % n
    left = word[0:n-mag]
    right = word[n-mag:]
    return right + left


def check_anagram(word: str, table: dict):
    for char in word:
        if table.get(char, -1) == -1:
            return False
        else:
            table[char] -= 1

    for key in table.keys():
        if table[key] != 0:
            return False

    return True


def main():
    word = input().lower()
    original = word
    n = int(input())
    query = list()
    for _ in range(n):
        side, mag = input().split()
        side = side.upper()
        mag = int(mag)
        query.append([side, mag])

    fcw = ''
    for side, mag in query:
        if side == 'R':
            word = right_rotation(word, mag)
        elif side == 'L':
            word = left_rotation(word, mag)
        fcw = fcw + word[0]

    fcw_dict = dict().fromkeys(fcw, 0)
    for char in fcw:
        fcw_dict[char] += 1
    fcw_len = len(fcw)

    flag = False
    for i in range(len(original)-fcw_len):
        sub_str = original[i:i+fcw_len]
        #print(sub_str)
        flag = check_anagram(sub_str, {**fcw_dict})
        if flag:
            break
    # print(fcw)
    # print(fcw_dict)
    print("YES" if flag else "NO")


if __name__ == "__main__":
    main()
