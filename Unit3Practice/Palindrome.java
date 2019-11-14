import java.util.Scanner;
class Palindrome{
    public static void main(){
        Scanner scan=new Scanner(System.in);
        String in=scan.nextLine();
        String newstr="";
        int len=in.length();
        for(int i=0;i<len;i++){
            if(in.charAt(i)>=65 && in.charAt(i)<=90){
                newstr+=in.charAt(i);
            }
            if(in.charAt(i)>=97 && in.charAt(i)<=122){
                newstr+=in.charAt(i);
            }
        }
        int newlen=newstr.length();
        newstr=newstr.toLowerCase();
        String reverse="";
        for(int i=newlen-1;i>=newlen-newlen/2;i--){
            reverse+=newstr.charAt(i);
        }
        if(reverse.equals(newstr.substring(0,newlen/2))){
            System.out.print("yes");
        }
        else System.out.print("yesn't");
    }
}