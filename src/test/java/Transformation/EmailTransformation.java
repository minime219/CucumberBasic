package Transformation;

import cucumber.api.Transformer;

public class EmailTransformation extends Transformer<String> {

    @Override
    public String transform(String value) {
        return value.concat("@ea.com");
    }
}
