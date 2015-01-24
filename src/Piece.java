import java.util.ArrayList;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 * Interface for all the pieces on the board.
 *
 * @author Jon La Marr
 * @author Adam Mounts
 * @author Michael Goheen
 * @version May 1, 2011
 */
public interface Piece
{
    /**
     * Gets the piece's x coord.
     *
     * @return x - the piece's x coord.
     */
    public int getX();


    /**
     * Gets the piece's y coord.
     *
     * @return y - the piece's y coord.
     */
    public int getY();


    /**
     * Sets the piece's x coord.
     *
     * @param x
     *            - the new x coord.
     */
    public void setX(int x);


    /**
     * Sets the piece's y coord.
     *
     * @param y
     *            - the new y coord.
     */
    public void setY(int y);


    /**
     * Gets the piece's imageIcon.
     *
     * @return the image of the piece.
     */
    public ImageIcon getImage();


    /**
     * Sets the image of the piece.
     *
     * @param i
     *            - the new image.
     */
    public void setImage(ImageIcon i);


    /**
     * Determines an array of possible moves.
     *
     * @return the array of moves.
     */
    public ArrayList<Point> possibleMoves();


    /**
     * Is this piece black?
     *
     * @return true if Black.
     */
    public boolean isBlack();


    /**
     * Set this piece to black.
     *
     * @param b
     *            - sets it to black.
     */
    public void setBlack(boolean b);


    /**
     * Is this a piece?
     *
     * @return true if its a piece, false otherwise.
     */
    public boolean isPiece();


    /**
     * Determines the background color of the piece.
     */
    public void bgd();
}
