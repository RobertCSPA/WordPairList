import java.util.ArrayList;
public class WordPairList
{
/** The list of word pairs, initialized by the constructor. */
private ArrayList<WordPair> allPairs;

/** Constructs a WordPairList object as described in part (a).
* Precondition: words.length >= 2
*/
public WordPairList(String[] words){ 
    allPairs = new ArrayList<WordPair>();
    for(int i  = 0 ; i < words.length-1; i++){
        for(int j = i+1; j < words.length; j++){
            WordPair w = new WordPair(words[i], words[j]);
            allPairs.add(w);
        }
    }
}

/** Returns the number of matches as described in part (b).
*/
public int numMatches() {
    int count = 0;
    for (WordPair wp : allPairs) {
        if (wp.getFirst().equals(wp.getSecond())) {
            count++;
        }
    }
    return count;

    
}
    @Override
    public String toString() {
        return allPairs.toString();
    }
}
