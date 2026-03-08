package IMP;
// Calculate and return the total number of carries generated while adding digits of two numbers 'num1' and 'num2'.
public class Q10 {
    public static void main(String[] args) {
        int num1 = 451;
        int num2 = 349;
        System.out.println(countCarries(num1,num2));
    }
    public static int countCarries(int num1,int num2){
        int carry = 0, count = 0;
        while(num1 > 0 || num2 > 0){
            carry = (num1 % 10 + num2 % 10 + carry) / 10;
            if(carry > 0) count++;
            num1 /= 10;
            num2 /= 10;
        }
        return count;
    }
}
