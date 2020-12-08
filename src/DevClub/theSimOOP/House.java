package DevClub.theSimOOP;

import DevClub.theSimOOP.item.Table;
import DevClub.theSimOOP.room.BedRoom;

public class House {
    private String door;
    private Table table;
    private BedRoom bedRoom;
    private String living_room;

    public void setDoor(String door) {
        this.door = door;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public void setBedRoom(BedRoom bedRoom) {
        this.bedRoom = bedRoom;
    }

    public String getLiving_room() {
        return living_room;
    }

    public void setLiving_room(String living_room) {
        this.living_room = living_room;
    }

    public String getDoor() {
        return door;
    }
    public Table getTable () {
        return table;
    }

    public House(String door, Table table, BedRoom bedRoom, String living_room) {
        this.door = door;
        this.table = table;
        this.bedRoom = bedRoom;
        this.living_room = living_room;
    }

    @Override
    public String toString() {
        return "House{" +
                "door='" + door + '\'' +
                ", table='" + table + '\'' +
                ", bedRoom='" + bedRoom + '\'' +
                ", livingRoom='" + living_room + '\'' +
                '}';
    }
}