import java.util.ArrayList;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 * This is the Rook class.
 *
 * @author Adam Mounts
 * @author Michael Goheen
 * @author Jon La Marr
 * @version Apr 13, 2011
 */
public class Rook
    implements Piece
{
    private int       x;
    private int       y;
    private ImageIcon image;
    private boolean   isBlack;


    // ----------------------------------------------------------
    /**
     * Sets the Rook. Determines if it is black or white, and its location.
     *
     * @param i
     *            - the X coordinate.
     * @param j
     *            - the Y coordinate.
     * @param b
     *            - is its black.
     */
    public Rook(int i, int j, boolean b)
    {
        x = i;
        y = j;
        if (b)
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/BRonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BRonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WRonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WRonB.gif");
            }

        }
        setBlack(b);
    }


    /**
     * gets the X method.
     *
     * @return is the x value.
     */
    @Override
    public int getX()
    {
        // TODO Auto-generated method stub
        return x;
    }


    /**
     * gets the Y method.
     *
     * @return y is the y value.
     */
    @Override
    public int getY()
    {
        // TODO Auto-generated method stub
        return y;
    }


    /**
     * Sets the x value to i.
     * @param i is the x coordinate.
     */
    @Override
    public void setX(int i)
    {
        // TODO Auto-generated method stub
        x = i;

    }


    /**
     * sets the y value to j.
     *
     * @param j
     *            is y value.
     */
    @Override
    public void setY(int j)
    {
        // TODO Auto-generated method stub
        y = j;

    }


    /**
     * gets the image of the Piece.
     *
     * @return is the image of the piece.
     */
    @Override
    public ImageIcon getImage()
    {
        // TODO Auto-generated method stub
        return image;
    }


    /**
     * Sets the image of the Piece.
     *
     * @param i
     *            is the image of the piece.
     */
    @Override
    public void setImage(ImageIcon i)
    {
        // TODO Auto-generated method stub
        image = i;

    }


    /**
     * Gets the ArrayList of possible moves for the Queen.
     *
     * @return moves - the ArrayList of moves.
     */
    @Override
    public ArrayList<Point> possibleMoves()
    {
        ArrayList<Point> moves = new ArrayList<Point>();
        int i = x;
        int j = y;
        while (i < 7)
        {
            i++;
            if (!BoardPanel.board[i][j].isPiece())
            {
                moves.add(new Point(i, j));
            }
            else if (BoardPanel.board[i][j].isPiece()
                && (BoardPanel.board[i][j].isBlack() != isBlack))
            {
                moves.add(new Point(i, j));
                break;
            }
            else
            {
                break;
            }
        }
        i = x;
        j = y;
        while (i > 0)
        {
            i--;
            if (!BoardPanel.board[i][j].isPiece())
            {
                moves.add(new Point(i, j));
            }
            else if (BoardPanel.board[i][j].isPiece()
                && (BoardPanel.board[i][j].isBlack() != isBlack))
            {
                moves.add(new Point(i, j));
                break;
            }
            else
            {
                break;
            }
        }
        i = x;
        j = y;
        while (j < 7)
        {
            j++;
            if (!BoardPanel.board[i][j].isPiece())
            {
                moves.add(new Point(i, j));
            }
            else if (BoardPanel.board[i][j].isPiece()
                && (BoardPanel.board[i][j].isBlack() != isBlack))
            {
                moves.add(new Point(i, j));
                break;
            }
            else
            {
                break;
            }
        }
        i = x;
        j = y;
        while (j > 0)
        {
            j--;
            if (!BoardPanel.board[i][j].isPiece())
            {
                moves.add(new Point(i, j));
            }
            else if (BoardPanel.board[i][j].isPiece()
                && (BoardPanel.board[i][j].isBlack() != isBlack))
            {
                moves.add(new Point(i, j));
                break;
            }
            else
            {
                break;
            }
        }
        return moves;
    }

    /**
     * Never used, but sets the Rook to black.
     *
     * @param isB
     *            - if the Rook is black.
     */
    public void setBlack(boolean isB)
    {
        isBlack = isB;
    }

    /**
     * True if rook is black, false if white.
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
    @Override
    public void bgd()
    {
        if (isBlack)
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/BRonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BRonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WRonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WRonB.gif");
            }

        }

    }

}
