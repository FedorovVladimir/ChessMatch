package pairs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum ResultGame{
    WHITE_WINS,
    BLACK_WINS,
    DRAW,
    MINUS_PLUS,
    PLUS_MINUS,
    MINUS_MINUS,
    ZERO_ZERO;

    private static final List<ResultGame> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static ResultGame randomResult()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}