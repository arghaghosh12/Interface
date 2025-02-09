package org;

class John extends Student implements Hotel,Theatre
{
	@Override
	void study()
	{
		System.out.println("John  tudied in college");
	}
	@Override
	public void eatFood()
	{
		System.out.println("Eating some foods");
		
	}
	@Override
	public void watchMovie()
	{
		System.out.println("Watching movie");
		
	}

	public static void main(String[] args) {
		
		John j=new John();
		j.study();
		j.eatFood();
		j.watchMovie();
	}
}
