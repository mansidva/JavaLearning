package com.threads;

class Printer {

	void printDocuments(int numOfCopies, String docName) {
		for (int i = 1; i <= numOfCopies; i++) {
			System.out.println("---Printing Document :" + docName + " " + i);
		}
	}
}

class MyThread extends Thread {
	Printer pRef;

	MyThread(Printer p) {
		pRef = p;
	}

	@Override
	public void run() {
		pRef.printDocuments(10, "JohnsProfile.pdf");
	}
}

public class SyncApp {

	public static void main(String[] args) {
		System.out.println(">>>Application started>>>");
		Printer printer = new Printer();
		printer.printDocuments(10, "my documents.pdf");
		MyThread mRef = new MyThread(printer);
		mRef.start();
		System.out.println("***Application Ended***");
	}

}
