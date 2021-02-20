/*
  This is a simple Java program.
  Call this file "Example.java".
*/
class Example {
  //Your program begins with a call to main().
  public static void main(String args[]) {
    System.out.println("\nThis is a simple Java program.");
  }
}

/*
  Here is another short examples.
  Call this file "Example2.java".
*/

class Example2 {
  public static void main(String args []) {
    var num = 100; // this assigns num the value 100

    System.out.println("The number is " + num);

    num = num * 2;

    System.out.print("The value of the number times 2 is ");
    System.out.println(num);
  }
}

class IfSample {
  public static void main(String args[]){
    int x, y;

    x = 10;
    y = 20;

    if (x < y) System.out.println("X is less than y");

    x = x*2;
    if (x == y) System.out.println("x now is now equal to y");

    x = x*2;
    if (x > y) System.out.println("x now is now greater to y");

    //This won't display anything
    if (x == y) System.out.println("you won't see this");
  }
}

// Demostrate for loop with file ForTest.java".
class ForTest {
  public static void main(String args[]){
    int x;

    for(x = 0; x<10; x++)
      System.out.println("This is x: " + x);
  }
}

// Demonstrate a block of code with this file called "BlockTest.java"
class BlockTest {
  public static void main(String args[]) {
    int x, y;

    y = 20;

    //the target of this loop is a block
    for(x = 0; x<10; x++) {
      System.out.println("This is x: " + x);
      System.out.println("this is y: " + y);
      y = y - 2;
    }
  }
}

// Compute distance light travels using long variables.
class Light {
  public static void main(String args[]) {
    int lightspeed;
    short days;
    int seconds;
    long distance;

    // approximate speed of light in miles per second
    lightspeed = 186000;

    days = 1000; //specify number of days here

    seconds = days * 24 * 60 * 60; // convert to seconds

    distance = lightspeed * seconds; // compute distance

    System.out.print("In " + days);
    System.out.print(" days light will travel about ");
    System.out.println(distance + " miles.");
  }
}

class Area {
  public static void main(String args[]) {
    double pi, r, a;
    r = 10.8; // radius of a circle
    pi = 3.1416; //pi, appoximately
    a = pi * r * r; //compute area

    System.out.println("Area of a circle is " + a);
  }
}

//Demonstrate char data type
class CharDemo {
  public static void main(String args[]) {
    char ch1, ch2;

    ch1 = 88; // code for X
    ch2 = 'Y';

    System.out.print("ch1 and ch2: ");
    System.out.println(ch1 + " " + ch2);
  }
}

// Demonstrate boolean values.
class BoolTests {
  public static void main(String args[]) {
    boolean b;

    b = false;
    System.out.println("b is " + b);
    b = true;
    System.out.println("b is "+ b);

    //boolean value can control the if statement
    if (b) System.out.println("This is executed.");
    b = false;
    if (b) System.out.println("This is not executed.");

    //outcome of a relational operator is a boolean values
    System.out.println("10 > 9 is " + (10 > 9));
  }
}

// Dempnstrate dynamic initialization.
class DynInit {
  public static void main(String args[]) {
    double a = 3.0, b = 4.0;

    // c is dynamically initialized
    double c = Math.sqrt(a * a + b * b);

    System.out.println("Hypostenuse is " + c);
  }
}

// Demonstrate block scope.
class Scope {
  public static void main(String args[]) {
    int x; // known to all code within main

    x = 10;
    if(x == 10) { // start new scope
      int y = 20; // known only to this block

      //x and y both known here.
      System.out.println("x and y: " + x + " " + y);
      x = y * 2;
    }
    // y is 100; // Error! y is not known here
    // x is still known here.
    System.out.println("x is " + x);
  }
}

// Demonstrate lifetime of a variable.
class LifeTime {
  public static void main(String args[]) {
    int x;

    for(x = 0; x < 3; x++) {
      int y = -1; // y is initialized each time block is entered
      System.out.println("y is: " + y); // this always prints -1
      y = 100;
      System.out.println("y is now: " + y);
    }
  }
}

