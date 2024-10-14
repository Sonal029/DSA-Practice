public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("101"));
    }

    private static int binaryToDecimal(String number) {
        int n =0;
        int p=0;
        for(int i= number.length()-1;i>=0;i--){
            System.out.println("n = "+n);
            int bit = (number.charAt(i)-'0');
            System.out.println("bit "+bit);
            n=n+(bit*(int)Math.pow(2,p));
            p=p+1;
        }
        return n;
    }
}
