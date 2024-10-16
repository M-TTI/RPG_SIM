package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EnvReader {
    private Map<String, String> variables;

    public EnvReader() {
        this.variables = new HashMap<String, String>();
    }

    public void load() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(".env"))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String key = ligne.split("=")[0];
                String value = "";
                try {
                    value = ligne.split("=")[1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    value = "";
                }
                this.variables.put(key, value);
            }
        }
    }

    public String get(String key) {
        return this.variables.get(key);
    }

    public String toString() {
        return this.variables.toString();
    }
}