// Demonstrate casts.
class Conversion {
  public static void main(String args[]) {
    byte b;
    int i = 257;
    double d = 323.142;

    System.out.println("\nConversion of int to byte.");
    b = (byte) i;
    System.out.println("i and b " + i + " " + b);

    System.out.println("\nConversion of int to byte. ");
    i = (int) d;
    System.out.println("d and i " + d + " " + i);

    System.out.println("\nConversion of double to byte.");
    b = (byte) d;
    System.out.println("d and b " + d + " " + b);
  }
}

class Promote {
  public static void main(String args[]) {
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;
    double result = (f*b) + (i/c) - (d*s);
    System.out.println((f * b) + (i / c) + " - " + (d * s));
    System.out.println("result = " + result);
  }
}

// Demonstrate a one-dimensional array.
class Array {
  public static void main(String args[]) {
    int month_days[];
    month_days = new int[12];
    month_days[0] = 31;
    month_days[1] = 28;
    month_days[2] = 31;
    month_days[3] = 30;
    month_days[4] = 31;
    month_days[5] = 30;
    month_days[6] = 31;
    month_days[7] = 31;
    month_days[8] = 30;
    month_days[9] = 31;
    month_days[10] = 30;
    month_days[11] = 31;
    System.out.println("April has " + month_days[3] + " days.");
  }
}

// An improved version of the previous program
class AutoArray {
  public static void main(String args[]) {

    int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    System.out.println("April has " + month_days[3] + " days.");
  }
}

//Average an array of values.
class Average {
  public static void main(String args[]) {
    double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
    double result = 0;
    int i;
    for(i=0; i<5; i++) {
      result = result + nums[i];
    }
    System.out.println("Average is " + result / 5);
  }
}

// Demonstrate a 2D array
class TwoDArray {
  public static void main(String args[]) {
    int twoD[][] = new int[4][5];
    int i, j, k = 0;

    for(i = 0; i<4; i++) {
      for(j=0; j<5; j++) {
        twoD[i] [j] = k;
        k++;
        System.out.print(twoD[i][j] + " ");
      }
      System.out.println();
    }
  }
}

//Manually allocate differing size of second dimensions.
class TwoDAgain {
  public static void main(String args[]) {
    int twoD[][] = new int[4][];
    twoD[0] = new int[1];
    twoD[1] = new int[2];
    twoD[2] = new int[3];
    twoD[3] = new int[4];

    int i, j, k = 0;
    for(i=0; i<4; i++) {
      for(j=0; j<i+1; j++) {
        twoD[i][j] = k;
        k++;
        System.out.print(twoD[i][j] + " ");
      }
      System.out.println();
    }
  }
}

class Matrix {
  public static void main(String args[]) {
    double m[][] = {
            {0*0, 1*0, 2*0, 3*0},
            {0*1, 1*1, 2*1, 3*1},
            {0*2, 1*2, 2*2, 3*2},
            {0*3, 1*3, 2*3, 3*3}
    };
    int i, j;

    for(i=0; i<4; i++) {
      for(j=0; j<4; j++) {
        System.out.println(m[i][j] + " ");
      }
      System.out.println();
    }
  }
}

class ThreeDMatrix {
  public static void main(String args[]) {
    int threeD[][][] = new int[3][4][5];
    int i, j, k;

    for(i=0; i<4; i++) {
      for (j = 0; j < 4; j++) {
        for (k = 0; k < 5; k++) {
          threeD[i][j][k] = i * j * k;
          System.out.print(threeD[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}

// A simple demonstration of local variable type onference.
class VarDemo {
  public static void main(String args[]) {

    //Use type infernece to determine the type of the variable named avg. In this case, double is inferred.
    var avg = 10;
    System.out.println("Value of avg: " + avg);

    //In the following context, var is not a predefined identifier.
    //It is simply a user-defined variable name.
    int var = 1;
    System.out.println("Value of var: " + var);

    //Interestingly, in the following sequence, var is used aas both the typ eof delaration and as a variable name
    var k = -var;
    System.out.println("Value of k: " + k);
  }
}