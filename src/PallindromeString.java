public class PallindromeString {
    public static void main(String[] args) {
      if(isPallindrome("0P")){
          System.out.println("Pallindrome");
      }
      else{
          System.out.println("Not pallindrome");
      }
    }

    private static boolean isPallindrome(String s) {
        int n =s.length();
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122)||((int)s.charAt(i)>=48&&(int)s.charAt(i)<=57)){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
        int l=0;
        int r= sb.length()-1;
        while(l<r){
            if(sb.charAt(l)!=sb.charAt(r)){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }


}
