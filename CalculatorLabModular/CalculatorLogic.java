import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculatorLogic implements ActionListener, KeyListener {
  CalculatorLabGUI gui;

  CalculatorLogic(CalculatorLabGUI gui) {
    this.gui = gui;
    gui.equButton.addActionListener(this);
    gui.inputField.addKeyListener(this);
    gui.inputField2.addKeyListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == gui.equButton) {
      double num1 = Double.parseDouble(gui.inputField.getText());
      double num2 = Double.parseDouble(gui.inputField2.getText());
      double result = 0;

      if (gui.minusBox.isSelected()) {
        result = num1 - num2;
      } else if (gui.plusBox.isSelected()) {
        result = num1 + num2;
      } else if (gui.mulBox.isSelected()) {
        result = num1 * num2;
      } else if (gui.divBox.isSelected()) {
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          gui.resultLabel.setText("Error");
          return;
        }
      }

      gui.resultLabel.setText(String.valueOf(result));
    }
  }

  public void keyTyped(KeyEvent e) {
    char c = e.getKeyChar();

    if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
      e.consume();
    }
  }

  public void keyPressed(KeyEvent e) {}

  public void keyReleased(KeyEvent e) {}
}