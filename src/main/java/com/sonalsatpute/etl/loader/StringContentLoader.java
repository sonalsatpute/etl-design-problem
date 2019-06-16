package com.sonalsatpute.etl.loader;

import java.io.InputStream;

public class StringContentLoader implements IContentLoader {
    private InputStream inputStream;
    @Override
    public void write(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public InputStream getInputStream() {
        return this.inputStream;
    }
}
