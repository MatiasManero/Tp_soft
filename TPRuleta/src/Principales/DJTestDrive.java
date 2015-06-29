package Principales;

import BeatModel.BeatController;
import BeatModel.BeatModel;
import BeatModel.BeatModelInterface;
import BeatModel.ControllerInterface;
  
public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
