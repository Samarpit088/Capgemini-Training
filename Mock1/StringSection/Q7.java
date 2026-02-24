package Mock1.StringSection;
// Find the first repeated string
public class Q7 {
    public static void main(String[] args) {
        String[] arr = {"java","python","c++","java","c","python"};
        String s = "";
        for(int i=0;i<arr.length;i++){
            if(s.contains(arr[i])) {
                System.out.println(arr[i]);
                break;
            }
            s = s + arr[i];
        }
    }
}
