import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final var expected = "h o d o r";

        App.main(null);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(null);

        final var actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
}