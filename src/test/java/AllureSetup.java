import com.codeborne.selenide.logevents.SelenideLogger;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AllureSetup {

    @BeforeSuite
    public void allureResultsClean() {
        String allureResultsPath = "allure-results";

        try {
            Path dir = Paths.get(allureResultsPath);
            if (Files.exists(dir)) {
                Files.walk(dir)
                        .map(Path::toFile)
                        .forEach(File::delete);
                System.out.println("[Allure] Cleared previous allure-results folder.");
            }
        } catch (IOException e) {
            System.err.println("[Allure] Failed to clean results: " + e.getMessage());
        }
    }
}

