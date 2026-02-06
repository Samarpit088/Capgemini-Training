package Regex;
// Validate a Hex Color Code
public class Q3 {
    public static void main(String[] args) {
        String[] colors = {"#FFA500","#ff4500","#123","#GGGGGG","FFA500"};
        for (String color : colors) {
            System.out.println(color + " → " + (isValidHexColor(color) ? "Valid" : "Invalid"));
        }
    }
    public static boolean isValidHexColor(String color) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        return color.matches(regex);
    }
}
