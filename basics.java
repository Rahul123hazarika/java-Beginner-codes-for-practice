//input handling- 
// system.in.read()
// Explanation:
//  System.in.read() reads a single character as an integer (ASCII code).
//  You convert it to a character using (char)typecasting. •
//  The program stops until you press a key + Enter.
import java.io.*;
import java.io.IOException; // required for handling input error
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.time.LocalTime;
class readcharacter{
    public static void main(String []args){
        try{
            System.out.println("Enter a character ");
            int ch=System.in.read();//reads one character as ascii value
            System.out.println("you entered :" +(char)ch);

        }
        catch(IOException e){
            System.out.println("an error occured while giving input"+e.getMessage());
            

        }
    }
}
//-------------------------------------------------------------------------------------------------------------
//trigger an IOException.


class TestIOException {
    public static void main(String[] args) {
        try {
            // Try to read a file that doesn't exist
            FileReader file = new FileReader("non_existing_file.txt");
            BufferedReader br = new BufferedReader(file);
            
            System.out.println(br.readLine());
            br.close();
        } 
        catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}

//-------------------------------------------------------------------------------------------------
// '''Explanation:
//  Uses BufferedReader(in java.io) to read full strings from the keyboard. •
//  Must handle IOException(checked exception). •
//  readLine() reads an entire line of text'''
//all are imported above 
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
//we can use bufferreader as "BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); "

class Bufferredreader{
    public static void main(String []args){
        //create a stream reader object to read byte and decode them into char
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(input);
        try{
            System.out.println("enter a string");
            String inputString=br.readLine();
            System.out.println("you entered :"+inputString);
        }
        catch(IOException e){
            System.out.println("it has io exception "+ e.getMessage());

        }

    }
}
//-------------------------------------------------------------------------------------------------------------
//scanner class example
// Explanation:
//  Scanner (in java.util) is the most common wayto read input. •
//  Common methods:
//  nextInt() → reads integer ○
//  nextDouble() → reads decimal ○
//  nextLine() → reads a full string line ○
//  next().charAt(0) → reads one character ○
//  •
//  Always close the scanner to prevent resource leaks
class scannerExample{
    public static void main(String []args){
         // Create Scanner object for keyboard input
         Scanner sc= new Scanner(System.in);
         System.out.println("enter your age");
         int age= sc.nextInt();
         System.out.println("enter your salary");
         double salary=sc.nextDouble();
         System.out.println("first character...");
         char ch= sc.next().charAt(0);
         System.out.println(age);
         System.out.println(salary);
         System.out.println(ch);
    }
}

//---------------------------------------------------------------------------------------------
class ifelsestatement{
    public static void main(String[]args){
        Scanner n= new Scanner(System.in);
        System.out.println("enter a number");
        int number=n.nextInt();
        if(number>18){
            System.out.println("eligible for test");
        }
        else{
            System.out.println("not eligible");
        }
    }
}

 //for-each Loop Example (from PDF)
class LoopExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 60};

        // Using traditional for loop
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum using for loop: " + sum);

        // Using for-each loop
        int add = 0;
        for (int num : numbers) {
            add += num;
        }
        System.out.println("Sum using for-each loop: " + add);
    }
}

//----------------------------------------------------------------------------------------------------------------------------
//local variable
class main{
    public static void main(String[]args){
        int localvar=10; //local var
        System.out.println(localvar);
    }
}
//instance +local + static variable

class Instance {
    String Name = "Annu";      // Instance variable
    static int count = 0;      // Static variable (shared by all objects)

    public static void main(String[] args) {
        Instance n = new Instance();  // Create object (to access instance variable)

        String Name = "rahul";        // Local variable (exists only inside main method)

        System.out.println("The local variable is " + Name);
        System.out.println("The instance variable is " + n.Name);

        Instance.count++;             // Access static variable using class name
        System.out.println("Static variable is " + Instance.count);
    }
}

class Example {
    static int count = 0;  // shared by all objects
    String name;

    Example(String n) {
        name = n;
        count++;  // increment shared variable
    }

    void display() {
        System.out.println(name + " | count = " + count);
    }

    public static void main(String[] args) {
        Example e1 = new Example("A");
        Example e2 = new Example("B");
        Example e3 = new Example("C");

        e1.display();
        e2.display();
        e3.display();
    }
}


//finding max element of an array
class maxelement{
    public static void main(String []args){
        int arr[]={23, 50, 55, 23, 67};
        int max=arr[0];
        for( int num :arr){
            if(num>max){
                max=num;

            }
        }
        System.out.println("he max element is "+max);
    }
}

//find trace(tace is for sum of diagonal elements) of matrix(sum of diagonal elements)
class MatrixTrace{
    public static void main(String[]args){
        int [][]matrix ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
    int trace=0;
    for(int i=0; i<matrix.length; i++){
        trace +=matrix[i][i];
    }
    System.out.println("trace of matrix "+trace);
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------------

/** array class name finder */
class Array{
    public static void main(String []args){
        int[] intArray=new int[10];
        String[] stringArray=new String[10];
        System.out.println("class name of intarray :"+intArray.getClass().getName());
        System.out.println("class name of stringArray:"+stringArray.getClass().getName());
    }
}

//------------------------------------------------------------------------------------------------------------------------------------------
 class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
 System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
 }

//different method types

