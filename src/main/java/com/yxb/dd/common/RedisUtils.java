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
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 读取缓存
     *
     * @param key 主键
     * @return 值
     */
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 写入缓存
     *
     * @param key 主键
     * @param value 值
     */
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 更新缓存
     *
     * @param key 主键
     * @param value 值
     */
    public void getAndSet(String key, String value) {
        redisTemplate.opsForValue().getAndSet(key, value);
    }

    /**
     * 删除缓存
     *
     * @param key 主键
     */
    public void delete(String key) {
        redisTemplate.delete(key);
    }
}
