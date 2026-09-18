class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet hashSet = new HashSet();

        List<Integer> ret = new ArrayList<>(); 

        for(int i=0; i < nums.length; i++)
            hashSet.add(nums[i]);

        for(int j=1; j <= nums.length; j++)
            if(!hashSet.contains(j))
                ret.add(j);

        
        return ret;
        
    }
}