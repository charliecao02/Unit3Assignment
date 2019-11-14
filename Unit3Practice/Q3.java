import java.util.Scanner;
class Q3{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        long num=scan.nextLong();
        long i=num;
        String result="";
        while(num>0){
            result+=(num%2);
            num=num/2;
        }
        String reverse="";
        int len=result.length();
        for(int i1=len-1;i1>=0;i1--){
            reverse+=result.charAt(i1);
        }
        System.out.print(reverse);
    }
}