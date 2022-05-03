package example;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "æ»≥Á«œººø‰";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
	}
	
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
}
