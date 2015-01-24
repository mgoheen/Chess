import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.JPanel;

/**
 * // -------------------------------------------------------------------------
 * The main class of the program, the BoardPanel.
 *
 * @author Adam Mounts
 * @author Michael Goheen
 * @author Jon La Marr
 * @version Apr 13, 2011
 */
public class BoardPanel
    extends JPanel
{
    /** The board matrix. */
    static Piece[][]   board;
    /** The buttons on the board */
    static JButton[][] buttons;
    /** Who goes first? */
    static boolean     first    = true;
    /** Determines selected button */
    Point              selected = null;
    /** A test imageIcon for test purposes */
    ImageIcon          test;
    /** Whose turn is it? */
    static boolean     turn     = true;
    /** Shows whose turn it is */
    static JLabel      whoseturn;


    /**
     * Creates the board and sets it up like normal chess.
     */
    public BoardPanel()
    {
        buttons = new JButton[8][8];
        selected = null;
        test = new ImageIcon("src/WRoB.gif");
        JPanel ctl = new JPanel();
        JPanel boardp = new JPanel();
        add(boardp);
        boardp.setBackground(Color.BLACK);
        boardp.setLayout(new GridLayout(8, 8));
        boardp.setPreferredSize(new Dimension(700, 700));

        board = new Piece[8][8];
        for (int y = 0; y < 8; y++)
        {
            for (int x = 0; x < 8; x++)
            {
                buttons[x][y] = new JButton();
                buttons[x][y].setIcon(test);
                buttons[x][y].addActionListener(new AL());
                boardp.add(buttons[x][y]);
            }
        }
        whoseturn = new JLabel(new ImageIcon("src/WRoB.gif"));
        ctl.add(whoseturn);
        add(ctl);
        for (int x = 0; x < 8; x++)
        {
            for (int y = 0; y < 8; y++)
            {
                buttons[x][y].setIcon(test);
            }
        }
        fillBoard();

        // Add Listeners, buttons, etc.

    }


    /**
     * Fills the board with all the pieces.
     */
    public void fillBoard()
    {
        for (int x = 0; x < 8; x++)
        {
            for (int y = 0; y < 8; y++)
            {
                if ((x + y) % 2 == 0)
                {
                    board[x][y] = new Whiteboard(x, y, false);
                }
                else
                {
                    board[x][y] = new Blackboard(x, y, true);
                }
            }
        }

        board[2][0] = new Bishop(2, 0, true);
        board[5][0] = new Bishop(5, 0, true);
        board[0][0] = new Rook(0, 0, true);
        board[7][0] = new Rook(7, 0, true);
        board[1][0] = new Knight(1, 0, true);
        board[6][0] = new Knight(6, 0, true);
        board[4][0] = new King(4, 0, true);
        board[3][0] = new Queen(3, 0, true);

        board[2][7] = new Bishop(2, 7, false);
        board[5][7] = new Bishop(5, 7, false);
        board[0][7] = new Rook(0, 7, false);
        board[7][7] = new Rook(7, 7, false);
        board[1][7] = new Knight(1, 7, false);
        board[6][7] = new Knight(6, 7, false);
        board[4][7] = new King(4, 7, false);
        board[3][7] = new Queen(3, 7, false);

        for (int x = 0; x < 8; x++)
        {
            board[x][1] = new Pawn(x, 1, true);
            board[x][6] = new Pawn(x, 6, false);
        }

        for (int x = 0; x < 8; x++)
        {
            for (int y = 0; y < 8; y++)
            {
                buttons[x][y].setIcon(board[x][y].getImage());
            }

        }
        // fills the board with different Piece objects.
    }


    /**
     * Returns the piece at the selected point.
     *
     * @param x
     *            - the X coordinate.
     * @param y
     *            - the Y coordinate.
     * @return board[x][y] - the piece at (x, y).
     */
    public Piece pieceAt(int x, int y)
    {
        // returns a Piece at the coordinates
        return board[x][y];
    }


    /**
     * Did you win the game?
     *
     * @return - true if you won, false otherwise.
     */
    public boolean gameWon()
    {
        // determine if the game has been won
        return false;

    }


    /**
     * Moves the piece to (x, y).
     *
     * @param p
     *            - the Piece moving.
     * @param x
     *            - the x coordinate to move to.
     * @param y
     *            - the y coordinate to move to.
     */
    public void makeMove(Piece p, int x, int y)
    {

        ArrayList<Point> moves = p.possibleMoves();
        Point temp = new Point(x, y);
        if (moves.contains(temp))
        {

            removePiece(pieceAt(p.getX(), p.getY()));
            if (board[x][y] instanceof King)
            {
                System.out.println("*********YOU WIN**********");
            }
            board[x][y] = p;
            board[x][y].setX(x);
            board[x][y].setY(y);
            Piece m = board[x][y];
            m.bgd();
        }
        else
        {
            System.out.println("Not Allowed");
            turn = !turn;
        }
        update();

    }


    /**
     * After you take a piece, it must be removed. (it has been taken by the
     * opposite player)
     *
     * @param p
     *            - the piece being removed.
     */
    public void removePiece(Piece p)
    {
        if ((p.getX() + p.getY()) % 2 == 0)
        {
            board[p.getX()][p.getY()] = null;
            board[p.getX()][p.getY()] =
                new Whiteboard(p.getX(), p.getY(), false);
        }
        if ((p.getX() + p.getY()) % 2 == 1)
        {
            board[p.getX()][p.getY()] = null;
            board[p.getX()][p.getY()] =
                new Blackboard(p.getX(), p.getY(), false);
        }
        update();
    }


    /**
     * Updates the icons on the board.
     */
    public static void update()
    {
        for (int x = 0; x < 8; x++)
        {
            for (int y = 0; y < 8; y++)
            {
                buttons[x][y].setIcon(board[x][y].getImage());
            }

        }
    }


    /**
     * Creates an empty board for testing purposes.
     *
     * @return temp - the empty board.
     */
    public static Piece[][] emptyBoard()
    {
        Piece[][] temp = new Piece[8][8];
        for (int x = 0; x < 8; x++)
        {
            for (int y = 0; y < 8; y++)
            {
                if ((x + y) % 2 == 0)
                {
                    temp[x][y] = new Whiteboard(x, y, false);
                }
                else
                {
                    temp[x][y] = new Blackboard(x, y, true);
                }
            }
        }
        temp[0][0] = new Queen(0, 0, false);
        return temp;

    }


    /**
     * // ----------------------------------------------------------------------
     * --- /** Custom actionListener class that implements some listeners.
     *
     * @author Jon La Marr
     * @author Adam Mounts
     * @author Michael Goheen
     * @version May 1, 2011
     */
    public class AL
        implements ActionListener
    {
        /**
         * An action is performed, so something happens.
         *
         * @param e
         *            - the event performed.
         */
        public void actionPerformed(ActionEvent e)
        {

            JButton b = (JButton)e.getSource();

            int[] a = getLoc(b);
            Piece m = board[a[0]][a[1]];
            if (first && m.isBlack() != turn)
            {
                if (board[a[0]][a[1]].isPiece())
                {

                    selected = new Point(a[0], a[1]);
                    buttons[a[0]][a[1]].setEnabled(false);
                    first = false;
                    update();
                }
            }
            else if (!first)
            {
                if (board[(int)selected.getX()][(int)selected.getY()] != null)
                {
                    makeMove(
                        pieceAt((int)selected.getX(), (int)selected.getY()),
                        a[0],
                        a[1]);
                }
                buttons[(int)selected.getX()][(int)selected.getY()]
                    .setEnabled(true);
                selected = null;
                first = true;

                turn = !turn;
                update();
            }

            for (int x = 0; x < 8; x++)
            {
                for (int y = 0; y < 8; y++)
                {
                    buttons[x][y].setIcon(board[x][y].getImage());
                }

            }
        }


        /**
         * Gets the location of the piece (the button).
         *
         * @param b
         *            - the Button you're looking for.
         * @return a - the location.
         */
        public int[] getLoc(JButton b)
        {
            int[] a = new int[2];
            for (int x = 0; x < 8; x++)
            {
                for (int y = 0; y < 8; y++)
                {
                    if (b.equals(buttons[x][y]))
                    {

                        a[0] = x;
                        a[1] = y;
                    }
                }
            }
            return a;
        }
    }

}
