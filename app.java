import java.util.ArrayList;

class app {
    // public static void main(String[] args)
    // {

    //     String[][] table = { { "Alice", "Joe", "Sam" },
    //             { "hal", "Bob", "Fran" }, { "Chad", "Marry", "Dan" }, { "tom", "ed", "ian" } };
    //     table[2][0] = "zoe";
    //     System.out.println("arr[0][0] = " + table[2][0]);
    // }

    //     public static void main(String[] args) {
    //       String[][] num = { { "Alice", "Joe", "Sam" },
    //                 { "hal", "Bob", "Fran" }, { "Chad", "Marry", "Dan" }, { "tom", "ed", "ian" } };
    //                 int numRows = num.length;
    //                 int numCols = num[0].length;

    //                 System.out.println("Number of rows: " + numRows);
    //                 System.out.println("Number of cols: " + numCols);

    //                 for (int i = 0; i < numRows; i++) {
    //                     for (int j = 0; j < numCols; j++) {
    //                         System.out.print(num [i ] [j]);
    //                     }
    //                     System.out.println( "");
    //                 }
    //     }
    // }
    //     static void printUpperLeftEntry(String[][] table) {
    //         System.out.println("left top corner: " + table[0][0]);
    //     }
    //     public static void main(String args[]) {
    //         String[][] table = { { "Alice", "Joe", "Sam" },
    //                 { "hal", "Bob", "Fran" }, { "Chad", "Marry", "Dan" }, { "tom", "ed", "ian" } };
    //         printUpperLeftEntry(table);
    //     }
    // }
    //     static final int n = 4;
    //     static final int m = 3;

    //     static void printUpperRight(String[][] table) {
    //         System.out.println("Upper Right: " + table[0][m-1]);
    //     }

    //     public static void main(String args[]) {
    //         String[][] table = { { "Alice", "Joe", "Sam" },
    //                 { "hal", "Bob", "Fran" }, { "Chad", "Marry", "Dan" }, { "tom", "ed", "ian" } };
    //         printUpperRight(table);
    //     }
    // }

    // static final int N = 4;

    //     // This function stores Object
    //     // of A[][] in B[][]
    //     static void transpose(Object[][] table)
    //     {
    //         int i, j;
    //         for (i = 0; i < N; i++)
    //             for (j = 0; j < N; j++)
    //                 table[i][j] = table[j][i];
    //     }

    //     // Driver code
    //     public static Object[][] main(String[] args)
    //     {
    //         int table[][] = { { 1, 1, 1, 1 },
    //                       { 2, 2, 2, 2 },
    //                       { 3, 3, 3, 3 },
    //                       { 4, 4, 4, 4 } };

    //         Object[][] table2 = new Object[N][N];
    //         int i, j;

    //           // Function call
    //         return(table2);

    //         System.out.print("Result matrix is \n");
    //         for (i = 0; i < N; i++) {
    //             for (j = 0; j < N; j++)
    //                 System.out.print(B[i][j] + " ");
    //             System.out.print("\n");

    //         }
    //     }
    //     }
    // 	public static void main(String[] args) {
    // 		// creating the first matrix using arrays
    // 		int[][] matrix = { { 0, 1, 2, 3 }, { 10, 11, 12, 13 }, { 20, 21, 22, 23 } };

    // 		System.out.println("Input Matrix : ");
    // 		ResultTranMatrices(matrix);

    // 		int rows = matrix.length;
    // 		int columns = matrix[0].length;

    // 		int[][] result = TransposeMatrices(matrix, rows, columns);

    // 		System.out.println("Transpose of Matrix : ");
    // 		ResultTranMatrices(result);

    // 	}

    //     private static int[][] TransposeMatrices(int[][] matrix, int rows, int columns) {

    //         int[][] result = new int[columns][rows];
    //         for (int i = 0; i < rows; i++) {
    //             for (int j = 0; j < columns; j++) {
    //                 result[j][i] = matrix[i][j];
    //             }
    //         }

    //         return result;
    //     }

    // 	private static void ResultTranMatrices(int[][] result) {
    // 		for (int i = 0; i < result.length; i++) {
    // 			for (int j = 0; j < result[1].length; j++) {
    // 				System.out.print(result[i][j] + " ");
    // 			}
    // 			System.out.println();
    // 		}
    // 	}

    // }

   static ArrayList<ArrayList<Object>> transpose(ArrayList<ArrayList<Object>> table) {
        ArrayList<ArrayList<Object>> matrixOut = new ArrayList<>();
        int rowCount = table.size();
        int colCount = 0;

        for (int i = 0; i < rowCount; i++) {
            ArrayList<Object> row = table.get(i);
            int rowSize = row.size();
            if (rowSize > colCount) {
                colCount = rowSize;
            }
        }
        for (int r = 0; r < rowCount; r++) {
            ArrayList<Object> innerIn = table.get(r);

            for (int c = 0; c < colCount; c++) {

                ArrayList<Object> matrixOutRow = new ArrayList<>();
                if (r != 0) {
                  {
                        matrixOutRow = matrixOut.get(c);
                    }
                }
                {
                    matrixOutRow.add(innerIn.get(c));
                } 
                {
                    matrixOut.set(c, matrixOutRow);
                }
                }
            }
        return matrixOut;
    }
}