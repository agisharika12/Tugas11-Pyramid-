
public class Patern6 {
    public static void main(String[] args) {

        int i, j =0, n=5;
        for (i = 1; i <= 5; i++) {

                for (j = 2; j <= i; j++ ) {
                    System.out.print(" ");
                }
                for (j = n; j >= i ; j--) {
                    System.out.print(j);
                }
                for (j = j+2; j <= n; j++) {
                    System.out.print(j);
                }

                System.out.print("\n");
            }
        }
    }
