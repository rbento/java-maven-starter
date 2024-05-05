
package rbento;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileHelper {
    public static void ensureDirectory(Path path) {
        if (Files.isDirectory(path)) {
            log.info("Directory exists, skipping...");
            return;
        }
        log.info("Creating directory: {}", path);
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            log.error("Unable to create directory: {}", path);
            log.error("Reason", e);
            throw new RuntimeException(e);
        }
    }
}
