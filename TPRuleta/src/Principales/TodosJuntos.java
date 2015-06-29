package Principales;

import BeatModel.BeatController;
import BeatModel.BeatModel;
import BeatModel.BeatModelInterface;
import BeatModel.ControllerInterface;
import Codigo.Control;
import Codigo.Modelo;
import HeartModel.HeartController;
import HeartModel.HeartModel;

public class TodosJuntos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Modelo model= new Modelo();
		Control control= new Control(model);
		
		HeartModel heartModel = HeartModel.getInstance();
        ControllerInterface control1 = new HeartController(heartModel);
        
        BeatModelInterface beatmodel = new BeatModel();
		ControllerInterface controller = new BeatController(beatmodel);
		

	}

}
