import java.util.Set;
import java.util.HashMap;

public class NashFlap {
    public static void main(String[] args) {
        HashMap <String, String> trackList = new HashMap<String, String>();
        trackList.put("Kashmir", "Oh, let the sun beat down upon my face And stars fill my dream I'm a traveler of both time and space");
        trackList.put("Stairway To Heaven", "There's a sign on the wall, but she wants to be sure 'Cause you know sometimes words have two meanings");
        trackList.put("Immigrant Song", "On we sweep with threshing oar Our only goal will be the western shore");
        trackList.put("Black Dog", "Didn't take too long 'fore I found out What people mean by down and out Spent my money, took my car");

        String song = trackList.get("Stairway To Heaven");
        System.out.println(song);
        // get the keys by using the keySet method
        Set<String> lyrics = trackList.keySet();
        for(String track : lyrics) {
            System.out.println(track);
            System.out.println(trackList.get(track));    
        }
    }
}