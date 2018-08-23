package com.atguigu.commou.utils;

import org.apache.log4j.Logger;

import static org.springframework.util.StringUtils.isEmpty;

public class MyUtils {
    private static final Logger LOGGER = Logger.getLogger(MyUtils.class);
    public static boolean isNotEmpty(Object obj){
        if (obj==null){
            LOGGER.debug("obj is null");
            return false;
        }
        if (obj instanceof String){
            LOGGER.debug("String===========>"+obj);
            return !("".equals(obj));
        }
        LOGGER.debug("Objdect===========>"+obj);
        return !isEmpty(obj);
    }
}
