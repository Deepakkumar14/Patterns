import java.util.*;
public class  HalfPyramidofNumbers{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	    int rows=input.nextInt();
        int i, j;
         for (i = 1; i <= rows;i++) {
             for (j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
             System.out.println(" ");
        }
	}
}

/*
Enter the number of rows: 
5

1  
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5  

*/



