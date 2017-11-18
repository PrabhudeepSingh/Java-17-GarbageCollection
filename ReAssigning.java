//ReAssigning a reference makes the corresponding object eligible for GarbageCollection.

class ReAssigning
{
	public static void main(String[] args)
	{
		String str1 = new String("Prabhu");
		String str2 = new String("Deep");
		//No object is eligible for GarbageCollection.

		str1 = new String("Singh");
		//One Object is eligible for GarbageCollection.

		str2 = str1;
		//Two objects are eligible for GarbageCollection.
	}
}