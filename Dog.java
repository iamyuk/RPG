package homeworks;

public class Dog extends Character {
  int power;

  Dog() {
    this.hp = 200;
    this.mp = 200;
    this.name = "モカ";
  }

  public void introduce() {
    System.out.println(name + "はちょっとすごいいぬです。体力は" + hp + "、魔力は" + mp + "もっています。");
  }

  public void attack(Character target) {
    System.out.println(name + "は吠えた！");
    target.damage(20);
  }
}