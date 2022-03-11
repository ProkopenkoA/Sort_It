package Zadanie;

import java.io.FileWriter;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        int index = 0;
        boolean decrease = false;
        boolean text = false;
        FileWriter output = null;
        DynamicMassive mas = null;
        final ArrayList<InputFile> inputTXT = new ArrayList<>();
        try {
            for (String str : args) {
                if (!str.equals("a")) {
                    if (str.equals("d")) {
                        decrease = true;
                    }
                    else if (str.equals("i")) {
                        if (decrease) {
                            mas = new IntegerDecreased();
                        }
                        else {
                            mas = new IntegerIncreased();
                        }
                    }
                    else if (str.equals("s")) {
                        text = true;
                        if (decrease) {
                            mas = new StringDecreased();
                        }
                        else {
                            mas = new StringIncreased();
                        }
                    }
                    else if (output == null) {
                        output = new FileWriter(str);
                    }
                    else {
                        if (text) {
                            inputTXT.add(new InputFileString(str));
                            mas.addMassElement(index, (String)inputTXT.get(index).countLine());
                        }
                        else {
                            assert mas != null;
                            inputTXT.add(new InputFileInteger(str));
                            mas.addMassElement(index, (int)inputTXT.get(index).countLine());
                        }
                        ++index;
                    }
                }
            }
            assert mas != null;
            index = mas.extreme();
            mas.setPoint(mas.getMassElement(index));
            while (!inputTXT.isEmpty()) {
                index = mas.extreme();
                if (inputTXT.get(index).isEmpty()) {
                    inputTXT.remove(index);
                    mas.massCloseElement(index);
                }
                else {
                    final Object element = mas.getMassElement(index);
                    if (mas.variablePoint(element)) {
                        System.out.println("Ошибка, не в правильном порядке - " + element);
                    }
                    else {
                        output.write(element + "\n");
                        mas.setPoint(element);
                    }
                    mas.setMassElement(index, inputTXT.get(index).countLine());
                }
            }
            assert output != null;
            output.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
