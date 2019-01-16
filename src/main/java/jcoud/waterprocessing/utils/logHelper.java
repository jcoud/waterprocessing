package jcoud.waterprocessing.utils;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class logHelper {
    public static void log(Level loglevel, Object obj){
        FMLLog.log(Reference.MOD_ID, loglevel, String.valueOf(obj));
    }

    public static void all(Object obj) { log(Level.ALL, obj); }
    public static void debug(Object obj) { log(Level.DEBUG, obj); }
    public static void error(Object obj) { log(Level.ERROR, obj); }
    public static void fatal(Object obj) { log(Level.FATAL, obj); }
    public static void info(Object obj) { log(Level.INFO, obj); }
    public static void trace(Object obj) { log(Level.TRACE, obj); }
    public static void off(Object obj) { log(Level.OFF, obj); }
    public static void warn(Object obj) { log(Level.WARN, obj); }
}
