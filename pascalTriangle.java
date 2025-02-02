import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public static void main(String[] args){
        List<List<Integer>> pascalsssss = generate(3);
        for (List<Integer> pascals : pascalsssss) {
            for (Integer pascal : pascals) {
                System.out.print(pascal + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> generate(int numRows) {
        // given num rows, make list of size num rows
        // for each row, make list of size row number
        // for each elelemnt in row, if position 0 = fill 1,
        // if position (length) = fill 1,
        // else, fill with ((List(current_row - 1)(position - 1)) - (List(current_row - 1)(position - 1)))

        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> currentRow, previousRow;
        for (int i = 1; i < numRows; i++) {
            triangle.add(new ArrayList<>(i));
            currentRow = triangle.get(i - 1);
            previousRow = currentRow;
            for (int j = 0; j < i; j++) {
                if (j == 0) { currentRow.add(j, 1);}
                else if (j == currentRow.size() - 1) { currentRow.add(j, 1);}
                else {
                    currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
                }
            }
            previousRow = triangle.get(i);
        }
        return triangle;

    }

        
}