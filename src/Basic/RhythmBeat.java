package Basic;

import javax.swing.*;
import java.awt.*;

public class RhythmBeat extends JFrame {
    private Image screenImage;
    private Graphics screenGraphic;

    private Image introBackground;

    public RhythmBeat() {
        setTitle("Test Rhythm Game");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        introBackground = new ImageIcon(Main.class.getResource("../image/back.jpg")).getImage();

        Music introMusic = new Music("intro.mp3", true);
        introMusic.start();
    }

    public void paint(Graphics g) {
        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
    }

    private void screenDraw(Graphics screenGraphic) {
        screenGraphic.drawImage(introBackground, 0, 0, null);
        this.repaint();
    }
}