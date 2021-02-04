public class Array_3 {

	public static void main(String[] args) {
		
		int[][] a = new int[100][100];
		
		for (int j = 0; j < a.length; j++ ) {
            for (int  x = 0; x < a[j].length; x++ ){
  			   a[j][x] = j - x; 
	        }   
        }
		
		System.out.println("Subtração dos indices: " );
		
		for ( int j = 0; j < a.length; j++ ) {
            for ( int x = 0; x< a[j].length; x++ ){
            	System.out.print(j);
				System.out.print(" - "+x);
				System.out.println("  ->  " + a[j][x]);
            }
		}
		
		for ( int j = 0; j < a.length; j++ ) {
            for ( int x = 0; x< a[j].length; x++ ){
  			   a[j][x] = 7 * (j + x) ; 
            }
		}
		
		System.out.println("Subtração dos indices multiplicados por 7: " );
		
		for ( int j = 0; j < a.length; j++ ) {
            for ( int x = 0; x< a[j].length; x++ ){
            	System.out.print(j);
				System.out.print(" - "+x);
				System.out.println("  ->  " + a[j][x]);
            }
		}
	}
}