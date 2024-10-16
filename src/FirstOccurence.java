public class FirstOccurence {
    public static void main(String[] args) {
         System.out.println(strStr("a","a"));
    }

    public static int strStr(String haystack, String needle) {
          if(needle.length()>haystack.length()){
              return -1;
          }
        for(int i=0;i<=(haystack.length()-needle.length());i++){
            StringBuilder sb = new StringBuilder();
            System.out.println("i+needle.length()"+i+needle.length());
            for(int j=i;j<i+needle.length();j++){
                sb.append(haystack.charAt(j));
            }
            System.out.println(sb.toString());
            if(sb.toString().equals(needle)){
                return i;
            }
        }
            return -1;
    }
}
