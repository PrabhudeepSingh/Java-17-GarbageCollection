//The objects created inside a method are eligible for GarbageCollection once method completes it's execution.

class MethodObjects
{
	public static void main(String[] args)
	{
		mth();
		//Two objects are eligible for GarbageCollection.
	}

	public static void mth()
	{
		String str1 = new String("Prabhu");
		String str2 = new String("Deep");		
	}
}