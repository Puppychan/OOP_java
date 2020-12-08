package DevClub.theSimOOP.room;

public class BedRoom {
    private float size;
    private String wallColor;

    public BedRoom(float size, String wallColor) {
        this.size = size;
        this.wallColor = wallColor;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor) {
        this.wallColor = wallColor;
    }

    @Override
    public String toString() {
        return "BedRoom{" +
                "size=" + size +
                ", wallColor='" + wallColor + '\'' +
                '}';
    }
}
