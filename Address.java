package Laba16;

public final class Address {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;
    Address(String cityName,String streetName,int buildingNumber){
        this.cityName = cityName;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
    }
    public String getCityName(){
        return cityName;
    }
    public String getStreetName(){
        return streetName;
    }
    public int getZipCode(){
        return zipCode;
    }
    public int getBuildingNumber(){
        return buildingNumber;
    }
    public int getApartmentNumber(){
        return apartmentNumber;
    }
    public char getBuildingLetter(){
        return buildingLetter;
    }
}
