import java.lang.*;
import java.util.*;

public class Max_three_number
{
    public static void main(String[] args)
    {
        int a, b, c, largest, temp;

        Scanner Sc =new Scanner(System.in);
        
        System.out.print("\n Enter a 1st Number: ");
        a= Sc.nextInt();

        System.out.print("\n Enter a 2nd Number: ");
        b  = Sc.nextInt();

        System.out.print("\n Enter a 3rd Number: ");
        c = Sc.nextInt();

        temp=a>b?a:b;

        largest= c>temp?c:temp;
        
            System.out.println("the largest Number is:"+largest); 
        

    }
}



    


    

