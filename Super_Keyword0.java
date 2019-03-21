package coreJava;

class Animals{
	//String color="Dog";
	 Animals()
	{
		System.out.println("animal is created");
	}
}

class Dogs extends Animals{
	/*String color="black";
void print()
{
	System.out.println(color);
	System.out.println(super.color);*/
	Dogs()
	{
		System.out.println("Dog is created");
	}
	
}



public class Super_Keyword0 {

	public static void main(String[] args) {
		//new Dogs().print();
		new Dogs();
		
	}

}
