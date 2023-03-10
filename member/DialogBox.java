package member;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;


class DialogBox extends JDialog implements ActionListener {
    
	JButton b1;
    ZipcodeFrame cp;
    
    DialogBox(ZipcodeFrame cp,String name,String title) {
        super(cp, true);
        this.cp = cp;
        setTitle(title);
        // �޽��� ���
        add(new JLabel(name, JLabel.CENTER));
        
        JPanel pan = new JPanel();
        pan.setLayout(new FlowLayout());
        add(pan, BorderLayout.SOUTH);

        b1 = new JButton("Ȯ��");
        pan.add(b1);
        b1.addActionListener(this);
        	
        setSize(250, 150);
        setLocationRelativeTo(cp);
        setVisible(true);
    }

    // ���̾�α� ���� ��ư�� Ŭ������ ��
    public void actionPerformed(ActionEvent evt) {
        dispose();
    }
}