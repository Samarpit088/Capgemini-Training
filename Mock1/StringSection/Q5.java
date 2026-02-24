package Mock1.StringSection;
// Toggle Case by Index
public class Q5 {
    public static void main(String[] args) {
        String s = "java programming";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb.append(Character.toUpperCase(s.charAt(i)));
                continue;
            }
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
        System.out.println(sb.toString());
    }
}
