package Zadanie;

import java.util.ArrayList;

public class StringIncreased extends DynamicMassive
{
    public StringIncreased() {
        super.massString = new ArrayList<>();
        super.massLength = 0;
    }
    
    @Override
    public void setPoint(final String point) {
        super.point = point;
    }
    
    @Override
    public String getMassElement(final int index) {
        return this.massString.get(index);
    }
    
    @Override
    public void setMassElement(final int index, final String element) {
        this.massString.set(index, element);
    }
    
    @Override
    public void addMassElement(final int index, final String element) {
        this.massString.add(index, element);
        ++this.massLength;
    }
    
    @Override
    public void massCloseElement(final int index) {
        this.massString.remove(index);
        --this.massLength;
    }
    
    @Override
    public int extreme() {
        String max = this.massString.get(0);
        int maxNum = 0;
        for (int i = 0; i < this.massLength; ++i) {
            if (max.compareTo(this.massString.get(i)) < 0) {
                max = this.massString.get(i);
                maxNum = i;
            }
        }
        return maxNum;
    }
    
    @Override
    public boolean variablePoint(final String element) {
        return element.compareTo((String)this.point) > 0;
    }
}
