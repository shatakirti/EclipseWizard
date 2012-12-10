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

public class MyPageOne extends WizardPage {
  private Text travelName;
  private Composite container;

  public MyPageOne() {
    super("First Page");
    setTitle("Travel Agent Name");
    setDescription("Travel Agent Name");
  }

  @Override
  public void createControl(Composite parent) {
    container = new Composite(parent, SWT.NULL);
    GridLayout layout = new GridLayout();
    container.setLayout(layout);
    layout.numColumns = 2;
    Label label1 = new Label(container, SWT.NULL);
    label1.setText("Travel Agent Name");

    travelName = new Text(container, SWT.BORDER | SWT.SINGLE);
    travelName.setText("");
    travelName.addKeyListener(new KeyListener() {

      @Override
      public void keyPressed(KeyEvent e) {
      }

      @Override
      public void keyReleased(KeyEvent e) {
        if (!travelName.getText().isEmpty()) {
          setPageComplete(true);
        }
      }

    });
    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    travelName.setLayoutData(gd);
    // Required to avoid an error in the system
    setControl(container);
    setPageComplete(false);

  }

public String getTravelName() {
	return travelName.getText();
}

public void setTravelName(Text travelName) {
	this.travelName = travelName;
}


} 