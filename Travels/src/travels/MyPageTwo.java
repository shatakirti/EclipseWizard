package travels;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MyPageTwo extends WizardPage {
  private Text from,to,via1,via2,via3;
  private Label destinationLabel,fromLabel,via1Label,via2Label,via3Label;
  private Composite container;

  public MyPageTwo() {
    super("Second Page");
    setTitle("Travel Details");
    setDescription("Travel Details");
    //setControl(from);
  }

  @Override
  public void createControl(Composite parent) {
	    container = new Composite(parent, SWT.NULL);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 2;
   
    destinationLabel = new Label(container, SWT.NULL);
    destinationLabel.setText("Enter Destination");
    to=new Text(container, SWT.BORDER | SWT.SINGLE);
    to.setText("");
   
    fromLabel = new Label(container, SWT.NULL);
    fromLabel.setText("Enter Starting Point");
    from=new Text(container, SWT.BORDER | SWT.SINGLE);
    from.setText("");
    
    via1Label = new Label(container, SWT.NULL);
    via1Label.setText("Enter Via Point 1");
    via1=new Text(container, SWT.BORDER | SWT.SINGLE);
    via1.setText("");
    
    via2Label = new Label(container, SWT.NULL);
    via2Label.setText("Enter Via Point 2");
    via2=new Text(container, SWT.BORDER | SWT.SINGLE);
    via2.setText("");
    
    via3Label = new Label(container, SWT.NULL);
    via3Label.setText("Enter Via Point 3");
    via3=new Text(container, SWT.BORDER | SWT.SINGLE);
    via3.setText("");

    to.addKeyListener(new KeyListener() {
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
	        	if(!from.getText().isEmpty()&&!from.getText().isEmpty())
	            setPageComplete(true);
	          
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	});

    from.addKeyListener(new KeyListener() {

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
          if (!to.getText().isEmpty()&&!from.getText().isEmpty()) {
            setPageComplete(true);
          }
        }

      });
    via1.addKeyListener(new KeyListener() {

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
          if (!to.getText().isEmpty()&&!from.getText().isEmpty()) {
            setPageComplete(true);
          }
        }

      });
    via2.addKeyListener(new KeyListener() {

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
          if (!to.getText().isEmpty()&&!from.getText().isEmpty()) {
            setPageComplete(true);
          }
        }

      });
    via3.addKeyListener(new KeyListener() {

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
          if (!to.getText().isEmpty()&&!from.getText().isEmpty()) {
            setPageComplete(true);
          }
        }

      });
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    to.setLayoutData(gd);
    from.setLayoutData(gd);
    via1.setLayoutData(gd);
    via2.setLayoutData(gd);
    via3.setLayoutData(gd);
    setControl(container);
    setPageComplete(false);
  }

public String getFrom() {
	return from.getText();
}

public String getTo() {
	return to.getText();
}

public String getVia1() {
	return via1.getText();
}

public String getVia2() {
	return via2.getText();
}

public String getVia3() {
	return via3.getText();
}
} 
