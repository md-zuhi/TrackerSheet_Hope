interface trigger{
    boolean istriggered();
}
class MotionTrigger implements trigger{
    boolean trig;
    MotionTrigger(boolean trig){
        this.trig=trig;
    }
    @Override
    public boolean istriggered(){
        return trig==true;
    }
}

class Temp implements trigger{
    int temp;
    Temp(int temp){
        this.temp=temp;
    }
    
    @Override
    public boolean istriggered(){
        if(temp>30){
            return true;
        }
        return false;
    }
    
}
class Time implements trigger{
    int time;
    Time(int time){
        this.time=time;
    }
    @Override
    public boolean istriggered(){
        if(time>7){
            return true;
        }
        return false;
    }
}