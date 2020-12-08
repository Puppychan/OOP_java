package DevClub.theSimOOP.item;

public class Chair {
    private String color;
    private String material;
    private int numberOfLeg;

    public Chair(String color, String material, int numberOfLeg) {
        this.color = color;
        this.material = material;
        this.numberOfLeg = numberOfLeg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumberOfLeg() {
        return numberOfLeg;
    }

    public void setNumberOfLeg(int numberOfLeg) {
        this.numberOfLeg = numberOfLeg;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", numberOfLeg=" + numberOfLeg +
                '}';
    }
}
