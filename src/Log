import java.io.FileWriter;
import java.io.IOException;

/**
 * Singleton class for logging events in the application.
 * This class provides methods to add log entries and write them to a file.
 */
public class Log {
    private static Log instance;
    private StringBuilder logEntries;

    private Log() {
        logEntries = new StringBuilder();
    }

    /**
     * Gets the single instance of the Log class.
     *
     * @return the instance of Log
     */
    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    /**
     * Adds a log entry to the log.
     *
     * @param entry the log entry to be added
     */
    public void addEntry(String entry) {
        logEntries.append(entry).append("\n");
    }

    /**
     * Retrieves all log entries as a string.
     *
     * @return a string containing all log entries
     */
    public String getLogEntries() {
        return logEntries.toString();
    }

    /**
     * Writes the log entries to a specified file.
     *
     * @param filename the name of the file to write the log entries to
     */
    public void writeToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(logEntries.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}