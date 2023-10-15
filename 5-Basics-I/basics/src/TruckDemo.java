public class TruckDemo {
    public static void main(String[] args) {
        Truck t1 = new Truck();

        t1.setColor("Red");

        System.out.println(t1.color);
        System.out.println(t1.model);


        var t2 = new Truck();
        t2.setModel("Mustang");

        System.out.println(t2.model);
    }
}
