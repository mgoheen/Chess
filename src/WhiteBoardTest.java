
/**
 * // -------------------------------------------------------------------------
 * Tests the whiteboard class
 *
 * @author Adam Mounts
 * @author Michael Goheen
 * @author Jon La Marr
 * @version Apr 13, 2011
 */
public class WhiteBoardTest
    extends student.GUITestCase
{

    private Whiteboard wb;


    /**
     * Setup the board
     */
    public void setUp()
    {
        wb = new Whiteboard(5, 5, true);
    }

    // ----------------------------------------------------------
    /**
     * Test the blackboard class
     */
    public void testWhiteBoard() {
        wb.bgd();
        assertEquals(5, wb.getX());
        assertEquals(5, wb.getY());
        wb.setX(4);
        wb.setY(7);
        wb.setImage(null);
        wb.getImage();
        wb.possibleMoves();
        assertFalse(wb.isBlack());
        wb.setBlack(true);
        assertFalse(wb.isPiece());

    }
}
