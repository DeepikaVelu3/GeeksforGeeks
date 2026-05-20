import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int nums[]) {

        Arrays.sort(nums);

        int n = nums.length;

        int r = -1;

        ArrayList<Integer> list = new ArrayList<>();

        // Find repeating number
        for (int i = 0; i < n - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                r = nums[i];
                break;
            }
        }

        // Find missing number
        int mis = -1;
        int expected = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] == expected) {
                expected++;
            }
            else if (nums[i] > expected) {
                mis = expected;
                break;
            }
        }

        // If missing number is n
        if (mis == -1) {
            mis = n;
        }

        list.add(r);
        list.add(mis);

        return list;
    }
}