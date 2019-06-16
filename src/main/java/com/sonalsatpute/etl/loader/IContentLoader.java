package com.sonalsatpute.etl.loader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface IContentLoader {
    void write(InputStream inputStream) throws IOException;
    InputStream getInputStream() throws FileNotFoundException;
}
