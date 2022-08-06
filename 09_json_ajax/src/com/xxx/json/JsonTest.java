package com.xxx.json;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xxx.pojo.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {

    /* 1.JSON和JavaBean的转换 */
    @Test
    public void test1(){
        Gson gson = new Gson();

        /* JavaBean对象转换为JSON字符串 */
        Person person = new Person(1,"abc");
        String JsonString = gson.toJson(person);
        System.out.println(JsonString);

        /* JSON字符串转换为JavaBean对象 */
        Person person1 = gson.fromJson(JsonString, Person.class);
        System.out.println(person1);
    }

    /* 2.JSON和List的转换 */
    @Test
    public void test2(){
        Gson gson = new Gson();
        List<Person> list = new ArrayList<>();
        list.add(new Person(1,"a"));
        list.add(new Person(2,"b"));
        list.add(new Person(3,"c"));

        /* List集合转换为JSON字符串 */
        String JsonString = gson.toJson(list);
        System.out.println(JsonString);

        /* JSON字符串转换为List集合 */
        List<Person> list1 = gson.fromJson(JsonString, new TypeToken<List<Person>>(){}.getType());
        System.out.println(list1);
        System.out.println(list1.get(0));
    }

    /* 3.JSON和Map的转换 */
    @Test
    public void test3(){
        Gson gson = new Gson();
        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person(1,"a"));
        map.put(2,new Person(2,"b"));
        map.put(3,new Person(3,"c"));

        /* Map转换为JSON字符串 */
        String JsonString = gson.toJson(map);
        System.out.println(JsonString);

        /* JSON字符串转换为Map */
        Map<Integer,Person> map1 = gson.fromJson(JsonString, new TypeToken<Map<Integer, Person>>() {}.getType());
        System.out.println(map1);
    }

}
