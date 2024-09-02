import java.lang.*;
import java.util.*;

public class Reverse_Table
{
    public static void main(String[] args)
    {
        int No = 0, i=0, a=0;
        Scanner Sc = new Scanner(System.in);

        System.out.print("\n Enter Number: ");
        No = Sc.nextInt();

        i = 10;

        while (i >=  1)
        {
            a= No * i;

        
           System.out.println(" " + No + "*" + i + " = " + a);
           i--;

           System.out.println(" ");
        }
        
    }
}

















   