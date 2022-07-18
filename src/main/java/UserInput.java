import playerraces.*;

import java.util.*;

public class UserInput {

    String baseRace = "";
    Scanner userInput = new Scanner(System.in);
    RaceList playerRaceList = new RaceList();

    public UserInput() {
    }

    public String getRaceInput() {
        List<String> raceList = playerRaceList.getRaceList();
        String playerInputRace = "";

        do {
            System.out.print("What race is your character? " + raceList + " >>> ");
            playerInputRace = userInput.nextLine().toLowerCase();
            if (!raceList.contains(playerInputRace)) {
                System.out.println("Please enter a valid race.");
            }
        } while (!raceList.contains(playerInputRace));

        if (playerInputRace.equals("random")) {
            playerInputRace = playerRaceList.getRandomRace();
            System.out.println("Your character is a " + playerInputRace + "!");
        }
        baseRace = playerInputRace;
        return playerInputRace;
    }

    public String getSubRaceInput(String race) {
        PlayerRace player = null;
        String playerInputSubRace;
        switch (race) {
            case "dwarf":
                player = new Dwarf(race);
                break;
            case "elf":
                player = new Elf(race);
                break;
            case "gnome":
                player = new Gnome(race);
                break;
            case "halfling":
                player = new Halfling(race);
                break;
            case "human":
                player = new Human(race);
                break;
        }

        do {
            assert player != null;
            System.out.print(player.getSubRaceSelector(race));
            playerInputSubRace = userInput.nextLine().toLowerCase();
            if (!player.getSubRaceList().contains(playerInputSubRace)) {
                System.out.println("Please enter a valid subrace.");
            }
            if (playerInputSubRace.equals("random")) {
                playerInputSubRace = player.getSubRace();
                System.out.println("Your character is a " + playerInputSubRace + "!");
            }
        } while (!player.getSubRaceList().contains(playerInputSubRace));
        return playerInputSubRace;
    }

    public List<String> getVariableStatInput(String race) {
        List<String> variableStatList = new ArrayList<>();
        String firstStatBoost = "";
        String secondStatBoost = "";

        if (race.equals("half elf")) {
            List<String> halfElfStatList = new ArrayList<>();
            halfElfStatList.add("strength");
            halfElfStatList.add("dexterity");
            halfElfStatList.add("constitution");
            halfElfStatList.add("intelligence");
            halfElfStatList.add("wisdom");
            do {
                System.out.print("What is the first stat you wish to increase by 1? " +
                        halfElfStatList + " >>> ");
                firstStatBoost = userInput.nextLine().toLowerCase();
                if (!halfElfStatList.contains(firstStatBoost)) {
                    System.out.println("Please enter a valid stat.");
                }
            } while (!halfElfStatList.contains(firstStatBoost));
            variableStatList.add(firstStatBoost);

            do {
                System.out.print("What is the second stat you wish to increase by 1? This stat must be " +
                        "different than " + firstStatBoost + ". \n" + halfElfStatList + " >>> ");
                secondStatBoost = userInput.nextLine().toLowerCase();
                if (firstStatBoost.equals(secondStatBoost)) {
                    System.out.println("You must increase a different stat than your first stat increase. " +
                            "Please select a stat other than " + firstStatBoost + ". >>> ");
                }
                if (!halfElfStatList.contains(secondStatBoost)) {
                    System.out.println("Please enter a valid stat.");
                }
            } while (firstStatBoost.equals(secondStatBoost) || !halfElfStatList.contains(secondStatBoost));
            variableStatList.add(secondStatBoost);


        }
        if (race.equals("human")) {
            List<String> humanStatList = new ArrayList<>();
            humanStatList.add("strength");
            humanStatList.add("dexterity");
            humanStatList.add("constitution");
            humanStatList.add("intelligence");
            humanStatList.add("wisdom");
            humanStatList.add("charisma");
            do {
                System.out.print("What is the first stat you wish to increase by 1? " +
                        humanStatList + " >>> ");
                firstStatBoost = userInput.nextLine().toLowerCase();
                if (!humanStatList.contains(firstStatBoost)) {
                    System.out.println("Please enter a valid stat.");
                }
            } while (!humanStatList.contains(firstStatBoost));
            variableStatList.add(firstStatBoost);

            do {
                System.out.print("What is the second stat you wish to increase by 1? This stat must be " +
                        "different than " + firstStatBoost + ". \n" + humanStatList + " >>> ");
                secondStatBoost = userInput.nextLine().toLowerCase();
                if (firstStatBoost.equals(secondStatBoost)) {
                    System.out.println("You must increase a different stat than your first stat increase. " +
                            "Please select a stat other than " + firstStatBoost + ". >>> ");
                }
                if (!humanStatList.contains(secondStatBoost)) {
                    System.out.println("Please enter a valid stat.");
                }
            } while (firstStatBoost.equals(secondStatBoost) || !humanStatList.contains(secondStatBoost));
            variableStatList.add(secondStatBoost);
        }
        return variableStatList;
    }
}
