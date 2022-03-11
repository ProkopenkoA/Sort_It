package Zadanie;

import java.io.FileReader;
import java.util.Scanner;

public abstract class InputFile
{
    Scanner namedFile;
    boolean empty;
    
    public InputFile(final String namedFile) throws Exception {
        this.empty = false;
        final FileReader fr = new FileReader(namedFile);
        this.namedFile = new Scanner(fr);
    }
    
    public boolean isEmpty() {
        return this.empty;
    }
    
    public abstract Object countLine();
}
