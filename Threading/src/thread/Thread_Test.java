package thread;

import java.util.Calendar;

public class Thread_Test {
	
	public static void main(String[] args) throws Exception {

		log("Begining");
		
		Runner runner1 = new Runner("Runner 1", 5);
		Runner runner2 = new Runner("Runner 2", 7);
		Runner runner3 = new Runner("Runner 3", 10);
		Jogger jogger1 = new Jogger("Jogger 1", 8);
		Jogger jogger2 = new Jogger("Jogger 2", 10);

		runner1.getThread().join();
		jogger2.interrupt();
		runner2.getThread().join();
		runner3.getThread().join();
		jogger1.join();
		jogger2.join();
		log("End");
	}
	
	private static void log (String s) {
		Calendar c = Calendar.getInstance();
		String dateTime = (c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE) + " " +
				c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + 
				c.get(Calendar.SECOND) + ":" + c.get(Calendar.MILLISECOND));
		String threadName = Thread.currentThread().getName();
		System.out.println(dateTime + " [" + threadName + "] " + s);
	}
}
