package Principales;


import BeatModel.ControllerInterface;
import HeartModel.HeartController;
import HeartModel.HeartModel;

public class HeartTestDrive {

    public static void main (String[] args) {
    	
		HeartModel heartModel = HeartModel.getInstance();
        ControllerInterface model = new HeartController(heartModel);
    }
}

