class FinalizeDemo1
{
    public static void main(String[] args)
    {
        String str = new String("durga");
        str = null;
        System.gc();  
        System.out.println("End of main");
    }
    
    public void finalize()
    {
        System.out.println("finalize method called");
    }
}
//in the above example String object is eligible for GC & hence String class finalize method got executed