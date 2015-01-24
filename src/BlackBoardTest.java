
/**
 * // -------------------------------------------------------------------------
 * Tests the blackboard class
 *
 * @author Adam Mounts
 * @author Michael Goheen
 * @author Jon La Marr
 * @version Apr 13, 2011
 */
public class BlackBoardTest
    extends student.GUITestCase
{

    private Blackboard bb;


    /**
     * Setup the board
     */
    public void setUp()
    {
        bb = new Blackboard(5, 5, true);
    }


    // ----------------------------------------------------------
    /**
     * Test the blackboard class
     */
    public void testBlackBoard()
    {
        bb.bgd();
        assertEquals(5, bb.getX());
        assertEquals(5, bb.getY());
        bb.setX(4);
        bb.setY(7);
        assertEquals(4, bb.getX());
        assertEquals(7, bb.getY());
        bb.setImage(null);
        assertNull(bb.getImage());
        assertNull(bb.possibleMoves());
        assertTrue(bb.isBlack());
        bb.setBlack(false);
        assertFalse(bb.isBlack());
        assertFalse(bb.isPiece());

    }
}
