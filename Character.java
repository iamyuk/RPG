package homeworks;

public class Character {
  protected int hp;
  protected int mp;
  public String name;

  public Character(int hp, int mp, String name) {
    this.hp = hp;
    this.mp = mp;
    this.name = name;
  }

  Character() {
    hp = 100;
    mp = 100;
    name = "クロちゃん";
  }

  public void introduce() {
    System.out.println("私の名前は"+name+"です。体力は"+hp+"持っていて、魔力は"+mp+"持っています。");
  }

  public void damage(int power) {
    hp -= power;
    System.out.println(name+"は"+power+"のダメージを受けました。");
  }

  public void attack(Character target) {
    System.out.println(name + "のこうげき！");
    target.damage(10);
  }
}
