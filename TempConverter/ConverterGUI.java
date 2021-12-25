// View, GUI, also links to the model and controller

import javax.swing.*; 
import java.awt.event.*;

public class ConverterGUI extends JPanel 
{
    private static final long serialVersionUID = 1L;
    private String title = "Simple Temperature Converter";
    private TempConverter model = new TempConverter();
    private ConverterController controller = new ConverterController(this);

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public TempConverter getModel() {
        return model;
    }

    public ConverterController getController() {
        return controller;
    }

    public JTextField getCelsiusField() 
    {
		return celsiusField;
	}


	public JTextField getFarField() 
    {
		return farField;
	}


    private JTextField celsiusField = new JTextField("0.0", 10);
	private JTextField farField = new JTextField("32.0", 10);

    public ConverterGUI()
    {
        add(new JLabel("Celsius"));
        add(celsiusField);
        celsiusField.addActionListener(controller);
        add(new JLabel("Fahrenheit"));
		add(farField);
		farField.addActionListener(controller);

    }

    // display for the panel
    public void display()
    {
        JFrame frame = new JFrame();
		 frame.setTitle(title);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.add(this);
		 frame.pack();
		 frame.setVisible(true);
    }

    public static void main(String[] args) 
    {
        ConverterGUI gui = new ConverterGUI();
        gui.display();
    }
}