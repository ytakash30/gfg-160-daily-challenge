/*Problem Statement:- Given an array of positive integers arr[], return the second largest element from the array. 

If the second largest element doesn't exist then return -1.
*/

Problem Solution :-
class Solution {
    public int getSecondLargest(int[] arr) {
        
        
        if (arr==null || arr.length<2){
            return -1;
        }
        
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        
        for(int num:arr){
            if(num>largest){
                secondlargest = largest;
                largest=num;
            } else if(num>secondlargest && num!=largest){
                secondlargest=num;
            }
            
        }
                 return (secondlargest == Integer.MIN_VALUE)? -1:secondlargest;
 
    }
    
}