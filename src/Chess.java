import javax.swing.JFrame;

/**
 * This is the Chess class.
 *
 * @author Adam Mounts
 * @author Michael Goheen
 * @author Jon La Marr
 * @version Apr 13, 2011
 */

public class Chess
{
    /**
     * This is the main method of the program that calls the panel.
     *
     * @param args
     *            are the arguments passed to the program.
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new BoardPanel());
        frame.pack();
        frame.setVisible(true);

    }
}
