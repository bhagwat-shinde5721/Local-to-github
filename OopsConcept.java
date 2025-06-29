

import java.lang.*;

public class OopsConcept
{
     static void show()
    {
        System.out.println("Oops class Method");
    }
  public static void main(String[] args) {
    Test t = new Test();
    OopsConcept o = new OopsConcept();
    Test.show();
    OopsConcept.show();
      
  }
}

class Test extends OopsConcept
{
   protected  static void show()
   {
     System.out.println("Test class Method");
   }

}
