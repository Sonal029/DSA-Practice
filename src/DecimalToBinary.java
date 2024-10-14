public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Binary value is:  "+decimalToBinary(5));
    }

    private static String decimalToBinary(int i) {
        StringBuilder str= new StringBuilder();
        while(i>=1){
            if(i%2==0){
                str.append("0");
            }
            else{
                str.append("1");
            }
            i=i/2;
        }
        return (str.reverse().toString());
    }
}
