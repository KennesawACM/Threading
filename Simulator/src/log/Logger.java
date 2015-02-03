package log;

public class Logger {

	private String Log_Header;
	private String Log_State;
	private String Log_Time;
	private String Log_Message;
	
	public Logger() {
		
	}
	
	public Logger(String msg, String header, String state) {
		this.Log_Header = header;
		this.Log_State = state;
	}

	public String getLog_Header() {
		return Log_Header;
	}

	public String getLog_State() {
		return Log_State;
	}

	public String getLog_Time() {
		return Log_Time;
	}

	public String getLog_Message() {
		return Log_Message;
	}
	
	public void setLog_Header(String log_Header) {
		Log_Header = log_Header;
	}

	public void setLog_State(String log_State) {
		Log_State = log_State;
	}

	public void setLog_Time(String log_Time) {
		Log_Time = log_Time;
	}
	
	public void setLog_Message(String log_Message) {
		Log_Time = log_Message;
	}
	
	@Override
	public String toString() {
		
		return "" + "[TIME]: " + getLog_Time() + ", [STATE]: " + getLog_State() + "\n" +
				"Log_Message: " + getLog_Message();
	}
}
