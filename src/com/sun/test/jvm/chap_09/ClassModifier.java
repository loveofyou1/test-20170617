package com.sun.test.jvm.chap_09;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 修改Class文件，暂时只提供修改常量池的功能
 * Created by root on 17-7-26.
 */
public class ClassModifier {
    /**
     * Class文件中常量池的起始偏移
     */
    private static final int CONSTANT_POOL_COUNT_INDEX = 8;
    /**
     * CONSTANT_Utf8_info常量的tag标志
     */
    private static final int CONSTANT_Utf8_info = 1;
    /**
     * 常量池中11种常量所占的长度CONSTANT_Utf8_info常量除外，因为它不是定长的
     */
    private static final int[] CONSTANT_ITEM_LENTGH = {-1, -1, -1, 5, 5, 9, 9, 3, 3, 5, 5, 5, 5};
    private static final int u1 = 1;
    private static final int u2 = 2;
    private byte[] classtype;

    public ClassModifier(byte[] classtype) {
        this.classtype = classtype;
    }

    /**
     * 修改常量池种CONSTANT_Utf8_info常量的的内容
     */
    public byte[] modifyUTF8Constant(String oldStr, String newStr) {
        int cpc = this.getConstantPoolCount();
        int offset = CONSTANT_POOL_COUNT_INDEX + u2;
        for (int i = 0; i < cpc; i++) {
            int tag = ByteUtils.bytes2Int(classtype, offset, u1);
            if (tag == CONSTANT_Utf8_info) {
                int len = ByteUtils.bytes2Int(classtype, offset + u1, u2);
                offset = (u1 + u2);
                String str = ByteUtils.bytes2String(classtype, offset, len);
                if (str.equalsIgnoreCase(oldStr)) {
                    byte[] strBytes = ByteUtils.String2Bytes(newStr);
                    byte[] strlen = ByteUtils.int2Bytes(newStr.length(), u2);
                    classtype = ByteUtils.bytesReplace(classtype, offset - u2, u2, strlen);
                    classtype = ByteUtils.bytesReplace(classtype, offset, len, strBytes);
                    return classtype;
                } else {
                    offset += len;
                }
            } else {
                offset += CONSTANT_ITEM_LENTGH[tag];
            }
        }
        return classtype;
    }

    public int getConstantPoolCount() {
        return ByteUtils.bytes2Int(classtype, CONSTANT_POOL_COUNT_INDEX, u2);
    }
}
