# https://www.hackerearth.com/challenges/competitive/kotlin-a-thon-a-jetbrains-contest/algorithm/the-magical-stairs-bed325e7/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    12/05/2020
'''
import sys


def main():
    totalSteps = int(input())
    steps = list()
    for _ in range(totalSteps):
        steps.append(int(input()))
    dp = [None]*(totalSteps)
    dp[-1] = 0

    for index in range(totalSteps-2, -1, -1):
        #print(index)
        getMinimumEnergy(dp, steps, index, 0)

    print(dp[0])
    print(dp)


def getMinimumEnergy(dp: list, steps: list, idx: int, energySpent: int):
    # Out of bounds
    if(idx >= len(steps)):
        return sys.maxsize

    # Getting from DP table
    if dp[idx] != None:
        return dp[idx]

    minEnergy = sys.maxsize
    for jump in range(1, steps[idx]+1):
        if((idx+jump)>len(steps)):
            break
        minEnergy = min(minEnergy, getMinimumEnergy(dp, steps, idx+jump, energySpent+1))

    dp[idx] = minEnergy + 1
    return dp[idx]


if __name__ == "__main__":
    main()



# This solution was not accepted but I did the same solution in Java and it got accepted.

#JAVA SOLUTION THIS WAS ACCEPTED.
'''
import java.lang.Integer;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;



class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int totalSteps = s.nextInt();
        int steps[] = new int[totalSteps];

        for(int i=0; i<totalSteps; i++){
            steps[i] = s.nextInt();
        }
        
        int dp[] = new int[totalSteps];
        Arrays.fill(dp,-1);
        dp[totalSteps-1] = 0;

        for(int i=totalSteps-2; i>=0; i--){
            getMinimumEnergy(dp, steps, i, 0);
        }
        System.out.println(dp[0]);
    }

    public static int getMinimumEnergy(int dp[], int steps[], int idx, int energySpent){
        if(idx >= steps.length)
            return Integer.MAX_VALUE;

        if(dp[idx] != -1)
            return dp[idx];
        
        int minEnery = Integer.MAX_VALUE;

        for(int jump=1; jump<=steps[idx]; jump++){
            if((idx+jump)>=steps.length)
                break;
            minEnery = Math.min(minEnery, getMinimumEnergy(dp, steps, idx+jump, energySpent+1));
        }
        
        dp[idx] = minEnery + 1;
        return dp[idx];
    }
}

'''