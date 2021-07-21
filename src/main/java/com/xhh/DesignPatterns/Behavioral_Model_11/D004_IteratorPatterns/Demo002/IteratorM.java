package com.xhh.DesignPatterns.Behavioral_Model_11.D004_IteratorPatterns.Demo002;

/**
 * Iterator 接口
 *
 * @param <E>
 */
public interface IteratorM<E> {
    
    public int modCount = 0;

    boolean hasNext();

    void next();

    E currentItem();
}