# https://www.hackerrank.com/challenges/migratory-birds/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    02/06/2019
'''

def main():
    n = int(input())
    bird_count = dict.fromkeys(range(1,6),0)
    array = list(map(int,input().strip().split()))
    for _ in array:
        bird_count[_] += 1
    
    bird_id = None
    birds = 0
    
    for i in range(1,6):
        if bird_count[i]>birds:
            bird_id = i
            birds = bird_count[i]
    
    print(bird_id)

if __name__ == "__main__":
    main()