import java.util.*;
public class  HalfPyramidofAlphabets{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	    int rows=input.nextInt();
        int i, j;
        char Alphabets='A';
         for (i = 1; i <= rows;i++) {
             for (j = 1; j <= i; j++) {
                System.out.print(Alphabets +" ");
            }
            Alphabets++;
             System.out.println(" ");
        }
	}
}

/*
Enter the number of rows: 
5

A  
B B  
C C C  
D D D D  
E E E E E  

*/



