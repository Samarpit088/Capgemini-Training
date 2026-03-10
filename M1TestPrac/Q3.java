package M1TestPrac;

public class Q3 {
    public static void main(String[] args) {
        String s = "11101111011111";
        int i=0;
        int c=0;
        while(i<s.length()){
            if(s.charAt(i)=='0'){
                System.out.print((char)('A'+(c-1)));
                c=0;
            }
            else{
                c++;
            }
            i++;
        }
        if(c!=0){
            System.out.print((char)('A'+(c-1)));
        }
    }
}
