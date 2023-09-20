import javax.swing.*;

public class Pawn extends Piece{

    boolean isWhite;
    public Pawn(Coordinate start, boolean isWhite){

        super(start);
        this.coordinate = start;
        this.isWhite = isWhite;
        if(isWhite == true){
            this.pieceIcon  = new ImageIcon("ChessPieces/w_pawn.png");
        }else{
            this.pieceIcon  = new ImageIcon("ChessPieces/b_pawn.png");
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
    public Coordinate[] findDestinations(){
        int new_row = 0;
        int new_column = 0;

        if(isWhite){
            new_row = this.coordinate.x + 1;
            new_column = this.coordinate.y;
        }else{
            new_row = this.coordinate.x - 1;
            new_column = this.coordinate.y;
        }

        Coordinate newCoordinate = new Coordinate(new_row,new_column);
        Coordinate coordinatesArr[] = new Coordinate[1];
        coordinatesArr[0] = newCoordinate;
        return coordinatesArr;

    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public void movePiece() {

    }
}
