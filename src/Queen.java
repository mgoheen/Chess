import java.util.ArrayList;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 * This is the Queen class.
 *
 * @author Adam Mounts
 * @author Michael Goheen
 * @author Jon La Marr
 * @version Apr 13, 2011
 */
public class Queen
    implements Piece
{
    private int       x;
    private int       y;
    private ImageIcon image;
    private boolean   isBlack;


    /**
     * Sets the Queen. Determines if it is black or white, and its location.
     *
     * @param i
     *            - the X coordinate.
     * @param j
     *            - the Y coordinate.
     * @param b
     *            - is its black.
     */
    public Queen(int i, int j, boolean b)
    {
        x = i;
        y = j;
        if (b)
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/BQonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BQonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WQonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WQonB.gif");
            }

        }
        isBlack = b;
    }


    /**
     * Gets the X coordinate of the Queen.
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
     * Gets the Y coordinate of the Queen.
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
     * Sets the X coordinate of the Queen.
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
     * Sets the Y coordinate of the Queen.
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
     * Gets the image icon of the Queen.
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
     * Sets the image icon of the Queen.
     *
     * @param i
     *            - the image of it.
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

        // rook
        i = x;
        j = y;
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
     * Never used, but sets the Queen to black.
     *
     * @param isB
     *            - if the Queen is black.
     */
    public void setBlack(boolean isB)
    {
        isBlack = isB;
    }


    /**
     * True if queen is black, false if white.
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
                image = new ImageIcon("src/BQonW.gif");
            }
            else
            {
                image = new ImageIcon("src/BQonB.gif");
            }
        }
        else
        {
            if ((x + y) % 2 == 0)
            {
                image = new ImageIcon("src/WQonW.gif");
            }
            else
            {
                image = new ImageIcon("src/WQonB.gif");
            }

        }

    }

}
