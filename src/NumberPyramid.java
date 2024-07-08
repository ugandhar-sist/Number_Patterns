public class NumberPyramid {
    public static void main(String[] args) {
        int i,count,j;
        for(i=1;i<=5;i++)
        {
            count = 1;
            for(j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
