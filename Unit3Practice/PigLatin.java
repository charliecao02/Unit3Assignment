class PigLatin{
    public static String main(String str){
        String newstr="";
        int len=str.length();
        int stop=0, start=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)==' ') {
                stop=i;
                if(Math.abs(start-stop)>1){
                    newstr+=str.substring(start+1,stop);
                    newstr+=str.substring(start,start+1);
                    newstr+="ay";
                }
                else newstr+=str.substring(start,start+1);
                newstr+=" ";
                i++;
                start=i;
            }
            if(i==len-1){
                stop=i;
                if(Math.abs(start-stop)>1){
                    newstr+=str.substring(start+1,stop);
                    newstr+=str.substring(start,start+1);
                    newstr+="ay";
                }
                else newstr+=str.substring(start,start+1);
            }
        }
        return newstr;
    }
}