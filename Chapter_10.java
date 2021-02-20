import java.util.Random;

//use page 240-242 for error list.


//This won't work.
class Exc1 {
    public static void main(String args[]) {
        try { //monitor a block of code.
            int d = 0;
            int a = 42 / d;
            System.out.println("This will not be printed. ");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero. ");
        }
        System.out.println("After catch statement.");
    }
}

//handle an exception and move on.
class HandleError {
    public static void main(String args[]) {
        int a=0, b=0, c=0;
        Random r = new Random();

        for(int i=0; i<32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            }
            catch (ArithmeticException e) {
                System.out.println("Division by zero.");
                a = 0; //set a to zero and continue.
            }
            System.out.println("a: " + a);
        }
    }
}

class MultipleCatches {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int c[] = { 1 };
            c[42] = 99;
        }
        catch(ArithmeticException e) {
            System.out.println("Divide by 0 " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks. ");
    }
}

class NestTry {
    public static void main(String args[]) {
        try {
            int a = args.length;

            //If no command-line args are present, the following statement will generate a divide by zero exception.

            int b = 42/a;

            System.out.println("a = " + a);

            try {//nested try block
                if(a==1) a = a/(a-a); //division by zero.

                if(a==2) {
                    int c[] = { 1 };
                    c[42] = 99; //generate an out-of bounrds exception
                }
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds:" + e);
            }
        }
        catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}

//demonstrate throw.
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Demo");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside demoproc");
            throw e; //rethrow the exception
        }
    }
    public static void main(String args[]) {
        try {
            demoproc();
        }
        catch(NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}

class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne. ");
        throw new IllegalAccessException("Demo");
    }
    public static void main(String args[]) {
        try {
            throwOne();
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}

class FinallyDemo {
    static void procA() {
        //Also possible after a return or normally
        try {
            System.out.println("1");
            throw new RuntimeException("Demo");
        }
        finally {
            System.out.println("Finally Test1");
        }
    }
    public static void main(String args[]) {
        try {
            procA();
        }
        catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}

class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Called computer(" + a + ")");
        if(a > 10)
            throw new MyException(a);
        System.out.println("Normal exit");
    }
    public static void main(String args[]) {
        try {
            compute(1);
            compute(20);
        }
        catch (MyException e) {
            System.out.println("Cauguht " + e);
        }
    }
}

class ChainExcDemo {
    static void demoproc() {

        //create an exception.
        NullPointerException e = new NullPointerException("top layer");

        //add a clause
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }
    public static void main(String args[]) {
        try {
            demoproc();
        }
        catch (NullPointerException e) {
            //display top level exception
            System.out.println("Caught: " + e);

            //display cause exception
            System.out.println("Original cause: " + e.getCause());
        }
    }
}




