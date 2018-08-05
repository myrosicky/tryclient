package aa;
import java.rmi.Naming;
import java.rmi.registry.*;



public class tryclient {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
           try
           {
        	   Registry rr=LocateRegistry.getRegistry();
        	   inface ii=(inface)rr.lookup("tryrmi");
        	   System.out.println(ii.hi());
           }catch(Exception ee){ee.printStackTrace();}
	}

}
