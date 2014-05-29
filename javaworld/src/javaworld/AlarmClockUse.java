package javaworld;

public class AlarmClockUse {

	public static void main(String[] args) {
		AlarmClock aClock1 = new AlarmClock();
		aClock1.setAlarmTime(3, 4);
		AlarmClock aClock2 = new AlarmClock(15, 16);
		System.out.println("Alarm clock 1 setting is " + aClock1.getAlarmHour() + ":" + aClock1.getAlarmMinute());
		System.out.println("Alarm clock 2 setting is " + aClock2.getAlarmHour() + ":" + aClock2.getAlarmMinute());
	}

}
