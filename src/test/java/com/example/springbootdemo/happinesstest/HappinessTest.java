package com.example.springbootdemo.happinesstest;

import com.example.springbootdemo.SpringbootDemoApplicationTests;
import com.example.springbootdemo.mybatis.service.HappinessService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO:请添加描述
 *
 * @author TYF
 * @date 2018/12/24
 * @since 1.0.0
 */
public class HappinessTest extends SpringbootDemoApplicationTests {

    @Autowired
    private HappinessService happinessService;

    @Test
    public void findHappinessByCity() {
        happinessService.findHappinessByCity("北京");
    }

    @Test
    public void insertHappiness() {
        happinessService.insertHappiness("北京", 1);
    }

    @Test
    public void updateByCity() {
        happinessService.updateByCity("南京", 1l);
    }

    @Test
    public void deleteByCity() {
        happinessService.deleteByCity("北京");
    }

    @Test
    public void findHappinessByCityXml() {
        happinessService.findHappinessByCityXml("南京");
    }

    @Test
    public void selectByPrimaryKey() {
        happinessService.selectByPrimaryKey(1l);
    }

    @Test
    public void testString() {
        //递归测试实现字符串顺序调换
        String abc = HappinessTest.reverse("abc");
        System.out.println(abc);
    }

    public static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    @Test
    public void test() {
        //i++原子性操作
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.incrementAndGet();

        //递归实现斐波那契
        int fribonacci = HappinessTest.Fribonacci(9);
        System.out.println(fribonacci);
    }

    public static int Fribonacci(int n) {
        if (n <= 2)
            return 1;
        else return Fribonacci(n - 1) + Fribonacci(n - 2);
    }

    @Test//队列测试
    public void queue() {
        Queue<String> queue = new LinkedList<>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll=" + queue.poll()); //返回第一个元素，并在队列中删除
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element=" + queue.element()); //返回第一个元素
        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek=" + queue.peek()); //返回第一个元素
        for (String q : queue) {
            System.out.println(q);
        }
    }
}
