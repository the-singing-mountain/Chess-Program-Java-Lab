import java.awt.*;
import javax.swing.JFrame;


public class ChessBoard extends JFrame {


   //Initialise arrays to hold panels and images of the board

    private ChessPieces[] labels = new ChessPieces[] {
    // black
    new ChessPieces("\u265C"), new ChessPieces("\u265E"), new ChessPieces("\u265D"), 
    new ChessPieces("\u265B"), new ChessPieces("\u265A"), new ChessPieces("\u265D"), 
    new ChessPieces("\u265E"), new ChessPieces("\u265C"), new ChessPieces("\u265F"), 
    new ChessPieces("\u265F"), new ChessPieces("\u265F"), new ChessPieces("\u265F"), 
    new ChessPieces("\u265F"), new ChessPieces("\u265F"), new ChessPieces("\u265F"), 
    new ChessPieces("\u265F"), 
    // empty
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "), 
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "), 
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "), 
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "), 
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "), 
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "), 
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "), 
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "),
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "), 
    new ChessPieces(" "), new ChessPieces(" "), new ChessPieces(" "), 
    new ChessPieces(" "), new ChessPieces(" "),
    // white
    new ChessPieces("\u2659"), new ChessPieces("\u2659"), new ChessPieces("\u2659"), 
    new ChessPieces("\u2659"), new ChessPieces("\u2659"), new ChessPieces("\u2659"), 
    new ChessPieces("\u2659"), new  ChessPieces("\u2659"),new ChessPieces("\u2656"), 
    new ChessPieces("\u2658"), new ChessPieces("\u2657"), new ChessPieces("\u2655"), 
    new ChessPieces("\u2654"), new ChessPieces("\u2657"), new ChessPieces("\u2658"), 
    new ChessPieces("\u2656") 
    };

    void display()
    {
        setTitle("Chess board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //GridLayout to arrange components in a grid
        GridLayout gridLayout = new GridLayout(8, 8);
        contentPane.setLayout(gridLayout);

        int row = -1;

        //putting unicode pieces on the board
        for (int i=0;i < labels.length; i++)
        {
            if(i%8==0)
            row++;
            labels[i].set(i,row);
            contentPane.add(labels[i]);
        }
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    //Main method
    //Displaying the board
    public static void main(String args[]) 
    {
        ChessBoard board = new ChessBoard();

        board.display();
    }
}