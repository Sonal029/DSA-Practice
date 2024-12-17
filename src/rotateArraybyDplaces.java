public class rotateArraybyDplaces {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,67,78,89};
        int d = 4;
        int[] ans = rotateArray(arr, d);
        int[] ansOptimised = rotateArrayOptimised(arr, d);
        for(int i=0;i<ans.length;i++){
           System.out.print(ans[i]+" ");
        }
        System.out.println();
    }

    public static int[] rotateArray(int[] arr, int d){
        int rotation = d% arr.length;
        int [] temp = new int[rotation];
        for(int i=0;i< rotation;i++){
            temp[i]=arr[i];
        }
        for(int i=rotation;i< arr.length;i++){
            arr[i-rotation] =arr[i];
        }
        for(int i=0;i<temp.length;i++){
            arr[rotation+i] =temp[i];
        }
        return arr;
    }
}
