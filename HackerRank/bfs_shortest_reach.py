# https://www.hackerrank.com/challenges/bfsshortreach/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    07/07/2019
'''


def main():
    for _ in range(int(input())):
        nodes, edges = map(int, input().split())
        graph = {i: list() for i in range(1, nodes+1)}
        for _ in range(edges):
            u, v = map(int, input().split())
            graph[u].append(v)
            graph[v].append(u)
        start = int(input())

        distance = [-1]*(nodes+1)
        que = [start]
        distance[start] = 0

        while(len(que) != 0):
            node = que.pop(0)
            for child in graph[node]:
                if(distance[child] == -1):
                    que.append(child)
                    distance[child] = distance[node] + 1

        for i in range(1, nodes+1):
            if(i == start):
                continue
            if(distance[i] == -1):
                print(-1, end=' ')
                continue
            print(distance[i]*6, end=' ')
        print()


if __name__ == "__main__":
    main()
