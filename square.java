package homework;
public class square {
	static Boolean check(int[][] arr) {
		Boolean check = true;
		for(int i=0;i<arr.length; i++) {
			if(!(arr.length == arr[i].length)){
				check = false;
			}
		}
		int startsumrow = 0, sumrow = 0, startsumcol = 0, sumcol = 0, sumdiag1 = 0, sumdiag2 = 0;
	    for(int j=0;j<arr[0].length; j++)
				startsumrow += arr[0][j];	
		for(int i=1;i<arr.length; i++) {
			sumrow = 0;
			for(int j=0;j<arr[i].length; j++)
				sumrow += arr[i][j];
			if(sumrow != startsumrow) {
				check = false;
				break;
			}
		}
	    for(int i=0;i<arr.length; i++) 
				startsumcol += arr[i][0];	
		for(int j=1;j<arr.length; j++) {
			sumcol = 0;
			for(int i=0;i<arr[j].length; i++)
				sumcol += arr[i][j];
			if(sumcol != startsumcol) {
			check = false;
			break;
			}
		}
	    for(int i=0;i<arr.length; i++) {
	    	sumdiag2 += arr[i][arr.length-i-1];
		for(int j=0;j<arr[0].length; j++) {
			if(i == j)
				sumdiag1 += arr[i][j];	
		}
	    }
	    if(sumdiag1 != sumdiag2)
	    	check = false;
		return check;
	}	
	public static void main(String[] args) {
		int[][] arr = {{ 8,11,14, 1},
				       {13, 2, 7,12},
				       { 3,16, 9, 6},
				       {10, 5, 4, 15}};
		System.out.println(check(arr));
	}
}