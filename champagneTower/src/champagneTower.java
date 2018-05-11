public class champagneTower {


    public static void main(String[] args) {


        final double[][] A = new double[5][5];
        System.out.println("Hello World!"); // Display the string.

       System.out.print(champagneTower(4.0,2,1,A));

        for(int r=0; r<A.length; r++) {
            for(int c=0; c<A[r].length; c++)
                System.out.print(A[r][c] + "    ");
            System.out.println();
        }
    }

    private static double champagneTower(double poured, int query_row, int query_glass, double[][] A) {


        A[0][0] = (double) poured;
        for (int r = 0; r <= query_row; ++r) {
            for (int c = 0; c <= r; ++c) {
                double q = (A[r][c] - 1.0) / 2.0;
                if (q > 0) {
                    A[r+1][c] += q;
                    A[r+1][c+1] += q;
                }
            }
        }

        return Math.min(1, A[query_row][query_glass]);
    }




}
