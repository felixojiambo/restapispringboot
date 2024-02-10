package com.zep.restapicrud.model;

import lombok.Data;

@Data
public class Vendor {
    private  String vendorId;
    private  String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

    public Vendor() {
    }

    public Vendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
