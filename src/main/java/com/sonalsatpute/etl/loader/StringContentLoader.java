package com.sonalsatpute.etl.loader;

import java.io.InputStream;

public class StringContentLoader implements IContentLoader {
    @Override
    public InputStream load(InputStream inputStream) {
        return inputStream;
    }
}
