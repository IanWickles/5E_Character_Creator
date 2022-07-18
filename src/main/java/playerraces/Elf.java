package playerraces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Elf extends PlayerRace {

    public Elf(String race) {
        super(race);
        setHasSubRace(true);

        List<String> elfSubRaceList = new ArrayList<>();
        elfSubRaceList.add("dark elf");
        elfSubRaceList.add("high elf");
        elfSubRaceList.add("wood elf");
        elfSubRaceList.add("random");
        setSubRaceList(elfSubRaceList);

        setSubRaceSelector("What kind of Elf? " + elfSubRaceList + " >>> ");

        Random rand = new Random();
        setSubRace(elfSubRaceList.get(rand.nextInt(3)));
    }

    public Elf(String race, String subRace) {
        super(race, subRace);
        setHasSubRace(false);
        setHasVariableStatBonus(false);
        setDexterityBonus(2);

        List<String> elfRaceAttributes = new ArrayList<>();
        elfRaceAttributes.add("Age: Although elves reach physical maturity at about the same age as humans, the elven understanding of adulthood goes beyond physical growth to encompass worldly experience. An elf typically claims adulthood and an adult name around the age of 100 and can live to be 750 years old.\n");
        elfRaceAttributes.add("Size: Elves range from under 5 to over 6 feet tall and have slender builds. Your size is Medium.\n");
        elfRaceAttributes.add("Speed: Your base walking speed is 30 feet.\n");
        elfRaceAttributes.add("Darkvision: Accustomed to twilit forests and the night sky, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.\n");
        elfRaceAttributes.add("Fey Ancestry: You have advantage on saving throws against being charmed, and magic can't put you to sleep.\n");
        elfRaceAttributes.add("Trance: Elves do not sleep. Instead they meditate deeply, remaining semi-conscious, for 4 hours a day. The Common word for this meditation is \"trance.\" While meditating, you dream after a fashion; such dreams are actually mental exercises that have become reflexive after years of practice. After resting in this way, you gain the same benefit a human would from 8 hours of sleep.\n");
        elfRaceAttributes.add("Keen Senses: You have proficiency in the Perception skill.\n");
        elfRaceAttributes.add("Languages: You can speak, read, and write Common and Elven.\n");

        if (subRace.equals("dark elf")) {
            setCharismaBonus(1);
            elfRaceAttributes.add("Superior Darkvision: Your darkvision has a range of 120 feet, instead of 60.\n");
            elfRaceAttributes.add("Sunlight Sensitivity: You have disadvantage on attack rolls and Wisdom (Perception) checks that rely on sight when you, the target of the attack, or whatever you are trying to perceive is in direct sunlight.\n");
            elfRaceAttributes.add("Drow Magic: You know the Dancing Lights cantrip. When you reach 3rd level, you can cast the Faerie Fire spell once with this trait and regain the ability to do so when you finish a long rest. When you reach 5th level, you can cast the Darkness spell onceand regain the ability to do so when you finish a long rest. Charisma is your spellcasting ability for these spells.\n");
            elfRaceAttributes.add("Drow Weapon Training: You have proficiency with rapiers, shortswords, and hand crossbows.\n");
        }
        if (subRace.equals("high elf")) {
            setIntelligenceBonus(1);
            elfRaceAttributes.add("Cantrip: You know one cantrip of your choice from the Wizard spell list. Intelligence is your spellcasting ability for it.\n");
            elfRaceAttributes.add("playerraces.Elf Weapon Training: You have proficiency with the longsword, shortsword, shortbow, and longbow.\n");
            elfRaceAttributes.add("Extra Language: You can read, speak, and write one additional language of your choice.\n");
        }
        if (subRace.equals("wood elf")) {
            setWisdomBonus(1);
            elfRaceAttributes.add("playerraces.Elf Weapon Training: You have proficiency with the longsword, shortsword, shortbow, and longbow.\n");
            elfRaceAttributes.add("Fleet of Foot: Your base walking speed increases to 35 feet.\n");
            elfRaceAttributes.add("Mask of the Wild: You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow, mist, and other natural phenomena.\n");
        }
        setRaceAttributes(elfRaceAttributes);
    }
}
