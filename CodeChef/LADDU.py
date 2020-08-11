# https://www.codechef.com/LRNDSA01/problems/LADDU
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    11/08/2020
'''


def main():
    for _ in range(int(input())):
        totalInstructions, divideBy = input().strip().split()
        totalInstructions = int(totalInstructions)
        divideBy = 200 if(divideBy == "INDIAN") else 400
        score = 0
        for _ in range(totalInstructions):
            inp = input().strip()

            if(inp.startswith("CONTEST_WON")):
                rank = int(inp.split()[-1])
                score += 300
                score += 0 if(rank>20) else (20-rank)
            elif(inp.startswith("TOP_CONTRIBUTOR")):
                score += 300
            elif(inp.startswith("BUG_FOUND")):
                severity = int(inp.split()[-1])
                score += severity
            elif(inp.startswith("CONTEST_HOSTED")):
                score += 50
        print(score//divideBy)
        
            
            



if __name__ == "__main__":
    main()
