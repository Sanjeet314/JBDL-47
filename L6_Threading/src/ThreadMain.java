
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntThread t1= new IntThread();
		t1.start();
		
		IntThread t2= new IntThread();
		t2.start();
		
		for(int i =0;i<10;i++) {
			System.out.println("Main Thread :"+i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
