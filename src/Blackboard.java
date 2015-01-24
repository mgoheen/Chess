import java.util.ArrayList;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 * // -------------------------------------------------------------------------
/**
 *  Black Background of the board.
 *
 *  @author Jon La Marr
 *  @author Adam Mounts
 *  @author Michael Goheen
 *  @version May 1, 2011
 */
public class Blackboard
    implements Piece
{

    private int       x;       // The X coord of the board
    private int       y;       // The Y coord of the board
    private ImageIcon image;   // The image of the board
    private boolean   isBlack; // Black, if true


    /**
     * Creates the black board with specified coords.
     * @param i - the x coord.
     * @param j - the y coord.
     * @param b - Black, if true
     */
    public Blackboard(int i, int j, boolean b)
    {
        x = i;
        y = j;
        image = new ImageIcon("src/bb.gif");
        isBlack = b;

    }


    /**
     * Gets the x coord of the board.
     * @return x - the x coord.
     */
    @Override
    public int getX()
    {
        // TODO Auto-generated method stub
        return x;
    }


    /**
     * Gets the y coord of the board.
     * @return y - the y coord.
     */
    @Override
    public int getY()
    {
        // TODO Auto-generated method stub
        return y;
    }


    /**
     * Sets the board's x coord to the specified x coord. (Unneeded)
     * @param i - the x coord.
     */
    @Override
    public void setX(int i)
    {
        // TODO Auto-generated method stub
        x = i;
    }


    /**
     * Sets the board's y coord to the specified y coord. (Unneeded)
     * @param j - the y coord.
     */
    @Override
    public void setY(int j)
    {
        // TODO Auto-generated method stub
        y = j;
    }


    /**
     * Gets the image of the board.
     * @return image - the image of it.
     */
    @Override
    public ImageIcon getImage()
    {
        // TODO Auto-generated method stub
        return image;
    }


    /**
     * Sets the image of the board. (Unneeded)
     * @param i - the new image.
     */
    @Override
    public void setImage(ImageIcon i)
    {
        // TODO Auto-generated method stub
        image = i;
    }


    /**
     * Gets the array of possible moves. (Unneeded)
     * @return moves - the arraylist of moves.
     */
    @Override
    public ArrayList<Point> possibleMoves()
    {
        // TODO Auto-generated method stub
        return null;
    }


    /**
     * Is this piece black? (Unneeded)
     * @return isBlack - true if black.
     */
    @Override
    public boolean isBlack()
    {
        // TODO Auto-generated method stub
        return isBlack;
    }


    /**
     * Sets the piece to black. (Unneeded)
     * @param b - setting it to black.
     */
    @Override
    public void setBlack(boolean b)
    {
        isBlack = b;

    }


    /**
     * Is this a piece? Nope. (Unneeded)
     * @return isPiece - true if its a piece.
     */
    @Override
    public boolean isPiece()
    {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Sets the background image. (Unneeded)
     */
    @Override
    public void bgd()
    {
        // TODO Auto-generated method stub

    }

}
