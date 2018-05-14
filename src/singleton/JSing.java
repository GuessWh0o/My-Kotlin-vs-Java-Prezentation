package singleton;

public enum JSing {
  INSTANCE;

  public void sing() {
    System.out.println("Bla Bla I am singing");
  }

  public static void main(String[] args) {
    JSing.INSTANCE.sing();
  }
}
