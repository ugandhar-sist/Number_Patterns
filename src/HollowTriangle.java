public class HollowTriangle {
    public static void main(String[] args) {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == height - 1 || j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
