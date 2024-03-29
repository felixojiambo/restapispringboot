package com.zep.restapicrud.controller;

import com.zep.restapicrud.model.Vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendor")
public class VendorApiService
{
    Vendor cloudVendor;
    @GetMapping("{vendorId}")
    public Vendor getVendorDetails(String vendorId){
    return  cloudVendor;//new Vendor("A1","Oracle 1","Address 1","xxxxxxx");
    }
   @PostMapping
    public  String createVendorDetails(@RequestBody Vendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return  "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public  String updateVendorDetails(@RequestBody Vendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return  "Cloud Vendor Updated Successfully";
    }
    @DeleteMapping
    public  String deleteVendorDetails(String vendorId){
        this.cloudVendor=null;
        return  "Cloud Vendor deleted Successfully";
    }
}
