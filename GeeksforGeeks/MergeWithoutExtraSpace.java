// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/08/2021
*/

//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int gap = arr1.length+arr2.length;

        for(gap = calculateNextGap(gap); gap>0; gap=calculateNextGap(gap)) {
            // System.out.println("Current Gap: "+gap);
            int offSet = 0;
            while(gap+offSet < (arr1.length + arr2.length)) {
                int currentIdx = gap+offSet;
                // System.out.println("\tOffset: "+offSet);

                while(currentIdx-gap>=0) {
                    int swapIdx = currentIdx-gap;
                    // System.out.println("\t\tSwap Index: "+swapIdx+", Current Index: "+currentIdx);

                    long num = currentIdx<arr1.length ? arr1[currentIdx] : arr2[currentIdx-arr1.length];
                    long leftNum = swapIdx<arr1.length ? arr1[swapIdx] : arr2[swapIdx-arr1.length];

                    // System.out.println("\t\tLeft Num: "+leftNum+", Num: "+num);

                    if(leftNum > num) {
                        long a[] = swapIdx<arr1.length ? arr1 : arr2;
                        long b[] = currentIdx<arr1.length ? arr1 : arr2;
                        int idx1 = swapIdx>=a.length ? swapIdx-a.length : swapIdx;
                        int idx2 = currentIdx>=a.length ? currentIdx-a.length: currentIdx;

                        // System.out.println("\t\t  Swapped indices between ("+idx1+","+idx2+")");

                        swapElementsBetweenArrays(idx1, idx2, a, b);
                        // System.out.println("  1st Array: "+Arrays.toString(arr1));
                        // System.out.println("  2nd Array: "+Arrays.toString(arr2));
                    }
                    currentIdx = swapIdx;
                }
                offSet++;
            }
            // System.out.println("  1st Array: "+Arrays.toString(arr1));
            // System.out.println("  2nd Array: "+Arrays.toString(arr2));
        }
    }

    private static void swapElementsBetweenArrays(int idx1, int idx2, long arr1[], long arr2[]) {
        // System.out.println("\t\t  A length: "+arr1.length);
        // System.out.println("\t\t  B length: "+arr2.length);
        long temp = arr1[idx1];
        arr1[idx1] = arr2[idx2];
        arr2[idx2] = temp;
    }

    private static int calculateNextGap(int gap) {
        if(gap<=1) return 0;
        return (int)Math.ceil((double)gap/2);
    }
}

