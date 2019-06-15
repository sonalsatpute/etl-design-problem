package com.sonalsatpute.etl.parsar;

import java.io.FileNotFoundException;

public interface IContentParser {
    String execute() throws FileNotFoundException;
}
