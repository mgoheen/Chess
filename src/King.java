import java.util.ArrayList;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 * This is the King class.
 *
 * @author Adam Mounts
 * @author Michael Goheen
 * @author Jon La Marr
 * @version Apr 13, 2011
 */
public class King
    implements Piece
{
    private int       x;
    private int       y;
    private ImageIcon image;
    private boolean   isBlack;


    /**
     * Sets the King. Determines if it is black or white, and its location.
     *
     * @param i
     *            - the X coordinate.
     * @param j
     *            - the Y coordinate.
     * @param b
     *            - is its black.
     */
    public King(int i, int j, boolean b)
    {
        x = i;
        y = j;
        if (b)
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/BKonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BKonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WKonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WKonB.gif");
            }

        }

        setBlack(b);
    }


    /**
     * Gets the X coordinate of the King.
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
     * Gets the Y coordinate of the King.
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
     * Sets the X coordinate of the King.
     *
     * @param i
     *            - the x coordinate.
     */
    @Override
    public void setX(int i)
    {
        // TODO Auto-generated method stub
        x = i;
    }


    /**
     * Sets the Y coordinate of the King.
     *
     * @param j
     *            - the Y coordinate.
     */
    @Override
    public void setY(int j)
    {
        // TODO Auto-generated method stub
        y = j;

    }


    /**
     * Gets the image icon of the King.
     *
     * @return image - the image icon.
     */
    @Override
    public ImageIcon getImage()
    {
        // TODO Auto-generated method stub
        return image;
    }


    /**
     * Sets the image icon of the King.
     *
     * @param i
     *            - the image icon.
     */
    @Override
    public void setImage(ImageIcon i)
    {
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
        if (x > 0)
        {
            if (y > 0)
            {
                moves.add(new Point(x - 1, y - 1));
                moves.add(new Point(x - 1, y));
                moves.add(new Point(x, y - 1));
            }
            if (y < 7)
            {
                moves.add(new Point(x - 1, y + 1));
                moves.add(new Point(x, y + 1));
            }
        }
        if (x < 7)
        {
            if (y > 0)
            {
                moves.add(new Point(x + 1, y - 1));
                moves.add(new Point(x + 1, y));
            }
            if (y < 7)
            {
                moves.add(new Point(x + 1, y + 1));
                moves.add(new Point(x, y + 1));
            }
        }
        ArrayList<Point> temp = new ArrayList<Point>();

        for (Point p : moves)
        {
            Piece m = BoardPanel.board[(int)p.getX()][(int)p.getY()];
            if (!m.isPiece() || (m.isBlack() != isBlack && m.isPiece()))
            {

                temp.add(p);
            }
        }

        return temp;
    }


    /**
     * Never used, but sets the King to black.
     *
     * @param isB
     *            - if the King is black.
     */
    public void setBlack(boolean isB)
    {
        isBlack = isB;
    }


    /**
     * True if king is black, false if white.
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
     * Determines the background color of the king.
     */
    @Override
    public void bgd()
    {
        // TODO Auto-generated method stub
        if (isBlack)
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/BKonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BKonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WKonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WKonB.gif");
            }

        }

    }

}
