// this doesn't work properly
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SnakeGame extends JPanel implements KeyListener {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private int[] snakeX = new int[WIDTH * HEIGHT];
    private int[] snakeY = new int[WIDTH * HEIGHT];
    private int snakeLength = 3;
    private int direction = 3; // 0 - up, 1 - down, 2 - left, 3 - right
    private boolean running = false;
    private Timer timer;
    private int appleX, appleY;
    private boolean appleAvailable = true;

    public SnakeGame() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (running) move();
            }
        });

        initGame();
    }

    private void initGame() {
        snakeLength = 3;
        for (int i = 0; i < snakeLength; i++) {
            snakeX[i] = WIDTH / 2 - i;
            snakeY[i] = HEIGHT / 2;
        }
        spawnApple();
        running = false;
    }

    private void startGame() {
        running = true;
        timer.start();
    }

    private void stopGame() {
        running = false;
        timer.stop();
    }

    private void move() {
        for (int i = snakeLength - 1; i > 0; i--) {
            snakeX[i] = snakeX[i - 1];
            snakeY[i] = snakeY[i - 1];
        }
        if (direction == 0) snakeY[0]--;
        if (direction == 1) snakeY[0]++;
        if (direction == 2) snakeX[0]--;
        if (direction == 3) snakeX[0]++;
        if (snakeX[0] == appleX && snakeY[0] == appleY) {
            snakeLength++;
            appleAvailable = false;
        }
        if (snakeX[0] < 0 || snakeX[0] >= WIDTH || snakeY[0] < 0 || snakeY[0] >= HEIGHT) {
            stopGame();
            JOptionPane.showMessageDialog(this, "Game Over!");
            initGame();
            return;
        }
        for (int i = 1; i < snakeLength; i++) {
            if (snakeX[i] == snakeX[0] && snakeY[i] == snakeY[0]) {
                stopGame();
                JOptionPane.showMessageDialog(this, "Game Over!");
                initGame();
                return;
            }
        }
        if (!appleAvailable) {
            spawnApple();
            appleAvailable = true;
        }
        repaint();
    }

    private void spawnApple() {
        appleX = (int) (Math.random() * WIDTH);
        appleY = (int) (Math.random() * HEIGHT);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(appleX * 20, appleY * 20, 20, 20);
        g.setColor(Color.GREEN);
        for (int i = 0; i < snakeLength; i++) {
            g.fillRect(snakeX[i] * 20, snakeY[i] * 20, 20, 20);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP && direction != 1) direction = 0;
        if (key == KeyEvent.VK_DOWN && direction != 0) direction = 1;
        if (key == KeyEvent.VK_LEFT && direction != 3) direction = 2;
        if (key == KeyEvent.VK_RIGHT && direction != 2) direction = 3;
        if (key == KeyEvent.VK_SPACE) {
            if (running) stopGame();
            else startGame();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Snake Game");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new SnakeGame());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
