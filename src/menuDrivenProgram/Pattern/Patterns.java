package menuDrivenProgram.Pattern;

public class Patterns {
    public void RightPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {


                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pyramidPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }


}
