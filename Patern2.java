
public class Patern2 {
    public static void main (String[] args) {
        int b = 5;
        char a = 'x';

        method1(a, b);
        System.out.println("");
}
    private static void method1(char a, int b) {
        char oth = (a == 'x') ? 'o' : 'x';
        for (int i = 0; i < (b*b); i++) {
            System.out.print( i % 2 == 0 ? a : oth);
            if ((i+1) % b == 0) {
                System.out.println();
            }
        }
    }

}