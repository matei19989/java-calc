import javax.swing.*;
import java.awt.*;

public class CalculatorLabGUI {
  JFrame frame;
  JTextField inputField;
  JTextField inputField2;
  JLabel resultLabel;
  JButton equButton;
  JCheckBox minusBox;
  JCheckBox plusBox;
  JCheckBox mulBox;
  JCheckBox divBox;
  ButtonGroup checkBoxGroup;
  Font myFont = new Font("Times New Roman", Font.PLAIN, 30);

  CalculatorLabGUI() {
    frame = new JFrame("Calculator Lab");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 300);
    frame.setLayout(null);

    inputField = new JTextField();
    inputField2 = new JTextField();
    resultLabel = new JLabel("Here is the result");
    equButton = new JButton("=");

    minusBox = new JCheckBox("Minus", false);
    plusBox = new JCheckBox("Plus", false);
    mulBox = new JCheckBox("Inmultire", false);
    divBox = new JCheckBox("Impartire", false);

    checkBoxGroup = new ButtonGroup();
    checkBoxGroup.add(minusBox);
    checkBoxGroup.add(plusBox);
    checkBoxGroup.add(mulBox);
    checkBoxGroup.add(divBox);

    frame.add(inputField);
    frame.add(inputField2);
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

    inputField.setBounds(50, 20, 200, 30);
    inputField2.setBounds(270, 20, 200, 30);

    resultLabel.setBounds(160, 90, 200, 30);
    resultLabel.setHorizontalAlignment(JLabel.CENTER);
    resultLabel.setFont(myFont);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new CalculatorLabGUI();
  }
}