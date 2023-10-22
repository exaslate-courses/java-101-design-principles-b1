public class Tesla implements ElectricVehicle {
    int currentSpeed = 60; // mph

    public void increaseSpeed() {
        this.currentSpeed += 10;
    }
    public void reduceSpeed() {
        this.currentSpeed -= 10;
    }
}
