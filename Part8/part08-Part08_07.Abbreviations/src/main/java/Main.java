
public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("ie", "more precisely");
        abbreviations.addAbbreviation("etc", "and so on");
        abbreviations.addAbbreviation("eg", "for example");

        String text = "eg ie etc lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }
            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
