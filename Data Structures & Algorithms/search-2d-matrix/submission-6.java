class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        int mid;

        // Find the candidate row
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == matrix[mid][0]) {
                return true;
            } else if (target > matrix[mid][0]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // The candidate row is end
        int row = end;

        if (row < 0) {
            return false;
        }

        // Binary search within the selected row
        start = 0;
        end = matrix[row].length - 1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == matrix[row][mid]) {
                return true;
            } else if (target > matrix[row][mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
