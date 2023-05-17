public class Load {
    private boolean isPerishable;
    private double length;
    private double weight;

    public Load(boolean isPerishable,double length, double weight) {
        this.isPerishable = isPerishable;
    }

    public boolean isPerishable() {
        return isPerishable;
    }

    public void setPerishable(boolean perishable) {
        isPerishable = perishable;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
