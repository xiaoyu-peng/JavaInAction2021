package com.xhh.DesignPatterns.Structural_Model_7.D005_FacadePatterns;

/**
 * 【问题】：在标准的外观模式结构图中，如果需要增加、删除或更换与外观类交互的子系统类，必须修改外观类或客户端的源代码，这将违背开闭原则。
 * 【解决】：抽象外观类，客户端针对抽象外观类编程，而在运行时在确定具体外观类
 */
abstract class AbstractEncryptFacade {

    public abstract void fileEncrypt(String fileNameSrc, String fileNameDes);

}
