class MissingNumber{
    public static int missingNumber(int [] nums){
        int n=nums.length;
        int numSum=0;
        int total=0;
            for(int num : nums){
                   numSum+=num;
            }
            for(int i=0;i<n+1;i++){
                total+=i;
            }
            return total-numSum;
        
    }
    public static void main(String[] args){
       int[]  num= {9,6,4,2,3,5,7,0,1};
           System.out.print(missingNumber(num));
      
    }
}