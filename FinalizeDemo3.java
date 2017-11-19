class FinalizeDemo3
{
    public static void main(String[] args)
    {
        FinalizeDemo3 finalizeDemo=new FinalizeDemo3();
        finalizeDemo.finalize();
        finalizeDemo.finalize();
        finalizeDemo = null;
        System.gc();
        System.out.println("End of main");
    }

    public void finalize()
    {
        System.out.println("finalize method called");
    }
}
//if we are calling finalize() explicitly then it will be executed like a normal method call