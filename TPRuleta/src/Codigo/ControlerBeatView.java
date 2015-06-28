package Codigo;

import BeatModel.BeatModelInterface;
import BeatModel.ControllerInterface;
import BeatModel.DJView;

public class ControlerBeatView implements ControllerInterface {
	
	DJView view1;
	BeatModelInterface model;
	int bpm;
	
	public ControlerBeatView(View view){
		model=new Modelo(view);
		view1=new DJView((BeatModel.ControllerInterface) this,model);
		model.initialize();	
		bpm=90;
	}
		
	public void star(){
		model.on();	
			
	}
		
	public void stop(){
		model.off();	
	}
		
	public void increaseBPM(){
		bpm++;
		model.setBPM(bpm);
	}
		
	public void decreaseBPM(){
		bpm--;
		model.setBPM(bpm);
	}
		
	public void setBPM(int bpm){
	 	model.getBPM();	
		
	}
	 	
}
