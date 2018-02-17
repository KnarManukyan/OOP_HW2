package homework;
public class word_sentence_counter {
		public static void main(String[] args) {
			int foo[][] = {{ 8,11,14, 1},
				       {13, 2, 7,12},
				       { 3,16, 9, 6},
				       {10, 5, 4, 15}}; //arbitrary array
			System.out.println("result" + Check(foo));
		}
		static boolean Check(int[][] arr) {
			int toolr[] = new int[arr.length];
			 	for (int i = 0; i < arr.length; i++){
			        for (int j = 0; j < arr[i].length; j++){
			            toolr[i] += arr[i][j];  
			        } //array of row sums
			    }
			 
			 int toolc[] = new int[arr.length];
			 	for (int j = 0; j < arr[0].length; j++){
			        for (int i = 0; i < arr.length; i++){
			            toolc[i] += arr[0][j];  
			        } //array of column sums
			    }
			 
			 int toold[] = new int[arr.length]; 
			 	for(int i = 0; i<arr.length; i++) {
			 		for(int j = 0; j<arr[i].length; j++) {
			 			if(i == j) {
			 				toold[0] += arr[i][j];
			 			}
			 			if(j == arr.length-1 -i) {
			 				toold[1] += arr[i][j];
			 			}
			 		}
			 	} //sum of two diagonals in an array
			 
			 boolean boo = false;

			 for(int a = 0; a< toolc.length; a++) {
				 if(toolc[0] == toolc[a]) {
					 boo = true;
				 }
				 else {
					 boo = false;
				 }
			 } //compare whether the column sums are equal to each other
			 
			 boolean boo2 = false;
			 for(int checker = 0; checker< toolr.length; checker++) {
				 if(toolr[0] == toolr[checker]) {
					 boo2 = true;
				 }
					 else {
						 boo2 = false;
				 }
			 } //compare whether the row sums are equal to each other
			 boolean booD = false;
			 if(toold[0] == toold[1] && toold[0] == toolc[0]) {
				 booD = true;
			 }// compare two diagonal sums with each other (and column sum)
			 Boolean booS = false;
			 for(int i = 0; i<arr.length; i++) {
				 if(arr.length == arr[i].length) {
					 booS = true; //checks if it has a shape of square
				 };
			 }
			 boolean f = false;
			 if(boo == boo2 && boo == booD && boo == booS && boo == true) {
				f = true;
			 }
			 return f; //compare the sums and square requirement (row, column and diagonals)	
		}
	}