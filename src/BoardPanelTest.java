import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 * // -------------------------------------------------------------------------
 * Tests the gameplay
 *
 * @author Adam Mounts
 * @author Michael Goheen
 * @author Jon La Marr
 * @version Apr 13, 2011
 */
public class BoardPanelTest
    extends student.GUITestCase
{

    private BoardPanel b;


    /**
     * Setup the board
     */
    public void setUp()
    {
        b = new BoardPanel();
    }


    // ----------------------------------------------------------
    /**
     * Test chess main window
     */
    public void testBoardPanel()
    {
        // Run the program
        Chess.main(null);

        // Make sure the main panel was created
        assertNotNull(getComponent(BoardPanel.class));
    }


    /**
     * Test the board
     */
    public void testBoardMovements()
    {
        // Fill Board
        assertEquals("Pawn", b.pieceAt(1, 1).toString().substring(0, 4));
        // Move all black pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 1), i, 3);
            assertEquals("Pawn", b.pieceAt(i, 3).toString().substring(0, 4));

        }
        // Move all white pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 6), i, 4);
            assertEquals("Pawn", b.pieceAt(i, 4).toString().substring(0, 4));
        }
        // Move black rook
        b.makeMove(b.pieceAt(0, 0), 0, 2);
        assertEquals("Rook", b.pieceAt(0, 2).toString().substring(0, 4));
        // Move white rook
        b.makeMove(b.pieceAt(0, 7), 0, 5);
        assertEquals("Rook", b.pieceAt(0, 5).toString().substring(0, 4));
        // Move black knight
        b.makeMove(b.pieceAt(1, 0), 2, 2);
        assertEquals("Knight", b.pieceAt(2, 2).toString().substring(0, 6));
        // Move white knight
        b.makeMove(b.pieceAt(1, 7), 2, 5);
        assertEquals("Knight", b.pieceAt(2, 5).toString().substring(0, 6));
        // Move black bishop
        b.makeMove(b.pieceAt(2, 0), 4, 2);
        assertEquals("Bishop", b.pieceAt(4, 2).toString().substring(0, 6));
        // Move white bishop
        b.makeMove(b.pieceAt(2, 7), 4, 5);
        assertEquals("Bishop", b.pieceAt(4, 5).toString().substring(0, 6));
        // Move black king
        b.makeMove(b.pieceAt(4, 0), 4, 1);
        assertEquals("King", b.pieceAt(4, 1).toString().substring(0, 4));
        // Move white king
        b.makeMove(b.pieceAt(4, 7), 4, 6);
        assertEquals("King", b.pieceAt(4, 6).toString().substring(0, 4));
        // Move black queen
        b.makeMove(b.pieceAt(3, 0), 3, 2);
        assertEquals("Queen", b.pieceAt(3, 2).toString().substring(0, 5));
        // Move white queen
        b.makeMove(b.pieceAt(3, 7), 3, 5);
        assertEquals("Queen", b.pieceAt(3, 5).toString().substring(0, 5));
    }


    /**
     * Test the GUI buttons
     */
    public void testGUI()
    {
        showInFrame(b);

        BoardPanel b1 = getComponent(BoardPanel.class);
        click(b1, 200, 600);
        click(b1, 200, 550);
        click(b1, 400, 600);
        click(b1, 500, 600);
        click(b1, 200, 600);
        click(b1, 400, 600);
        click(b1, 500, 600);
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        assertNotNull(br); // Something was printed out.
    }


    /**
     * Tests the emptyBoard method.
     */
    public void testEmptyBoard()
    {
        Piece[][] temp = BoardPanel.emptyBoard();
        assertNotNull(temp);
    }


    /**
     * Testing for the knight
     */
    public void testKnight()
    {
        // Fill Board
        assertEquals("Pawn", b.pieceAt(1, 1).toString().substring(0, 4));
        // Move all black pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 1), i, 3);
            assertEquals("Pawn", b.pieceAt(i, 3).toString().substring(0, 4));

        }
        // Move all white pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 6), i, 4);
            assertEquals("Pawn", b.pieceAt(i, 4).toString().substring(0, 4));
        }
        // Move black knight
        b.makeMove(b.pieceAt(1, 0), 2, 2);
        assertEquals("Knight", b.pieceAt(2, 2).toString().substring(0, 6));
        b.makeMove(b.pieceAt(2, 2), 1, 0);
        assertEquals("Knight", b.pieceAt(1, 0).toString().substring(0, 6));
        // Move white knight
        b.makeMove(b.pieceAt(1, 7), 2, 5);
        assertEquals("Knight", b.pieceAt(2, 5).toString().substring(0, 6));
        b.makeMove(b.pieceAt(2, 5), 1, 7);
        assertEquals("Knight", b.pieceAt(1, 7).toString().substring(0, 6));
    }


    // ----------------------------------------------------------
    /**
     * Testing for the Rook
     */
    public void testRook()
    {
        // Fill Board
        assertEquals("Pawn", b.pieceAt(1, 1).toString().substring(0, 4));
        // Move all black pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 1), i, 3);
            assertEquals("Pawn", b.pieceAt(i, 3).toString().substring(0, 4));

        }
        // Move all white pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 6), i, 4);
            assertEquals("Pawn", b.pieceAt(i, 4).toString().substring(0, 4));
        }
        // Move black rook
        b.makeMove(b.pieceAt(0, 0), 0, 2);
        assertEquals("Rook", b.pieceAt(0, 2).toString().substring(0, 4));
        b.makeMove(b.pieceAt(0, 2), 0, 0);
        assertEquals("Rook", b.pieceAt(0, 0).toString().substring(0, 4));
        // Move white rook
        b.makeMove(b.pieceAt(0, 7), 0, 5);
        assertEquals("Rook", b.pieceAt(0, 5).toString().substring(0, 4));
        b.makeMove(b.pieceAt(0, 5), 0, 7);
        assertEquals("Rook", b.pieceAt(0, 7).toString().substring(0, 4));
    }


    /**
     * Testing for the Bishop.
     */
    public void testBishop()
    {
        // Fill Board
        assertEquals("Pawn", b.pieceAt(1, 1).toString().substring(0, 4));
        // Move all black pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 1), i, 3);
            assertEquals("Pawn", b.pieceAt(i, 3).toString().substring(0, 4));

        }
        // Move all white pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 6), i, 4);
            assertEquals("Pawn", b.pieceAt(i, 4).toString().substring(0, 4));
        }

        b.makeMove(b.pieceAt(2, 0), 1, 1);
        assertEquals("Bish", b.pieceAt(1, 1).toString().substring(0, 4));
        b.makeMove(b.pieceAt(1, 1), 2, 0);
        assertEquals("Bish", b.pieceAt(2, 0).toString().substring(0, 4));

        b.makeMove(b.pieceAt(5, 0), 6, 1);
        assertEquals("Bish", b.pieceAt(6, 1).toString().substring(0, 4));
        b.makeMove(b.pieceAt(6, 1), 5, 0);
        assertEquals("Bish", b.pieceAt(5, 7).toString().substring(0, 4));
    }


    // ----------------------------------------------------------
    /**
     * Tests the Queen
     */
    public void testQueen()
    {
        // Fill Board
        assertEquals("Pawn", b.pieceAt(1, 1).toString().substring(0, 4));
        // Move all black pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 1), i, 3);
            assertEquals("Pawn", b.pieceAt(i, 3).toString().substring(0, 4));

        }
        // Move all white pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 6), i, 4);
            assertEquals("Pawn", b.pieceAt(i, 4).toString().substring(0, 4));
        }
        b.makeMove(b.pieceAt(3, 0), 2, 1);
        assertEquals("Quee", b.pieceAt(2, 1).toString().substring(0, 4));
        b.makeMove(b.pieceAt(2, 1), 3, 0);
        assertEquals("Quee", b.pieceAt(3, 0).toString().substring(0, 4));

        b.makeMove(b.pieceAt(3, 7), 4, 6);
        assertEquals("Quee", b.pieceAt(4, 6).toString().substring(0, 4));
        b.makeMove(b.pieceAt(4, 6), 3, 7);
        assertEquals("Quee", b.pieceAt(3, 7).toString().substring(0, 4));
    }


    /**
     * Test the King class
     */
    public void testKing()
    {
        // Fill Board
        assertEquals("Pawn", b.pieceAt(1, 1).toString().substring(0, 4));
        // Move all black pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 1), i, 3);
            assertEquals("Pawn", b.pieceAt(i, 3).toString().substring(0, 4));

        }
        // Move all white pawns
        for (int i = 0; i < 8; i++)
        {
            b.makeMove(b.pieceAt(i, 6), i, 4);
            assertEquals("Pawn", b.pieceAt(i, 4).toString().substring(0, 4));
        }
        b.makeMove(b.pieceAt(4, 0), 3, 1);
        assertEquals("King", b.pieceAt(3, 1).toString().substring(0, 4));
        b.makeMove(b.pieceAt(3, 1), 4, 0);
        assertEquals("King", b.pieceAt(4, 0).toString().substring(0, 4));

        b.makeMove(b.pieceAt(4, 7), 5, 6);
        assertEquals("King", b.pieceAt(5, 6).toString().substring(0, 4));
        b.makeMove(b.pieceAt(5, 6), 4, 7);
        assertEquals("King", b.pieceAt(4, 7).toString().substring(0, 4));
    }
}
