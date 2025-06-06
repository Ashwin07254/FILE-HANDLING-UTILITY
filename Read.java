import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class Read {

	public static void main(String[] args) throws IOException {
		String path = "src/file1.txt";
        File file = new File(path);
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		int c;
		while((c=br.read())!=-1)
		{
		System.out.print((char)c);
	
		}
		System.out.println("Done");
		}

}
