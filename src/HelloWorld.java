public class HelloWorld {

  public String sayHello() {
    String result = new String("Hello Java World!");
    return result;
  }

  public static void main(String[] args) {
    String stringArg = "Hello, World.";

    if (args.length > 0) {
      stringArg = args[0];
    }

    System.out.println(stringArg);
  }
}
