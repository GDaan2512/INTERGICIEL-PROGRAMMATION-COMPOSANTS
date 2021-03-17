import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/*
Get_global_values (retourne les valeurs globales clés Global du fichier json)
Get_country_values v_pays (retourne les valeurs du pays demandé ou v_pays est une chaine de caractère du pays demandé)
Get_confirmed_avg (retourne une moyenne des cas confirmés sum(pays)/nb(pays))
Get_deaths_avg (retourne une moyenne des Décès sum(pays)/nb(pays))
Get_countries_deaths_percent (retourne le pourcentage de Décès par rapport aux cas confirmés)
Help (affiche la liste des commandes et une explication comme ci-dessus)
 */

public class Console {
	
	public static String Get_global_values() throws IOException {
		String val = "TODO";
		System.out.println(val);
		return val;
	}
	
	public static String Get_country_values(String pays) {
		String val = "TODO";
		System.out.println(val);
		return val;
	}
	
	public static String Get_confirmed_avg() {
		String val = "TODO";
		System.out.println(val);
		return val;
	}
	
	public static String Get_deaths_avg() {
		String val = "TODO";
		System.out.println(val);
		return val;
	}
	
	public static String Get_countries_deaths_percent() {
		String val = "TODO";
		System.out.println(val);
		return val;
	}
	
	public static String Help() {
		String h = "";
		h += "Get_global_values (retourne les valeurs globales clés Global du fichier json)\r\n"
				+ "Get_country_values v_pays (retourne les valeurs du pays demandé ou v_pays est une chaine de caractère du pays demandé)\r\n"
				+ "Get_confirmed_avg (retourne une moyenne des cas confirmés sum(pays)/nb(pays))\r\n"
				+ "Get_deaths_avg (retourne une moyenne des Décès sum(pays)/nb(pays))\r\n"
				+ "Get_countries_deaths_percent (retourne le pourcentage de Décès par rapport aux cas confirmés)\r\n"
				+ "Help (affiche la liste des commandes et une explication comme ci-dessus)";
		System.out.println(h);
		return "h";
	}

	public static void main(String[] args) throws IOException {
		while(true) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			String[] mots = s.split("\\s+");
			if(s.equals("Help") || s.equals("HELP") || s.equals("help"))
				Help();
			if(s.equals("Get global values") || s.equals("Get_global_values") || s.equals("get_global_values"))
				Get_global_values();
			if(mots[0].equals("Get_country_values") )
				Get_country_values(mots[1]);
			if(s.equals("Get confirmed avg") || s.equals("Get_confirmed_avg") || s.equals("get_confirmed_avg"))
				Get_confirmed_avg();
			if(s.equals("Get deaths avg") || s.equals("Get_deaths_avg") || s.equals("get_deaths_avg"))
				Get_deaths_avg();
			if(s.equals("Get countries deaths percent") || s.equals("Get_countries_deaths_percent") || s.equals("Get_countries_deaths_percent"))
				Get_countries_deaths_percent();	
			if(s.equals(""))
				break;
		}
	}
}
