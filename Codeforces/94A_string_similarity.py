# Problem Link
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    DD/MM/2020
'''

def main():
    for _ in range(int(input())):
        n = int(input().strip())
        binary = input().strip()
        output = ""

        for idx in range(0,len(binary),2):
            output+= binary[idx]
        print(output[:n])

if __name__ == "__main__":
    main()