import java.util.Set;
import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args){
        HashMap<String, String> trackMap = new HashMap<String, String>();
        trackMap.put("Take a Bow", "Corrupt. You corrupt. Bring corruption to all that you touch.");
        trackMap.put("Starlight", "Far away, this ship is taking me far away, far away from the memories of the people who care if I live or die...");
        trackMap.put("Supermassive Black Hole", "Oh baby, don't you know I suffer? Oh baby, can you hear me moan?");
        trackMap.put("Map of the Problematique", "Fear, and panic in the air. I want to be free from desolation and despair...");

        String song = trackMap.get("Take a Bow");
        System.out.println(song);

        Set<String> keys = trackMap.keySet();
        for(String key : keys) {
            System.out.println(key + " : ");
            System.out.println(trackMap.get(key));
        }
    
    }
}
