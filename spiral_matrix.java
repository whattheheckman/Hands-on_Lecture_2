import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list = new ArrayList<>();
            int left = 0;
            int top = 0;
            int right = matrix.length - 1;
            int bottom = matrix.length - 1;
            while (left <= right && top <= bottom) {
                for (int j = left; j <= right; j++) {
                    list.add(matrix[top][j]);
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
                if (top <= bottom) {
                    for (int j = right; j >= left; j--) {
                        list.add(matrix[bottom][j]);
                    }
                }
                bottom--;
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        list.add(matrix[i][left]);
                    }
                }
                left++;
            }
            return list;
        }
    
        public static void main(String[] args) {
            int[][] inputMatrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
            List<Integer> spiralProgression = spiralOrder(inputMatrix);
            System.out.println(spiralProgression);

    }
}