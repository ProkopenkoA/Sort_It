package Zadanie;

public class InputFileInteger extends InputFile
{
    public InputFileInteger(final String namedFile) throws Exception {
        super(namedFile);
    }
    
    @Override
    public Integer countLine() {
        int i = 0;
        while (this.namedFile.hasNext()) {
            if (this.namedFile.hasNextInt()) {
                i = this.namedFile.nextInt();
                return i;
            }
            System.out.println("Ошибка, не целое число - " + this.namedFile.nextLine());
        }
        this.namedFile.close();
        this.empty = true;
        return i;
    }
}
