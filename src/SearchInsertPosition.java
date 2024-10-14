public class SearchInsertPosition {
    public static void main(String[] args) {
        int target =90;
        int [] arr = {1,2,3,4,5,67,78,89};
        System.out.println(insertPosition(arr, target));
    }

    private static int insertPosition(int[] arr, int target) {
        int left = 0;
        int mid = 0;
        int right=arr.length-1;
        while(left<=right){
            mid = left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else if(arr[mid]>target){
                right = mid-1;
            }
        }
        return left;
    }
}
