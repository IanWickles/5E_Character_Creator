package playerraces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Halfling extends PlayerRace{

    public Halfling(String race) {
        super(race);
        setHasSubRace(true);

        List<String> halflingSubRaceList = new ArrayList<>();
        halflingSubRaceList.add("lightfoot halfling");
        halflingSubRaceList.add("strongheart halfling");
        halflingSubRaceList.add("random");
        setSubRaceList(halflingSubRaceList);

        setSubRaceSelector("What kind of Halfling? " + halflingSubRaceList + " >>> ");

        Random rand = new Random();
        setSubRace(halflingSubRaceList.get(rand.nextInt(2)));
    }
    public Halfling(String race, String subRace) {
        super(race, subRace);
        setHasSubRace(true);
        setHasVariableStatBonus(false);
        setDexterityBonus(2);

        List<String> halflingRaceAttributes = new ArrayList<>();
        halflingRaceAttributes.add("Age: A halfling reaches adulthood at the age of 20 and generally lives into the middle of his or her second century.\n");
        halflingRaceAttributes.add("Size: Halflings average about 3 feet tall and weigh about 40 pounds. Your size is small.\n");
        halflingRaceAttributes.add("Speed: Your base walking speed is 25 feet.\n");
        halflingRaceAttributes.add("Lucky: When you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die. You must use the new result, even if it is a 1.\n");
        halflingRaceAttributes.add("Brave: You have advantage on saving throws against being frightened.\n");
        halflingRaceAttributes.add("Nimble: You can move through the space of any creature that is of a size larger than yours.\n");
        halflingRaceAttributes.add("Languages: You can speak, read, and write Common and playerraces.Halfling.\n");

        if(subRace.equals("lightfoot halfling")) {
            setCharismaBonus(1);
            halflingRaceAttributes.add("Naturally Stealthy: You can attempt to hide even when you are only obscured by a creature that is at least one size larger than you.\n");
        }
        if(subRace.equals("strongheart halfling")) {
            setConstitutionBonus(1);
            halflingRaceAttributes.add("Stout Resilience: You have advantage on saving throws against poison, and you have resistance to poison damage.\n");
        }
        setRaceAttributes(halflingRaceAttributes);
    }
}
