import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RecordList extends JPanel implements ActionListener, KeyListener {

    Timer timer;
    int playerX = 200;
    int object X, obejct Y;
    int score = 0;
    int misses = 0;

    Random rand = new Random();

    public SimpleTest {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLACK);

        addKeyListener(this);
        setFocusable(true);

        spawnObject();

        timer = new Timer(20, this);
        timer.start();
    }

    void spawnObject() {
        objectX = rand.nextInt(450);
        objectY = 0;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Player
        g.setColor(Color.GREEN);
        g.fillRect(playerX, 450, 80, 10);

        // Falling object
        g.setColor(Color.RED);
        g.fillOval(objectX, objectY, 20, 20);

        // Score
        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 10, 20);
        g.drawString("Misses: " + misses, 10, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        objectY += 5;

        // Collision
        if (objectY >= 430 && objectX >= playerX && objectX <= playerX + 80) {
            score++;
            spawnObject();
        }

        // Missed
        if (objectY > 500) {
            misses++;
            spawnObject();
        }

        // Game over
        if (misses >= 5) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Its Over! List Score: " + score);
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT && playerX > 0) {
            playerX -= 20;
        }

        if (key == KeyEvent.VK_RIGHT && playerX < 420) {
            playerX += 20;
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Get COIN");
        SimpleTest game = new SimpleTest();

        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}