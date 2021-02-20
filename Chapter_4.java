// Demonstrate the % operator.
class Modulus {
    public static void main(String args[]) {
        int x = 42;
        double y = 42.25;

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
    }
}

// Demonstrate the bitwise logical operators.
class BitLogic {
    public static void main(String args[]) {
        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "0000", "1110", "1111"
        };
        int a = 3; // 0 + 2 + 1 or 0011 in binary
        int b = 6; // 4 + 2 + 0 or 0110 in binary
        int c = a | b;
        int d = a & b;
        int e = a^b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

    }
}

//Demonstrate the boolean logical operators.
class BoolLogic {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a &b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("               a = " + a);
        System.out.println("               b = " + b);
        System.out.println("               a | b = " + c);
        System.out.println("               a & b = " + d);
        System.out.println("               a^b = " + e);
        System.out.println("               !a&b | a&!b = " + f);
        System.out.println("               !a = " + g);
    }
}

//Demonstrate ?.
class Ternary {
    public static void main(String args[]) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; //get absolute value of i
        System.out.print("Absolute value  of  ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 0 ? -i : i; //Get absolute value of i
        System.out.print("Abolute value of ");
        System.out.println(i + " is " + k);
    }
}