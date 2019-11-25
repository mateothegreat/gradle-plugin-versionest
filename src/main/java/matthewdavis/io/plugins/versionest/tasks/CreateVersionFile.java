package matthewdavis.io.plugins.versionest.tasks;

import matthewdavis.io.plugins.versionest.Version;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateVersionFile extends DefaultTask {

    public static void writeFile(Version version) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("version.properties"));

        writer.write(version.getMajor() + "." + version.getMinor() + "." + version.getPatch());
        writer.close();

    }

    @TaskAction
    public void createVersionFile() throws IOException {

        writeFile(new Version());

        System.out.println("version.properties created!");

    }

}
