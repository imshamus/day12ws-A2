package sg.edu.nus.iss.day12ws_A2.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class NumInput {

    // @Digits(fraction = 0, integer = 2, message = "Max allowable digits is 2.") // redundant
    // @NotBlank(message = "Input must not be blank.") // not blank meant for strings

    @Max(value = 20, message = "Maximum number is 20.")
    @Min(value = 1, message = "Minumber number to generate is 1.")
    @NotNull(message = "Input must not be null.")
    private Integer value;

    public NumInput(Integer value) {
        this.value = value;
    }

    public NumInput() {
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
}
