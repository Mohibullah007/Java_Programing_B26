package day43_custom_classes;

public class Address {

    String street, city, state, zipcode;

//    public Address(String inputStreet, String inputCity,
//    String inputState,  String inputZipcode){

//        street = inputStreet;
//        city = inputCity;
//        state = inputState;
//        zipcode = inputZipcode;
//    }

    public Address(String street, String city, String state, String zipcode) {

        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;

    }
}
