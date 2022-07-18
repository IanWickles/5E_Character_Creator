package playerraces;

import java.util.ArrayList;
import java.util.List;

public class HalfOrc extends PlayerRace {
    public HalfOrc(String race) {
        super(race);
        setHasSubRace(false);
        setHasVariableStatBonus(false);
        setStrengthBonus(2);
        setConstitutionBonus(1);

        List<String> halfOrcRaceAttributes = new ArrayList<>();
        halfOrcRaceAttributes.add("Age: Half-orcs mature a little faster than humans, reaching adulthood around age 14. They age noticeably faster and rarely live longer than 75 years.\n");
        halfOrcRaceAttributes.add("Size: Half-orcs are somewhat larger and bulkier than humans, and they range from 5 to well over 6 feet tall. Your size is Medium.\n");
        halfOrcRaceAttributes.add("Speed: Your base walking speed is 30 feet.\n");
        halfOrcRaceAttributes.add("Darkvision: Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.\n");
        halfOrcRaceAttributes.add("Menacing: You gain proficiency in the Intimidation skill.\n");
        halfOrcRaceAttributes.add("Relentless Endurance: When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can't use this feature again until you finish a long rest.\n");
        halfOrcRaceAttributes.add("Savage Attacks: When you score a critical hit with a melee weapon attack, you can roll one of the weapon's damage dice one additional time and add it to the extra damage of the critical hit.\n");
        halfOrcRaceAttributes.add("Languages: You can speak, read, and write Common and Orc. Orc is a harsh, grating language with hard consonants. It has no script of its own but is written in the Dwarvish script.\n");

        setRaceAttributes(halfOrcRaceAttributes);
    }
}
