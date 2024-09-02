import java.lang.*;
import java.util.*;

public class Maximum_Two_Number
{
    public static void main(String[] args)
    {
        int N1 = 0, N2 = 0;
        Scanner S =new Scanner(System.in);
        
        System.out.print("\n Enter a 1st Number: ");
        N1 = S.nextInt();
        System.out.print("\n Enter a 2nd Number: ");
        N2 = S.nextInt();

        if (N1 == N2)
        {
            System.out.println("\n Both number are equal");

        }
        else if (N1 > N2)
        {
            System.out.print("\n N1 number are Maximum");

        }
        else 
        {
            System.out.print("\n N2 is Maximum ");

        }
          System.out.print("Thanks");
    }
}        
    






