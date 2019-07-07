# https://www.hackerrank.com/challenges/torque-and-development/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    07/07/2019
'''


def DFS(start: int, graph: dict, visited: list) -> int:
    visited[start] = True
    count = 0
    for child in graph[start]:
        if(not visited[child]):
            count += DFS(child, graph, visited)
    return 1+count


def main():
    for _ in range(int(input())):
        cities, roads, clib, croad = map(int, input().split())
        graph = {i: list() for i in range(1, cities+1)}
        for _ in range(roads):
            u, v = map(int, input().split())
            graph[u].append(v)
            graph[v].append(u)

        # Special Case
        if(clib <= croad):
            print(cities*clib)
            continue

        visited = [False]*(cities+1)
        ccount = list()
        for node in range(1, cities+1):
            if(not visited[node]):
                ccount.append(DFS(node, graph, visited))
        
        cost = 0
        for c in ccount:
            cost += (c-1)*croad + clib
        
        print(cost)


if __name__ == "__main__":
    main()
