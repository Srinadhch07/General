import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventDemo extends JFrame {
    private JLabel eventLabel;

    public MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        eventLabel = new JLabel();
        eventLabel.setHorizontalAlignment(JLabel.CENTER);
        eventLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        updateEventLabel("No event");

        addMouseListener(new MouseEventHandler());

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(eventLabel, BorderLayout.CENTER);
    }

    private void updateEventLabel(String eventName) {
        eventLabel.setText(eventName);
    }

    private class MouseEventHandler extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            updateEventLabel("Mouse Clicked");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            updateEventLabel("Mouse Pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            updateEventLabel("Mouse Released");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            updateEventLabel("Mouse Entered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            updateEventLabel("Mouse Exited");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseEventDemo demo = new MouseEventDemo();
            demo.setVisible(true);
        });
    }
}