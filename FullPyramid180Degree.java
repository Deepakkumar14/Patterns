import java.util.*;
public class  FullPyramid180Degree{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	    int rows=input.nextInt();
        int i, j;
         for (i = 1; i <= rows;i++) {
             for (j = 1; j <= i;j++) {
                System.out.print("*"+" ");
            }
             System.out.println(" ");
        }
        for (i = rows-1; i>=0;i--) {
             for (j = 1; j <= i;j++) {
                System.out.print("*"+" ");
            }
             System.out.println(" ");
        }
	}
}

/*

Enter the number of rows: 
5

*  
* *  
* * *  
* * * *  
* * * * *  
* * * *  
* * *  
* *  
*  

*/
 



