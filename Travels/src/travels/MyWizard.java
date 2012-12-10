package travels;

import javax.swing.JOptionPane;

import org.eclipse.jface.wizard.Wizard;

public class MyWizard extends Wizard {

	protected MyPageOne one;
	protected MyPageTwo two;
	protected SelectAgentDate three;
	public MyWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		one = new MyPageOne();
		two = new MyPageTwo();
		three = new SelectAgentDate();
		addPage(one);
		addPage(two);
		addPage(three);
	}

	@Override
	public boolean performFinish() {
		String travelName=one.getTravelName(),source=two.getTo(),destination=two.getFrom(),via1=two.getVia1(),via2=two.getVia2(),via3=two.getVia3();
		String travels=three.getTravels();
		String date=three.getDate();
		// Print the result to the console
		System.out.println("TravelName : " + travelName);
		System.out.println("Source : " + source);
		System.out.println("Destination : " + destination);
		System.out.println("Via1 : " + via1);
		System.out.println("Via2 : " + via2);
		System.out.println("Via3 : " + via3);
		System.out.println("Travels : " + travels);
		System.out.println("Date of journey : " + date);
		String str="Travel Agent : "+travelName+"\n TravelsName : " + travels+"\n Source : "+source+"\n Destination : "+destination+"\n Date of Journey : "+date+"\n Via1 : "+via1+"\n Via2 : "+via2+"\n Via3 : "+via3;
		System.out.println(str);
		JOptionPane.showMessageDialog(null,str);
		return true;
	}
}