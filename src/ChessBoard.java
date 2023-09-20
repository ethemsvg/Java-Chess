import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessBoard extends JFrame {

    private JPanel panel;
    private JCell[][] cells = new JCell[8][8];
    public ChessBoard(){
        panel = new JPanel();
        this.setSize(640,640);
        this.setLocationRelativeTo(null);
        panel.setSize(640,640);
        panel.setLayout(new GridLayout(8,8));


        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){

                cells[i][j] = new JCell(" ");
                cells[i][j].setSize(new Dimension(50,50));
                cells[i][j].setFocusPainted(false);

                if( (i+j) % 2 == 0 ){
                    cells[i][j].setBackground(new Color(200,200,200));
                }else{
                    cells[i][j].setBackground(new Color(80,80,80));
                }



            }
        }
        setBoardFunctionality();
        this.add(panel);
        this.setDefaultCloseOperation(3);
    }

    public void addPiece(Piece piece){

        cells[piece.coordinate.x][piece.coordinate.y].setIcon(piece.pieceIcon);
        cells[piece.coordinate.x][piece.coordinate.y].piece = piece;
        cells[piece.coordinate.x][piece.coordinate.y].hasPiece = true;
    }

    public void drawBoard(){

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                panel.add(cells[i][j]);
            }
        }


        panel.setVisible(true);
        this.setVisible(true);
    }

    public void setBoardFunctionality(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                int row=i;
                int col=j;
                cells[i][j].addActionListener(e -> {
                    if(cells[row][col].hasPiece){
                        movePiece(cells[row][col].piece);
                    }


                });


            }
        }
    }

    private ActionListener moveListener;





    public void movePiece(Piece piece){

        Coordinate newCoordinates[] = piece.findDestinations(); // Decrement y to move upwards
        Coordinate newCoordinate = newCoordinates[0];
        int new_row = newCoordinate.x;
        int new_column = newCoordinate.y;

        System.out.println("New row:"+ new_row + " New column: " + new_column);
        System.out.println("Old row:" + piece.coordinate.x + " Old column: " + piece.coordinate.y);

        Piece thePiece = cells[piece.coordinate.x][piece.coordinate.y].piece;
        Color oldColor = cells[new_row][new_column].getBackground();
        this.cells[new_row][new_column].setBackground(Color.green);
        System.out.println("The color is set to green just now.");

        ActionListener oneTimeListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cells[new_row][new_column].getBackground() == Color.green){

                    cells[piece.coordinate.x][piece.coordinate.y].setIcon(null);
                    cells[piece.coordinate.x][piece.coordinate.y].hasPiece = false;

                    cells[new_row][new_column].piece = piece;
                    cells[new_row][new_column].setIcon(piece.pieceIcon);
                    cells[new_row][new_column].setBackground(oldColor);
                    cells[new_row][new_column].hasPiece = true;

                    piece.coordinate.x = new_row;
                    piece.coordinate.y = new_column;


                }

                //cells[new_row][new_column].removeActionListener(this);



            }
        };

        cells[new_row][new_column].addActionListener(oneTimeListener);
        cells[new_row-1][new_column].setBackground(oldColor);

        // Update the piece's coordinates
        drawBoard();
        return;
    }


}
