public class Truck {
    private String plate;
    private Load load;

    public Truck(String plate, Load load) {
        this.plate = plate;
        this.load = load;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "plate='" + plate + '\'' +
                ", load=" + load.isPerishable() +
                '}';
    }
}
