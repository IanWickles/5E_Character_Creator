package playerraces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human extends PlayerRace{

    public Human(String race) {
        super(race);
        setHasSubRace(true);
        List<String> humanSubRaceList = new ArrayList<>();
        humanSubRaceList.add("standard human");
        humanSubRaceList.add("variant human");
        humanSubRaceList.add("random");
        setSubRaceList(humanSubRaceList);

        setSubRaceSelector("What kind of Human? " + humanSubRaceList + " >>> ");

        Random rand = new Random();
        setSubRace(humanSubRaceList.get(rand.nextInt(2)));
    }
    public Human(String race, String subRace) {
        super(race, subRace);
        setHasSubRace(true);

        List<String> humanRaceAttributes = new ArrayList<>();
        humanRaceAttributes.add("Age: Humans reach adulthood in their late teens and live less than a century.\n");
        humanRaceAttributes.add("Size: Humans vary widely in height and build, from barely 5 feet to well over 6 feet tall. Regardless of your position in that range, your size is Medium.\n");
        humanRaceAttributes.add("Speed: Your base walking speed is 30 feet.\n");
        humanRaceAttributes.add("Languages: You can speak, read, and write Common and one extra language of your choice. Humans typically learn the languages of other peoples they deal with, including obscure dialects. They are fond of sprinkling their speech with words borrowed from other tongues: Orc curses, Elvish musical expressions, Dwarvish military phrases, and so on.\n");

        if(subRace.equals("standard human")) {
            setHasVariableStatBonus(false);
            setStrengthBonus(1);
            setDexterityBonus(1);
            setConstitutionBonus(1);
            setIntelligenceBonus(1);
            setWisdomBonus(1);
            setCharismaBonus(1);
        }
        if(subRace.equals("variant human")) {
            setHasVariableStatBonus(true);
            humanRaceAttributes.add("Skills: You gain proficiency in one skill of your choice.\n");
            humanRaceAttributes.add("Feat: You gain one Feat of your choice.\n");
        }
        setRaceAttributes(humanRaceAttributes);
    }
}
