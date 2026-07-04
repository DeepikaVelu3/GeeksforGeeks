class Solution {

    // Counts how many students are needed if each can take at most 'mid' pages
    public int countStudents(int[] arr, long mid) {
        int students = 1;
        int totalPages = 0;
        for (int x : arr) {
            if (totalPages + x <= mid) {
                totalPages += x;
            } else {
                students++;
                totalPages = x;
            }
        }
        return students;
    }

    public int findPages(int[] arr, int k) {
        if (k > arr.length) {
            return -1;
        }

        long low = 0;
        long high = 0;
        for (int x : arr) {
            low = Math.max(low, x);   // at least the max single book
            high += x;                // all books to one student
        }

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (countStudents(arr, mid) > k) {
                // Need more students than available → increase max pages per student
                low = mid + 1;
            } else {
                // Can fit in k students → try smaller max
                high = mid - 1;
            }
        }

        return (int)low;
    }
}