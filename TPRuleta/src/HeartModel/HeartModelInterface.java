package HeartModel;

import BeatModel.BPMObserver;
import BeatModel.BeatObserver;


public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);

}
