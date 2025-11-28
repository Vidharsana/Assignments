package com.mphasis.DesignPatterns;

public class Youtube extends Video{

	public Youtube(ProcessingQuality quality) {
		super(quality);
		
	}

	@Override
	public void playVideo() {
		System.out.println("Playing video in youtube with ");
		quality.processVideo();
	}

}
