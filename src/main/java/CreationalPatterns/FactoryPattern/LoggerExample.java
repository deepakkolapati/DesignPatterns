package CreationalPatterns.FactoryPattern;

 interface Logger {
     void log(String msg);
}

class ConsoleLogger implements Logger{
     @Override
    public void log(String msg){
         System.out.println("Console Logger: " + msg);
     }
}

class FileLogger implements Logger{
     public void log(String msg){
         System.out.println("File Logger: " + msg);
     }
}

class LoggerFactory{
     public static Logger getLogger(String type) {
         return switch(type) {
             case "console" -> new ConsoleLogger();
             case "file" -> new FileLogger();
             default -> throw new IllegalArgumentException("Unknown logger type");
         };

     }
}

public class LoggerExample{
    public static void main(String[] args) {
        Logger logger = new LoggerFactory().getLogger("console");
        logger.log("Hii");
        logger = LoggerFactory.getLogger("file");
        logger.log("Bye");
    }
}