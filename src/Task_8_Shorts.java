public class Task_8_Shorts {
    public static void main(String[] args) {
        /*
        short a = 5, b = 6;
        short c = a + b;
        System.out.println(c);

        This code will not compile because of a type error
        caused by lossy conversion from int to short
        In order to work short has to be cast before the sum
        Or the type of the sum has to be changed on int
        both solutions will work
         */
        short a = 5, b = 6;
        short c = (short) (a + b);
        System.out.println(c);
    }
}
