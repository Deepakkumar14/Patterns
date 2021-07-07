import java.util.*;
public class PascalsTriangle{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	    int rows=input.nextInt();
        int i,j,k,value=1;
         for (i=0;i<rows;i++) {        // since i iterate from 0 <rows is given
             for ( j=1;j<=rows-i; j++) {    //to print the leadind spaces
                System.out.print(" ");
            }
            for(k=0; k<= i; k++){         //to print values
                if (k==0 || i==0)
                value = 1;
                else
                value = value*(i-k+1)/k;
                System.out.print(value +" ");
            }
            System.out.println(" ");
        }
	}
}

/*
Enter the number of rows: 
5

     1  
    1 1  
   1 2 1  
  1 3 3 1  
 1 4 6 4 1  

*/



