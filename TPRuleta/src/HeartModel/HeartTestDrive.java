package HeartModel;


import BeatModel.ControllerInterface;

public class HeartTestDrive {

    public static void main (String[] args) {
    	
		HeartModel heartModel = HeartModel.getInstance();
        ControllerInterface model = new HeartController(heartModel);
    }
}

