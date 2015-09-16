package com.jmeo.springmvc.utils;

import net.spy.memcached.AddrUtil;
import net.spy.memcached.MemcachedClient;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by JmeoM on 2015/9/16.
 */
public class MemcachedHepler {

    private static MemcachedClient client;
    static {
        try {
//            InputStream in = MemcachedHepler.class.getClassLoader().getResourceAsStream("config.properties");
            String address = getConfigProperties().getProperty("address");
            client = new MemcachedClient(AddrUtil.getAddresses(address));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties getConfigProperties(){
        Properties properties = new Properties();
        try {
            InputStream in = MemcachedHepler.class.getClassLoader().getResourceAsStream("config.properties");
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
            properties = null;
        }
        return properties;
    }

    public static String getString(String key){
        Object tem = client.get(key);
        return tem!=null? String.valueOf(tem) : null;
    }

    public static String getString(String key,String defautlValue){
        Object tem = client.get(key);
        return tem!=null? String.valueOf(tem) : defautlValue;
    }

    public static Object get(String key){
        return client.get(key);
    }

    public static  Object get(String key,Object def){
        return client.get(key) != null ? client.get(key) : def;
    }

    public static void set(String key,Object value){
        Integer exp = Integer.valueOf(getConfigProperties().getProperty("cacheTime"));
        exp =  exp!=null?exp:1000;
        set(key,value,exp);
    }

    public static void set(String key,Object value,int exp){
        client.set(key,exp,value);
    }

}
