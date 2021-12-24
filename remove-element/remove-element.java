class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i]= 100;
                c = c+1;
            }
        }
        Arrays.sort(nums);
        
        int k=0;
        k = nums.length-c;
        
        return k;
    }
}