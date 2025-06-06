import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;
public class Modify {
	public static void main(String args[]) throws IOException
	{
		String path = "src/file1.txt";
        File file = new File(path);
        
       FileWriter fw=new FileWriter(file,true);//Modifying existing file
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("\n File handling in Java refers to the process of managing data stored in files. It involves performing operations such as creating, reading, writing, and deleting files. ");
        bw.close();
        fw.close();
	}   
     

}
