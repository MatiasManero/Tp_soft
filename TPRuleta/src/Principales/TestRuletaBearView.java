package Principales;

import BeatModel.BeatController;
import BeatModel.BeatModel;
import BeatModel.BeatModelInterface;
import BeatModel.ControllerInterface;
import Codigo.ControlerBeatView;
import Codigo.Modelo;

public class TestRuletaBearView {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		BeatModelInterface ruletiña= new Modelo();
		ControllerInterface controller = new ControlerBeatView(ruletiña);

	}

}
