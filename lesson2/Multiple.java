package lesson2;

public class Multiple {
    public static void main(String[] args) {
        for (int n = 0; n < 15; n++) {
            System.out.println(n);
            switch (n % 3) {
            case 0:
                System.out.println("3の倍数です。");
                break;
            default:
                System.out.println("X");
                break;
            }
            switch (n % 5) {
            case 0:
                System.out.println("5の倍数です。");
            default:
                System.out.println("Y");
                break;
            }
        }
    }
}
