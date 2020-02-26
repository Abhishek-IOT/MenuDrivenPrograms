package Lambda;

@FunctionalInterface
interface RandomNumber {
    int generate();

}


public class Main {
    public static void main(String[] args) {
        RandomNumber randomNumber = () -> (int) (Math.random() * 100);//Lambda Function
        System.out.println(randomNumber.generate());

    }

}