 class methodExample{
    public void sayhello(){
         System.out.println("Hello, no parameters!");

    }
    public void  printData(int num) {
        System.out.println("Integer: " + num);
    }
    public static void main(String []args){
        methodExample n=new methodExample();
        n.sayhello();
        n.printData(4);
        
    }
}

//-------------------------------------------------------------------------------------------------------------------------------------
//string constructor example

class StringExample{
    public static void main(String[]args){
        char[]  chararr={1,2,3,4,5};
        String s1=new String(chararr);
        System.out.println(s1);
    }
}


//----------------------------------------------------------------------------------------------------------------------------------------
//string concatenatination
class stringconcatenation{
    public static void main(String[]args){
         String s1="sachin";
         String s2=" hazarika";
         String s3= s1.concat(s2);
         System.out.println(s3);

    }
   
}

//-----------------------------------------------------------------------------------------------------------------------------
//override
class Animal1 {
    void sound1() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound1() {  // overriding the parent method
        System.out.println("Dog barks");
    }
}

 class TestOverride {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.sound1();   // Calls Animal's method

        Dog1 d = new Dog1();
        d.sound1();   // Calls Dog's overridden method

        Animal1 obj = new Dog1();
        obj.sound1(); // Calls Dog's method (runtime polymorphism)
    }
}

//---------------------------------------------------------------------------------------------------------------------------------
//Demonstrating Common String Methods
class StringFunctions {
    public static void main(String[] args) {
        String s = " Welcome to PES.edu ";
 System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Trimmed: " + s.trim());
        System.out.println("Substring(3,8): " + s.substring(3, 8));
        System.out.println("Replace: " + s.replace('e', 'E'));
        System.out.println("Contains 'PES': " + s.contains("PES"));
        System.out.println("Index of 'e': " + s.indexOf('e'));
        System.out.println("Last Index of 'e': " + s.lastIndexOf('e'));

    }
}
//-----------------------------------------------------------------------------------------------------------
    //  Replace and Trim Example
 class StringReplaceTrim {
    public static void main(String[] args) {
        String str = " Welcome to PES.edu ";
        System.out.println("After replace: " + str.replace('o', 'T'));
        System.out.println("After trim: " + str.trim());
    }
 } 


 //---------------------------------------“Banana”, “Orange”, “Jackfruit” Problems)
//  Banana Problem 1 –Digital Clock

// import java.time.LocalTime;
class DigitalClock {
    public static void main(String[] args) throws InterruptedException {
        while (true) { // lowercase 'true'
            System.out.print("\r" + LocalTime.now()); // '\r' rewrites same line
            Thread.sleep(1000); // wait for 1 second
        }
    }
}

//---------------------------------------------- -------------------------------------------------------
//palindrom words
class palindrom{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String words[]=sc.nextLine().split(" ");
        for(String w: words){
            String rev= new StringBuilder(w).reverse().toString();
            if(w.equalsIgnoreCase(rev)){
                System.out.println("palindrom " +w);
            }
        }
    }
}

//-------------------------------------------------------------------------------------------------------------------------------------
//A jagged array is used when your data is not uniform —different rows have different sizes, and you want memory efficiency and flexibility.
class JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = new int[2][];
        jagged[0] = new int[3];
        jagged[1] = new int[5];
 int count = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = count++;
            }
        }
 System.out.println("Jagged Array:");
        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
 }
 
//------------------------------------------------------------------static vs instance method-----------------------------------------
 class MethodTypeExample {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
 void instanceMethod() {
        System.out.println("This is an instance method.");
    }
 public static void main(String[] args) {
        MethodTypeExample.staticMethod(); // No object needed
        MethodTypeExample obj = new MethodTypeExample();
        obj.instanceMethod(); // Object needed  
        
    }
 }

 //--------------------------------------------------------------------------------------------------------------------------------
 //shopping cart system
class Shopping {
    String name;
    int quantity;
    double price;

    // Constructor must match class name
    Shopping(String name, int quantity, double price) {
        this.name = name;   
        this.quantity = quantity;
        this.price = price;
    }

    // Correct method syntax
    double calculateTotal() {
        return quantity * price;
    }

    // Display product details
    void display() {
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + calculateTotal());
    }

    // Main method
    public static void main(String[] args) {
        Shopping sp = new Shopping("Laptop", 2, 50000);
        Shopping sp1 = new Shopping("Phone", 2, 5000);

        sp1.display();
        System.out.println();
        sp.display();
    }
}
//----------------------------------------------------------------------------------------------------------------------------
// Method Overloading Example
    class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }
 // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
 // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }
 }
 class Methodoverload {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));      // 15
        System.out.println(calc.add(5, 10, 15));  // 30
        System.out.println(calc.add(5.5, 10.5));  // 16.0
    }
 }



 //---------------------------------------------------------------------------------------------------------------------------------
 //inheritance
 //singlelevel inheritance
