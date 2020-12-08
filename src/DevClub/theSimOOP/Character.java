package DevClub.theSimOOP;

public class Character {
    private String name;
    private String hairStyle;
    private String face;
    private String skin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairStyle() {
        return name +"'s hairstyle is " + hairStyle;

    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Character(String name, String hairStyle, String face, String skin) {
        this.name = name;
        this.hairStyle = hairStyle;
        this.face = face;
        this.skin = skin;
    }

    public String dance(){
        return name + " is dancing";
    }
    public String walk(){
        return name + " is walking";
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", hairStyle='" + hairStyle + '\'' +
                ", face='" + face + '\'' +
                ", skin='" + skin + '\'' +
                '}';
    }
}
