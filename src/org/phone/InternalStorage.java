package org.phone;

public class InternalStorage {
public void processName() {
	System.out.println("processName is android");
}
private void ramSize() {
	System.out.println("ramsize is 256");
}
public static void main(String[] args) {
	InternalStorage e = new InternalStorage();
	e.processName();
	e.ramSize();
	
	ExternalStorage e1 = new ExternalStorage();
	e1.size();
	
}
}
