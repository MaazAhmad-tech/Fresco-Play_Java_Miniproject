import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;

public class Hashset {
    public static String getOut(int numberOfMatches, String squads, int squad1, int squad2){

        String res1="", res2="";
        ArrayList<HashSet<String>> list = new ArrayList<HashSet<String>>();
        String teamPlayers[] = squads.split("[#]");
        for (int i = 0; i < teamPlayers.length; i++) {
            HashSet<String> team = new HashSet<>();
            String players = teamPlayers[i];
            String[] s = players.split("[ ]");
            for(String str: s){
                team.add(str);
            }
            //System.out.println("Team "+(i+1)+": "+team);

            list.add(team);
        }
        HashSet<String> hashres1 = new HashSet<>();
        Vector<String> toRemove = new Vector<>();
        hashres1.addAll(list.get(0));
        //hashres1 = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            HashSet<String> h = new HashSet<>();
            h = list.get(i);
            for(String s:hashres1){
                if(!h.contains(s)){
                    toRemove.add(s);
                }
            }
        }
        for(String s : toRemove){
            hashres1.remove(s);
        }
        for(String s: hashres1){
            res1 += s+" ";
        }
        /*for(HashSet<String> s: list){
            System.out.println(s);
        }*/

        HashSet<String> teamX = new HashSet<>();
        HashSet<String> teamY = new HashSet<>();
        teamX = list.get(squad1-1);
        teamY = list.get(squad2-1);
        //System.out.println("TeamX :"+teamX);
        //System.out.println(teamX.contains("Messi"));
        for(String s: teamY){
            if(!teamX.contains(s)){
                res2 += s+ " ";
            }
        }
        //System.out.println(res2);
        res1 = res1.substring(0, res1.length()-1);
        res2 = res2.substring(0, res2.length()-1);

        return res1+", "+res2;

    }
}
