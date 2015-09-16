package com.jmeo.springmvc.service;

import com.jmeo.springmvc.utils.MemcachedHepler;
import net.spy.memcached.AddrUtil;
import net.spy.memcached.MemcachedClient;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by JmeoM on 2015/9/16.
 */
public class MemcachedTest {

    @Test
    public void memcachedTest() throws IOException {

        System.out.println("---> this action test start ...");
        Long st = System.currentTimeMillis();
        MemcachedClient client = new MemcachedClient(AddrUtil.getAddresses("localhost:11211"));
//        client.set("h1",1000,"hello");
        Object s = client.get("h1");

        System.out.println(s);
        Long end = System.currentTimeMillis();

        System.out.println("---> this action test end ...");
        System.out.println(" action time is : " + (end-st));
    }

    @Test
    public void readPorperties() throws IOException {
        Properties properties = new Properties();
        InputStream s = MemcachedTest.class.getClassLoader().getResourceAsStream("test.properties");
        properties.load(s);
        String st = properties.getProperty("jmeo");
        System.out.println(st);
    }

    @Test
    public void mmTest(){
        long st = System.currentTimeMillis();
//        MemcachedHepler.set("name", "jmeo");
        String name = MemcachedHepler.getString("name");
        System.out.println(name);
        long end = System.currentTimeMillis();

        System.out.println("all time is : " + (end-st));
    }

}
