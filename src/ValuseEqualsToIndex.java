import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValuseEqualsToIndex {
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>(Arrays.asList(1,21,3,11,4,52,6,74,8));
        List<Integer> ans =  valueEqualToIndex(value);
        for(Integer n: ans){
            System.out.print(n+" ");
        }
    }

    public static List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> ans = new ArrayList<>();
        int index = 1;
        for (Integer n : nums) {
            if (n == index) {
                ans.add(n);
            }
                index++;
        }
        return ans;
    }
}
