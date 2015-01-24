import java.util.ArrayList;
import java.awt.Point;
import javax.swing.ImageIcon;
/**
 *  Class for the Bishop piece.
 *
 *  @author Jon La Marr
 *  @author Adam Mounts
 *  @author Michael Goheen
 *  @version May 1, 2011
 */
public class Bishop
    implements Piece
{

    private int       x;
    private int       y;
    private ImageIcon image;
    private boolean   isBlack;


    // ----------------------------------------------------------
    /**
     * Sets the Bishop. Determines if it is black or white, and its location.
     *
     * @param i
     *            - the X coordinate.
     * @param j
     *            - the Y coordinate.
     * @param b
     *            - is its black.
     */
    public Bishop(int i, int j, boolean b)
    {
        x = i;
        y = j;
        if (b)
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/BBonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BBonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WBonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WBonB.gif");
            }

        }
        setBlack(b);
    }

    /**
     * Gets the X coordinate of the bishop.
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
     * Gets the Y coordinate of the bishop.
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
     * Sets the X coordinate of the bishop.
     *
     * @param i - the x coordinate.
     */
    @Override
    public void setX(int i)
    {
        x = i;

    }

    /**
     * Sets the Y coordinate of the bishop.
     *
     * @param j - the Y coordinate.
     */
    @Override
    public void setY(int j)
    {
        y = j;

    }

    /**
     * Gets the image icon of the bishop.
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
     * Sets the image icon of the pawn.
     *
     * @param i - the image of it.
     */
    @Override
    public void setImage(ImageIcon i)
    {
        image = i;
    }

    /**
     * Gets the ArrayList of possible moves for the bishop.
     *
     * @return moves - the ArrayList of moves.
     */
    @Override
    public ArrayList<Point> possibleMoves()
    {
        ArrayList<Point> moves = new ArrayList<Point>();
        int i = x;
        int j = y;
        while (i < 7 && j < 7)
        {
            i++;
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
        while (i > 0 && j < 7)
        {
            i--;
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
        while (i > 0 && j > 0)
        {
            i--;
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
        i = x;
        j = y;
        while (i < 7 && j > 0)
        {
            i++;
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
    * Never used, but sets the bishop to black.
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
        // TODO Auto-generated method stub
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
                image = new ImageIcon("src/BBonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BBonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WBonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WBonB.gif");
            }

        }

    }

}
