package CreationalPatterns.Singleton;

public enum Logger {
    INSTANCE;

    private Logger() {}

    public static Logger getInstance(){
        return INSTANCE;
    }

    void log(String msg){
        System.out.println("LOG: " + msg);
    }
}
