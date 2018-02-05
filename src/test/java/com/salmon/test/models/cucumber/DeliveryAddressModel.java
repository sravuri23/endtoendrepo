package com.salmon.test.models.cucumber;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class DeliveryAddressModel {


    private String addressName;
    private String firstName;
    private String lastName;
    private String addressline1;
    private String  city;
    private String  postalcode;
    private String  phoneNumber;
    private String  errorMessage;
}
