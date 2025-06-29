// Java program to demonstrate the order of 
// execution of constructors, static blocks, 
// and instance initialization blocks
class Geeks {
    int n;
    int k;
    // parametrized constructor
    Geeks(int x) {
        this.k = x;
        System.out.println("ONE argument constructor" +" "+ k);
    }
    
    //default  defind constructor to intialize objects.
    Geeks() {
        this(45);
        System.out.println("No argument constructor");
    }
     
     // static block will be called when class is initiated
     // order of execution depend on how they define
    static {
        System.out.println("1st static init");
    }
   
   // init block will be called when insatnce is created and can be used to assign values to insatnce variable
   // order of execution followed by how they defined
    {
         n =100;
        System.out.println("1st instance init");
    }
    
    // Init block
    {
        System.out.println("2nd instance init");
    }

    //static block

    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args) {
        new Geeks();
        //new Geeks(8);
        System.out.println(new Geeks().n);
        System.out.println(new Geeks(89).k);
    }
}

// // Class Method and Method Passing
// class Student {
//     private int id;    
//     private String name;
    
//     // Constructor for initialization
//     public Student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
    
//     // method demonstrating parameter passing
//     public void printStudent(String header) {
//         System.out.println(header);
//         System.out.println("ID: " + getId());
//         System.out.println("Name: " + getName());
//     }
    
//     // Getter methods
//     public int getId() { return id; }
//     public String getName() { return name; }
// }
// class Main extends Student {

//     public Main() {
//         super(30, "Geeks");
//     }
    
//     public static void main(String[] args) {
//         // Proper initialization
//         //Student obj = new Student(28, "Geek");  
//         Main m = new Main();
//         // Method with parameter
//         m.printStudent("Student Details:"); 
//     }
// }