package amey.practice;

public class CalcImpl implements Calc{
    
    @Override
    public long add(long a, long b) {
        return (a+b);
    }

    @Override
    public long sub(long a, long b) {
        return (a-b);
    }

    @Override
    public long multiply(long a, long b) {
        return (a*b);
    }

    @Override
    public long divide(long a, long b) {
        if(b<=0){
            return 0l;
        }
        else{
            return (a/b);
        }
       
    }

    @Override
    public long addSub(long a, long b) {
        return ((a+b)-a);
    }
    
}
