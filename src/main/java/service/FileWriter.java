package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public interface FileWriter {
    void write(String data, String filePath);
}
