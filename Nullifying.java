//Nullifying a reference variable makes the corresponding object eligible for GarbageCollection.

class Nullifying
{
	public static void main(String[] args) 
	{
		String str1 = new String("Prabhu");
		String str2 = new String("Deep");
		//No Objet is eligible for GarbageCollection.

		str1 = null;
		//One Object is eligibe for GarbageCollection.

		str2 = null;
		//Two objects are eligibe for GarbageCollection.
	}
}