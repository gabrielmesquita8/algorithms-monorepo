package easyLevel;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> array = new HashSet(); 

        for(int i = 0; i < nums.length; i++) {
            if(array.contains(nums[i])) {
                return true; 
            } 
            array.add(nums[i]);
        }
        return false;
    }
}