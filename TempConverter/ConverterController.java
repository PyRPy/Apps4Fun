// controller, action listener; register controls; action performed method

import java.awt.event.*;
import javax.swing.*;

public class ConverterController implements ActionListener 
{
    private ConverterGUI gui;
    public ConverterController(ConverterGUI gui)
    {
        this.gui = gui;
    }

    public void actionPerformed(ActionEvent e)
    {
        TempConverter calculator = gui.getModel();
        JTextField farField = gui.getFarField();
        JTextField celsiusField = gui.getCelsiusField();
        if (e.getSource() == farField) {
            try {
                double fTemp = Double.parseDouble(farField.getText());

                double cTemp = calculator.f2c(fTemp);
                celsiusField.setText("" + cTemp);
            } catch(NumberFormatException nde) {
                JOptionPane.showMessageDialog(gui, "Error, input must be numerical");

            }
        } else {
            try {
                double cTemp  = Double.parseDouble(celsiusField.getText());
                double fTemp = calculator.c2f(cTemp);
                farField.setText("" + fTemp);
            } catch(NumberFormatException nde) {
                JOptionPane.showMessageDialog(gui, "Error, input must be numerical");

            }
        }
    }
}
// http://www.cs.sjsu.edu/faculty/pearce/modules/lectures/j2se/jfc/GUI1/converter/index.htm
// https://www.geeksforgeeks.org/double-parsedouble-method-in-java-with-examples/