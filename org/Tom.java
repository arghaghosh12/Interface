package org;

class Tom extends Employee implements Jspiders,Qspiders{
	@Override
	public void work()
	{
		System.out.println("Waiking on the way");
	}
	@Override
	public void developApp()
	{
		System.out.println("develop the web apps");
	}
	@Override
	public void testApp()
	{
		System.out.println("Testing the web apps ");
	}

	public static void main(String[] args) {
		Tom t=new Tom();
		t.work();
		t.developApp();
		t.testApp();
		
	}
}
