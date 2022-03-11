package Zadanie;

public class IntegerDecreased extends IntegerIncreased
{
    @Override
    public int extreme() {
        int max = this.massInt.get(0);
        int maxNum = 0;
        for (int i = 0; i < this.massLength; ++i) {
            if (max < this.massInt.get(i)) {
                max = this.massInt.get(i);
                maxNum = i;
            }
        }
        return maxNum;
    }
    
    @Override
    public boolean variablePoint(final int element) {
        return (int)this.point < element;
    }
}
