package springaop;

public class Logging {
    public void beforeAdvice(){
        System.out.println("Going to setup student profile");
    }
    public void afterAdvice(){
        System.out.println("Student profile has been setup");
    }
    public void afterReturningAdvice(Object reVal){
        System.out.println("Returning:" + reVal.toString());
    }
    public void AfterThrowingAdvice(IllegalArgumentException e){
        System.out.println("There has been an exception:" + e.toString());
    }
}
