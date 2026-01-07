class BillUnit
{
	public static void main(String args[])
	{
		int billunit=200;

		if(billunit<100)
		{
			System.out.println("Low Usage");
		}
		else if((billunit>=101)&&(billunit<=300))
		{
			System.out.println("Medium Usage");
		}
		else if(billunit>300)
		{
			System.out.println("High Usage");
		}
		else
		{
			System.out.println("Invalid bill Unit");
		}
	}
}