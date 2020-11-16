package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
                
        System.out.println("json-muotoinen data:");
/*         System.out.println( bodyText ); */

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        ArrayList<Player> finskit = new ArrayList<>();
        
        System.out.println("Oliot:");
        for (Player player : players) {

            if (player.getNationality().equals("FIN")) {
                finskit.add(player);
/*                 System.out.println(player); */
            }
        }   
        Collections.sort(finskit);
        
        for (Player player : finskit) {
            System.out.println(player);
            
        }
    }
  
}
