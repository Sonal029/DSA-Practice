public class Swap2Numbers {
    public static void main(String[] args) {

        swap(87,98);
    }

    private static void swap(int a , int b){
        a = a^b;
        b=a^b;
        a=a^b;

        System.out.println("A = "+a);
        System.out.println("B = "+b);
    }
}
