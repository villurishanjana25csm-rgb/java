public class TwoDArray {
	public static void main(String[] args) {
		int x[][] = {{3,5,9},{7,4,8},{1,6,2}};  
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(x[i][j] + "  ");
			}
			System.out.println();
		}
	}
}