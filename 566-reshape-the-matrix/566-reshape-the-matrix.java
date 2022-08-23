class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }
        int[][] rc = new int[r][c];
        int x = 0;
        int y = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rc[x][y] = mat[i][j];
                y++;
                if (y == c) {
                    x++;
                    y = 0;
                }
            }
        }
        return rc;
    }
}
