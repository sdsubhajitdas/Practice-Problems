# https://www.hackerrank.com/challenges/find-the-nearest-clone/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=graphs
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    07/07/2019
'''
import sys


def BFS(nodes: int, graph: dict, start: int, dest: int) -> int:
    que = list()
    que.append([start, 0])
    visted = [False]*(nodes+1)
    visted[0] = None

    while(len(que) != 0):
        node, dis = que.pop(0)
        visted[node] = True
        if(node == dest):
            return dis
        for child in graph[node]:
            if(not visted[child]):
                que.append([child, dis+1])

    return sys.maxsize


def main():
    nodes, edges = map(int, input().split())
    graph = {i: list() for i in range(1, nodes+1)}
    for _ in range(edges):
        u, v = map(int, input().split())
        graph[u].append(v)
        graph[v].append(u)
    colors = list(map(int, input().split()))
    find = int(input())

    count = colors.count(find)
    if(count <= 1):
        print(-1)
        return

    min_dis = sys.maxsize
    for i in range(nodes):
        for j in range(i+1, nodes):
            if(colors[i] == colors[j]):
                start = i+1
                des = j+1
                min_dis = min(min_dis, BFS(nodes, graph, start, des))
    
    print(min_dis)


if __name__ == "__main__":
    main()
