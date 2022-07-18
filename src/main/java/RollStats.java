import java.util.*;

public class RollStats {

    private Map<String, Integer> stats;
    private final String[] startingStats;


    // Default Constructor for RollStats, runs the generateStats method.
    public RollStats(String[] startingStats) {
        this.startingStats = startingStats;
        this.generateStats();
    }

    // Returns the map of starting stats (Linked Map, so they stay in the proper order).
    public Map<String, Integer> getStats() {
        return new LinkedHashMap<>(stats);
    }

    public void generateStats() {
        // Calling rand.nextInt(6) on this array from 1-6 simulates rolling a d6.
        int[] d6 = {1, 2, 3, 4, 5, 6};
        Random rand = new Random();

        // Creates a Linked HashMap for starting stats, sets each stat equal to 0.
        stats = new LinkedHashMap<>();
        for (String startingStat : startingStats) {
            stats.put(startingStat, 0);
        }

        // Rolled stats are typically done by rolling 4d6 and dropping the lowest value.
        // This creates an Integer list and adds 4 separate d6 rolls to the List.
        List<Integer> rollFourDiceDropLowest = new ArrayList<>();
        for(String statValue : stats.keySet()) {
            rollFourDiceDropLowest.clear();
            rollFourDiceDropLowest.add(d6[rand.nextInt(6)]);
            rollFourDiceDropLowest.add(d6[rand.nextInt(6)]);
            rollFourDiceDropLowest.add(d6[rand.nextInt(6)]);
            rollFourDiceDropLowest.add(d6[rand.nextInt(6)]);

            // This removes the lowest d6 roll from the List, leaving 3 separate D6 rolls for stats.
            rollFourDiceDropLowest.remove(Collections.min(rollFourDiceDropLowest));

            // Adds the 3 d6 rolls together and puts that as the value for each stat key using
            // the for each loop.
            stats.put(statValue, rollFourDiceDropLowest.get(0) + rollFourDiceDropLowest.get(1) + rollFourDiceDropLowest.get(2));
        }
    }
}
