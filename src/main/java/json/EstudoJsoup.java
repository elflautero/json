package json;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class EstudoJsoup {

		public static  void main (String [] args) throws IOException {
		
			String Usuario = "Fabricio";
			String CPF = "699.749.261-49";
			String Endereco = "Rua 20, Vicente Pires, Brasília/DF";
			
			File file = new File("../json/src/main/resources/html/relatorio.html");
		
			Document docHtml = Jsoup.parse(file, "UTF-8").clone();
	
			docHtml.select("nomeus").prepend(Usuario);
			docHtml.select("cpfus").prepend(CPF);
			docHtml.select("endus").prepend(Endereco);
			
			System.out.println(docHtml);
			
			
		}
}

	