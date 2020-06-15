package org.appenders.log4j2.elasticsearch;

public class SysoutLog {
    public static void out(String msg)
    {
        System.out.println("::"+msg);
    }
}
