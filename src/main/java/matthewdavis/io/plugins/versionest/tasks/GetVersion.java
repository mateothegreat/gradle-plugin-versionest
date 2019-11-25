package matthewdavis.io.plugins.versionest.tasks;

import matthewdavis.io.plugins.versionest.Version;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetVersion extends DefaultTask {

    @TaskAction
    public void getCurrentVersion() throws IOException {

        System.out.println("ktuy");

        String file = Files.readString(Path.of("version.properties"));

        System.out.println(file);

        Pattern pattern = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)");
        Matcher matcher = pattern.matcher(file);

        matcher.find();

        Version version = new Version();
        System.out.println(matcher.groupCount());
        System.out.println(matcher.toString());

        System.out.println(4444);
        System.out.println(matcher.group(1));
        System.out.println(222);
        System.out.println(matcher.group(2));
        System.out.println(1333);
        System.out.println(matcher.group(3));


//        if (matcher.groupCount() == 3) {

        version.setMajor(Integer.parseInt(matcher.group(1)));
        version.setMinor(Integer.parseInt(matcher.group(2)));
        version.setPatch(Integer.parseInt(matcher.group(3)));

//        }


        System.out.println(version);
    }

}
