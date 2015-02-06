package thread;

import java.util.Calendar;

public class Person extends Thread {

	String name;
	int lifeExpectancy;
	
	public Person(String name, int lifeExpetancy) {
		
		this.name = name;
		this.lifeExpectancy = (lifeExpetancy * (int) (Math.random() * 50) + 50) / 100;
		setName(name);
		start();
	}
	
	public void run() {
		
		log("Begin");
		try {
			Thread.sleep(lifeExpectancy);
		}
		catch (Exception e) {
			log("forced to quit");
		}
		log("End");
	}

	private void log (String s) {
		Calendar c = Calendar.getInstance();
		String dateTime = (c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE) + " " +
				c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + 
				c.get(Calendar.SECOND) + ":" + c.get(Calendar.MILLISECOND));
		String threadName = this.getName();
		System.out.println(dateTime + " [" + threadName + "] " + s);
	}
}
