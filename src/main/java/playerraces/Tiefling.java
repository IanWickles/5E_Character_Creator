package playerraces;

import java.util.ArrayList;
import java.util.List;

public class Tiefling extends PlayerRace{
    public Tiefling(String race) {
        super(race);
        setHasSubRace(false);
        setHasVariableStatBonus(false);
        setCharismaBonus(2);
        setIntelligenceBonus(1);

        List<String> tieflingRaceAttributes = new ArrayList<>();
        tieflingRaceAttributes.add("Age: Tieflings mature at the same rate as humans but live a few years longer.\n");
        tieflingRaceAttributes.add("Size: Tieflings are about the same size and build as humans. Your size is Medium.\n");
        tieflingRaceAttributes.add("Speed: Your base walking speed is 30 feet.\n");
        tieflingRaceAttributes.add("Darkvision: Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.\n");
        tieflingRaceAttributes.add("Hellish Resistance: You have resistance to fire damage.\n");
        tieflingRaceAttributes.add("Languages: You can speak, read, and write Common and Infernal.\n");
        tieflingRaceAttributes.add("Infernal Legacy: You know the Thaumaturgy cantrip. Once you reach 3rd level, you can cast the Hellish Rebuke spell once as a 2nd-level spell. Once you reach 5th level, you can also cast the Darkness spell once. You must finish a long rest to cast these spells again with this trait. Charisma is your spellcasting ability for these spells.\n");

        setRaceAttributes(tieflingRaceAttributes);
    }
}
