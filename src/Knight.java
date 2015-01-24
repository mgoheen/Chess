import java.util.ArrayList;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 * This is the Knight class.
 *
 * @author Adam Mounts
 * @author Michael Goheen
 * @author Jon La Marr
 * @version Apr 13, 2011
 */
public class Knight
    implements Piece
{
    private int       x;
    private int       y;
    private ImageIcon image;
    private boolean   isBlack;


    /**
     * Sets the Knight. Determines if it is black or white, and its location.
     *
     * @param i
     *            - the X coordinate.
     * @param j
     *            - the Y coordinate.
     * @param b
     *            - is its black.
     */
    public Knight(int i, int j, boolean b)
    {
        x = i;
        y = j;
        if (b)
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/BNonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BNonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WNonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WNonB.gif");
            }

        }
        setBlack(b);
    }


    /**
     * Gets the X coordinate of the knight.
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
     * Gets the Y coordinate of the knight.
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
     * Sets the X coordinate of the knight.
     *
     * @param i
     *            - the x coordinate.
     */
    @Override
    public void setX(int i)
    {
        x = i;

    }


    /**
     * Sets the Y coordinate of the knight.
     *
     * @param j
     *            - the Y coordinate.
     */
    @Override
    public void setY(int j)
    {
        y = j;

    }


    /**
     * Gets the image icon of the knight.
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
     * Sets the image icon of the knight.
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
     * Gets the ArrayList of possible moves for the Knight.
     *
     * @return moves - the ArrayList of moves.
     */
    @Override
    public ArrayList<Point> possibleMoves()
    {
        ArrayList<Point> moves = new ArrayList<Point>();
        if (x + 2 < 8
            && y - 1 >= 0
            && (!BoardPanel.board[x + 2][y - 1].isPiece() ||
                BoardPanel.board[x + 2][y - 1]
                .isBlack() != isBlack))
        {
            moves.add(new Point(x + 2, y - 1));
        }
        if (x + 2 < 8
            && y + 1 < 8
            && (!BoardPanel.board[x + 2][y + 1].isPiece() ||
                BoardPanel.board[x + 2][y + 1]
                .isBlack() != isBlack))
        {
            moves.add(new Point(x + 2, y + 1));
        }
        if (x - 2 >= 0
            && y - 1 >= 0
            && (!BoardPanel.board[x - 2][y - 1].isPiece() ||
                BoardPanel.board[x - 2][y - 1]
                .isBlack() != isBlack))
        {
            moves.add(new Point(x - 2, y - 1));
        }
        if (x - 2 >= 0
            && y + 1 < 8
            && (!BoardPanel.board[x - 2][y + 1].isPiece() ||
                BoardPanel.board[x - 2][y + 1]
                .isBlack() != isBlack))
        {
            moves.add(new Point(x - 2, y + 1));
        }

        if (x + 1 < 8
            && y + 2 < 8
            && (!BoardPanel.board[x + 1][y + 2].isPiece() ||
                BoardPanel.board[x + 1][y + 2]
                .isBlack() != isBlack))
        {
            moves.add(new Point(x + 1, y + 2));
        }
        if (x - 1 >= 0
            && y + 2 < 8
            && (!BoardPanel.board[x - 1][y + 2].isPiece() ||
                BoardPanel.board[x - 1][y + 2]
                .isBlack() != isBlack))
        {
            moves.add(new Point(x - 1, y + 2));
        }
        if (x + 1 < 8
            && y - 2 >= 0
            && (!BoardPanel.board[x + 1][y - 2].isPiece() ||
                BoardPanel.board[x + 1][y - 2]
                .isBlack() != isBlack))
        {
            moves.add(new Point(x + 1, y - 2));
        }
        if (x - 1 >= 0
            && y - 2 >= 0
            && (!BoardPanel.board[x - 1][y - 2].isPiece() ||
                BoardPanel.board[x - 1][y - 2]
                .isBlack() != isBlack))
        {
            moves.add(new Point(x - 1, y - 2));
        }
        return moves;
    }


    /**
     * Never used, but sets the Knight to black.
     *
     * @param isB
     *            - if the Knight is black.
     */
    public void setBlack(boolean isB)
    {
        isBlack = isB;
    }


    /**
     * True if knight is black, false if white.
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
     * Determines the background color of the knight.
     */
    @Override
    public void bgd()
    {
        if (isBlack)
        {
            if ((x + y) % 2 == 0)
            {
                image =
                    new ImageIcon(
                        "src/BNonW.gif");
            }
            else
            {
                image =
                    new ImageIcon(
                        "src/BNonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image =
                    new ImageIcon(
                        "src/WNonW.gif");
            }
            else
            {
                image =
                    new ImageIcon(
                        "src/WNonB.gif");
            }

        }

    }

}
