package ee.itcollage.level14;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MasterOfStreamsTest {

    @Test
    public void checkConverted() {
        assertEquals(MasterOfStreams.convertMe(), MasterOfStreams.converted());
    }

    @Test
    public void checkGrouping() {
        List<String> words = List.of("hello", "world", "is", "nice", "way", "to", "start", "programming");
        Map<Integer, List<String>> result = Map.of(2, List.of("is", "to"), 3, List.of("way"), 4, List.of("nice"),
                5, List.of("hello", "world", "start"), 11, List.of("programming"));
        assertEquals(result, MasterOfStreams.mapWordsByLength(words));
    }
}
