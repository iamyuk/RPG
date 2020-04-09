package homeworks;

public class RPG {
  public static void main(String[] args) {
    Character a = new Character();
    Dog b = new Dog();
    Character c = new Cat();
    a.introduce();
    b.introduce();
    c.introduce();
    a.attack(b);
    b.attack(c);
    c.attack(a);
  }
}
