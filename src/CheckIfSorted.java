public class CheckIfSorted {
    public static void main(String[] args) {
       Boolean ans = checkIfSorted(new int[]{91, 181,71,61,51,41,31,21});
       if(ans){
           System.out.println("Array is sorted");
       }
       else{
           System.out.println("Array is not sorted");
       }
    }

    private static boolean checkIfSorted(int[] arr) {
        boolean asc = false;
        boolean desc =false;
        boolean result = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                asc = true;
                break;
            }
            if(arr[i]<arr[i+1]){
                desc = true;
                break;
            }
        }

        if(asc){
            for(int i=1;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    result = false;
                }
            }
        }
        if(desc){
            for(int i=1;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    result = false;
                }
            }
        }
        return  result;
    }
}
