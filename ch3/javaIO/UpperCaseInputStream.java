package ch3.javaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {
    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toUpperCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int res = in.read(b, off, len);
        for (int i = off; i < off + len; i++) {
            b[i] = (byte) Character.toUpperCase((char) b[i]);
        }

        return res;
    }

}
