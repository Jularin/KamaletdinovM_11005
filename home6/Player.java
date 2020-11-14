package home6;

public class Player {
    private int hp;
    private String name;

    public Player(int hp, String name ) {
        this.hp = hp;
        this.name = name;
    }

    public void hpMinus(int hitPower){
        this.hp -= hitPower;
    }

    public int getHp(){
        return this.hp;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

}
