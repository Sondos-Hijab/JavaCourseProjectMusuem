package defaultPackage;
import java.awt.*;
import defaultPackage.Languages;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;
public class GuideImp extends JFrame implements ActionListener{
	//north Part 
	MuseumSystem ms;
	MuseumWorkingDays expecDay;
	Languages selLanguage;
	ArrayList <Guide> arrayListGuide=new ArrayList<Guide>();
	private JPanel Buttons;
	private JButton guideButton;
	private JButton visitorButton;
	private JButton managementButton;
	private FlowLayout flowLayout;
	private JLabel[] labels;
	private GridLayout gridLayout;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel northPart;
	private JPanel allPanel;
	//Center Part
	private JLabel guideNameLabel;
	private JTextField guideNameText;
	private JButton search;
	private JPanel firstRow;
	private JLabel guideWorkinDaysLabel;
	private JComboBox days;
	String [] dayWeek={"sunday","monday","tuesday","wednesday","thursday","firday","saturday"};
	private JButton listAvaiGuides;
	private JPanel secondRow;
	private JLabel tourLangLabel;
	String [] LanguagesStrings= {"arabic","english","french"};
	private JComboBox langs;
	private JButton listAllLang;
	private JPanel thirdRow;
	private JPanel allRows;
	private JPanel centerPart;
	private JTextArea textArea;
	private JPanel textAreaPanel;
	private Box box=Box.createHorizontalBox(); 
	public GuideImp(MuseumSystem m) {
		super("Museum System Management");
		ms=m;
		//north part
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
		visitorButton.addActionListener(this);
		managementButton.addActionListener(this);
		guideButton.addActionListener(this);
		panel3= new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add(panel2,BorderLayout.NORTH);
		northPart=new JPanel();
		northPart.setLayout(new BorderLayout());
		northPart.add(panel3,BorderLayout.WEST);
		allPanel=new JPanel();
		allPanel.setLayout(new BorderLayout());
		allPanel.add(northPart,BorderLayout.NORTH);
		//Center Part
		guideNameLabel=new JLabel("Guide's Name");
		firstRow=new JPanel();
		firstRow.setLayout(new FlowLayout());
		firstRow.add(guideNameLabel);
		guideNameText=new JTextField(20);
		firstRow.add(guideNameText);
		search=new JButton("Search By Name");
		search.addActionListener(this);
		firstRow.add(search);
		
		guideWorkinDaysLabel=new JLabel("Guide's Working Days");
		secondRow=new JPanel();
		secondRow.setLayout(new FlowLayout());
		secondRow.add(guideWorkinDaysLabel);
		days=new JComboBox(dayWeek);
		secondRow.add(days);
		listAvaiGuides=new JButton("List All Available Guides");
		listAvaiGuides.addActionListener(this);
		secondRow.add(listAvaiGuides);
		
		tourLangLabel=new JLabel("Tour's Language");
		thirdRow=new JPanel();
		thirdRow.setLayout(new FlowLayout());
		thirdRow.add(tourLangLabel);
		langs=new JComboBox(LanguagesStrings);
		thirdRow.add(langs);
		listAllLang=new JButton ("List All Guides");
		listAllLang.addActionListener(this);
		thirdRow.add(listAllLang);
		
		allRows=new JPanel();
		allRows.setLayout(new BorderLayout());
		allRows.add(firstRow,BorderLayout.NORTH);
		allRows.add(secondRow,BorderLayout.CENTER);
		allRows.add(thirdRow,BorderLayout.SOUTH);
		centerPart=new JPanel();
		centerPart.setLayout(new BorderLayout());
		centerPart.add(allRows,BorderLayout.NORTH);
		
		
		textAreaPanel=new JPanel();
		textArea = new JTextArea( 30, 60 ); 
		box.add( new JScrollPane( textArea ) );
		textAreaPanel.add(box);
		
		centerPart.add(textAreaPanel,BorderLayout.CENTER);
		
		allPanel.add(centerPart,BorderLayout.CENTER);
		add(allPanel);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {	
		if (e.getSource()==search) {
			String string="";
			Boolean bool=false;
			arrayListGuide=ms.getArrayListGuide();
			for(Guide g:arrayListGuide) {
				if(guideNameText.getText().equals(g.getName())) {
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(g.getDob());
					int year=calendar.get(Calendar.YEAR);
					string="Guide's Name: "+g.getName()+"\n"+"ID: "+g.getId()
					+"\n"+"Employment Id:"+g.getEmployment_id()+"\n"+"Age: "+(2021-year)+"\nHire Date:"+
							g.getHireDate()+"\nMaximum Number Of Tours: "+g.getToursPerDay()+"\n"+
					"Spoken Languages: "+g.getLanguage()+"\nNumber Of Tours Performed This Week: "+g.getToursPerWeek();
					
					bool=true;
					textArea.setText(string);
					}
				if(bool==false) {
					string="no guide found";
					textArea.setText(string);
				}
			}
		}
		else if(e.getSource()==listAvaiGuides) {
			String sguides="";
			int i=0;
			ArrayList <Guide> availableGuides=new ArrayList<Guide>();
			if(days.getSelectedIndex()==0)
				expecDay=MuseumWorkingDays.SUNDAY;
			else if (days.getSelectedIndex()==1)
				expecDay=MuseumWorkingDays.MONDAY;
			else if (days.getSelectedIndex()==2)
				expecDay=MuseumWorkingDays.TUESDAY;
			else if (days.getSelectedIndex()==3)
				expecDay=MuseumWorkingDays.WEDNESDAY;
			else if (days.getSelectedIndex()==4)
				expecDay=MuseumWorkingDays.THURSDAY;
			else if (days.getSelectedIndex()==5)
				expecDay=MuseumWorkingDays.FRIDAY;
			else if (days.getSelectedIndex()==6)
				expecDay=MuseumWorkingDays.SATURDAY;
			
			for(Guide g: ms.getArrayListGuide()) {
				for(MuseumWorkingDays d: g.getWorkingdays()) {
						if(d==expecDay)
							{availableGuides.add(g); }
				}
			}
			
			for(Guide g:availableGuides) {
				sguides+= (++i)+"- "+g.getName()+", Employee id: "+g.getEmployment_id()+"\n";
			}
			
			textArea.setText("A list of all available guides on "+expecDay+" are:\n"+sguides);
		}
		
		else if(e.getSource()==listAllLang) {
			String sguides="";
			int i=0;
			ArrayList <Guide> availableGuides=new ArrayList<Guide>();
			if(langs.getSelectedItem()=="arabic") selLanguage=Languages.ARABIC;
			else if (langs.getSelectedItem()=="english") selLanguage=Languages.ENGLISH;
			else if(langs.getSelectedItem()=="french") selLanguage=Languages.FRENCH;
			
			for(Guide g: ms.getArrayListGuide()) {
				for(Languages d: g.getLanguage()) {
						if(d==selLanguage)
							{availableGuides.add(g); }
				}
			}
			
			for(Guide g:availableGuides) {
				sguides+= (++i)+"- "+g.getName()+", Employee id: "+g.getEmployment_id()+"\n";
			}
			textArea.setText("A list of all available guides who speak "+selLanguage+" are:\n"+sguides);
		}

		else if(e.getSource()==visitorButton) {
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
