package playerraces;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gnome extends PlayerRace{

    public Gnome(String race) {
        super(race);
        setHasSubRace(true);

        List<String> gnomeSubRaceList = new ArrayList<>();
        gnomeSubRaceList.add("forest gnome");
        gnomeSubRaceList.add("rock gnome");
        gnomeSubRaceList.add("random");
        setSubRaceList(gnomeSubRaceList);

        setSubRaceSelector("What kind of Gnome? " + gnomeSubRaceList + " >>> ");

        Random rand = new Random();
        setSubRace(gnomeSubRaceList.get(rand.nextInt(2)));
    }

    public Gnome(String race, String subRace) {
        super(race, subRace);
        setHasSubRace(true);
        setHasVariableStatBonus(false);
        setIntelligenceBonus(2);

        List<String> gnomeRaceAttributes = new ArrayList<>();
        gnomeRaceAttributes.add("Age: Gnomes mature at the same rate as humans, and most are expected to settle into adult life around the age of 40. They can live to 350 years on average, but it's not too uncommon for them to reach 500 years of age.\n");
        gnomeRaceAttributes.add("Size: Gnomes are between 3 and 4 feet tall and weigh around 40 pounds. Your size is Small.\n");
        gnomeRaceAttributes.add("Speed: Your base walking speed is 25 feet.\n");
        gnomeRaceAttributes.add("Darkvision: Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.\n");
        gnomeRaceAttributes.add("playerraces.Gnome Cunning: You have advantage on all Intelligence, Wisdom, and Charisma saves against magic.\n");
        gnomeRaceAttributes.add("Languages: You can read, speak, and write Common and Gnomish.\n");

        if(subRace.equals("forest gnome")) {
            setDexterityBonus(1);
            gnomeRaceAttributes.add("Natural Illusionist: You know the Minor Illusion cantrip. Intelligence is your spellcasting modifier for it.\n");
            gnomeRaceAttributes.add("Speak with Small Beasts: Through sound and gestures, you may communicate simple ideas with Small or smaller beasts.\n");
        }
        if(subRace.equals("rock gnome")) {
            setConstitutionBonus(1);
            gnomeRaceAttributes.add("Artificer's Lore: Whenever you make an Intelligence (History) check related to magical, alchemical, or technological items, you can add twice your proficiency bonus instead of any other proficiency bonus that may apply.\n");
            gnomeRaceAttributes.add("Tinker: You have proficiency with artisan tools (tinker's tools). Using those tools, you can spend 1 hour and 10 gp worth of materials to construct a Tiny clockwork device (AC 5, 1 hp). The device ceases to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when you use your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to three such devices active at a time. When you create a device, choose one of the following options:\n" +
                    "Clockwork Toy - This toy is a clockwork animal, monster, or person, such as a frog, mouse, bird, dragon, or soldier. When placed on the ground, the toy moves 5 feet across the ground on each of your turns in a random direction. It makes noises as appropriate to the creature it represents.\n" +
                    "Fire Starter - The device produces a miniature flame, which you can use to light a candle, torch, or campfire. Using the device requires your action.\n" +
                    "Music Box - When opened, this music box plays a single song at a moderate volume. The box stops playing when it reaches the song's end or when it is closed.\n" +
                    "At your DM's discretion, you may make other objects with effects similar in power to these. The Prestidigitation cantrip is a good baseline for such effects.\n");
        }
        setRaceAttributes(gnomeRaceAttributes);
    }
}
