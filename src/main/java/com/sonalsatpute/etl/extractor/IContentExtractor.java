package com.sonalsatpute.etl.extractor;

import java.io.InputStream;

public interface IContentExtractor {
    InputStream contentAsStream();
}
