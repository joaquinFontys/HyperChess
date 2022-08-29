package hyperchess.logic;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {
    private String location;

    public Tile(String location, javafx.scene.paint.Paint color) {
        this.location = location;
        setFill(color);
        setHeight(100);
        setWidth(100);
    }

    public void previewMode(){
        setFill(Color.RED);
    }
}
