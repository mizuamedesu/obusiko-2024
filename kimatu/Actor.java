package kimatu;

public class Actor {
    private String Name;
    private int HP;

    public Actor(String Name, int HP ){
        this.Name = Name;
        this.HP = HP;
    }

    public void getDamage (int Damage){

        this.HP = this.HP - Damage;

        System.out.println(this.Name + "は" + Damage + "ダメージを受けた！");
        System.out.println("残りHP: " + this.HP);

    }

    public String  getName(){
        return this.Name;
    }

    public int getHP(){
        return this.HP;
    }
}