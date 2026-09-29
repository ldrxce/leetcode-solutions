class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List <List <Integer>> solution = new LinkedList();

        for(int i=0; i<nums.length-2; i++){
            if (i==0 || (i>0 && nums[i] != nums[i-1])){
                int front=i+1;
                int rear= nums.length-1;
                int sum= 0-nums[i];

                while (front < rear){
                    if (nums[front]+nums[rear] == sum){
                        solution.add(Arrays.asList(nums[i], nums[front], nums[rear]));
                    
                    while (front < rear && nums[front] == nums[front+1]) front++;
                    while (front < rear && nums[rear] == nums[rear-1]) rear--;

                    front++;
                    rear--;
                    }
                     else if(nums[front]+nums[rear] > sum){
                        rear--;
                    } else front++;
                    
                }
            }
        }
    return solution;
    }
}