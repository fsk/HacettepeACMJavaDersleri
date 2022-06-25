package com.company.ders9;

import java.io.Serializable;

public class CustomerImpl implements ICustomer, Serializable, Runnable {


    @Override
    public void createCustomer(Long custId, String custName) {
        // parametrelerdeki bilgileri al DB'ye yaz, success ise sonucu dön değilse throw et.
    }

    @Override
    public Customer inquireCustomerInfos(Long custId) {
        // custId ile customer ı bul geri döndür.
        return null;
    }

    @Override
    public Customer inquireCustomerInfos(String custName) {
        // custName ile customer ı bul geri döndür.
        return null;
    }

    @Override
    public void deleteCustomer(Long custId) {
        //parametre olarak gelen custId'nin bilgilerini sil.
    }

    @Override
    public void run() {

    }
}
