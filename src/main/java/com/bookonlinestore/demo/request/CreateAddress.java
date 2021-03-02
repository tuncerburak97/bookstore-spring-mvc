package com.bookonlinestore.demo.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateAddress {
    private String street;
    private String number;
    public String city;
    private String zipcode;

}
