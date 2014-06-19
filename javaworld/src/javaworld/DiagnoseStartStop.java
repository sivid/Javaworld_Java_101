package javaworld;

//DiagnoseStartStop.java
interface DiagnoseStartStop extends StartStop {
	boolean NOT_STARTED = false;
	boolean STARTED = true;

	boolean isStarted();
}