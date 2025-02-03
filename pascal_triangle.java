import java.util.ArrayList;
import java.util.List;

public class pascal_triangle {

    public static void main(String[] args) {
        List<List<Integer>> pascalsssss = generatePascalTriangle(3);

        System.out.println(pascalsssss);

    }

    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        // given num rows, make list of size num rows
        // for each row, make list of size row number
        // for each elelemnt in row, if position 0 = fill 1,
        // if position (length) = fill 1,
        // else, fill with ((List(current_row - 1)(position - 1)) - (List(current_row - 1)(position - 1)))

        List<List<Integer>> triangle = new ArrayList<>(numRows);
        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>(row + 1);
            for (int position = 0; position <= row; position++) {
                if (position == 0 || position == row) {
                    currentRow.add(1);
                } else {
                    currentRow.add(triangle.get(row - 1).get(position - 1) + triangle.get(row - 1).get(position));
                }
            }
            triangle.add(currentRow);
        }
        return triangle;

    }

}