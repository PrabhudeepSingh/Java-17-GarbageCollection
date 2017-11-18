class IslandOfIsolation
{
	IslandOfIsolation i;

	public static void main(String[] args)
	{
		IslandOfIsolation obj1 = new IslandOfIsolation();
		IslandOfIsolation obj2 = new IslandOfIsolation();
		IslandOfIsolation obj3 = new IslandOfIsolation();

		obj1.i = obj2;
		obj2.i = obj3;
		obj3.i = obj1;

		obj1 = null;
		obj2 = null;
		obj3 = null;
		//Three Objects are eligibe for GarbageCollection.
	}
}