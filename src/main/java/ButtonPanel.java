import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    protected JButton but;
    protected int row;
    protected int col;

    public ButtonPanel(){
        row=3;
        col=2;
        int cells=row*col;
        for(int i=0;i<cells;i++){
            setLayout(new GridLayout(row,col)); // One row, one column
            but=new JButton("Press me :)");
            add(but);
            but.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Good job!");

                }
            });
        }
    }
}
