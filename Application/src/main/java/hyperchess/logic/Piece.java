package hyperchess.logic;

import javafx.scene.Node;
import javafx.scene.image.Image;

import java.awt.*;
import java.io.FileInputStream;

public class Piece {
    private String job;
    private String location;
    private javafx.scene.image.Image profile;

    public Piece(String job, String location, javafx.scene.image.Image piece) {
        this.job = job;
        this.location = location;
        this.profile = piece;
    }

    public void move(String boardLocation){

    }

    public void surrender(Player winner){

    }

    public String getJob() {
        return job;
    }

    public String getLocation() {
        return location;
    }

    public Image getProfile() {
        return profile;
    }
}
