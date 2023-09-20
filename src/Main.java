public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ChessBoard gameBoard = new ChessBoard();

        Pawn bpawn1 = new Pawn(new Coordinate(6,0),false);
        Pawn bpawn2 = new Pawn(new Coordinate(6,1),false);
        Pawn bpawn3 = new Pawn(new Coordinate(6,2),false);
        Pawn bpawn4 = new Pawn(new Coordinate(6,3),false);
        Pawn bpawn5 = new Pawn(new Coordinate(6,4),false);
        Pawn bpawn6 = new Pawn(new Coordinate(6,5),false);
        Pawn bpawn7 = new Pawn(new Coordinate(6,6),false);
        Pawn bpawn8 = new Pawn(new Coordinate(6,7),false);

        Rook brook1 = new Rook(new Coordinate(7,0), false);
        Rook brook2 = new Rook(new Coordinate(7,7), false);

        Knight bknight1 = new Knight(new Coordinate(7,1), false);
        Knight bknight2 = new Knight(new Coordinate(7,6), false);

        Bishop bbishop1 = new Bishop(new Coordinate(7,2), false);
        Bishop bbishop2 = new Bishop(new Coordinate(7,5), false);

        King bking = new King(new Coordinate(7,4),false);
        Queen bqueen = new Queen(new Coordinate(7,3),false);

        Pawn wpawn1 = new Pawn(new Coordinate(1,0),true);
        Pawn wpawn2 = new Pawn(new Coordinate(1,1),true);
        Pawn wpawn3 = new Pawn(new Coordinate(1,2),true);
        Pawn wpawn4 = new Pawn(new Coordinate(1,3),true);
        Pawn wpawn5 = new Pawn(new Coordinate(1,4),true);
        Pawn wpawn6 = new Pawn(new Coordinate(1,5),true);
        Pawn wpawn7 = new Pawn(new Coordinate(1,6),true);
        Pawn wpawn8 = new Pawn(new Coordinate(1,7),true);

        Rook wrook1 = new Rook(new Coordinate(0,0), true);
        Rook wrook2 = new Rook(new Coordinate(0,7), true);

        Knight wknight1 = new Knight(new Coordinate(0,1), true);
        Knight wknight2 = new Knight(new Coordinate(0,6), true);


        Bishop wbishop1 = new Bishop(new Coordinate(0,2), true);
        Bishop wbishop2 = new Bishop(new Coordinate(0,5), true);

        King wking = new King(new Coordinate(0,4),true);
        Queen wqueen = new Queen(new Coordinate(0,3),true);

        gameBoard.addPiece(bpawn1);
        gameBoard.addPiece(bpawn2);
        gameBoard.addPiece(bpawn3);
        gameBoard.addPiece(bpawn4);
        gameBoard.addPiece(bpawn5);
        gameBoard.addPiece(bpawn6);
        gameBoard.addPiece(bpawn7);
        gameBoard.addPiece(bpawn8);

        gameBoard.addPiece(brook1);
        gameBoard.addPiece(brook2);

        gameBoard.addPiece(bknight1);
        gameBoard.addPiece(bknight2);

        gameBoard.addPiece(bbishop1);
        gameBoard.addPiece(bbishop2);

        gameBoard.addPiece(bking);
        gameBoard.addPiece(bqueen);

        gameBoard.addPiece(wpawn1);
        gameBoard.addPiece(wpawn2);
        gameBoard.addPiece(wpawn3);
        gameBoard.addPiece(wpawn4);
        gameBoard.addPiece(wpawn5);
        gameBoard.addPiece(wpawn6);
        gameBoard.addPiece(wpawn7);
        gameBoard.addPiece(wpawn8);

        gameBoard.addPiece(wrook1);
        gameBoard.addPiece(wrook2);

        gameBoard.addPiece(wknight1);
        gameBoard.addPiece(wknight2);

        gameBoard.addPiece(wbishop1);
        gameBoard.addPiece(wbishop2);

        gameBoard.addPiece(wking);
        gameBoard.addPiece(wqueen);

        gameBoard.drawBoard();
    }
}