class animal{
    void eat(){
        System.out.println("eating");
    }

}  

class dog extends animal{
    void bark(){
        System.out.println("barking ....");
    }
}
class animalbehaviour{
    public static void main(String[]args){
        dog d=new dog();
        d.eat();
        d.bark();
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------------
//  Mul level Inheritance Example
 class Animal {
    void eat() {
        System.out.println("eating...");
    }
 }
 class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
 }
 class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
 }
 class TestMultilevelInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
 }

 //-----------------------------------------------------------------------------------------------------------------------------------------
//Hierarchical Inheritance Example
 class Animall {
    void eat() {
        System.out.println("eating...");
    }
 }
 class Dogg extends Animall {
    void bark() {
        System.out.println("barking...");
    }
 }
 class Cat extends Animall {
    void meow() {
        System.out.println("meowing...");
    }
 }
class TestHierarchical {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        Dogg d = new Dogg();
        d.bark();
        d.eat();
    }
 }
 
 //-------------------------------------------------------------------------------------------------------------------------------------
 //interface in java
 interface shape{
    void getArea();//abstract method

 }
class rectangle implements shape{
    double height, width;
    rectangle(double height, double width){
        this.height=height;
        this.width=width;

    }
    public void getArea(){
        System.out.println("area of the rectangle = "+(height*width));
    }
}
class interfacedemo{
    public static void main(String[]args){
        shape sh;
        sh=new rectangle(10, 20);
        System.out.println(sh);
    }
}


//--------------------------------------------------------------------------------------------------------------------------------
//Interface Inheritance Example
 interface Animal {
    void eat();
 }
 interface Pet extends Animal {
    void play();
 }
 class Dog implements Pet {
    public void eat() {
        System.out.println("Dog eats food");
    }
 public void play() {
        System.out.println("Dog loves to play fetch");
    }
 }
  class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
 }


//-------------------------------------------------------------------------------------------------------------------------------------
//Real-Life Example — Payment System
 interface Payment {
    void processPayment(double amount);
 }
 class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of Rs. " + amount);
    }
 }
 class UpiPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of Rs. " + amount);
    }
 }
 class PaymentSystem {
    public static void main(String[] args) {
        Payment p;
 p = new CreditCardPayment();
        p.processPayment(1500);
 p = new UpiPayment();
        p.processPayment(800);
    }
 }

 // ---------------------------------------------------------------------------------------------------------------------------------
/

//  Autoboxing and Unboxing Example 
public class AutoBoxingDemo {
    public static void main(String[] args) {
        int a = 5;            // primitive
        Integer obj = a;      // Autoboxing
        System.out.println("Integer object: " + obj);
        Integer x = 10;       // Wrapper object
        int b = x;            // Unboxing
         System.out.println("Primitive value: " + b);
     }
}


//   Wrapper Class with ArrayList 
 //import java.util.ArrayList;
 public class WrapperDemo {
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // Autoboxing
         list.add(20);
        int sum = 0;
        for (Integer i : list) {
             sum += i; // Unboxing
         }
  System.out.println("Sum: " + sum);
    }
 }

//   Manual Boxing and Unboxing Example
  public class BoxingExample {
     public static void main(String[] args) {
         int num = 100;
//  // Manual boxing
         Integer boxed = Integer.valueOf(num);
 // Manual unboxing
         int unboxed = boxed.intValue();
  System.out.println("Boxed value: " + boxed);
        System.out.println("Unboxed value: " + unboxed);
    }
 }

//    Using Wrapper Methods Example
  class WrapperMethods {
    public static void main(String[] args) {
         int n = Integer.parseInt("123");
         double d = Double.valueOf("45.6");
        boolean b = Boolean.parseBoolean("true");
          System.out.println("Integer: " + n);
          System.out.println("Double: " + d);
          System.out.println("Boolean: " + b);
     }
  }

//    Comparing Wrapper and Primi ve
  class CompareWrapper {
     public static void main(String[] args) {
         Integer x = 100;
         int y = 100;
   if (x == y) { // unboxing happens automatically
             System.out.println("Equal");
         } else {
             System.out.println("Not Equal");
         }
     }
  }

  class ParseDemo {
     public static void main(String[] args) {
        try {
             int num = Integer.parseInt("12a"); // invalid number
             System.out.println(num);
         } catch (NumberFormatException e) {
             System.out.println("Invalid number format!");
         }
    
         }
     }
 }

//   Wrapper Class Behavior with null
 class NullWrapper {
     public static void main(String[] args) {
         Integer x = null;
  try {
             int y = x; // causes NullPointerException
         } catch (NullPointerException e) {
            System.out.println("Cannot unbox null object!");
        }
     }
