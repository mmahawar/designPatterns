package designPatterns.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing VLC file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("This is wrong type for this class " + fileName);
	}

}
