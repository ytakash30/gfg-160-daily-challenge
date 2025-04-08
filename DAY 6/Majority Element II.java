/*Problem Statement:- You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format.
*/

Problem Solution :-
 
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int candidate1 = 0, candidate2 = 1, count1 = 0, count2 = 0;
        
        // First pass: Find potential candidates
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
            else if (count1 == 0) { candidate1 = num; count1 = 1; }
            else if (count2 == 0) { candidate2 = num; count2 = 1; }
            else { count1--; count2--; }
        }
        
        // Second pass: Verify candidates meet n/3 threshold
        count1 = 0; count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }
        
        if (count1 > nums.length/3) result.add(candidate1);
        if (count2 > nums.length/3) result.add(candidate2);
        
        Collections.sort(result); // Return in increasing order
        return result;
    }
}