package homeworks;

public class Character {
  private int hp;
  private int mp;
  private String name;

  Character(int hp, int mp, String name) {
    this.hp = hp;
    this.mp = mp;
    this.name = name;
  }

  void introduce() {
    System.out.println("私の名前は"+name+"です。体力は"+hp+"持っていて、魔力は"+mp+"持っています。");
  }
}
