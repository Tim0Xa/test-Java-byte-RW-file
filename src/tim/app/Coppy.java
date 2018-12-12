package tim.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Coppy {

    public void coppy(String readFrom, String writeTo){
        try {
            byte[] data  = Files.readAllBytes(new File(readFrom).toPath());
            Files.write(Paths.get(writeTo),data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
