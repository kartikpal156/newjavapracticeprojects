package newjavaproject;

public class arrayAssisted {
		public static void main(String[] args) {
			//Single -Dimensional array
			int a[] = {10,20,30,40,50};
			for (int i=0;i<5;i++) {
				System.out.println("Elements of array a:"+a[i]);
				
			}
			//multi dimensional array
			int[][] b= {{2,4,6,8},{3,6,9}};
			System.out.println("\n Length of row 1:"+b[0].length);
			
			
		}
}