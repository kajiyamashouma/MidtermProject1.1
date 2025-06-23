public class Hero extends Character{
    String weapon;
    public Hero(String name, int hp,String weapon){
        super(name, hp);
        this.weapon = weapon;
    }
    @Override
    public void attack(Character target) {
        System.out.println(this.name + "は" + this.weapon + "で攻撃！");
        System.out.println("敵に1ポイントのダメージをあたえた！");
        target.hp -= 1;
    }
    public void heal() {
        System.out.println(this.name + "は回復呪文を唱えた！");
        System.out.println(this.name + "はHPを20ポイント回復した！");
        this.hp += 20;
    }
}
