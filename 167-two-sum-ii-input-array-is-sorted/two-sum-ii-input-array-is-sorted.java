class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int front=0;
        int rear= numbers.length-1;

        while(front <= rear){
            int sum= numbers[front] + numbers[rear];

            if(sum > target){
                rear--;
            } else if (sum < target){
                front++;
            }else return new int [] {front+1, rear+1};
        }

        return new int [] {front+1, rear+1}; 
    }
}