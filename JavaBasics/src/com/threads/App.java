package com.threads;

//MyTask is- a thread
class MyTask extends Thread{
	@Override
	public void run() {
		for( int doc =1; doc <=10; doc++) {
			System.out.println("Printing Document 2:  "+ doc);	
	}
}
}



public class App {
	//main method represents main thread
public static void main(String[] args) {
	
	//whatever we write in here will be executed by main thread
	//sequesntial of output
	
	//JOB 1
	System.out.println("*******Application started********");
	
	//JOB 2
	MyTask task = new MyTask();//child Thread or Worker Thread
	task.start();
	
	//Till job 2 is not finished, below writeen jobs are waiting and are not executed
	//Job 3
	// now main and MyTask executing paralelly or concurrently
	
	for( int doc =1; doc <=10; doc++) {
		System.out.println("Printing document1 :  "+ doc);
		
	}
	//jon 4
	System.out.println("*****Application end**********");
}
}
