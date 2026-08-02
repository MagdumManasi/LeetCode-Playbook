class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
      int st=0;
      int e=numbers.length-1;

        while(st<e){
            if(numbers[st]+numbers[e]==target){
                return new int[]{st+1,e+1};
            }
            else if(numbers[st]+numbers[e]>target){
                e--;      
               
            }
            else if(numbers[st]+numbers[e]<target){
                st++;
            }

        }
    return new int[]{};
        
    }
}