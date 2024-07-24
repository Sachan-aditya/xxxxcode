class Box {
    double width;
    double height;
    double depth;

    Box(){        // Default setting by this constructor
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() { // compute and return volume
        return width * height * depth;
    }
}

// Here, Box is extended to include weight.
class BoxWeight extends Box {
    double weight; // weight of box

    // Constructors for BoxWeight
    BoxWeight() {      // Default constructor
        super();           // Call the default constructor in the super class
        weight = 0.0;
    }


    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);  // Call the overloaded constructor in the super class
        weight = m;
    }
}

class Demonstration_62b {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        // System.out.println("Weight of mybox1 is " + mybox1.weight); ERROR!
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
    }
}
