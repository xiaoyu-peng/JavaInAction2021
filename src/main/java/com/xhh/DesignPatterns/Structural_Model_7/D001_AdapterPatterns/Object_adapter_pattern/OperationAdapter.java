package com.xhh.DesignPatterns.Structural_Model_7.D001_AdapterPatterns.Object_adapter_pattern;

/**
 * 操作适配器：适配器
 */
public class OperationAdapter implements ScoreOperation {

    /**
     * 定义适配者QuickSort对象
     */
    private QuickSort sortObj;
    /**
     * 定义适配者BinarySearch对象
     */
    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int array[]) {
        //调用适配者类QuickSort的排序方法
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int array[], int key) {
        //调用适配者类BinarySearch的查找方法
        return searchObj.binarySearch(array, key);
    }
}