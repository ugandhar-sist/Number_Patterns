import java.util.*;
public class Trapezium {
        public static void main(String[] args)
        {
            int a,i,j,k;
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            for(i=1;i<=a;i++)
            {
                for(j=1; j<=a-i; j++)
                {
                    System.out.print(" ");
                }
                for(k = 1; k <= a; k++)
                    System.out.print("*");
                System.out.println();
            }
        }
}
