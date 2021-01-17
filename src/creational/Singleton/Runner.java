package creational.Singleton;

public class Runner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("1 string");
        ProgramLogger.getProgramLogger().addLogInfo("2 string");
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
