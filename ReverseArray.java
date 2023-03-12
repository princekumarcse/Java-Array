public class ReverseArray{
    public static void reverse(int num[]){
        int n=num.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    } 
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14};
        reverse(num);
    }
}


