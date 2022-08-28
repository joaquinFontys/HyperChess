package hyperchess.logic;

import java.util.List;

public class Player {
    private String name;
    private List<Piece> piecesTaken;
    private int associatedColor;

    public Player(String name, int associatedColor) {
        this.name = name;
        this.associatedColor = associatedColor;
    }

    public void addPiece(Piece pieceToAdd){
        piecesTaken.add(pieceToAdd);
    }

}
