package com.xhh.DesignPatterns.Creation_Mode_6.D005_PrototypePatterns;

import java.io.*;

/** 深拷贝 - 先将对象序列化，然后再反序列化成新的对象。
 *
 *  TODO 如果将一个对象先序列化写入字节流，然后再读出，重新构造成一个对象，就能实现这个对象的deep copy。
 */
public class DeepCopyDemo02 {

  public Object deepCopy(Object object) throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bo = new ByteArrayOutputStream();
    ObjectOutputStream oo = new ObjectOutputStream(bo);
    oo.writeObject(object);

    ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
    ObjectInputStream oi = new ObjectInputStream(bi);

    return oi.readObject();
  }
}
