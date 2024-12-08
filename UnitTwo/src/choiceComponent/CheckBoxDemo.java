package choiceComponent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxDemo extends JFrame{
	JLabel courselbl, displaylbl;
	JCheckBox cfmoto, xpulsepro, crf, ktm;
	JButton btn;
	
	public CheckBoxDemo() {
		setTitle("course Frame");
		setLayout(new FlowLayout(FlowLayout.LEFT, 30 ,10));
		setBounds(1000, 350, 200, 200);
		setResizable(false);
		
		//Object creation
		courselbl = new JLabel("cHOOSE PROGRAM");
		cfmoto = new JCheckBox("CFMOTO");
		xpulsepro = new JCheckBox("XPULSE");
		crf = new JCheckBox("CRF");
		ktm = new JCheckBox("KTM");
		
		btn = new JButton("Submit");
		displaylbl = new JLabel();
		
		//action listner to btn
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ArrayList<String> list = new ArrayList<String>();
				if(cfmoto.isSelected()) {
					list.add(cfmoto.getText());
				}
				if(xpulsepro.isSelected()) {
					list.add(xpulsepro.getText());
				}
				if(crf.isSelected()) {
					list.add(crf.getText());
				}
				if(ktm.isSelected()) {
					list.add(ktm.getText());
				}
				
				displaylbl.setText(list.toString());
				
			}
		});
		
		add(courselbl);
		add(cfmoto);
		add(xpulsepro);
		add(ktm);
		add(crf);
		
		add(btn);
		add(displaylbl);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new CheckBoxDemo();

	}

}
