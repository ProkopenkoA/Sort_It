package Zadanie;

public class InputFileString extends InputFile
{
    public InputFileString(final String namedFile) throws Exception {
        super(namedFile);
    }
    
    @Override
    public String countLine() {
        String str = "";
        while (this.namedFile.hasNext()) {
            str = this.namedFile.nextLine();
            if (!str.contains(" ")) {
                return str;
            }
            System.out.println("Ошибка, строка содержит пробел - " + str);
        }
        this.namedFile.close();
        this.empty = true;
        return str;
    }
}
