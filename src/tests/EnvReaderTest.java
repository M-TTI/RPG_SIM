package tests;

import org.junit.jupiter.api.Test;
import utilities.EnvReader;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
class EnvReaderTest {
  @Test
    void testEnv() throws IOException {
      EnvReader envReader = new EnvReader();
      envReader.load();
      assert(envReader.get("DB_URL") != null);
      assert(envReader.get("DB_USER") != null);
      assert(envReader.get("DB_PASS") != null);
    }
}