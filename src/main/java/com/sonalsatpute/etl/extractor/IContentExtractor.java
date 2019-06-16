package com.sonalsatpute.etl.extractor;

import java.io.IOException;
import java.io.InputStream;

public interface IContentExtractor {
    InputStream getInputStream() throws IOException;
}

