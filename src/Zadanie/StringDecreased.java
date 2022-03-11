package Zadanie;

public class StringDecreased extends StringIncreased
{
    @Override
    public int extreme() {
        String max = this.massString.get(0);
        int maxNum = 0;
        for (int i = 0; i < this.massLength; ++i) {
            if (max.compareTo(this.massString.get(i)) > 0) {
                max = this.massString.get(i);
                maxNum = i;
            }
        }
        return maxNum;
    }
    
    @Override
    public boolean variablePoint(final String element) {
        return element.compareTo((String)this.point) < 0;
    }
}
