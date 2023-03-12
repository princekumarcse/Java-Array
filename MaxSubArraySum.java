public class MaxSubArraySum{
    public static void SumOfMaxSubArray(int num[]){
        int currSum=0, MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum += num[k];
                }
                System.out.print(currSum);
                if(currSum>MaxSum){
                    MaxSum=currSum;
                }
                System.out.println();
            }
        }
System.out.println("Max Sum of SubArray = "+MaxSum);
    }
    public static void main(String args[]){
        int num[]={1,-2,6,-1,3};
        SumOfMaxSubArray(num);
    }
}