public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();

        System.out.println(v1.color);

        v2.setColor("White");
        System.out.print(v2.color);
    }
}
