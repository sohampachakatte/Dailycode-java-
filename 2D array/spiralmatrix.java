public class spiralmatrix {
    public static void printSprialMatix(int matrix[][]) {

        int startrow = 0, startcol = 0;
        int endrow = matrix.length - 1, endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            // bottom
            for (int k = endcol - 1; k >= startcol; k--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][k] + " ");
            }

            // left
            for (int m = endrow - 1; m >= startrow + 1; m--) {
                if (endcol == startcol) {
                    break;
                }
                System.out.print(matrix[m][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 },
        };

        printSprialMatix(matrix);
    }
}
