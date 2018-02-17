package json;

import java.io.*;

public class Buffered {

	public String Buf () {
	
		String FILENAME = "../json/src/main/resources/html/relatorio.html";

		BufferedReader br = null;
		FileReader fr = null;
		String leitorRelatorio = null;

		try {

		fr = new FileReader(FILENAME);
		br = new BufferedReader(fr);

		while ((leitorRelatorio = br.readLine()) != null) {
			System.out.println(leitorRelatorio);
		}

		} catch (IOException e) {

		e.printStackTrace();

		} finally {

				try {

					if (br != null)
						br.close();

					if (fr != null)
						fr.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}

			}	

			return leitorRelatorio;
			
			
		}

}






/*https://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example/
 * 
 * //http://www.guj.com.br/t/ler-arquivo-txt-linha-por-linha-java/335520
 * 
 * //  File file = new File("../json/src/main/resources/html/relatorio.html");
	      //   "../json/src/main/resources/html/relatorio.html"
	      //   /json/src/main/resources/html/relatorio.html
	      
	    	   //BufferedReader br = null;
		   		
	
		//BufferedReader br = new BufferedReader(new FileReader("../json/src/main/resources/html/relatorio.html"));
*/
