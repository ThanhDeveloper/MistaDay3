
class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;
	public RunnableDemo(String Name) {
		threadName=Name;
		System.out.println("Creating "+threadName);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo r=new RunnableDemo("HrDatabase");
		r.start();
		RunnableDemo s=new RunnableDemo("SendEmail");
		s.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running" +threadName);
		try {
			for (int i = 4; i >0; i--) {
				System.out.println("Thread "+threadName+ " , "+i);
				//let the thread sleep for a while
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread "+ threadName +" interrupted.  ");
		}
		System.out.println("Thread "+threadName +" Exiting. ");
	}
	public void start() {
		System.out.print("Starting " +threadName);
		if(t==null) {
			t=new Thread(this,threadName);
			t.start();
		}
	}

}
