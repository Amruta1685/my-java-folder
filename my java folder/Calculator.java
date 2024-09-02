import java.lang.*;
import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {
        int N1 = 0, N2 = 0;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter First Number=");
        N1 = sc.nextInt();

        System.out.print("Enter Second Number=");
        N2 = sc.nextInt();

        int Add = 0,Sub = 0, Mul = 0, Div = 0;
        
        Add = N1 + N2;
        System.out.println("Addition of Given Numbers= "+Add);

        Sub = N1 - N2;
        System.out.println("Addition of Given Numbers= "+Sub);

        Mul = N1 * N2;
        System.out.println("Addition of Given Numbers= "+Mul);

        Div = N1 / N2;
        System.out.println("Addition of Given Numbers= "+Div);

    }
}














