public class SecondLargestElement {
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{11,2,3,4,5,6,7,8,9,10}));
    }

    private static int secondLargest(int[] arr) {
        int largest =Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest =arr[i];
            }
        }
        return secondLargest;
    }
}
