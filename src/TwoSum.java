import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static int[] findTwoSumIndex(int[] arr, int target) {
        int n = arr.length;
       /*
        This is the brute force algorithm method
        */

        /*for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(target == arr[i]+arr[j]){
                    return new int[]{i, j};
                }
            }
        }*/

        /*
        this is the optimized code
        */
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]), i};
            }
            else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = new int[]{21, 71, 7, 3, 2};
        int target = 9;
        int res[] ;
        res = findTwoSumIndex(arr, target);
        System.out.println(res[0] + " " + res[1]);
    }

}
