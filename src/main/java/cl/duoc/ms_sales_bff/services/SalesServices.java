package cl.duoc.ms_sales_bff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_sales_bff.clients.SalesBsFeignClient;
import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@Service
public class SalesServices {

    @Autowired
    SalesBsFeignClient salesBsFeignClient;

    public SalesDTO getSalesById(Long id){
        return salesBsFeignClient.findSalesById(id).getBody();
    }

}
