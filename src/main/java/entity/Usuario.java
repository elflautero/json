package entity;

import json.Buffered;

public class Usuario {
	
	Buffered bufUsuario = new Buffered();
	
	private String Nome;
	private String CPF;
	private String End;
	
	
	public String toJson() {
		
		
		
		String json = bufUsuario.Buf();
		
		/*String json = "<table border='1' style='border:4px solid;border-bottom-width:0px;margin-left:auto;margin-right:auto;width:800px;'>" 
				+ 		"<tbody>"
				+ 		   "<tr>"
				+ 				"<td align='left'colspan='3'>1. Nome/Raz&atilde;o Social: "+ this.Nome + "</td>" 
				+ 			"<td align='left' colspan='1'>2. CPF/CNPJ: " + this.CPF + "</td>"
				+			"</tr>"
				+			"<tr>" 
				+				"<td align='left' colspan='4'>3. Endere&ccedil;o: " + this.End
				+			"</tr>";
		*/
		return json;
	}
		

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getEnd() {
		return End;
	}

	public void setEnd(String end) {
		this.End = end;
	}	
	
}








/*
String json = "{<td align=\'left\'colspan=\'3\'>1. Nome/Raz&atilde;o Social: '"+this.Nome+"',</td>"
		+ "<td align=\'left\'colspan=\'4\'>2. CPF/CNPJ: '"+this.CPF+"', </td>}";

String json = "<td align=\\'left\\'colspan=\\'3\\'>1. Nome/Raz&atilde;o Social: " + this.Nome + "</td>"
			+ "<td align=\'left\'colspan=\'4\'>2. CPF/CNPJ: " +this.CPF;

*/

/*

String cabecalho = "<table style='border:4px solid;border-bottom-width:0px; margin-left:auto;margin-right:auto;width:800px;'>"
		+ 				"<tbody>" 
		+					"<tr>"
		+						"<td align='left'><strong>RELAT&Oacute;RIO DE VISTORIA E FISCALIZA&Ccedil;&Atilde;O N&deg;</strong></td>" 
	    +						"<td align='left'><strong>SEI N&deg;</strong></td>"
		+					"</tr>"
		+				"</tbody>"
		+			"</table>";
		
	
String json = "<table border='1' style='border:4px solid;border-bottom-width:0px;margin-left:auto;margin-right:auto;width:800px;'>" 
		+ 		"<tbody>"
		+ 		   "<tr>"
		+ 				"<td align='left'colspan='3'>1. Nome/Raz&atilde;o Social: "+ this.Nome + "</td>" 
		+ 			"<td align='left' colspan='1'>2. CPF/CNPJ: " + this.CPF + "</td>"
		+			"</tr>"
		+			"<tr>" 
		+				"<td align='left' colspan='4'>3. Endere&ccedil;o: " + this.End
		+			"</tr>";
		

return cabecalho + json;


} */
