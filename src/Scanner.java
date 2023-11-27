import java.util.ArrayList;
import java.util.List;

public class Scanner {
    private String source;
    private final List<Token> tokens = new ArrayList<>();

    Scanner(String source) {
        this.source = source;
    }

    public List<Token> scanTokens()  {
        return tokens;
    }
}
