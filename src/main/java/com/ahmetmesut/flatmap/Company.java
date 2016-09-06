package com.ahmetmesut.flatmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Company {

    public static List flatMap(){

        CompanyModel companyApple = new CompanyModel();
        companyApple.setId(1L);
        companyApple.setCompanyName("Apple");

        CompanyModel companySamsung = new CompanyModel();
        companySamsung.setId(2L);
        companySamsung.setCompanyName("Samsung");

        List<CompanyModel> mobileCompanies=  new ArrayList<>();
        mobileCompanies.add(companyApple);
        mobileCompanies.add(companySamsung);



        CompanyModel companyFacebook = new CompanyModel();
        companyFacebook.setId(3L);
        companyFacebook.setCompanyName("Facebook");

        CompanyModel companyTwitter = new CompanyModel();
        companyTwitter.setId(4L);
        companyTwitter.setCompanyName("Twitter");

        List<CompanyModel> socialNetworkingCompanies = new ArrayList<>();
        socialNetworkingCompanies.add(companyFacebook);
        socialNetworkingCompanies.add(companyTwitter);

        Map<String, List<CompanyModel>> companies = new HashMap<>();
        companies.put("MobileCompanies", mobileCompanies);
        companies.put("SocialNetworkingCompanies", socialNetworkingCompanies);

        return companies.keySet()
                 .stream()
                 .flatMap(x->companies.get(x).stream())
                 .map(y->y.getCompanyName())
                 .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(flatMap());

    }
}