package Zadanie;

import java.util.ArrayList;

public abstract class DynamicMassive
{
    ArrayList<Integer> massInt;
    ArrayList<String> massString;
    Integer massLength;
    Object point;
    
    public void setPoint(final int point) {
    }
    
    public void setPoint(final String point) {
    }
    
    public void setPoint(final Object point) {
        if (point instanceof String) {
            this.setPoint((String)point);
        }
        if (point instanceof Integer) {
            this.setPoint((int)point);
        }
    }
    
    public boolean variablePoint(final int element) {
        return false;
    }
    
    public boolean variablePoint(final String element) {
        return false;
    }
    
    public boolean variablePoint(final Object element) {
        if (element instanceof String) {
            return this.variablePoint((String)element);
        }
        return !(element instanceof Integer) || this.variablePoint((int)element);
    }
    
    public abstract int extreme();
    
    public abstract Object getMassElement(final int p0);
    
    public void addMassElement(final int index, final int element) {
    }
    
    public void addMassElement(final int index, final String element) {
    }
    
    public void setMassElement(final int index, final int element) {
    }
    
    public void setMassElement(final int index, final String element) {
    }
    
    public void setMassElement(final int index, final Object element) {
        if (element instanceof String) {
            this.setMassElement(index, (String)element);
        }
        if (element instanceof Integer) {
            this.setMassElement(index, (int)element);
        }
    }
    
    public abstract void massCloseElement(final int p0);
}
