package IMP;
// String Transformation
public class Q2 {
    public static void main(String[] args) {
        String s = "abaabbcc";
        StringBuilder sb = new StringBuilder();
        for(char ch :s.toCharArray()){
            if(ch=='a'){
                sb.append('b');
            }else if(ch=='b'){
                sb.append('a');
            }else{
                sb.append((ch));
            }
        }
        System.out.println(sb);
    }
}
