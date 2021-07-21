package com.xhh.DesignPatterns.Structural_Model_7.D006_FlyweightPatterns.Demo003;

/**
 * 案例：
 * 在文本编辑器中，我们每敲一个文字，都会调用 Editor 类中的 appendCharacter() 方法，创建一个新的 Character 对象，保存到 chars 数组中。
 * 如果一个文本文件中，有上万、十几万、几十万的文字，那我们就要在内存中存储这么多 Character 对象。
 * 那有没有办法可以节省一点内存呢？实际上，在一个文本文件中，用到的字体格式不会太多，毕竟不大可能有人把每个文字都设置成不同的格式。
 * TODO 所以，对于字体格式，我们可以将它设计成享元莫斯，让不同的文字共享使用。按照这个设计思路，我们对上面的代码进行重构。
 */
public class ClientTest {
}
