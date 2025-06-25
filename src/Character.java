public abstract class Character implements Creature{
    String name;
    int hp;
    public Character(String name,int hp) {
        this.name = name;
        this.hp = hp;
    }
    public final boolean isAlive(){
        if (0 >= hp){
            return false;
        }else {
            return true;
        }
    }
    public void showStatus() {
        System.out.println(name + ":HP: " + hp);
    }
}
