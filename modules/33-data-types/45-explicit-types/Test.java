import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Test {
    public static void main(String[] args) {
        final String expected = "One more time\n";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.main(null);

        final String actual = out.toString();

        App.main(null);

        assertThat(actual).isEqualTo(expected);
    }
}
