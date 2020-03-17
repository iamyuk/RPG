package homeworks;

public class Character {
  private int hp;
  private int mp;
  private String name;

  public Character(int hp, int mp, String name) {
    this.hp = hp;
    this.mp = mp;
    this.name = name;
  }

  public void introduce() {
    System.out.println("私の名前は"+name+"です。体力は"+hp+"持っていて、魔力は"+mp+"持っています。");
  }

  public void damage(int power) {
    hp -= power;
    System.out.println(name+"は"+power+"のダメージを受けました。");
  }

  public void attack(Character target) {
    System.out.println(name+"の攻撃！");
    target.damage(10);
  }
}
