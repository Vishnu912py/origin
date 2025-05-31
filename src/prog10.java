import java.awt.event.*;
import java.awt.*; // Import for BorderLayout
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.*;

public class prog10 {
    public static void main(String[] args){
        // The top level container ("Heavyweight container" from AWT package)
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setSize(900, 900);
        jfrm.setLayout(new FlowLayout());
        JToggleButton t1 = new JToggleButton("Click Here");
        JTextField txt1 = new JTextField();
        String[] items = {"USA","EUROPE","AUSTRALIA","INDIA","ANTARTICA"};
        JList<String> lis1 = new JList<String>(items);



        // Initialize lab BEFORE it's used in action listeners
        JLabel lab = new JLabel("Press a Button");
        JLabel jlab = new JLabel("Toggle Button Click me");
        // Center the text in the label
        lab.setHorizontalAlignment(SwingConstants.CENTER);

        JButton btn1 = new JButton("Ok");
        JButton btn2 = new JButton("Cancel");

        // This is a lightweight container (It inherits JComponent Class)
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(btn1);
        p1.add(btn2);
        p1.add(t1);
        p1.add(lis1);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lis1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                lis1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                ArrayList<String> selected_items= new ArrayList<String>();
                selected_items.add(lis1.getSelectedValue());
                for(String str:selected_items){
                    System.out.println(str);
                }

            }
        });

        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                lab.setText("Ok is Pressed");
            }
        });

        t1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                if (t1.isSelected()){
                    jlab.setText("On");

                }
                else {
                    jlab.setText("OFF");
                }

            }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                lab.setText("Cancel is Pressed");
            }
        });

        // Use BorderLayout to place components in specific regions
        jfrm.add(lab); // Place label at the top
        jfrm.add(p1);  // Place panel with buttons at the bottom
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
}