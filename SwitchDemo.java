class SwitchDemo
{
	public static void main(String args[])
	{
		String ch="";
		System.out.println("Sport1. Cricket");
		System.out.println("Sport2. Football");
		System.out.println("Sport3. Rugby");
		System.out.println("Sport4. Polo");
		System.out.println("Sport5. Kabaddi");

		//Enter your choice
		ch="Sport3";

		switch(ch)
		{
			case "Sport1":
			System.out.println("My favourite sport is Cricket");
			break;

			case "Sport2":
			System.out.println("My favourite sport is Football");
			break;

			case "Sport3":
			System.out.println("My favourite sport is Rugby");
			break;

			case "Sport4":
			System.out.println("My favourite sport is Polo");
			break;
	
			case "Sport5":
			System.out.println("My favourite sport is Kabaddi");
			break;

		}
	}
}