public class PrintSubArray{
    public static void SubArray(int num[]){
        int totalSubArray=0;
    for(int i=0;i<num.length;i++){
        int start=i;
        for(int j=i;j<num.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print(num[k]+" ");
                totalSubArray++;
            }
            System.out.println();
        }
        System.out.println();
    }
    System.out.print("Total Number of SubArray: "+totalSubArray);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14,16};
        SubArray(num);
    }
}