package homeworks;

public class Cat extends Character{
  int power;

  public Cat() {
    this.hp = 500;
    this.mp = 500;
    this.name = "タマ";
  }

  public void introduce() {
    System.out.println(name + "はすごいねこです。なんと体力は" + hp + "、魔力は" + mp + "もっています。");
  }

  public void attack(Character target) {
    System.out.println(name + "はひっかいた！");
    target.damage(50);
  }
}
