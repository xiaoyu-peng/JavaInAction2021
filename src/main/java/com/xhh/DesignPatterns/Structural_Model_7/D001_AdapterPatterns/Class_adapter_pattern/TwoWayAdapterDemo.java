package com.xhh.DesignPatterns.Structural_Model_7.D001_AdapterPatterns.Class_adapter_pattern;

/**
 * 在对象适配器的使用过程中，如果在适配器中同时包含对目标类和适配者类的引用，适配者可以通过它调用目标类中的方法，目标类也可以通过它调用适配者类中的方法，那么该适配器就是一个双向适配器.
 *
 * 实际开发中很少用
 */
public class TwoWayAdapterDemo {

    /**
     *     class Adapter implements Target, Adaptee {
     *         //同时维持对抽象目标类和适配者的引用
     *         private Target target;
     *         private Adaptee adaptee;
     *
     *         public Adapter(Target target) {
     *             this.target = target;
     *         }
     *
     *         public Adapter(Adaptee adaptee) {
     *             this.adaptee = adaptee;
     *         }
     *
     *         public void request() {
     *             adaptee.specificRequest();
     *         }
     *
     *         public void specificRequest() {
     *             target.request();
     *         }
     *     }
     */


}
