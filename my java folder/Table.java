import java.lang.*;
import java.util.*;

class Table
{
    public static void main(String[] args)
    {
        int No = 0, i=0, a=0;
        Scanner Sc = new Scanner(System.in);

        System.out.print("\n Enter Number: ");
        No = Sc.nextInt();

        i = 1;

        while(i <= 10)
        {
            a= No * i;

        
           System.out.println(" " + No + "*" + i + " = " + a);
           i++;

           System.out.println(" ");
        }
        
    }
}

















   