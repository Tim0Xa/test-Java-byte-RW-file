package tim.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileCoppy {
    public static void main(String[] args) {

        String readFrom = "C:/Users/tim0f/Test/1/images (2).jpg";
        String writeTo = "C:/Users/tim0f/Test/2/images (2).jpg";

        System.out.println(Arrays.deepToString(new File(
                "C:/Users/tim0f/Test/1/").listFiles()));
        System.out.println(Arrays.deepToString(new File(
                "C:/Users/tim0f/Test/2/").listFiles()));

        new Coppy().coppy(readFrom,writeTo);

        System.out.println(Arrays.deepToString(new File(
                "C:/Users/tim0f/Test/1/").listFiles()));
        System.out.println(Arrays.deepToString(new File(
                "C:/Users/tim0f/Test/2/").listFiles()));
    }
}
