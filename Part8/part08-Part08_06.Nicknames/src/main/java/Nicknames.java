import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {

        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        String matthewNickname = nicknames.get("matthew");
        System.out.println("Matthew's nickname is " + matthewNickname);
    }

}
