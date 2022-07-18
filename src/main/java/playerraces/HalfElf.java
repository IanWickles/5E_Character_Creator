package playerraces;

import java.util.ArrayList;
import java.util.List;

public class HalfElf extends PlayerRace {
    public HalfElf(String race) {
        super(race);
        setHasSubRace(false);
        setHasVariableStatBonus(true);
        setCharismaBonus(2);

        List<String> halfElfRaceAttributes = new ArrayList<>();
        halfElfRaceAttributes.add("Age: Half-elves age at much the same rate as humans, reaching adulthood at the age of 20. They live much longer than humans, however, often exceeding 180 years.\n");
        halfElfRaceAttributes.add("Size: Half-elves are more or less the same size as humans, ranging from 5 to 6 feet tall. Your size is Medium.\n");
        halfElfRaceAttributes.add("Speed: Your base walking speed is 30 feet.\n");
        halfElfRaceAttributes.add("Darkvision: Thanks to your elven heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.\n");
        halfElfRaceAttributes.add("Fey Ancestry: You have advantage on saving throws against being charmed, and magic can't put you to sleep.\n");
        halfElfRaceAttributes.add("Skill Versatility: You gain proficiency in two skills of your choice.\n");
        halfElfRaceAttributes.add("Languages: You can read, speak, and write Common, Elven, and one language of your choice.\n");

        setRaceAttributes(halfElfRaceAttributes);
    }
}
