package net.nprogram.RealEngine1.logging;

import net.nprogram.RealEngine1.color.Color;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

import static java.util.logging.Level.INFO;

public class Logging {
    private static Logger root = Logger.getLogger("");
    public void onStart(){
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                String rt = "";
                Level level = record.getLevel();
                if (Level.SEVERE.equals(level)) {
                    rt += Color.ANSI_RED;
                } else if (Level.WARNING.equals(level)) {
                    rt += Color.ANSI_CYAN;
                } else if (INFO.equals(level)) {
                    rt += Color.ANSI_WHITE;
                }
                SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
                Date d = new Date(record.getMillis());
                rt += "["+record.getLevel()+" "+df.format(d)+"] ";
                rt += record.getMessage();
                rt += "\n";
                return rt;
            }
        });
        for(Handler handler : root.getHandlers()){
            root.removeHandler(handler);
        }
        root.addHandler(consoleHandler);
    }
    public static void log(Level level,Object message){
        root.log(level,String.valueOf(message));
    }
}