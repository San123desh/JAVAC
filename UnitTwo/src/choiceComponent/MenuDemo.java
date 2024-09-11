package choiceComponent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenuDemo extends JFrame {
	JMenuBar bar;
	JMenu bike, car;
	JMenuItem cfmoto, xpulse, toyota, hondacivic;
	JCheckBoxMenuItem status;
//	JRadioButtonMenuItem online;

	public MenuDemo() {
		super("Menu Frame");
		setBounds(1000, 350, 250, 250);
		bar = new JMenuBar();
		// mENU
		bike = new JMenu("BIKE");
		car = new JMenu("CAR");
		bar.add(bike);
		bar.add(car);

		// MENUITEM
		cfmoto = new JMenuItem("cfmoto");
		xpulse = new JMenuItem("xpulse");
		toyota = new JMenuItem("toyota");
		hondacivic = new JMenuItem("hondacivic");
		bike.add(cfmoto);
		bike.add(xpulse);
		car.add(toyota);
		car.add(hondacivic);
		
		// check menuitem\
		status = new JCheckBoxMenuItem("Status", true);
		bike.add(status);
//		online = new JRadioButtonMenuItem("Online");
//		car.add(online);
		setJMenuBar(bar);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuDemo();
	}

}
