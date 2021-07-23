package cn.chitucao.designpattern.s3_decorator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Created by Tom.
 */
public class JsonLoggerFactory {

    public static JsonLogger getLogger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
