package defaultPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI_Imp extends JFrame implements ActionListener{
	MuseumSystem ms;
	private JPanel Buttons;
	private JButton guideButton;
	private JButton visitorButton;
	private JButton managementButton;
	private FlowLayout flowLayout;
	
	private JLabel[] labels;
	private GridLayout gridLayout;
	private JPanel panel2;
	private JPanel panel3;

	public GUI_Imp(MuseumSystem m) {
		super("Museum System Management");
		ms=m;
		Buttons=new JPanel();
		flowLayout=new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		Buttons.setLayout(flowLayout);
		
		guideButton=new JButton("Guide Information");
		Buttons.add(guideButton);
		visitorButton=new JButton("Visitor Information");
		Buttons.add(visitorButton);
		managementButton=new JButton("Management");
		Buttons.add(managementButton);
		add(Buttons,BorderLayout.NORTH); 
		panel2=new JPanel();
		gridLayout=new GridLayout(3,1);
		panel2.setLayout(gridLayout);
		labels= new JLabel[3];
		labels[0]=new JLabel("Museum Name: "+m.getName());
		Font font1 = new Font("SansSerif", Font.BOLD, 18);
		labels[0].setFont(font1);
		panel2.add(labels[0]);
		labels[1]=new JLabel("Address: [ Nablus- An Najah National University ]");
		panel2.add(labels[1]);
		String line=new String("Museum Working Days: [  ");
		for(MuseumWorkingDays d: MuseumWorkingDays.values()) {
			line+=d+"   ";
		}
		line+=" ]";
		labels[2]=new JLabel(line);
		panel2.add(labels[2]);
		panel3= new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add(panel2,BorderLayout.NORTH);
		add(panel3,BorderLayout.WEST);
		
		visitorButton.addActionListener(this);
		managementButton.addActionListener(this);
		guideButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		if(e.getSource()==visitorButton) {
			VisitorImp vis=new VisitorImp(ms);
			vis.setSize(2000,850);
			vis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			vis.setVisible(true);
			
		}
		else if(e.getSource()==managementButton) {
			ManagementImp manage=new ManagementImp(ms);
			manage.setSize(2000,850);
			manage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			manage.setVisible(true);
			
		}
		else if(e.getSource()==guideButton) {
			GuideImp g=new GuideImp(ms);
			g.setSize(2000,850);
			g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			g.setVisible(true);
			
		}
	}

}
