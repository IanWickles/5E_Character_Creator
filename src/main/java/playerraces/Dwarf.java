package playerraces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dwarf extends PlayerRace {

    public Dwarf(String race) {
        super(race);
        setHasSubRace(true);

        List<String> dwarfSubRaceList = new ArrayList<>();
        dwarfSubRaceList.add("hill dwarf");
        dwarfSubRaceList.add("mountain dwarf");
        dwarfSubRaceList.add("random");
        setSubRaceList(dwarfSubRaceList);

        setSubRaceSelector("What kind of Dwarf? " + dwarfSubRaceList + " >>> ");

        Random rand = new Random();
        setSubRace(dwarfSubRaceList.get(rand.nextInt(2)));
    }

    public Dwarf(String race, String subRace) {
        super(race, subRace);
        setHasSubRace(true);
        setHasVariableStatBonus(false);
        setConstitutionBonus(2);

        List<String> dwarfRaceAttributes = new ArrayList<>();
        dwarfRaceAttributes.add("Age: Dwarves mature at the same rate as humans, but they're considered young until they reach the age of 50. On average, they live about 350 years.\n");
        dwarfRaceAttributes.add("Size: Dwarves stand between 4 and 5 feet tall and average about 150 pounds. Your size is Medium.\n");
        dwarfRaceAttributes.add("Speed: Your base walking speed is 25 feet. Your speed is not reduced by wearing heavy armor.\n");
        dwarfRaceAttributes.add("Darkvision: Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.\n");
        dwarfRaceAttributes.add("Dwarven Resilience: You have advantage on saving throws against poison, and you have resistance against poison damage.\n");
        dwarfRaceAttributes.add("Dwarven Combat Training: You have proficiency with the battleaxe, handaxe, light hammer, and warhammer.\n");
        dwarfRaceAttributes.add("Tool Proficiency: You gain proficiency with the artisan's tools of your choice: smith's tools, brewer's supplies, or mason's tools.\n");
        dwarfRaceAttributes.add("Stonecunning: Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.\n");
        dwarfRaceAttributes.add("Languages: You can speak, read, and write Common and Dwarvish. Dwarvish is full of hard consonants and guttural sounds, and those characteristics spill over into whatever other language a dwarf might speak.\n");

        if (subRace.equals("hill dwarf")) {
            setWisdomBonus(1);
            dwarfRaceAttributes.add("Dwarven Toughness: Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.\n");
        }
        if (subRace.equals("mountain dwarf")) {
            setStrengthBonus(2);
            dwarfRaceAttributes.add("Dwarven Armor Training: You have proficiency with light and medium armor.\n");
        }
        setRaceAttributes(dwarfRaceAttributes);
    }
}
