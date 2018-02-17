package homework;
public class palindrome {
	static Boolean check (int[] arr, int l) {
	boolean result = true;
	for(int i = 0; i<l; i++) {
		if(!(arr[i] == arr[l-i-1])){
			result = false;
			break;
		  } 
		}
	return result;
	} 
	public static void main(String[] args) {
	int [] arr = {1,2,1,2,1};
	// I haven't considered if the number of elements in the array is odd or even, 
	// as in the case of odd ones the middle element is equal to itself.
	System.out.println(check(arr,arr.length));
	}
}