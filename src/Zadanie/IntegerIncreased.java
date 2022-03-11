package Zadanie;

import java.util.ArrayList;

public class IntegerIncreased extends DynamicMassive
{
    public IntegerIncreased() {
        super.massInt = new ArrayList<>();
        super.massLength = 0;
    }
    
    @Override
    public void setPoint(final int point) {
        super.point = point;
    }
    
    @Override
    public Integer getMassElement(final int index) {
        return this.massInt.get(index);
    }
    
    @Override
    public void setMassElement(final int index, final int element) {
        this.massInt.set(index, element);
    }
    
    @Override
    public void addMassElement(final int index, final int element) {
        this.massInt.add(index, element);
        ++this.massLength;
    }
    
    @Override
    public void massCloseElement(final int index) {
        this.massInt.remove(index);
        --this.massLength;
    }
    
    @Override
    public int extreme() {
        int max = this.massInt.get(0);
        int maxNum = 0;
        for (int i = 0; i < this.massLength; ++i) {
            if (max > this.massInt.get(i)) {
                max = this.massInt.get(i);
                maxNum = i;
            }
        }
        return maxNum;
    }
    
    @Override
    public boolean variablePoint(final int element) {
        return (int)this.point > element;
    }
}
