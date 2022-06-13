public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        boolean isArrayContainsMyNum = false;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int myNum = 5;

        for (int num : array) {
            if (num == myNum) {
                isArrayContainsMyNum = true;
                break;
            }
        }

        if (isArrayContainsMyNum) {
            print("Array sayimi iceriyor!");
        } else {
            print("Array sayimi icermiyor!");
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }
}