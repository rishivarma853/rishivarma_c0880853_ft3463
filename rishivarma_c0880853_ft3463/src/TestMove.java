// the Moving is  a collection of items
public class TestMove {

    /******************************************************
     COMPLETE YOUR MOVING CLASS AND ADD REQUESTED CLASSES
     *******************************************************/
    public static void main(String[] args) {
//        we create a move of 2 items
        Moving moving = new Moving(2);

        //we creat eand fill 3 boxses
        Box box1 = new Box(1,1);
        box1.addItem(new SimpleItem("scissors"));
        Box box2 = new Box(1,2);
        box2.addItem(new SimpleItem("book"));
        Box box3 = new Box(2,3);
        box3.addItem(new SimpleItem("compass"));

        // we add later another box that contains an object "scarf"
        Box box4 = new Box(1,4);
        box4.addItem(new SimpleItem("scarf"));
        box3.addItem(box4);

        //we add the three boxses to one box
        Box box5 = new Box(3,5);
        box5.addItem(box1);
        box5.addItem(box2);
        box5.addItem(box3);

        //we add a box containing 3 items
        Box box6 = new Box(3,6);
        box6.addItem(new SimpleItem("pencils"));
        box6.addItem(new SimpleItem("pens"));
        box6.addItem(new SimpleItem("rubber"));


        moving.addBox(box5);
        moving.addBox(box6);

        moving.print();

        System.out.println("the scarf is in the box number: " + moving.find("scarf"));
    }
}


