package com.sun.test.jvm.chap_09;

import java.lang.reflect.Method;

/**
 * JavaClass执行工具
 * Created by root on 17-7-26.
 */
public class JavaClassExecuter {
    /**
     * 执行外部传过来的代表的一个java类的byte数组
     * 将输入类的byte数组代表java.lang.System的CONSTANT_Utf8_info常量修改为劫持后的HackSytem类
     * 执行方法为该类的static main(String[] args)方法，输出结果为该类向System.out/err输出的信息
     */
    public static String execute(byte[] classByte) {
        HackSystem.clearBuffer();
        ClassModifier cm = new ClassModifier(classByte);
        byte[] modiBytes = cm.modifyUTF8Constant("java/lang/System", "org/fenixsoft/classloading/execute/HackSystem");
        HotSwapClassLoader loader = new HotSwapClassLoader();
        Class clazz = loader.loadByte(modiBytes);
        try {
            Method method = clazz.getMethod("main", new Class[]{String[].class});
        } catch (Throwable e) {
            e.printStackTrace(HackSystem.out);
        }
        return HackSystem.getBufferString();
    }
}
