package IMP;

public class Q6{
    public static void main(String[] args) {
        System.out.println(convert("apples",'a','p'));
    }
    public static String convert(String s,char ch1,char ch2){
        if(s==null || s.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch1) sb.append(ch2);
            else if(s.charAt(i)==ch2) sb.append(ch1);
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
