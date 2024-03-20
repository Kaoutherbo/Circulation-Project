public class Circulation {
    public static void main(String[] args) {

        //Object a = new Automobile(0, 50);
        //Object v = new Velo(0, "VTT");

        // Create instances of Automobile and Velo
        Automobile a = new Automobile(0, 50);
        Velo v = new Velo(0, "VTT");

        // Create instances of Vehicule and Conducteur
        Vehicule vh = new Vehicule(3, 10);
        Conducteur c = new Conducteur("Karim", "1234567");

        // Simulate a bicycle falling
        v.tombe();

        // c.conduit((Automobile)v);
        // Error 3: Fix casting issue by passing Velo object directly
        c.conduit(v);

        // Error 4: Avoid casting issue by assigning vh to the same object as a
        vh = a;

        // Invoke faitLePlein method specific to Automobile by casting vh to Automobile
        ((Automobile) vh).faitLePlein(10);
    }
}
