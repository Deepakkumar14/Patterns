import java.util.*;
public class  InvertedFullPyramid{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	    int rows=input.nextInt();
        int i,j,k,l=1;
         for (i=rows;i>=1;i--) {
             for ( j=1;j<=l; j++) {
                System.out.print(" ");
            }
            for (k= 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            l++;
             System.out.println(" ");
        }
	}
}

/*
Enter the number of rows: 
5

 ********* 
  ******* 
   ***** 
    *** 
     * 

*/



