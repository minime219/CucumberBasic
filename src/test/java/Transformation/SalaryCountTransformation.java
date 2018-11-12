package Transformation;

import cucumber.api.Transformer;

public class SalaryCountTransformation extends Transformer<Integer> {

    @Override
    public Integer transform(String value) {
        return value.length();
    }
}
