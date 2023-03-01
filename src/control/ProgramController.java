package control;

import model.Token;
import java.util.ArrayList;
import java.util.List;

public class ProgramController {
    private final List<Token> tokenList = new ArrayList<>();

    public ProgramController() {

    }

    public void start() {
        new ViewController();
    }

    public boolean scan(String input) {
        tokenList.clear();
        String nInput = input += '#';
        if(nInput.length() % 2 == 0) return false;
        for(int i = 0; nInput.charAt(i) != '#'; i += 2) {
            if (nInput.charAt(i) == 'l') {
                if (input.charAt(i + 1) == 'a') tokenList.add(new Token("any"));
                else if (input.charAt(i + 1) == 'e') tokenList.add(new Token("any"));
                else if (input.charAt(i + 1) == 'u') tokenList.add(new Token("end"));
                else return false;
            } else return false;
        }
        return true;
    }

    public boolean parse() {
        if(tokenList.size() != 3) return false;
        return tokenList.get(2).type().equals("end");
    }
}