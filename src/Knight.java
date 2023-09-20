import javax.swing.*;

public class Knight extends Piece{

    boolean isWhite;

    public Knight(Coordinate start, boolean isWhite){
        super(start);
        this.coordinate = start;
        this.isWhite = isWhite;
        if(isWhite == true){
            this.pieceIcon  = new ImageIcon("ChessPieces/w_knight.png");
        }else{
            this.pieceIcon  = new ImageIcon("ChessPieces/b_knight.png");
        }
    }

    @Override
    public boolean isValidPath(Coordinate source, Coordinate destination) {
        return false;
    }

    @Override
    public int[][] drawPath(Coordinate source, Coordinate destination) {
        return new int[0][];
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public void movePiece() {

    }

    @Override
    public Coordinate[] findDestinations(){
        Coordinate coordinatesArr[] = new Coordinate[1];
        return coordinatesArr;
    }
}
