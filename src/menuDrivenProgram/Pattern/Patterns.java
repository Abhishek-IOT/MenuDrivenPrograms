package menuDrivenProgram.Pattern;

public class Patterns {

    public void RightPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {


                System.out.print("*");
            }//j
            System.out.println();
        }//i
    }//fn

    public void pyramidPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");// for the spaces
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");// for printing the *
            }
            System.out.println(" ");//for having the space between the *
        }//j
    }//fn


    public void rightUpperPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("*");
            }//j
            System.out.println();
        }//i
    }//fn

    public void LeftUpperPattern(int size) {

    }
}

