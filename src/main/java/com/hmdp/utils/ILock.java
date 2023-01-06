package com.hmdp.utils;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface ILock {

    /*
    尝试获取锁
     */
    boolean tryLock(long timeoutSec);

    /*
    释放锁
     */
    void unlock();
}
