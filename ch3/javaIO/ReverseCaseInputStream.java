package ch3.javaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReverseCaseInputStream extends FilterInputStream {
    public ReverseCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c
                : reverseCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int res = in.read(b, off, len);
        for (int i = off; i < off + len; i++) {
            b[i] = (byte) reverseCase((char) b[i]);
        }

        return res;
    }

    private char reverseCase(char c) {
        return (Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
    }

}
