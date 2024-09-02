import java.lang.*;
import java.util.*;

public class Addition
{
    public static void main(String[] args)
    {
        int N1,N2,addition;
        Scanner S =new Scanner(System.in);

        System.out.print("\n Enter 1st number= ");
        N1 = S.nextInt();
        System.out.print("\n Enter 2nd number= ");
        N2 = S.nextInt();

        addition=N1+N2;

        System.out.println("\n Addition of " + N1 + " & " + N2 + " is  = " + addition + ".");
        System.out.println( "Thanks.");

    }
}
