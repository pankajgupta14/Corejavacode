package com.object;

interface wallboard
{
	int wallheight=23;
	String wname="wallboard";
	void wallwriting();
	void startingplace();

}

abstract class blackboard implements wallboard
{
	final String bname="blackboard"; 
	final int bheight=45;
	static String chowk;
	
	static {
		chowk="natraj chowk";
		System.out.println("blackboard static block");
	}
	
	void blackwriting()
	{
		System.out.println("using "+chowk);
	}
	
	abstract void bboarddetails();
	
	public blackboard() {
		//bboarddetails();
		// TODO Auto-generated constructor stub
		System.out.println("blackboard constructorn");
	}
	
	public static void main(String[] args) {
		
	}
	 
			
}
public class whiteboard extends blackboard
{

	@Override
	public void wallwriting() {
		// TODO Auto-generated method stub
		System.out.println(chowk);
	}

	@Override
	public void startingplace() {
		// TODO Auto-generated method stub
		System.out.println("village");
	}

	@Override
	void bboarddetails() {
		// TODO Auto-generated method stub
		System.out.println("given in upper side ");
	}
  public static void main(String[] args)
   {
	  
	wallboard w=new whiteboard();
	w.wallwriting();
	w.startingplace();
	blackboard b=new whiteboard();
	b.bboarddetails();
   }
} 
