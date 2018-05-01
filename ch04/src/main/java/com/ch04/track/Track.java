package com.ch04.track;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @author restep
 * @date 2018/5/1
 */
@Aspect
public class Track {
    private Map<Integer, Integer> countMap = new HashMap<>();

    /**
     * *: 返回任意类型
     * cd.impl.CdImpl: 方法所属的类型
     * play: 方法
     * int: 接受int类型的参数
     * args(number): 指定参数
     * @param number
     */
    @Pointcut("execution(* com.ch04.cd.impl.CdImpl.play(int))" + "&& args(number)")
    public void trackPlay(int number) {

    }

    /**
     * 播放前 为该磁道计数
     * @param number
     */
    @Before("trackPlay(number)")
    public void countTrack(int number) {
        int count = getPlayCount(number);
        countMap.put(number, count + 1);
    }

    public int getPlayCount(int number) {
        return countMap.containsKey(number) ? countMap.get(number) : 0;
    }
}
