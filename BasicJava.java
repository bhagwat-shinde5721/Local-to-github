public class BasicJava{
  public void show(String name){
    System.out.println("Hi, " + name);
      }
    public String Basic(int a)
    {
      for(int i = 1 ; i<= a ; i++)
      {
        System.out.print(" "+i);
      }
      return "Heloooooo!!!!";
    }
  public static void main(String[] args)
  {
    BasicJava b = new BasicJava();
    b.show("Bhagwat Shinde");
    System.out.println(b.Basic(20));

  }
}
