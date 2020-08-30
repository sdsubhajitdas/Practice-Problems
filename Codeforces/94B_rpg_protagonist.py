# https://codeforces.com/contest/1400/problem/B
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/08/2020
'''


def main():
    myCapacity, folCapacity = map(int, input().strip().split())
    #   33          27
    swords, axes = map(int, input().strip().split())
    #  6     10
    swordWeight, axeWeight = map(int, input().strip().split())
    #    5           6

    if(swordWeight > axeWeight):
        swordWeight, axeWeight = axeWeight, swordWeight
        swords, axes = axes, swords

    maxWeapons = 0
    for takenSword in range(swords+1):
        if(takenSword*swordWeight > myCapacity):
            continue
        folTakenSword = min(swords-takenSword, folCapacity//swordWeight)

        leftMyCapacity = myCapacity - swordWeight*takenSword
        leftFolCapacity = folCapacity - swordWeight*folTakenSword

        takenAxe = min(leftMyCapacity//axeWeight, axes)
        folTakenAxe = min(leftFolCapacity//axeWeight, axes - takenAxe)

        maxWeapons = max(maxWeapons, takenSword+folTakenSword+takenAxe+folTakenAxe)
    
    print(maxWeapons)

if __name__ == "__main__":
    for _ in range(int(input())):
        main()
    # main()
