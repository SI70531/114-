public class Forloop {
    public static void main(String[] args) {
        for(int i = 2; i <= 9; i++){
            for(int a = 1; a <= 9; a++){
                System.out.printf("%dx%d=%2d ", i, a, i*a);
            }
            System.out.println();

        }
    }
}