package com.sonalsatpute.etl.transformer;

public class TitleCaseTransformer implements ICaseTransformer {

    @Override
    public String process(String content) {
        String[] words = content.split(" ");

        StringBuilder result = new StringBuilder();

        for (int index = 0 ; index < words.length ; index++) {

            String word = toTitleCase(words[index]);

            if (word.equals("")) continue;
            if (isSecondLastIndex(index, words.length))
                result.append(word + " ");
            else
                result.append(word);
        }

        return result.toString();
    }

    private boolean isSecondLastIndex(int index, int totalElements)
    {
        return (index <= totalElements - 2);
    }

    private String toTitleCase(String word) {
        if (word.equals("")) return "";
        String firstLatter = word.substring(0, 1);
        return word.replaceFirst(firstLatter, firstLatter.toUpperCase());
    }
}
