package travels;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;

public class SelectAgentDate extends WizardPage {
	  private Composite container;
	  private DateTime date;
	  private Combo travels;
	  final static String[] travelAgents={"Travels1","Travels2","Travels3","Travels4"};
	  private Label agentName;
	  private Label dateSelect;
	  

	SelectAgentDate()
	{
		super("Third Page");
	    setTitle("Timings");
	    setDescription("Travel Agent and timings");
	    
	}
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		container = new Composite(parent, SWT.NULL);
		GridLayout gl = new GridLayout();
		container.setLayout(gl);
		gl.numColumns = 2;
	    
	    agentName=new Label(container, SWT.NULL);
	    agentName.setText("Select the Agent Name");
	    travels= new Combo(container, SWT.BORDER|SWT.READ_ONLY);
	    travels.setItems(travelAgents);
	    
	    dateSelect=new Label(container, SWT.NULL);
	    dateSelect.setText("Select your date of travel");
	    date = new DateTime(container, SWT.CALENDAR);
	    
	    travels.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				if(!travels.getText().isEmpty())
				{
					setPageComplete(true);
				}
				else
				{
					setPageComplete(false);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	    setControl(container);
	    setPageComplete(false);
	}
	public String getDate() {
		return date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
	}

	public String getTravels() {
		return travels.getText();
	}
}
