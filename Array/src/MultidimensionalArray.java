
public class MultidimensionalArray {
	public static void main(String[] args) {
		//Cok boyutlu arrays
		//int[] aDarr=int[5];
		int[][] tablo=new int[][] {
			{1,75,10},
			{2,87,13},
			{3,95,15},
			{4,103,18},
			{5,110,19}
		};
		int[][] tablo2=new int[5][3];
		tablo2[0][0]=1;
		tablo2[0][1]=75;
		tablo2[0][2]=10;
		int i,j;
		for (i=0;i<tablo.length;i++) {
			for (j=0;j< tablo[0].length;j++) {
				System.out.print(tablo[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
	    //foreach kullanýmý
		for (int[] sutun:tablo) {
			for(int value:sutun) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
				
		
		
		
	}

}
