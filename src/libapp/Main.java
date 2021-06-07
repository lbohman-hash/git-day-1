package libapp;

public class Main {

    public int myMethod(int num) {
        int increment = num + 1;
        return increment;
    }

    public static void main(String[] args) {
        Main test = new Main();
        int add = test.myMethod(5);
        System.out.println(add);
    }
}
