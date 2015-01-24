import java.util.ArrayList;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 * // -------------------------------------------------------------------------
 * /** Creates a pawn at a selected place on the board. Determines if it is
 * black or white.
 *
 * @author Jon La Marr
 * @author Adam Mounts
 * @author Michael Goheen
 * @version May 1, 2011
 */
public class Pawn
    implements Piece
{
    private int       x;      // X coord of the piece
    private int       y;      // Y coord of the piece
    private ImageIcon image;  // The image of the piece
    private boolean   isBlack; // True if black


    /**
     * Sets the pawn. Determines if it is black or white, and its location.
     *
     * @param i
     *            - the X coordinate.
     * @param j
     *            - the Y coordinate.
     * @param b
     *            - is its black.
     */
    public Pawn(int i, int j, boolean b)
    {
        x = i;
        y = j;
        if (b)
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/BPonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BPonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WPonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WPonB.gif");
            }

        }
        isBlack = b;

    }


    /**
     * Gets the X coordinate of the pawn.
     *
     * @return x - the x coordinate.
     */
    @Override
    public int getX()
    {
        // TODO Auto-generated method stub
        return x;
    }


    /**
     * Gets the Y coordinate of the pawn.
     *
     * @return y - the y coordinate.
     */
    @Override
    public int getY()
    {
        // TODO Auto-generated method stub
        return y;
    }


    /**
     * Sets the X coordinate of the pawn.
     *
     * @param i
     *            - the coordinate of the pawn.
     */
    @Override
    public void setX(int i)
    {
        // TODO Auto-generated method stub
        x = i;
    }


    /**
     * Sets the Y coordinate of the pawn.
     *
     * @param j
     *            - the coordinate of the pawn.
     */
    @Override
    public void setY(int j)
    {
        // TODO Auto-generated method stub
        y = j;

    }


    /**
     * Gets the image icon of the pawn.
     *
     * @return image - the image of it.
     */
    @Override
    public ImageIcon getImage()
    {
        // TODO Auto-generated method stub
        return image;
    }


    /**
     * Gets the ArrayList of possible moves for the Pawn.
     *
     * @return moves - the ArrayList of moves.
     */
    @Override
    public ArrayList<Point> possibleMoves()
    {
        ArrayList<Point> moves = new ArrayList<Point>();

        if (isBlack && y == 1 && (!BoardPanel.board[x][y + 1].isPiece())
            && (!BoardPanel.board[x][y + 2].isPiece()))
        {
            moves.add(new Point(x, y + 1));
            moves.add(new Point(x, y + 2));
        }
        if (isBlack && y != 1 && (!BoardPanel.board[x][y + 1].isPiece()))
        {
            moves.add(new Point(x, y + 1));
        }

        if (!isBlack && y == 6 && (!BoardPanel.board[x][y - 1].isPiece())
            && (!BoardPanel.board[x][y - 2].isPiece()))
        {
            moves.add(new Point(x, y - 1));
            moves.add(new Point(x, y - 2));
        }
        if (!isBlack && y != 6 && (!BoardPanel.board[x][y - 1].isPiece()))
        {
            moves.add(new Point(x, y - 1));
        }

        if (isBlack && y < 7 && x > 0
            && BoardPanel.board[x - 1][y + 1].isPiece()
            && !BoardPanel.board[x - 1][y + 1].isBlack() == isBlack)
        {
            {

                moves.add(new Point(x - 1, y + 1));
            }
        }
        if (x < 7
            && (BoardPanel.board[x + 1][y + 1].isPiece() &&
                !BoardPanel.board[x + 1][y + 1]
                .isBlack() == isBlack))
        {
            moves.add(new Point(x + 1, y + 1));
        }

        if (!isBlack && y > 0)
        {
            if (x > 0
                && (BoardPanel.board[x - 1][y - 1].isPiece() &&
                    !BoardPanel.board[x - 1][y - 1]
                    .isBlack() == isBlack))
            {

                moves.add(new Point(x - 1, y - 1));

            }
            if (x < 7
                && (BoardPanel.board[x + 1][y - 1].isPiece() &&
                    !BoardPanel.board[x + 1][y - 1]
                    .isBlack() == isBlack))
            {

                moves.add(new Point(x + 1, y - 1));

            }
        }

        return moves;
    }


    /**
     * Never used, but sets the pawn to black.
     *
     * @param isB
     *            - if the pawn is black.
     */
    public void setBlack(boolean isB)
    {
        isBlack = isB;
    }


    /**
     * True if pawn is black, false if white.
     *
     * @return isBlack - if it's black.
     */
    public boolean isBlack()
    {
        return isBlack;
    }


    /**
     * Is this a piece?
     *
     * @return true if its a piece, false otherwise.
     */
    @Override
    public boolean isPiece()
    {
        return true;
    }


    /**
     * Determines the background color of the pawn.
     */
    public void bgd()
    {
        if (isBlack)
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/BPonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BPonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WPonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WPonB.gif");
            }

        }
    }


    /**
     * Sets the image of of the pawn.
     *
     * @param i
     *            - the image it's set to.
     */
    @Override
    public void setImage(ImageIcon i)
    {
        image = i;
    }

}
