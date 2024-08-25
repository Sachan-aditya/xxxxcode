package master;
import java.util.Arrays;

class copy {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
      int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n + m];
        
        // Copy nums1 into merged
        for (int i = 0; i < n; i++) {
            merged[i] = nums1[i];
        }
        
        // Copy nums2 into merged
        for (int i = 0; i < m; i++) {
            merged[n + i] = nums2[i];
        }
        
        // Sort the merged array
        Arrays.sort(merged);
        
        // Find the median
        if ((n + m) % 2 == 0) {
            return (merged[(n + m) / 2 - 1] + merged[(n + m) / 2]) / 2.0;
        } else {
            return merged[(n + m) / 2];
        }
    }
}