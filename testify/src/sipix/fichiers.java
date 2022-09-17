package sipix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;


public class fichiers {

	public static void main(String[] args) throws IOException {
		File fichier = new File("C://Users/Miki_Biboy/eclipse-workspace/testify/src/sipix/fichier.html");
		File fact = new File("C://Users/Miki_Biboy/eclipse-workspace/testify/src/sipix/fact.txt");
		File over = new File("C://Users/Miki_Biboy/eclipse-workspace/testify/src/sipix/fichier.txt");
		File doc = new File("C://Users/Miki_Biboy/eclipse-workspace/testify/src/sipix/folder");
		// Insertion ou Création de fichier
		if(!fichier.exists()) {
			try {
				fichier.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			List<String> htmlines = Arrays.asList("<html>","<head>","<title>JAVA</title>","</head>","<body>","<p>Aaron et Moise sont des frères.</p>","</body>","</html>");
			FileWriter writer = new FileWriter(fichier);
			BufferedWriter file = new BufferedWriter(writer);
			for(String part : htmlines) {
				file.write(part);
				file.newLine();
			}
			file.close();
			writer.close();
		}
		// Insertion ou Création de fichier
		if(!fact.exists()) {
			FileWriter fing = new FileWriter(fact);
			BufferedWriter finger = new BufferedWriter(fing);
			finger.write("Moise était au mont Horeb quand il fait la rencontre de Dieu.");
			finger.newLine();
			finger.write("Le frère de Moise s\'appelle Aaron.");
			finger.newLine();
			finger.write("Moise avait 80 ans.");
			finger.newLine();
			finger.close();
			fing.close();
		}
		//Création ou lecture
		if(over.exists()) {
			try {
				BufferedReader tanker = new BufferedReader(new InputStreamReader(new FileInputStream(over),"UTF-8"));
				String line = tanker.readLine();
				while(line != null) {
					System.out.println(line);
					line = tanker.readLine();
				}
				tanker.close();
			}catch(IOException e) {
					e.printStackTrace();
				}
		}else{
			over.createNewFile();
		}
		if(!doc.exists()) {
			doc.mkdir();
		}
		File fintec = new File("C://Users/Miki_Biboy/eclipse-workspace/testify/src/sipix/fichier.html");
		File destination = new File("C://Users/Miki_Biboy/eclipse-workspace/testify/src/sipix/folder/"+fintec.getName());
		try {
			Files.copy(fintec.toPath(), destination.toPath(),StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException e) {
			e.printStackTrace();
		}
		fintec.delete();
	}
}
