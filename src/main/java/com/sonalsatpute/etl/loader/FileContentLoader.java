package com.sonalsatpute.etl.loader;

import java.io.*;

public class FileContentLoader implements IContentLoader {

    private final String fileId;

    public FileContentLoader(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public void write(InputStream inputStream) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(fileId);

        int read;
        byte[] bytes = new byte[1024];

        while ((read = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, read);
        }
        outputStream.close();
    }

    @Override
    public InputStream getInputStream() throws FileNotFoundException {
        //Todo:
        // is there way to convert output stream to input stream?
        // reading file to to get input stream; seems to be overhead?
        return new FileInputStream(fileId);
    }
}
