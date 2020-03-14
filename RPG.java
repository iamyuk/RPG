package homeworks;

public class RPG {
  public static void main(String[] args) {
    Character a = new Character(100, 100, "ポチ");
    Character b = new Character(80, 120, "モカ");
    Character c = new Character(150, 100, "クロちゃん");
    a.introduce();
    b.introduce();
    c.introduce();
  }
}
