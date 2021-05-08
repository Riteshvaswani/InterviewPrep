
public class MaximalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		int count = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == '1') {
					count = Math.max(count, findSquare(matrix, i, j));
				}
			}
		}
		System.out.println(count);
	}
	public static int findSquare(char[][] matrix, int startI, int startJ) {
		int returnValue = 0;
		int min = Math.min(matrix.length-startI, matrix[startI].length-startJ);
		for(int p = 0; p < min; p++) {
			int count = 0;
			for(int i = startI; i <= startI+p; i++) {
				for(int j = startJ; j <= startJ+p; j++) {
					if(matrix[i][j] != '1')
						return -1;
					count++;
				}
			}
			returnValue = Math.max(returnValue, count);
		}
		return returnValue;
	}
}
