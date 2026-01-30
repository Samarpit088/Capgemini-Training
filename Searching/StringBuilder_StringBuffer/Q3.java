package Searching.StringBuilder_StringBuffer;
//Concatenate Strings Efficiently Using StringBuffer
public class Q3 {
    public static void main(String[] args) {
        String[] arr = {"Java", " ", "is", " ", "awesome"};

        String result = concatenateStrings(arr);
        System.out.println(result);
    }
    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();

        for (String str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }
}
