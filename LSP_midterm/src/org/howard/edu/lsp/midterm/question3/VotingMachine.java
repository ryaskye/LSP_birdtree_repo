package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    
    private Map<String, Integer> candidates;

   
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    //to add a candidate
    public void addCandidate(String candidateName) {
        candidates.put(candidateName, 0); // Initialize vote count to 0
    }

    //to vote for a candidate
    public boolean castVote(String candidateName) {
        if (candidates.containsKey(candidateName)) {
            candidates.put(candidateName, candidates.get(candidateName) + 1); // Increment vote count
            return true; 
        }
        return false; 
    }

    // to get the winner based on the highest votes
    public String getWinner() {
        String winner = null;
        int maxVotes = -1;

        
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            if (entry.getValue() > maxVotes) {
                winner = entry.getKey();
                maxVotes = entry.getValue();
            }
        }

        return winner + " WINS with " + maxVotes + " votes!!"; // Return winner with vote count
    }
}