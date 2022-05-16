package javaSpecial;

public class Message {

	private String command;
	private String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
		
	}

	public String getCommand() {  // private이므로 게터만 사용
		return command;
	}

	public String getTo() {
		return to;
	}
	
}
