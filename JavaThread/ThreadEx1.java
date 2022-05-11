package JavaThread;

import java.awt.Toolkit;

public class ThreadEx1 {

	public static void main(String[] args) {
		/*Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 1; i <= 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					}catch(InterruptedException e){
						
					}
				} // for
			}
		});*/
		/*Thread thread = new Thread(){
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 1; i <= 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					}catch(InterruptedException e){
						
					}
				} // for
			}
		};
		thread.start();*/
		new Thread(){
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 1; i <= 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					}catch(InterruptedException e){
						
					}
				} // for
			}
		}.start();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e){
				
			}
		}
	}

}
 