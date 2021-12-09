
public class EmplyWage{

    public static void main(String[] args){
    
    int IS_FULL_TIME = 1;
    
    double empCheck = Math.floor(Math.RANDOM() * 10) %2;
    
    if(empCheck == IS_FULL_TIME)
        System.out.println("employee is present");
    else
        System.out.println("employee is absent");
    }
    }