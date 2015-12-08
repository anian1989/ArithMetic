package com.fanhanfei.keywords.Transient;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 
* @ClassName: ExternalizableTest 
* @Description: Externalizable�ӿڵ�ʹ��
* @author junshuaizhang@163.com
* @date 2015��12��8�� ����3:51:58 
* ����֪����Java�У���������л�����ͨ��ʵ�����ֽӿ���ʵ�֣���ʵ�ֵ���Serializable�ӿڣ�
* �����е����л������Զ����У���ʵ�ֵ���Externalizable�ӿڣ���û���κζ��������Զ����л���
* ��Ҫ��writeExternal�����н����ֹ�ָ����Ҫ���л��ı����������Ƿ�transient�����޹ء�
* ��˵ڶ�������������Ǳ���content��ʼ�������ݣ�������null��
*
 */
public class ExternalizableTest implements Externalizable {

    private transient String content = "�ǵģ��ҽ��ᱻ���л����������Ƿ�transient�ؼ�������";

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(content);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException,
            ClassNotFoundException {
        content = (String) in.readObject();
    }

    public static void main(String[] args) throws Exception {
        
        ExternalizableTest et = new ExternalizableTest();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                new File("test.txt")));
        out.writeObject(et);

        ObjectInput in = new ObjectInputStream(new FileInputStream(new File(
                "test.txt")));
        et = (ExternalizableTest) in.readObject();
        System.out.println(et.content);

        out.close();
        in.close();
    }
}