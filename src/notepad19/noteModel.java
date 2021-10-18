package notepad19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class noteModel {
    FileWriter fw = null;
                try {
        fw = new FileWriter(filename2);
    } catch (
    IOException e) {
        e.printStackTrace();
    }
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter outFile = new PrintWriter(bw);
                outFile.println(text);
                outFile.flush();
                outFile.close();
}
