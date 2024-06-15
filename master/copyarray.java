package master;
import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // Create a copy of the original heights array
        int[] sorted = Arrays.copyOf(heights, heights.length);
        
        // Sort the copied array
        Arrays.sort(sorted);
        
        int count = 0;
        
        // Compare original heights with the sorted heights
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                count++;
            }
        }
        
        // Return the count of positions where heights differ
        return count;
    }
}
