import java.util.Scanner;
class PPAP{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        String in=scan.nextLine();
        int len=in.length();
        int second=in.indexOf(",");
        String obj1=in.substring(9,second);
        String obj2=in.substring(second+11,len);
        System.out.println("Uh! "+obj2+" "+obj1);
    }
}