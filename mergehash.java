class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Create a hashmap to store the indices of elements in arr2
        Map<Integer, Integer> map = new HashMap<>();
        // Create a result array to store the sorted elements
        int[] res = new int[arr1.length];
        // Initialize an index variable to keep track of the current position in the result array
        int index = 0;

        // Populate the hashmap with elements from arr2 and their indices
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        // Iterate through arr2 and find the corresponding elements in arr1
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                // Check if the current element in arr1 is present in the hashmap and its index matches the current index in arr2
                if (map.containsKey(arr1[j]) && map.get(arr2[i]) == i) {
                    // Add the element to the result array
                    res[index++] = arr1[j];
                }
            }
        }

        // Sort the remaining elements in arr1 that are not present in arr2
        Arrays.sort(arr1);

        // Iterate through the sorted arr1 and add the elements that are not present in the hashmap to the result array
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                res[index++] = arr1[i];
            }
        }

        // Return the result array
        return res;
    }
}