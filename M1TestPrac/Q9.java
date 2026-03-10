package M1TestPrac;
// Caesar Cipher
public class Q9 {
    public static void main(String[] args) {
        String s = "nrfzh";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = ch + 3;
            if(ascii>122){
                int newAscii = ascii-122;
                ch = (char)(97+newAscii-1);
                sb.append(ch);
            }
            else{
                sb.append((char)ascii);
            }

        }
        System.out.println(sb.toString());
    }
}
