package playerraces;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayerRace {

    private String race;
    private String subRace;
    private String subRaceSelector;
    private boolean hasSubRace;
    private boolean hasVariableStatBonus;
    private int strengthBonus;
    private int dexterityBonus;
    private int constitutionBonus;
    private int intelligenceBonus;
    private int wisdomBonus;
    private int charismaBonus;

    private List<String> raceAttributes = new ArrayList<>();

    private List<String> subRaceList = new ArrayList<>();

    public List<String> getSubRaceList() {
        return subRaceList;
    }

    public String getSubRaceSelector(String race) {
        this.race = race;
        return subRaceSelector;
    }

    public void setSubRaceSelector(String subRaceSelector) {
        this.subRaceSelector = subRaceSelector;
    }

    public void setSubRaceList(List<String> subRaceList) {
        this.subRaceList = subRaceList;
    }

    public PlayerRace(String race, String subRace) {
        this.race = race;
        this.subRace = subRace;
    }

    public PlayerRace(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSubRace() {
        return subRace;
    }

    public void setSubRace(String subRace) {
        this.subRace = subRace;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public void setStrengthBonus(int strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public int getDexterityBonus() {
        return dexterityBonus;
    }

    public void setDexterityBonus(int dexterityBonus) {
        this.dexterityBonus = dexterityBonus;
    }

    public int getConstitutionBonus() {
        return constitutionBonus;
    }

    public void setConstitutionBonus(int constitutionBonus) {
        this.constitutionBonus = constitutionBonus;
    }

    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    public void setIntelligenceBonus(int intelligenceBonus) {
        this.intelligenceBonus = intelligenceBonus;
    }

    public int getWisdomBonus() {
        return wisdomBonus;
    }

    public void setWisdomBonus(int wisdomBonus) {
        this.wisdomBonus = wisdomBonus;
    }

    public int getCharismaBonus() {
        return charismaBonus;
    }

    public void setCharismaBonus(int charismaBonus) {
        this.charismaBonus = charismaBonus;
    }

    public boolean isHasSubRace() {
        return hasSubRace;
    }

    public void setHasSubRace(boolean hasSubRace) {
        this.hasSubRace = hasSubRace;
    }

    public boolean isHasVariableStatBonus() {
        return hasVariableStatBonus;
    }

    public void setHasVariableStatBonus(boolean hasVariableStatBonus) {
        this.hasVariableStatBonus = hasVariableStatBonus;
    }

    public List<String> getRaceAttributes() {return raceAttributes;
    }

    public void setRaceAttributes(List<String> raceAttributes) {
        this.raceAttributes = raceAttributes;
    }

    public String printRaceAttributes() {
        String attributePrinter = "";
        for (String index: raceAttributes) {
            attributePrinter += index;
        }
        return attributePrinter;
    }
}
