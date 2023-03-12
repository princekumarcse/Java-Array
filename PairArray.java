public class PairArray{
    public static void Pair(int num[]){
        int totalPair=0;
        for(int i=0;i<num.length;i++){
            int current=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+current+","+num[j]+")"+" ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pair :" +totalPair);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14,16};
        Pair(num);
    }
}