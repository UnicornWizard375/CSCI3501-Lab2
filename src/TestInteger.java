public class TestInteger implements Comparable<TestInteger> {
    public Integer value = 0;
    static int counter = 0;

    @Override
    public int compareTo(TestInteger o) {
        counter++;
        return this.value - o.value;
    }

    public int getCounter(){
        int temp = counter;
        counter = 0;
        return temp;
    }

}
