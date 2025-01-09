package lesson2;

public class Case {
    public static void main(String[] args){
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("これは数字が1の場合");
                break;
            case 2:
                System.err.println("これは数字が2の場合");
                break;
            default:
                break;
        }

    }
}
