import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 2D extends JPanel {
    private final int width = 800;
    private final int height = 600;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);

        // Draw the original shape
        Rectangle rect = new Rectangle(50, 50, 100, 100);
        g.setColor(Color.BLACK);
        g.drawRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());

        // Apply scaling transformation
        g.translate(200, 0); // Move to the right
        g.scale(2, 2); // Scale by a factor of 2
        g.setColor(Color.RED);
        g.drawRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());

        // Apply translation transformation
        g.translate(200, 0); // Move to the right
        g.setTransform(1, 0, 0, 1, 0, 0); // Reset the transformation
        g.translate(0, 200); // Move down
        g.setColor(Color.BLUE);
        g.drawRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());

        // Apply reflection about the X axis
        g.translate(200, 0); // Move to the right
        g.setTransform(1, 0, 0, -1, 0, height); // Reflect about X axis
        g.setColor(Color.GREEN);
        g.drawRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Transformations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        Transformation2D panel = new Transformation2D();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
