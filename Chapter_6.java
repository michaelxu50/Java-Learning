//A program that uses the Box class.
class Boxda {
    double width;
    double height;
    double depth;

    //display volume of a box
    double volume () {
        return width * height * depth;
    }
}

//This class declares na object of type Box.
class BoxDemo {
    public static void main(String args[]) {
        Boxda mybox1 = new Boxda();
        Boxda mybox2 = new Boxda();
        double vol;

        //assign valuies to mybox's instance varibales
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //assign value of box2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //display volume of first box
        System.out.println("Volume is " + mybox1.volume());

        //display volume of second box
        System.out.println("Volume is " + mybox2.volume());
    }
}

class Box {
    double width;
    double height;
    double depth;

    //This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //compute and return volume.
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo2 {
    public static void main(String args[]) {
        //declare, allocate, and initialize Box objects.
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

class Stack {
    int stck[] = new int[10];
    int tos;

    //Initialize top-of-stack
    Stack() {
        tos = -1;
    }

    //Push an item onto the stack
    void push(int item) {
        if(tos==9)
            System.out.println("Stack is full. ");
        else
            stck[++tos] = item;
    }

    //Pop an itme from the stack
    int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //push those numbers off the stack
        for(int i=0; i<10; i++) mystack1.push(i);
        for(int i=0; i<20; i++) mystack2.push(i);

        //Pop those numbers off the stack.
        System.out.println("Stack in mystack1: ");
        for(int i=0; i<10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2: ");
        for(int i=0; i<10; i++) {
            System.out.println(mystack2.pop());
        }
    }
}

