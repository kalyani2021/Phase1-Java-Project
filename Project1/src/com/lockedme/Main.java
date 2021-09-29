package com.lockedme;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manipulations.createMainFolderIfNotPresent("main");
		
		Options.Welcome("LockedMe","Thatha Kalyani");
		
		HandleFileManipulations.handleWelcomeScreenInput();


	}

}
