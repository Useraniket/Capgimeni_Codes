package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\JavaFHandle\\Santu\\cantu.txt");
		BufferedWriter bf = new BufferedWriter(fw);
//		fw.write("Nije Liekho \n");
//		fw.write("Nije Liekho 2\n");
//		fw.write("Nije Liekho Returns \n");
//		fw.flush();
		bf.write("Nije Liekho \n");
		bf.newLine();
		bf.write("Nije Liekho 2\n");
		bf.newLine();
		bf.write("Nije Liekho Returns \n");
		bf.newLine();
		bf.write("Nije Liekho Returns Abar \n");
		bf.newLine();
		bf.flush();
		System.out.println("Useless folk!");
		
	}

}