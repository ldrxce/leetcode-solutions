class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet hashSet = new HashSet();

        for(int i=0; i < nums.length; i++ ){
            hashSet.add(nums[i]);
        }

        if(hashSet.size() != nums.length)
        return true;
        else return false;
    }
}