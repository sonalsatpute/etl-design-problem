package com.sonalsatpute.etl.loader;

import java.io.IOException;
import java.io.InputStream;

public interface IContentLoader {
    InputStream load(InputStream inputStream) throws IOException;
}
