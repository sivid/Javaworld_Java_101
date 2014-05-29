package javaworld;

public class AlarmClock {
	private long m_snoozeInterval=5000;
	private int m_alarmHour = 25;
	private int m_alarmMinute = 61;
	public AlarmClock(int hour, int minute){
		setAlarmTime(hour, minute);
	}
	public AlarmClock(){
	}
	public void snooze(){
		System.out.println("zzzzz for: " + m_snoozeInterval + "ms");
	}
	public void setsnoozeInterval(long longgg){
		// should put boundary checks here
		m_snoozeInterval = longgg;
	}
	public long getsnoozeInterval(){
		return m_snoozeInterval;
	}
	public void setAlarmHour(int hour){
		m_alarmHour = hour;
	}
	public void setAlarmMinute(int minute){
		m_alarmMinute = minute;
	}
	public int getAlarmHour(){
		return m_alarmHour;
	}
	public int getAlarmMinute(){
		return m_alarmMinute;
	}
	public void setAlarmTime(int hour, int minute){
		setAlarmHour(hour);
		setAlarmMinute(minute);
	}
}
