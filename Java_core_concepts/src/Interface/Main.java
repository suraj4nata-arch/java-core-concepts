package Interface;

public class Main 
{
	public static void main(String[] args) {
		
	Notification n= NotificationFactory.getNotification("email");
	n.send("Hello");
	
	}
}
