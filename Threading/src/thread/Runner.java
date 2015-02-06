package thread;

import java.util.Calendar;

public class Runner implements Runnable {

	String name;
	int speed;
	Thread thread;

	public Runner(String name, int speed) {
		this.name = name;
		this.speed = speed;
		this.thread = new Thread(this);
		this.thread.setName(name);
		this.thread.start();
	}

	public void run() {
		log("Begin");
		try {
			Thread.sleep(speed * 1000);
		}
		catch (Exception e) {
		}
		log("End");
	}

	private void log (String s) {
		Calendar c = Calendar.getInstance();
		String dateTime = (c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE) + " " +
				c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + 
				c.get(Calendar.SECOND) + ":" + c.get(Calendar.MILLISECOND));
		String threadName = this.thread.getName();
		System.out.println(dateTime + " [" + threadName + "] " + s);
	}

	public Thread getThread() {
		return thread;
	}

}
