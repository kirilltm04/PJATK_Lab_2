public class Task_5_Booleans {
    public static void main(String[] args) {
        boolean a;
        boolean b;
        a = true;
        b = true;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a ^ b);
        // everything is true except for the binary xor, it is true only if
        // the booleans are different in meaning

        a = true;
        b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a ^ b);
        // only binary and is false because one of the booleans is false

        a = false;
        b = true;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a ^ b);
        // same situation as in 2nd case

        a = false;
        b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a ^ b);
        // everything is false
        // binary and because both have to be true
        // binary or because neither of the booleans is true (one necessary)
        // binary xor because the booleans are the same
    }
}
