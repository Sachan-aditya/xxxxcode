package master;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[arr1.length];
        int index = 0;

        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (map.containsKey(arr1[j]) && map.get(arr2[i]) == i) {
                    res[index++] = arr1[j];
                }
            }
        }

        Arrays.sort(arr1);

        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                res[index++] = arr1[i];
            }
        }

        return res;
    }
}
