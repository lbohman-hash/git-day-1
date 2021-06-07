package libapp;

public class Main {

    public static void main(String[] args) {
        Main test = new Main();
        int add = test.myMethod(5);
        System.out.println(add);

        Main test2 = new Main();
        int add2 = test2.myMethod2(5);
        System.out.println(add2);

        Main test3 = new Main();
        int add3 = test3.myMethod3(5, 5);
        System.out.println(add3);
    }

    //Incrementing
    public int myMethod(int num) {
        int increment = num + 1;
        return increment;
    }

    //Decrementing
    public int myMethod2(int num) {
        int decrement = num - 1;
        return decrement;
    }

    //Multiplication
    public int myMethod3(int x, int y) {
        int z = x * y;
        return z;
    }
}
