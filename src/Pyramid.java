public class Pyramid {
    public static void main(String[] args) {
        int i,j,k;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=5; k>= i; k--)
            {
                System.out.print("*");    //--> for one sided pyramid
                //System.out.print("* "); // --> for actual pyramid
            }
            System.out.println();
        }
    }
}
