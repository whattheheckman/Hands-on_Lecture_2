import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            int left = 0;
            int top = 0;
            //arrays are 0 indexed, so we have to subtract by one to have the correct amount of items
            //if we don't get the length of how long each row is, the algo only works for a m * m sized array
            //this allows the 2nd dimension of array's length to be different from the first dimensions aka, an m * n sized array
            int right = matrix[0].length - 1; 
            int bottom = matrix.length - 1;   

            
            //while the horizontal and vertical location might seem switched compared to traditional ordered pairs
            //it is in the right place because the matrix is declared first by row, then by column
            while (left <= right && top <= bottom) {
                for (int horizLocation = left; horizLocation <= right; horizLocation++) {
                    list.add(matrix[top][horizLocation]);
                }
                top++;
                //the for loop compoarision is less than OR equal because we need it to run for the case of the bottom now, not excluding that case with normal less than
                for (int vertLocation = top; vertLocation <= bottom; vertLocation++) {
                    list.add(matrix[vertLocation][right]);
                }
                right--;
                if (top <= bottom) {
                    //the following 2 for loops are greater than because we are counting down instead of counting up
                    for (int horizLocation = right; horizLocation >= left; horizLocation--) {
                        list.add(matrix[bottom][horizLocation]);
                    }
                }
                bottom--;
                if (left < right) {
                    for (int vertLocation = bottom; vertLocation > top; vertLocation--) {
                        list.add(matrix[vertLocation][left]);
                    }
                }
            }
            return list;
        }
    
        public static void main(String[] args) {
            int[][] inputMatrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
            List<Integer> spiralProgression = spiralOrder(inputMatrix);
            System.out.println(spiralProgression);

    }
}