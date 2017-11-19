class FinalizeDemo2
{
    String str;
    FinalizeDemo2(String str)
    {
        this.str = str;
    }
    
    public static void main(String[] args)
    {
        FinalizeDemo2 finalizeDemo = new FinalizeDemo2("Prabhu");
        finalizeDemo=null;
        System.gc();  
        System.out.println("End of main");
    }
  
    public void finalize()
    {
        System.out.println("finalize method called");
    }
}