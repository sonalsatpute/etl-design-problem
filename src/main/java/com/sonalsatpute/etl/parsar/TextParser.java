package com.sonalsatpute.etl.parsar;


import com.sonalsatpute.etl.transformer.ICaseTransformer;

public class TextParser implements IContentParser {
    private String content;
    private ICaseTransformer transformer;

    public TextParser(String content, ICaseTransformer transformer) {
        this.content = content;
        this.transformer = transformer;
    }

    @Override
    public String execute() {
        return transformer.process(this.content);
    }
}
