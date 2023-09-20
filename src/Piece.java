import javax.swing.*;

public abstract class Piece {
    boolean isWhite;
    Coordinate coordinate;
    public ImageIcon pieceIcon;
    public String testStr;
    public Piece(Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public abstract boolean isValidPath(Coordinate source, Coordinate destination);

    public abstract int[][] drawPath(Coordinate source, Coordinate destination);

    public abstract Type getType();

    public abstract void movePiece();


    public abstract Coordinate[] findDestinations();



}
