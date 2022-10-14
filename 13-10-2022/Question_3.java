/* "Write a Java program to print an array after changing the rows and columns of a given tw array.
Original Array:
10 20 30
40 50 60 After changing the rows and columns of the said array: 10 40
20 50
30 60*/
public class Array_RowColumns {

	public static void main(String[] args) {
		int A[][] = {
				{10, 20, 30},
				{40, 50, 60}
		};
		System.out.print("Original Array:\n");
		print_array(A);
		System.out.print("After changing the rows and columns of the said array:");
		exchange(A);
		}
	
	public static void exchange (int A[][] )    //parameters method name as change 
  {
		
		int NewArr[][]  = new int[A[0].length][A.length]; // take new array of same length as arr
		
		for (int i = 0; i < A.length; i++)    //for row
    {
			for (int j = 0; j <A[0].length; j++)      //for column
      {
				NewArr[j][i] = A[i][j];           //change row to column
			}
		}
		
		print_array(NewArr);        // print interchanged array
	}
	 public static void print_array(int A[][] )        //parameters method name as display
   {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}
