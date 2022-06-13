public class Main {
    public static void main(String[] args) {
        create();
        read();
        update();
        delete();

        int result = sum(3, 4);
        System.out.println("Sonuc: " + result);
    }

    public static void create() {
        System.out.println("Created!");
    }

    public static void read() {
        System.out.println("Read!");
    }

    public static void update() {
        System.out.println("Updated!");
    }

    public static void delete() {
        System.out.println("Deleted!");
    }

    public static int sum(int numOne, int numTwo) {
        return numOne + numTwo;
    }
}
