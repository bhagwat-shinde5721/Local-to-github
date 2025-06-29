
import java.lang.*;
import java.util.*;
public class BasicJava {
   private static  float k=0;
   private static void show(){

   String s = "Bhagwat is good person";
   System.out.println(s.length());
   char k =  s.charAt(2);
   String c = s.replace("Bhagwat", "Bhagwan");
   System.out.println(c + "   "+ k);
   System.out.println(k+" "+c);

      }
    
    private static float setValue(int a)
    {
      k = (float)a;
      return k;
    }
     protected  static float getValue()
      {
        return k;
      }
    
     double cast(float a)
    {
      double s = a + 123.44;
      k = a + a ;
      show();
      getValue();
      setValue(23);
      return k;
    }

    public int[] arrayclass(int k)
    {
      int a[] = new int[10];
      for(int i = 0 ; i< 10 ; i++)
      {
        a[i] = k;
         k = k+k;
        System.out.println(a[i]);
      }
      System.out.println(a[9]);
      return a;
    }

    String[][] twodarray()
    {
      String[][] s1 = new String[2][2];
      for(int i =0 ; i<2 ;i++)
      {
        for(int j = 0 ; j<2 ; j++)
        {
          s1[i][j] = "Bhagwat";
        }
      }
      System.out.println(s1[1][1]);
      return s1;

    }

    public static int takeInt() throws ExceptionInInitializerError
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("What will be the no.");
      int a = sc.nextInt();
      System.out.println("So you chose this no. "+a+" !");
      return a;
    }

    public String takeInput()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Tell me your name??");
      String s = sc.nextLine();
      System.out.println(s);
      return s;
    }

  public static void main(String[] args)
  {

   BasicJava b = new BasicJava();
    //show();
  System.out.println( b.cast(23.87676F));
  System.out.println(getValue());
  System.out.println(k);
  b.arrayclass(10);
  System.out.println(b.twodarray());
  // BasicJava.takeInt();
  // b.takeInput();

 
  }
}

 

