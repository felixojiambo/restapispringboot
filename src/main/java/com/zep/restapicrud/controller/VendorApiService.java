package com.zep.restapicrud.controller;

import com.zep.restapicrud.model.Vendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
public class VendorApiService
{
    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(String vendorId){
    return new Vendor("A1","Oracle 1","Address 1","xxxxxxx");
    }
}
