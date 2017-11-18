class GarbageCollection
{
	public static void main(String[] args)
	{
		System.gc(); //First way of requesting for GarbageCollection

		Runtime rt = Runtime.getRuntime();	//Second way of requesting for GarbageCollection.
	}
}