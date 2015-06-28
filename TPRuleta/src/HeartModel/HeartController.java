package HeartModel;

import BeatModel.DJView;
import BeatModel.ControllerInterface;

  
public class HeartController extends HeartAdapter implements ControllerInterface  {

	HeartModelInterface model;
	DJView view;
	private HeartModel model2;
	private int bpm;
  
	public HeartController(HeartModelInterface model) {
		super(model);
		this.model = model;

		view = new DJView(this,new HeartAdapter(model));

        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}
  

    
	public void increaseBPM() {
		model2 = HeartModel.getInstance();
         bpm = this.getBPM();
	}
    
	public int getBPM() { 
		return bpm;
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void star() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseBPM() {

		
	}

}



