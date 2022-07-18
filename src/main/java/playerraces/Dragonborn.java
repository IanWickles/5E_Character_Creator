package playerraces;

import java.util.ArrayList;
import java.util.List;

public class Dragonborn extends PlayerRace {

    public Dragonborn(String race) {
        super(race);
        setHasSubRace(false);
        setHasVariableStatBonus(false);
        setStrengthBonus(2);
        setCharismaBonus(1);

        List<String> dragonbornRaceAttributes = new ArrayList<>();
        dragonbornRaceAttributes.add("Age: Young dragonborn grow quickly. They walk hours after hatching, attain the size and development of a 10-year-old human child by the age of 3, and reach adulthood by 15. They live to be around 80.\n");
        dragonbornRaceAttributes.add("Size: playerraces.Dragonborn are taller and heavier than humans, standing well over 6 feet tall and averaging almost 250 pounds. Your size is Medium.\n");
        dragonbornRaceAttributes.add("Speed: Your base walking speed is 30 feet.\n");
        dragonbornRaceAttributes.add("Draconic Ancestry: You are distantly related to a particular kind of dragon. Choose a type of dragon from the below list; this determines the damage and area of your breath weapon, and the type of resistance you gain.\n");
        dragonbornRaceAttributes.add("[Black / Acid / 5' by 30' line (DEX save)] [Blue / Lightning / 5' by 30' line (DEX save)] [Brass / Fire / 5' by 30' line (DEX save)] [Bronze / Lightning / 5' by 30' line (DEX save)] [Copper / Acid / 5' by 30' line (DEX save)] [Gold / Fire / 15' cone (DEX save)] [Green / Poison / 15' cone (CON save)] [Red / Fire / 15' cone (DEX save)] [Silver / Cold / 15' cone (CON save)] [White / Cold / 15' cone (CON save)]");
        dragonbornRaceAttributes.add("Damage Resistance: You have resistance to the damage type associated with your ancestry.\n");
        dragonbornRaceAttributes.add("Breath Weapon: You can use your action to exhale destructive energy. It deals damage in an area according to your ancestry. When you use your breath weapon, all creatures in the area must make a saving throw, the type of which is determined by your ancestry. The DC of this saving throw is 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increase to 3d6 at 6th level, 4d6 at 11th, and 5d6 at 16th level. After using your breath weapon, you cannot use it again until you complete a short or long rest.\n");
        dragonbornRaceAttributes.add("Languages: You can read, speak, and write Common and Draconic.\n");

        setRaceAttributes(dragonbornRaceAttributes);
    }
}
