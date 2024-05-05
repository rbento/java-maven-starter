
package rbento;

import java.nio.file.Files;
import java.nio.file.Path;
import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class FileHelperTest {
    @Test
    @SneakyThrows
    public void testDirectoryIsCreated(@TempDir Path tempDir) {
        Path path = tempDir.resolve("test");

        Assertions.assertThat(Files.exists(path)).isFalse();
        Assertions.assertThat(Files.isDirectory(path)).isFalse();

        FileHelper.ensureDirectory(path);

        Assertions.assertThat(Files.exists(path)).isTrue();
        Assertions.assertThat(Files.isDirectory(path)).isTrue();
    }
}
