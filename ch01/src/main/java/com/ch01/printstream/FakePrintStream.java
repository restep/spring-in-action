package com.ch01.printstream;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author restep
 * @date 2018/4/29
 */
public class FakePrintStream extends PrintStream {
    public static StringBuffer stringBuffer = new StringBuffer();

    public FakePrintStream() {
        super(new ByteArrayOutputStream());
    }

    @Override
    public void println(String str) {
        stringBuffer.append(str).append("\n");
    }

    public String getStringBuffer() {
        return stringBuffer.toString();
    }

    public void clear() {
        stringBuffer = new StringBuffer();
    }
}
