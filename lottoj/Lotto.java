import javax.swing.*;
import java.awt.event.*;

public class Lotto extends JFrame implements ActionListener
{
    ClassLoader ldr = this.getClass().getClassLoader();
    java.net.URL iconURL = ldr.getResource("powerBall.png");
    ImageIcon icon = new ImageIcon(iconURL);
    // components
    JLabel img = new JLabel(icon);
    JTextField txt = new JTextField("", 18);
    JButton btn = new JButton("Play");
    JPanel pnl = new JPanel();

    // constructor
    public Lotto()
    {
        super("Power Ball");
        setSize(260, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnl.add(img);
        pnl.add(txt);
        pnl.add(btn);
        btn.addActionListener(this);
        add(pnl);
        setVisible(true);
    }

    // event - handler
    public void actionPerformed(ActionEvent event)
    {
        if (event.getSource() == btn)
        {
            int[] nums = new int[70];
            String str = "";
            for (int i = 1; i < 70; i++) {
                nums[i] = i;
            }

            for (int i = 1; i < 70; i++) {
                int r = (int) (68 * Math.random()) + 1;
                int t = nums[i];
                nums[i] = nums[r];
                nums[r] = t;
            }

            for (int i = 1; i < 6; i++)
            {
                str += " " + Integer.toString(nums[i]) + " ";
            }
            txt.setText(str);
        }
    }

    // entry point
    public static void main(String[] args)
    {
        Lotto lotto = new Lotto();
    }

}
