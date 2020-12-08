package DevClub.theSimOOP.item;

public class Table {
    private String color;
    private int numberOfLeg;
    private String material;

    public Table(String color, int numberOfLeg, String material) {
        this.color = color;
        this.numberOfLeg = numberOfLeg;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", numberOfLeg=" + numberOfLeg +
                ", material='" + material + '\'' +
                '}';
    }
}
