package Codigo;

import BeatModel.BeatModelInterface;
import BeatModel.ControllerInterface;
import BeatModel.DJView;

public class ControlerBeatView implements ControllerInterface {
	
	private DJView view1;
	private BeatModelInterface model;
	private int bpm;
	
	public ControlerBeatView(BeatModelInterface model){
		this.model=model;
		view1=new DJView(this,model);
		model.initialize();
	    view1.createView();
	    view1.createControls();
	    view1.disableStopMenuItem();
	    view1.enableStartMenuItem();
	}
		
	public void star(){
		model.on();
		view1.enableStopMenuItem();
			
	}
		
	public void stop(){
		view1.enableStartMenuItem();
		model.off();
		
	}
		
	public void increaseBPM(){
	}
		
	public void decreaseBPM(){
	
	}
		
	public void setBPM(int bpm){
	
		
	}
	 	
}
