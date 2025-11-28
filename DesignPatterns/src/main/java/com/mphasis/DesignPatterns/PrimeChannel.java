package com.mphasis.DesignPatterns;

public class PrimeChannel extends Video{

	public PrimeChannel(ProcessingQuality quality) {
		super(quality);
		
	}

	@Override
	public void playVideo() {
		System.out.println("Play video in prime");
		quality.processVideo();
	}

}
