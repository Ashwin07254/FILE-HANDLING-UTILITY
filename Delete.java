import java.io.File;
import java.io.IOException;
public class Delete {
	public static void main(String args[]) throws IOException
	{
		String path = "src/file1.txt";
        File file = new File(path);
       if(file.delete())
       {
    	   System.out.println("File Deleted Suxessfully");
    	   
       }
       else
       {
    	   System.out.println("File not Deleted error occured");
       }
	}

}
