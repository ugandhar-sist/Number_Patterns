public class Diamond {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int rows = 5;
        for(i = 1; i <= rows; i++){
            for(j = i; j < rows; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= (2*i-1); k++) // --> odd number pyramid
                System.out.print("*");
            System.out.println();
        }
        for(i = rows - 1; i >= 1; i--){
            for(j = rows; j > i; j--){
                System.out.print(" ");
            }
            for(k = 1; k <= (2*i-1); k++) // --> odd number pyramid
                System.out.print("*");
            System.out.println();
        }
    }
}
