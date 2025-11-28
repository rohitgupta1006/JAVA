package arrays;

public class spiral_print 
{
    public static void main(String[] args) 
    {
        int[][] arr = { { 1,  4,  7,  11, 15 },
					    { 2,  5,  8,  12, 19 },
					   { 3,  6,  9,  16, 22 } };
		spiralprint(arr);
		
	}
	public static void spiralprint(int[][] arr) {
	    int minc = 0, maxc = arr[0].length - 1, minr = 0, maxr = arr.length - 1;
	    int totalElements = arr.length * arr[0].length;  // Total elements in the array
	    int printedElements = 0;

	    while (printedElements < totalElements) 
        {    
	        for (int i = minc; i <= maxc && printedElements < totalElements; i++) 
            {
	            System.out.print(arr[minr][i] + " ");
	            printedElements++;
	        }
	        minr++;
	        
	        for (int i = minr; i <= maxr && printedElements < totalElements; i++) 
            {
	            System.out.print(arr[i][maxc] + " ");
	            printedElements++;
	        }
	        maxc--;
	        
	        for (int i = maxc; i >= minc && printedElements < totalElements; i--) 
            {
	            System.out.print(arr[maxr][i] + " ");
	            printedElements++;
	        }
	        maxr--;
	        
	        for (int i = maxr; i >= minr && printedElements < totalElements; i--) 
            {
	            System.out.print(arr[i][minc] + " ");
	            printedElements++;
	        }
	        minc++;
        }
	}
}
