package HeartModel;

import java.util.*;

import BeatModel.BPMObserver;
import BeatModel.BeatObserver;



<<<<<<< HEAD

public class HeartModel implements HeartModelInterface, Runnable {
	ArrayList beatObservers = new ArrayList();
	ArrayList bpmObservers = new ArrayList();
	
	int time = 1000;
    int bpm = 90;
	Random random = new Random(System.currentTimeMillis());
	Thread thread;
	static HeartModel instance;

	public static HeartModel getInstance(){
		
		if(instance==null){
			instance= new HeartModel(); 
		}
		
		return instance;
	}
	
	
	private HeartModel() {
=======
public class HeartModel implements HeartModelInterface, Runnable {
	
	private static HeartModel uniqueinstance=null;
	
	ArrayList beatObservers = new ArrayList();
	ArrayList bpmObservers = new ArrayList();
	ArrayList InstanceObservers = new ArrayList();
	int time = 1000;
    int bpm = 90;
    static int instances=0;
	Random random = new Random(System.currentTimeMillis());
	Thread thread;
	
	public static HeartModel getInstance(){
		if(uniqueinstance == null){
			uniqueinstance = new HeartModel();
		}
		instances++;
		return uniqueinstance;
	}
	
	private HeartModel() {
		
>>>>>>> 3be3ee2b1a7d14b43d71500856dcc8197e1446aa
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		int lastrate = -1;

		for(;;) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 - change;
			}
			int rate = 60000/(time + change);
			if (rate < 120 && rate > 50) {
				time += change;
				notifyBeatObservers();
				if (rate != lastrate) {
					lastrate = rate;
					notifyBPMObservers();
				}
			}
			try {
				Thread.sleep(time);
			} catch (Exception e) {}
		}
	}
<<<<<<< HEAD
	public int getHeartRate() {
		return 60000/time;
	}

=======
	
	public int getHeartRate() {
			return 60000/time;
	}
	
	public static int getinstance() {
		if(uniqueinstance==null)
		{return 0;}
		else
		{return instances;}
	}
	
>>>>>>> 3be3ee2b1a7d14b43d71500856dcc8197e1446aa
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}

	public void notifyBeatObservers() {
		for(int i = 0; i < beatObservers.size(); i++) {
			BeatObserver observer = (BeatObserver)beatObservers.get(i);
			observer.updateBeat();
		}
	}

	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

	public void notifyBPMObservers() {
		for(int i = 0; i < bpmObservers.size(); i++) {
			BPMObserver observer = (BPMObserver)bpmObservers.get(i);
			observer.updateBPM();
		}
	}
<<<<<<< HEAD
=======

>>>>>>> 3be3ee2b1a7d14b43d71500856dcc8197e1446aa
		
}