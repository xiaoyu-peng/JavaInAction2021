package com.xhh.DesignPatterns.Creation_Mode_6.D002_FactoryPatterns.ex_nvwa;

/**
 * 人类工厂， 具体的实现工厂ConcreteCreator，创建具体产品类
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends IHuman> T createHuman(Class<T> c) {
        IHuman human = null;
        try {
            human = (IHuman) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
