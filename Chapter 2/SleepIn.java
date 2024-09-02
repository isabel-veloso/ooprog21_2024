public class SleepIn{
    public boolean sleepIn(boolean weekday, boolean vacation){
        
        if(!weekday && !vacation){
            return true;
        } else if(weekday && !vacation){
            return false;
        } else if(!weekday && vacation){
            return true;
        } else{
            return true;
        }
    }
    
    public static void main(String[] args){
        SleepIn sleepIn = new SleepIn();
        
        System.out.println(sleepIn.sleepIn(false, false)); 
        System.out.println(sleepIn.sleepIn(true, false));
        System.out.println(sleepIn.sleepIn(false, true));
    }
}