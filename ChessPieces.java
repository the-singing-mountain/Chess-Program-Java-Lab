import java.awt.*;
import javax.swing.*;

public class ChessPieces extends JLabel {
    //setting characteristics of the unicode images with AWT Classes
    Font f = new Font("Ariel", Font.PLAIN, 45);
    Color bgLight = new Color(255,255,255);
    Color bgDark = new Color(0,0,0);
    
    ChessPieces(String s)
    {
        super(s);
    }

    void set(int idx,int row)
    {
        setFont(f);
        setOpaque(true);
        //setting background color
        if((idx+row)%2 == 0)
            setBackground(bgLight);
        else
            setBackground(bgDark);
    }
}