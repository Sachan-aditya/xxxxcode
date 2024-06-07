package array;

class sort {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0; // Initialize counters to zero

        // Count the number of 0s, 1s, and 2s
        for (int i : nums) {
            if (i == 0) {
                zero++;
            } else if (i == 1) {
                one++;
            } else {
                two++;
            }
        }

        // Overwrite the array with the counted numbers
        int ind = 0;
        while (zero > 0) {
            nums[ind] = 0;
            ind++;
            zero--;
        }
        while (one > 0) {
            nums[ind] = 1;
            ind++;
            one--;
        }
        while (two > 0) {
            nums[ind] = 2;
            ind++;
            two--;
        }
    }
}
