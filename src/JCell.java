import javax.swing.*;
import java.awt.*;

public class JCell extends JButton {

    public Piece piece;
    public boolean hasPiece;

    public JCell(){
        super();
        setSize(new Dimension(50,50));
        setFocusPainted(false);
    }

    public JCell(String contentText){
        super(contentText);
        setSize(new Dimension(50,50));
        setFocusPainted(false);
    }


}
