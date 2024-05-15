package access.ex;

public class MaxCounter {
    private int count=0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if(count>=max){
            System.out.println("최대값 초과염");
            return;
        }
        count++;
    }
    public int getCount(){
        return count;
    }
}
