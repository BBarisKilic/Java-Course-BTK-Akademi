public class Main {
    static  public  void main(String[]  args) {
        char letter = 'E';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf!");
                break;
            default:
                System.out.println("Ince sesli harf!");
                break;
        }
    }
}
