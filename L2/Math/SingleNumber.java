import java.util.*;
class SingleNumber{
    public static int singleNumber(int [] nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
             }
             else{
                set.remove(nums[i]);
             }
        }
        Iterator<Integer> it=set.iterator();

        return it.next();

    }
    public static void main(String[] args){
        int [] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}