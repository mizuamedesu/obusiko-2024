package kimatu;

public class Slime extends Actor {

    private String color;

    public Slime (String name, int hp, String color){
        super(name, hp);
        this.color = color;
    }
    
    public void bounce (){
        System.out.println(getName() + "はぷるぷると揺れている！");
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public void getDamage(int damage){

        super.getDamage(damage);
        System.out.println("僕は悪いスライムじゃないよ...");
    }
}
