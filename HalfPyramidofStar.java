import java.util.*;
public class  HalfPyramidofStar{
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

*/



