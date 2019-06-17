# https://www.programminggeek.in/2018/08/codevita-2018-round-1-question-bank-compare.html
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    17/06/2019
'''


def get_emi(p: float, r: float, t: float) -> float:
    r = r/1200
    #r12 = (1+r)**(12*t)
    return (p * r / (1 - 1 / (1 + r) ** (t * 12)))


def get_amt(p: float, rates: list, t: float) -> float:
    amt = 0
    while (len(rates) != 0):
        s, r = rates[0]
        emi = get_emi(p, r, t)
        amt += (emi * s)
        rates.pop(0)
    return amt


def main():
    p = float(input())
    t = int(input())
    n1 = int(input())
    a = list()
    for _ in range(n1):
        a.append(list(map(float, input().strip().split())))
    n2 = int(input())
    b = list()
    for _ in range(n1):
        b.append(list(map(float, input().strip().split())))

    bankA = get_amt(p, a, t)
    bankB = get_amt(p, b, t)

    #print(bankA)
    #print(bankB)
    print('Bank B' if (bankA > bankB) else 'Bank A')


if __name__ == "__main__":
    main()
