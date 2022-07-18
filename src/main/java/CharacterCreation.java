import playerraces.*;

import java.util.*;

public class CharacterCreation {

    public static void main(String[] args) {

        // Step 1: Roll for and display Starting Stats.

        // Creates a String Array of the 6 primary stats.
        String[] stats = new String[] { "Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom", "Charisma" };

        // Instantiates the RollStats object and gets a String Integer map of each stat with its
        // randomly rolled starting value.
        RollStats rollStats = new RollStats(stats);
        Map<String, Integer> startingStatRolls = rollStats.getStats();

        // Prints out each stat in the starting stats String Array along with the random value
        // generated from the generateStats method in the RollStats class.
        for (String stat : stats) {
            int startingStat = startingStatRolls.get(stat);
            System.out.println("Your starting " + stat + " score is: " + startingStat);
        }

        // Step 2: Get user input for race and subrace.

        // Instantiates a new player race object as null, then receives user input from the
        // UserInput class to determine what base race the player wants to be.
        PlayerRace player = null;
        UserInput userInput = new UserInput();
        String playerInputRace = userInput.getRaceInput();

        // Switch statements to set the null PlayerRace object equal to a newly instantiated
        // race object depending on input given by user in UserInput.
        // These switch statements use the primary race constructor, which passes in only a base race.
        switch (playerInputRace) {
            case "dragonborn":
                player = new Dragonborn(playerInputRace);
                break;
            case "dwarf":
                player = new Dwarf(playerInputRace);
                break;
            case "elf":
                player = new Elf(playerInputRace);
                break;
            case "gnome":
                player = new Gnome(playerInputRace);
                break;
            case "half elf":
                player = new HalfElf(playerInputRace);
                break;
            case "halfling":
                player = new Halfling(playerInputRace);
                break;
            case "half orc":
                player = new HalfOrc(playerInputRace);
                break;
            case "human":
                player = new Human(playerInputRace);
                break;
            case "tiefling":
                player = new Tiefling((playerInputRace));
                break;
        }

        // Asserts that player is not null (to avoid null pointer exception) then checks if the
        // base race of the player has a subrace. If true, calls UserInput class again to query
        // the user for which subrace they want to pick.
        assert player != null;
        if (player.isHasSubRace()) {
            String playerInputSubrace = userInput.getSubRaceInput(playerInputRace);

            // Switch statements to set the PlayerRace object equal to a newly instantiated
            // race object depending on input given by user in UserInput.
            // These switch statements use the secondary race constructor, which passes in a base
            // race as well as a subrace.
            switch (playerInputRace) {
                case "dwarf":
                    player = new Dwarf(playerInputRace, playerInputSubrace);
                    break;
                case "elf":
                    player = new Elf(playerInputRace, playerInputSubrace);
                    break;
                case "gnome":
                    player = new Gnome(playerInputRace, playerInputSubrace);
                    break;
                case "halfling":
                    player = new Halfling(playerInputRace, playerInputSubrace);
                    break;
                case "human":
                    player = new Human(playerInputRace, playerInputSubrace);
                    break;
            }
        }

        // Checks to see if the race or subrace chosen by the player has a variable
        // stat increase property. If true, calls UserInput again to receive input for
        // which stats they wish to increase. Then sets the player stat bonus for the chosen
        // stats equal to +1 (all variable stat increases can only add +1 to a stat).
        if (player.isHasVariableStatBonus()) {
            List<String> variableStatList;
            variableStatList = userInput.getVariableStatInput(playerInputRace);
            if (variableStatList.contains("strength")) {
                player.setStrengthBonus(1);
            }
            if (variableStatList.contains("dexterity")) {
                player.setDexterityBonus(1);
            }
            if (variableStatList.contains("constitution")) {
                player.setConstitutionBonus(1);
            }
            if (variableStatList.contains("intelligence")) {
                player.setIntelligenceBonus(1);
            }
            if (variableStatList.contains("wisdom")) {
                player.setWisdomBonus(1);
            }
            if (variableStatList.contains("charisma")) {
                player.setCharismaBonus(1);
            }
        }

        // Step 3: Add racial bonuses to starting stats and display new stats.

        int finalStrength = startingStatRolls.get("Strength") + player.getStrengthBonus();
        int finalDexterity = startingStatRolls.get("Dexterity") + player.getDexterityBonus();
        int finalConstitution = startingStatRolls.get("Constitution") + player.getConstitutionBonus();
        int finalIntelligence = startingStatRolls.get("Intelligence") + player.getIntelligenceBonus();
        int finalWisdom = startingStatRolls.get("Wisdom") + player.getWisdomBonus();
        int finalCharisma = startingStatRolls.get("Charisma") + player.getCharismaBonus();

        System.out.println("Your final Strength score is: " + finalStrength);
        System.out.println("Your final Dexterity score is: " + finalDexterity);
        System.out.println("Your final Constitution score is: " + finalConstitution);
        System.out.println("Your final Intelligence score is: " + finalIntelligence);
        System.out.println("Your final Wisdom score is: " + finalWisdom);
        System.out.println("Your final Charisma score is: " + finalCharisma);

        // Step 4: Display racial attributes with explanations.

        System.out.println("You gain the following features.");
        System.out.println(player.printRaceAttributes());
    }

}
