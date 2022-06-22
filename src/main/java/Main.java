public class Main {
    public static void main(String[] args) {
        boolean factor = true;
        boolean factor2 = true;
        boolean factor3 = false;
        boolean factor4 = false;
        System.out.println("Truth table for && operator");
        System.out.println(factor && factor2);
        System.out.println(factor && factor3);
        System.out.println(factor3 && factor4);
        System.out.println(factor3 && factor2);
        System.out.println("Truth table for || operator");
        System.out.println(factor || factor2);
        System.out.println(factor || factor3);
        System.out.println(factor3 || factor4);
        System.out.println(factor3 || factor2);
    }
}
