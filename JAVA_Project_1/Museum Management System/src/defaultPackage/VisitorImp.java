package defaultPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;
public class VisitorImp extends JFrame implements ItemListener,ActionListener{
	ArrayList<RegularVisitor> arrayListRegularVisitor=new ArrayList<RegularVisitor>();
	ArrayList<SeniorVisitor> arrayListSeniorVisitor=new ArrayList<SeniorVisitor>();
	ArrayList<Visitor> arrayListVisitor=new ArrayList<Visitor>();
	MuseumSystem ms;
	private JPanel northPart;
	private JPanel allPanel;
	//north part
	private JPanel Buttons;
	private JButton guideButton;
	private JButton visitorButton;
	private JButton managementButton;
	private FlowLayout flowLayout;
	private JLabel[] labels;
	private GridLayout gridLayout;
	private JPanel panel2;
	private JPanel panel3;
	//center part
	private JLabel totalNumLabel;
	private JCheckBox regular;
	private JCheckBox senior;
	private JTextField calcNum;
	private JLabel VisN;
	private JTextField VisName;
	private JButton search;
	private JLabel totalNumSub;
	ButtonGroup group = new ButtonGroup();
	private JRadioButton daily;
	private JRadioButton monthly;
	private JRadioButton yearly;
	private JTextField calcNumber;
	
	private JTextArea textArea;
	private JPanel panel11;
	private JPanel panel22;
	private JPanel panel33;
	
	private JPanel panel123;
	
	private JPanel textAreaPanel;
	Box box = Box.createHorizontalBox();
	
	
	private JPanel centerPanel;
	public VisitorImp(MuseumSystem m) {
		super("Museum Management System");
		ms=m;
		allPanel=new JPanel();
		allPanel.setLayout(new BorderLayout());
		//north part
		northPart=new JPanel();
		northPart.setLayout(new BorderLayout());
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
		northPart.add(Buttons,BorderLayout.NORTH); 
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
		northPart.add(panel3,BorderLayout.WEST);
		allPanel.add(northPart,BorderLayout.NORTH);
		
		visitorButton.addActionListener(this);
		managementButton.addActionListener(this);
		guideButton.addActionListener(this);
		//center part
		panel11=new JPanel();
		panel11.setLayout(new FlowLayout());
		panel123=new JPanel();
		panel123.setLayout(new BorderLayout());
		totalNumLabel=new JLabel("Total Number Of Visitors: ");
		panel11.add(totalNumLabel);
		regular=new JCheckBox("Regular Visitors");
		regular.addItemListener(this);
		panel11.add(regular);
		senior=new JCheckBox("Senior Visitors");
		senior.addItemListener(this);
		panel11.add(senior);
		calcNum=new JTextField("[... Calculated number is shown here ...]");
		panel11.add(calcNum);
		panel123.add(panel11,BorderLayout.NORTH);
		
		panel22=new JPanel();
		panel22.setLayout(new FlowLayout());
		VisN=new JLabel("Visitor's Name");
		panel22.add(VisN);
		VisName=new JTextField(20);
		panel22.add(VisName);
		search=new JButton("Search By Name");
		search.addActionListener(this);
		panel22.add(search);
		panel123.add(panel22,BorderLayout.CENTER);
		
		panel33=new JPanel();
		panel33.setLayout(new FlowLayout());
		totalNumSub=new JLabel("Total Number Of Subscriptions/Visits");
		panel33.add(totalNumSub);
		daily=new JRadioButton("Daily",true);
		group.add(daily);
		daily.addItemListener(this);
		panel33.add(daily);
		monthly=new JRadioButton("Monthly",false);
		monthly.addItemListener(this);
		panel33.add(monthly);
		group.add(monthly);
		yearly=new JRadioButton("Yearly",false);
		yearly.addItemListener(this);
		panel33.add(yearly);
		group.add(yearly);
		calcNumber=new JTextField("[... Calculated number is shown here ...]");
		panel33.add(calcNumber);
		panel123.add(panel33,BorderLayout.SOUTH);
		
		textAreaPanel=new JPanel();
		textArea = new JTextArea( 30, 60 ); 
		box.add( new JScrollPane( textArea ) );
		textAreaPanel.add(box);
		
		centerPanel=new JPanel();
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(panel123,BorderLayout.NORTH);
		centerPanel.add(textAreaPanel,BorderLayout.CENTER);
		
		allPanel.add(centerPanel,BorderLayout.CENTER);
		add(allPanel);
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(regular.isSelected()&&senior.isSelected()) {
			arrayListRegularVisitor=ms.getRegularVisitors();
		    arrayListSeniorVisitor=ms.getSeniorVisitors();
		    arrayListRegularVisitor.trimToSize();
		    arrayListSeniorVisitor.trimToSize();
		    Integer x= arrayListRegularVisitor.size()+arrayListSeniorVisitor.size();
			calcNum.setText(x.toString());
		}
		else if(regular.isSelected()) {
			arrayListRegularVisitor=ms.getRegularVisitors();
		    arrayListRegularVisitor.trimToSize();
		    Integer x= arrayListRegularVisitor.size();
			calcNum.setText(x.toString());
		}
		else if(senior.isSelected()) {
		    arrayListSeniorVisitor=ms.getSeniorVisitors();
		    arrayListSeniorVisitor.trimToSize();
		    Integer x= arrayListSeniorVisitor.size();
			calcNum.setText(x.toString());
		}
		else {
			calcNum.setText("[... Calculated number is shown here ...]");
		}
		if(daily.isSelected()) {
			Integer dailycal=0;
			for(MultiTimeTicket mtt:ms.allMultiTimeTickets) {
				if(mtt.getType()==TicketType.DAILY)
					dailycal+=1;
			}
			calcNumber.setText(dailycal.toString());
		}
		if(monthly.isSelected()) {
			Integer monthlycal=0;
			for(MultiTimeTicket mtt:ms.allMultiTimeTickets) {
				if(mtt.getType()==TicketType.MONTHLY)
					monthlycal+=1;
			}
			calcNumber.setText(monthlycal.toString());
		}
		if(yearly.isSelected()) {
			Integer yearlycal=0;
			for(MultiTimeTicket mtt:ms.allMultiTimeTickets) {
				if(mtt.getType()==TicketType.YEARLY)
					yearlycal+=1;
			}
			calcNumber.setText(yearlycal.toString());
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList <VisitorRecord>records=new ArrayList<VisitorRecord>();
		String string="";
		Integer i=0;
		Boolean bool=false;
		arrayListVisitor=ms.getArrayListVisitor();
		for(Visitor v:arrayListVisitor) {
			if(VisName.getText().equals(v.getName())) {
				records=v.getVisits();
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(v.getDob());
				int year=calendar.get(Calendar.YEAR);
				string="Information on visitor: "+v.getName()+"\n"+"Name: "+v.getName()+"\n"+"ID: "+v.getId()
				+"\n"+"Visitor Id:"+v.getRecord_id()+"\n"+"Age: "+(2021-year)+"\nVisit History\n";
				
				for(VisitorRecord r: records) {
					string+= "Record"+(++i).toString()+" "+r+"\n";
				}
				bool=true;
				textArea.setText(string);
				}
			if(bool==false) {
				string="no visitor found";
				textArea.setText(string);
			}
		}
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
