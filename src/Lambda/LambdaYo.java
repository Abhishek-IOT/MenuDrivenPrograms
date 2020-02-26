package Lambda;

interface Add {
    int generate(int x, int y, int z);
}


public class LambdaYo {
    public static void main(String[] args) {
        Add add = (a, b, c) -> (a * b * c);
        System.out.println(add.generate(4, 5, 6));
    }


}
