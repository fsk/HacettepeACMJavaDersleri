package com.company.ders9;

public interface ICustomer {

    void createCustomer(Long custId, String custName);

    Customer inquireCustomerInfos(Long custId);

    Customer inquireCustomerInfos(String custName);

    void deleteCustomer(Long custId);
}
