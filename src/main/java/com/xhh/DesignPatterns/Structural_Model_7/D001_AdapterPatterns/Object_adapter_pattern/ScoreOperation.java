package com.xhh.DesignPatterns.Structural_Model_7.D001_AdapterPatterns.Object_adapter_pattern;

/**
 * 抽象成绩操作类：目标接口
 * @author PengHui
 */
public interface ScoreOperation {

    /**
     * 成绩排序
     * @param array
     * @return
     */
    public int[] sort(int array[]);

    /**
     * 成绩查找
     * @param array
     * @param key
     * @return
     */
    public int search(int array[], int key);
}
