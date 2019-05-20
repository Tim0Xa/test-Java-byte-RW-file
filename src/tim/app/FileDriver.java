package tim.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileDriver {

    public byte[] readFile(String str) throws IOException {
        return Files.readAllBytes(new File(str).toPath() );
    }
    public void writeToFile(String adr, byte[] data) throws IOException {
        Files.write(new File(adr).toPath(),data);
    }
    public boolean coppyFile(String from, String to){
        try {
            writeToFile(to,readFile(from));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public File[] listFiles(String adr){
        return new File(adr).listFiles();
    }

    public String[] listNames(String adr){
        File[] fileSet = new File(adr).listFiles();
        String[] result = new String[fileSet.length];
        for(int i =0 ; i<fileSet.length; i++){
            result[i] = fileSet[i].getName();
        }
        return result;
    }
    public boolean removeFile(File f){
        return f.delete();
    }
}
