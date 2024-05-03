package intafais;

public class Main {
  public static void main(String[] args) {
//        King k = new King();
//        Queen m = new Queen();
//        knight r = new knight();
//        System.out.println("キング:");
//        k.fight();
//        System.out.println("クイーン:");
//        m.fight();
//        System.out.println("騎士:");
//        r.fight();
      System.out.println("king");
      Player a = new King();
      a.setAttack(new punch());
      a.fight();
      System.out.println();
      System.out.println("Queen");
      Player b = new Queen();
      b.setAttack(new kick());
      b.fight();
      System.out.println();
      System.out.println("Knight");
      Player c = new knight();
      c.setAttack(new Cut());
      c.fight();

    }
}
