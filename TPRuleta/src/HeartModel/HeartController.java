package HeartModel;

import BeatModel.DJView;
<<<<<<< HEAD
import BeatModel.ControllerInterface;


  
public class HeartController implements ControllerInterface{
	
=======
import Codigo.ControllerInterface;

  
public class HeartController implements ControllerInterface {
>>>>>>> 3be3ee2b1a7d14b43d71500856dcc8197e1446aa
	HeartModelInterface model;
	DJView view;
  
	public HeartController(HeartModelInterface model) {
		this.model = model;
<<<<<<< HEAD
		view = new DJView(this,new HeartAdapter(model));
=======
		view = new DJView((BeatModel.ControllerInterface) this, new HeartAdapter(model));
>>>>>>> 3be3ee2b1a7d14b43d71500856dcc8197e1446aa
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}
  
	public void start() {}
 
	public void stop() {}
    
	public void increaseBPM() {}
    
	public void decreaseBPM() {}
  
 	public void setBPM(int bpm) {}

<<<<<<< HEAD
	@Override
	public void star() {
		// TODO Auto-generated method stub
		
	}

=======
>>>>>>> 3be3ee2b1a7d14b43d71500856dcc8197e1446aa
}



