import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorLab implements ActionListener, KeyListener {
  JFrame frame;
  JPanel panel;
  JButton equButton;
  JTextField textField;
  JTextField textField2;
  JLabel resultLabel;
  JCheckBox minusBox;
  JCheckBox plusBox;
  JCheckBox mulBox;
  JCheckBox divBox;
  ButtonGroup checkBoxGroup;

  Font myFont = new Font("Times New Roman", Font.PLAIN, 30);
  double num1 = 0, num2 = 0, result = 0;
  char operator;
  CalculatorLab() {

    frame = new JFrame("Calculator Lab");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 300);
    frame.setLayout(null);

    textField = new JTextField();
    textField2 = new JTextField();
    textField.setBounds(50, 20, 200, 30);
    textField2.setBounds(270, 20, 200, 30);

    resultLabel= new JLabel("Here is the result");
    resultLabel.setBounds(160, 90, 200, 30);
    resultLabel.setHorizontalAlignment(JLabel.CENTER);
    resultLabel.setFont(myFont);

    textField.addKeyListener(this);
    textField2.addKeyListener(this);

    equButton = new JButton("=");
    equButton.addActionListener(this);
    equButton.setFocusable(false);

    minusBox = new JCheckBox("Minus", false);
    plusBox = new JCheckBox("Plus", false);
    mulBox = new JCheckBox("Inmultire", false);
    divBox = new JCheckBox("Impartire", false);

    checkBoxGroup = new ButtonGroup();
    checkBoxGroup.add(minusBox);
    checkBoxGroup.add(plusBox);
    checkBoxGroup.add(mulBox);
    checkBoxGroup.add(divBox);

    frame.add(textField);
    frame.add(textField2);
    frame.add(resultLabel);
    frame.add(equButton);
    frame.add(minusBox);
    frame.add(plusBox);
    frame.add(mulBox);
    frame.add(divBox);

    minusBox.setBounds(50, 150, 100, 30);
    plusBox.setBounds(150, 150, 100, 30);
    mulBox.setBounds(50, 190, 100, 30);
    divBox.setBounds(150, 190, 100, 30);
    equButton.setBounds(50, 230, 200, 30);

    panel = new JPanel();
    panel.setBounds(50, 100, 300, 300);

    frame.add(panel);
    frame.setVisible(true);

  }
  public static void main(String[] args) {
    CalculatorLab cal = new CalculatorLab();
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == equButton) {
      num1 = Double.parseDouble(textField.getText());
      num2 = Double.parseDouble(textField2.getText());

      if (minusBox.isSelected()) {
        operator = '-';
        result = num1 - num2;
      } else if (plusBox.isSelected()) {
        operator = '+';
        result = num1 + num2;
      } else if (mulBox.isSelected()) {
        operator = '*';
        result = num1 * num2;
      } else if (divBox.isSelected()) {
        operator = '/';
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          resultLabel.setText("Error");
          return;
        }
      }

      resultLabel.setText(String.valueOf(result));
    }
  }

  public void keyTyped(KeyEvent e) {
    char c = e.getKeyChar();

    if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
      e.consume();
    }
  }

  public void keyPressed(KeyEvent e) {

  }

  public void keyReleased(KeyEvent e) {

  }
}