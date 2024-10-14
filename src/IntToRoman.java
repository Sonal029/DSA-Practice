public class IntToRoman {
    public static void main(String[] args) {
        intToRoman("XLIV");
    }

    private static void intToRoman(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'V') {
                    sum = sum - 1;
                } else {
                    sum = sum + 1;
                }
            }
            if (s.charAt(i) == 'X') {
                if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                    sum = sum - 10;
                } else {
                    sum = sum + 10;
                }
            }
            if (s.charAt(i) == 'C') {
                if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                    sum = sum - 100;
                } else {
                    sum = sum + 100;
                }
            }
            if (s.charAt(i) == 'V') {
                sum = sum + 5;
            }
            if (s.charAt(i) == 'M') {
                sum = sum + 1000;
            }
            if (s.charAt(i) == 'D') {
                sum = sum + 500;
            }
            if (s.charAt(i) == 'L') {
                sum = sum + 50;
            }

        }
        System.out.println(sum);
    }
}
