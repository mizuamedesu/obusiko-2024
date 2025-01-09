package lesson2;

public class ArrowSwitch {

    public static void main(String[] args) {
        int number = 1;
        String result = switch(number){
            case 1 -> "数字は1です";
            default -> "1,2,3以外の数字です";
        };
        System.out.println(result);
    }
}