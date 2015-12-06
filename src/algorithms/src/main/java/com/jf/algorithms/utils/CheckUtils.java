package com.jf.algorithms.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class CheckUtils {

    private static final Logger logger = LogManager.getLogger();

    public static boolean isNull(Object[] argValue) { return argValue == null; }

    public static void isNull(Object argValue, String argName) { isObjectNull(argValue, argName, String.format("The argument [%s] can't be null.", argName)); }
    public static void isNull(Object[] argValue, String argName) { isArrayNull(argValue, argName, String.format("The argument [%s] can't be null.", argName)); }

    public static void isObjectNull(Object argValue, String argName, String message) {

        if(argValue == null) {

            if(logger.isDebugEnabled()) {
                String logMsg = String.format("ArgName=[%s], ArgValue=[%s]", argName, argValue);
                logger.debug(logMsg);
            }

            throw new IllegalArgumentException(message);

        }
    }

    public static void isArrayNull(Object[] argValue, String argName, String message) {

        if(argValue == null) {

            if(logger.isDebugEnabled()) {
                String logMsg = String.format("ArgName=[%s], ArgValue=%s", argName, ArrayUtils.printValues(argValue));
                logger.debug(logMsg);
            }

            throw new IllegalArgumentException(message);

        }




    }

}
