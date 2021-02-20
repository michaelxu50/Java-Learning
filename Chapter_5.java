class IfElse {
    public static void main(String args[]) {
        int month = 4; //April
        String season;

        if(month == 12 || month == 1 || month == 2) {
            season = "Winter";
        }
        else if(month == 3 || month == 4 || month == 5) {
            season = "Spring";
        }
        else if(month == 6 || month == 7 || month == 8) {
            season = "Summer";
        }
        else if(month == 9 || month == 10 || month == 11) {
            season = "Fall";
        }
        else {
            season = "Bogus Month";
        }

        System.out.println("April is in the " + season + ".");
    }
}

class SampleSwitch {
    public static void main(String args[]) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero. ");
                    break;
                case 1:
                    System.out.println("i is one. ");
                    break;
                case 2:
                    System.out.println("i is two. ");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                default:
                    System.out.println("i is greater than 3.");

            }
    }
}

class StringSwitch {
    public static void main(String args[]) {
        String str = "two";

        switch(str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}

class While {
    public static void main(String args[]) {
        int n = 10;

        while(n > 0) {
            System.out.println("tick " + n);
            n--;
        }
    }
}

class NoBody {
    public static void main(String args[]) {
        int i, j;

        i = 100;
        j = 200;

        //find midpoint between i and j
        while (++i < --j); //no body in this loop

        System.out.println("midpoint is " + i);
    }
}

class DoWhile {
    public static void main(String args[]) {
        int n = 10;

        do {
            System.out.println("tick " + n);
            n--;
        } while(n>0);
    }
}

class FindPrime {
    public static void main(String args[]) {
        int num;
        boolean isPrime;

        num = 14;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i=2; i <= num/i; i++) {
            if((num %i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}

//parts of the for loop can be empty.
class ForVar {
    public static void main(String args[]) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println("i is " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}

class ForEach {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        //use for-each style for to display and sum the value
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum +=x;
        }
        System.out.println("Summation: " + sum);
    }
}

class ForEach2 {
    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];

        //give nums some values
        for (int i = 0; i<3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int x[] : nums) {
            for(int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}

class Search {
    public static void main(String args[]) {
        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4};
        int val = 9;
        boolean found = false;

        //use for-each style for to search nums for val
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Value found!");
    }
}

class Nested {
    public static void main(String args[]) {
        int i, j;

        for (i=0; i<10; i++) {
            for (j = i; j<10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}

class BreakLoop3 {
    public static void main(String args[]) {
        for (int i = 1; i<4; i++) {
            System.out.print("Pass " + i + ":  ");
            for (int j=0; j<100; j++) {
                if (j==10) break; //terminate loop if j is 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops complete. ");
    }
}
//use break to exit nested loops.
class BreakLoop4 {
    public static void main(String args[]) {
        outer: for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for(int j=0; j<100; j++) {
                if (j == 10) break outer; //exit both loops
                System.out.print(j + " ");
            }
            System.out.println("This will not print");
        }
        System.out.println("Loops complete. ");
    }
}

class Continue {
    public static void main(String args[]) {
        for (int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }
    }
}

//Demonstrate return.
class Return {
    public static void main(String args[]) {
        boolean t = true;

        System.out.println("Before the return. ");

        if(t) return; //return to caller

        System.out.println("This won't execute. ");
    }
}