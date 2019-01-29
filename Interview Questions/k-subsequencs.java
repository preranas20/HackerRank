//K-Subsequence
/*
8


10
Given a sequence of n positive integers we need to count consecutive sub-sequences whose sum is divisible by k.

Constraints : N is up to 10^6 and each element up to 10^9 and K is up to 100

EXAMPLE : Let N=5 and K=3 and array be 1 2 3 4 1

Here answer is 4

Explanation : there exists, 4 sub-sequences whose sum is divisible by 3, they are

3
1 2
1 2 3
2 3 4

*/
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[]{5,10,11,9,5};
		int k = 10;
		long result = kSub(k,nums);
		System.out.println(result);
	}

	private static long kSub(int k, int[] nums) {
		// TODO Auto-generated method stub
		
        long count = 0;
        for(int i=0;i<nums.length;i++){
            int total = 0;
            for(int j=i;j<nums.length;j++){
                total=nums[j]+total;
                 if(total%k == 0)
                   count++;
                
            }
        }
		return count;
	}

}
