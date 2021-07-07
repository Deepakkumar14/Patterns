import java.util.*;
public class  FullPyramid{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	    int rows=input.nextInt();
        int i,j,k;
         for (i =1; i<=rows;i++) {
             for (j = 1; j <=rows-i; j++) {
                System.out.print(" ");
            }
            for (k= 1; k<=2*i-1; k++) {
                System.out.print("*");
            }
             System.out.println(" ");
        }
	}
}

/*
Enter the number of rows: 
5

    * 
   *** 
  ***** 
 ******* 
********* 

*/



