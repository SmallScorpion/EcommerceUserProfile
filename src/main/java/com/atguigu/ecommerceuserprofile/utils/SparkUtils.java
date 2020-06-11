package com.atguigu.ecommerceuserprofile.utils;

import org.apache.spark.sql.SparkSession;

public class SparkUtils {

    // 定义一个spark session的会话池
    private static ThreadLocal<SparkSession> sessionPool = new ThreadLocal<>();

    // 初始化spark session的方法
    public static SparkSession initSession() {
        // 先判断会话池中是否有session，如果有就直接用，没有再创建
        if (sessionPool.get() != null) {
            return sessionPool.get();
        }

        SparkSession session = SparkSession.builder()
                .appName("userprofile-etl")
                .master("local[*]")
                .config("es.nodes", "hadoop102")
                .config("es.port", "9200")
                .config("es.index.auto.create", "false")
                .enableHiveSupport()    // 启用hive支持
                .getOrCreate();
        sessionPool.set(session);
        return  session;
    }

}
