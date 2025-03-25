
package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DinosaurAnimation {
        private JFrame frame;
        private DinosaurPanel dinosaurPanel;
    public DinosaurAnimation() {
        frame = new JFrame("Dinosaur Animation");
        frame.setSize(800, 400);

        dinosaurPanel = new DinosaurPanel();
        frame.add(dinosaurPanel);

        frame.setVisible(true);

        Timer timer = new Timer(100, new ActionListener() {
            int step = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                step++;
                dinosaurPanel.setDinosaurPosition(step);
                dinosaurPanel.repaint();

                if (step >= 8) {
                    ((Timer) e.getSource()).stop(); // Detener la animación después de 8 pasos
                }
            }
        });

        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DinosaurAnimation();
        });
    }
}

class DinosaurPanel extends JPanel {
    private int dinosaurPosition = 0;

    public void setDinosaurPosition(int position) {
        this.dinosaurPosition = position;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el fondo
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Dibuja el DinosaurAnimation en la posición actual
        int x = dinosaurPosition * 100; // Ajusta la posición horizontal
        int y = getHeight() - 100; // Altura fija en la parte inferior
        drawDinosaur(g, x, y);
    }

    private void drawDinosaur(Graphics g, int x, int y) {
        // Dibuja un DinosaurAnimation simple (puedes personalizarlo)
        g.setColor(Color.GREEN);
        g.fillRect(x, y - 40, 40, 20); // Cuerpo
        g.setColor(Color.ORANGE);
        g.fillRect(x + 10, y - 60, 20, 20); // Cabeza
        g.setColor(Color.BLACK);
        g.drawLine(x + 15, y - 50, x + 25, y - 50); // Ojo
        g.setColor(Color.RED);
        g.fillRect(x + 5, y - 30, 10, 10); // Pierna izquierda
        g.fillRect(x + 25, y - 30, 10, 10); // Pierna derecha
    }
}
