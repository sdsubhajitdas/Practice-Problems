# https://practice.geeksforgeeks.org/problems/maximum-sum-increasing-subsequence/0/?track=sp-dynamic-programming&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/07/2019
'''
from collections import OrderedDict


class FenwickTree:
    def __init__(self, l: int, arr: list = None):
        self.l = l
        self.tree = [0]*(l+1)

        if arr:
            self._construct(arr)

    def get_sum(self, idx: int) -> int:
        s = 0
        idx += 1
        while(idx > 0):
            s = max(self.tree[idx], s)
            idx -= idx & (-idx)
        return s

    def update(self, idx: int, val: int):
        idx += 1

        while(idx <= self.l):
            self.tree[idx] = max(self.tree[idx], val)
            idx += idx & (-idx)

    def _construct(self, arr: list):
        for idx, ai in enumerate(arr):
            self.update(idx, ai)


def main2():
    for _ in range(int(input())):
        n = int(input())
        val = list(map(int, input().split()))

        if(n == 1):
            print(val[0])
            continue

        idx = dict().fromkeys(sorted(val), 0)
        idx = OrderedDict(sorted(idx.items()))

        new_i = 0
        for key, _ in idx.items():
            new_i += 1
            idx[key] = new_i

        bit = FenwickTree(n)
        for i in range(n):
            max_sum = bit.get_sum(idx[val[i]]-1)
            bit.update(idx[val[i]]-1, val[i]+max_sum)

        print(max(bit.tree))


def main():
    for _ in range(int(input())):
        n = int(input())
        val = list(map(int, input().split()))
        dp = val[::]
        m = val[0]

        j = 1
        while(j < n):
            for i in range(0, j):
                if(val[i] < val[j]):
                    dp[j] = max(dp[j], val[j]+dp[i])
            m = max(m, dp[j])
            j += 1

        print(m)


if __name__ == "__main__":
    main()
