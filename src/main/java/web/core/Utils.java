package web.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import web.constants.Globals;

public class Utils {
	
	public static void deletFile() {
		File file = new File(Globals.PATH);
		if (file.exists()) {
		    file.delete();
		} else {
		    System.err.println(
		        "I cannot find '" + file + "' ('" + file.getAbsolutePath() + "')");
		}
	}

	public static void gravarDados(String data) throws IOException {
		deletFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(Globals.PATH, true));
		writer.append("");
		writer.append(data);
		writer.close();
	}

	public static void lerJson() throws java.io.IOException, ParseException, org.json.simple.parser.ParseException {

		JSONObject obj;
		JSONParser parser = new JSONParser();
		FileReader f = null;
		f = new FileReader(Globals.PATH);
		obj = (JSONObject) parser.parse(f);
		Globals.DADOS = obj;
	}

	public static String obterDadosChave(String chave) throws Exception{
		lerJson();
		return Globals.DADOS.get(chave).toString();
	}

}
