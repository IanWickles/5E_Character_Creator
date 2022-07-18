import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RaceList {

    public List<String> getRaceList() {
        List<String> raceList = new ArrayList<>();
        raceList.add("dragonborn");
        raceList.add("dwarf");
        raceList.add("elf");
        raceList.add("gnome");
        raceList.add("half elf");
        raceList.add("halfling");
        raceList.add("half orc");
        raceList.add("human");
        raceList.add("tiefling");
        raceList.add("random");
        return raceList;
    }

    public String getRandomRace() {
        List<String> raceList = new ArrayList<>();
        Random rand = new Random();
        raceList.add("dragonborn");
        raceList.add("dwarf");
        raceList.add("elf");
        raceList.add("gnome");
        raceList.add("half elf");
        raceList.add("halfling");
        raceList.add("half orc");
        raceList.add("human");
        raceList.add("tiefling");

        return raceList.get(rand.nextInt(9));
    }
}
