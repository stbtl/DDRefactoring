package com.yxb.dd.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis缓存类
 *
 * @author YingXB
 * @date 2020/09/23 16:12
 */
public class RedisUtils {

    @Autowired
    private static RedisTemplate<String, String> redisTemplate;

    /**
     * 读取缓存
     *
     * @param key 主键
     * @return 值
     */
    public static String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 写入缓存
     *
     * @param key 主键
     * @param value 值
     */
    public static boolean set(String key, String value) {
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 更新缓存
     *
     * @param key 主键
     * @param value 值
     */
    public static boolean getAndSet(String key, String value) {
        boolean result = false;
        try {
            redisTemplate.opsForValue().getAndSet(key, value);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 删除缓存
     *
     * @param key 主键
     */
    public static boolean delete(String key) {
        boolean result = false;
        try {
            redisTemplate.delete(key);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
