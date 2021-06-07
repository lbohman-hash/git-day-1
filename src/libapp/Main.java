package libapp;

public class Main {

    public int myMethod(int num) {
        int increment = num + 1;
        return increment;
    }

    public int myMethod3(int x, int y) {
        int z = x *y;
        return z;
    }

    public static void main(String[] args) {
        Main test = new Main();
        int add = test.myMethod(5);
        System.out.println(add);

        Main test3 = new Main();
        int add3 = test3.myMethod3(5, 5);
        System.out.println(add3);
    }
}
