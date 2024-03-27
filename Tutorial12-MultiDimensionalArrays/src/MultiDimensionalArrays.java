
public class MultiDimensionalArrays {
	public static void main(String[] args) {
		
		int[][] grid = {
			{3, 4, 8},
			{21, 42},
			{123, 431, 534, 984}
		};
		
//		System.out.println(grid[1][1]);
		
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		
	}
}
