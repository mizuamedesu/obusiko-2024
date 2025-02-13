package kimatu;

public class Main {
    public static void main(String[] args) {
        
        Slime slime = new Slime("ブルースライム", 40, "Blue");

        slime.getDamage(100);

        slime.bounce();

        System.out.println(slime.getName() + "の色は" + slime.getColor());

    }

    
}
