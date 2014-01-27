package designPatterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (isVlc(audioType)) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (isMp4(audioType)) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (isVlc(audioType)) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (isMp4(audioType)) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}

	private boolean isMp4(String audioType) {
		return audioType.equalsIgnoreCase("mp4");
	}

	private boolean isVlc(String audioType) {
		return audioType.equalsIgnoreCase("vlc");
	}

}
