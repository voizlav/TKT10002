import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> container;

    public Abbreviations() {
        this.container = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.container.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.container.get(abbreviation) != null;
    }

    public String findExplanationFor(String abbreviation) {
        return this.container.get(abbreviation);
    }
}
