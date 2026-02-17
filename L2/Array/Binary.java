class Binary{
    public static int bSearch(int[] nums, int target) {
        int left =0;
        int right = nums.length -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
                }
            else
            { 
                right = mid-1;
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,6,7,9,11,10};
        int target = 7;
        System.out.println(bSearch(nums,target));
    }
}