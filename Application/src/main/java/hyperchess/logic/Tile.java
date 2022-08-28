package hyperchess.logic;

public class Tile {
    private String location;
    private String color;

    public Tile(String location, String color) {
        this.location = location;
        this.color = color;
    }

    public void previewMode(){
        this.color = "Red";
    }
}
