public class Circulation {
    public static void main(String[] args) {

        //Object a = new Automobile(0, 50);
        //Object v = new Velo(0, "VTT");
        // Fix it
        // Replaced generic Object types with specific class types (Automobile and Velo).
        Automobile a = new Automobile(0, 50);
        Velo v = new Velo(0, "VTT");

        Vehicule vh = new Vehicule(3, 10);
        Conducteur c = new Conducteur("Karim", "1234567");

        v.tombe(); // To avoid compilation error, 'v' should be of type Velo with a 'tombe' method.

        //c.conduit((Automobile) v); // Runtime error, needs casting from Velo to Automobile to fix.
        // Casting is required because 'conduit' method expects an argument of type Automobile, and 'v' is of type Velo (a subclass of Vehicule).

        // Valid call to conduit with Object 'a', which is of type Vehicule
        c.conduit(a);

        vh = a; // Avoids casting issues; vh now refers to the instance of Automobile.
        // 'vh' is declared as Vehicule, and 'a' is of type Automobile, a subclass of Vehicule.

        ((Automobile) vh).faitLePlein(10); // Adding vh = a to avoid uncasting and runtime error.
        // Cast is needed because 'vh' is declared as Vehicule, and 'faitLePlein' is a method specific to Automobile (a subclass of Vehicule).
    }
}
