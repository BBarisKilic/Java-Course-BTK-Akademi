public class Main {
    public static void main(String[] args) {
        boolean isArrayContainsMyNum = false;
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int myNum = 9;

/*        for (int i =0; i< array.length; i++) {
            if(array[i]==myNum) {
                isArrayContainsMyNum = true;
                break;
            }
        }*/

        for(int num : array) {
            if(num == myNum) {
                isArrayContainsMyNum = true;
                break;
            }
        }

        if (isArrayContainsMyNum) {
            System.out.println("Array sayimi iceriyor!");
        } else {
            System.out.println("Array sayimi icermiyor!");
        }
    }
}
