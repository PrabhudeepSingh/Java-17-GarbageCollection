class FinalizeDemo4
{
    static int count=0;
    
    public static void main(String[] args)
    {
        for(int i=0;i<1000000;i++)//if we keep on increasing this no. at certain point memory problen raised & then JVM runs GC 
        {
            FinalizeDemo4 finalizeDemo=new FinalizeDemo4();
            finalizeDemo = null;
        }
    }

    public void finalize()
    {
        System.out.println("finalize method called  "+ ++count);
    }
}