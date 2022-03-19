package week1.day1;

public class Mobile {
	String mobileModel = "Redmi";
	float mobileWeight = 0.75F;
	boolean isFullyCharged;
	int mobileCost = 8000;
	
	public void makeCall()
	{
		System.out.println("Make call");
	}
	
	public void sendMsg()
	{
		System.out.println("Send Msg");
	}
	
	public static void main(String args[])
	{
		System.out.println("Mobile");
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.isFullyCharged);
		System.out.println(myMobile.mobileCost);
	}
	
}
