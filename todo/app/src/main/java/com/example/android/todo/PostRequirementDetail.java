package com.example.android.todo;

/**
 * Created by android on 3/5/2017.
 */

public class PostRequirementDetail {

    private String BloodGroup;
    private String NumOfUnits;
    private String Urgency;
    private String Country;
    private String State;
    private String City;
    private String Hospital;
    private String Relation;
    private String ContactNo;
    private String AdditionalInstruc;

    public PostRequirementDetail() {
    }

    public PostRequirementDetail(String bloodGroup, String numOfUnits, String urgency,
                                 String country, String state, String city, String hospital,
                                 String relation, String contactNo, String additionalInstruc) {
        BloodGroup = bloodGroup;
        NumOfUnits = numOfUnits;
        Urgency = urgency;
        Country = country;
        State = state;
        City = city;
        Hospital = hospital;
        Relation = relation;
        ContactNo = contactNo;
        AdditionalInstruc = additionalInstruc;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public String getNumOfUnits() {
        return NumOfUnits;
    }

    public String getUrgency() {
        return Urgency;
    }

    public String getCountry() {
        return Country;
    }

    public String getState() {
        return State;
    }

    public String getCity() {
        return City;
    }

    public String getHospital() {
        return Hospital;
    }

    public String getRelation() {
        return Relation;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public String getAdditionalInstruc() {
        return AdditionalInstruc;
    }


    public void setBloodGroup(String bloodGroup) {

        BloodGroup = bloodGroup;
    }

    public void setNumOfUnits(String numOfUnits) {
        NumOfUnits = numOfUnits;
    }

    public void setUrgency(String urgency) {
        Urgency = urgency;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setState(String state) {
        State = state;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setHospital(String hospital) {
        Hospital = hospital;
    }

    public void setRelation(String relation) {
        Relation = relation;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public void setAdditionalInstruc(String additionalInstruc) {
        AdditionalInstruc = additionalInstruc;
    }
}
