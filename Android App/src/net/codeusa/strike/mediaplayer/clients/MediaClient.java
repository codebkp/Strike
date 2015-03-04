package net.codeusa.strike.mediaplayer.clients;

public abstract class MediaClient {

	 public abstract void play();
	 public abstract void pause();
	 public abstract void stop();
	 public abstract void next();
	 public abstract void previous();
	 public abstract void volumeUP();
	 public abstract void volumeDown();
	 public abstract void mute();
	 public abstract void seek();
}
