import java.math.BigInteger;

public class AddTwoBinary {
    public static void main(String[] args) {
      String a=  "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
       String b=  "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
       System.out.println(addBinary(a,b));
        }
        public static String addBinary(String a, String b) {
            BigInteger num1 = new BigInteger(a, 2);
            BigInteger num2 = new BigInteger(b, 2);
            BigInteger sum = num1.add(num2);

           return(sum.toString(2));
    }
}
