package cl.duoc.ms_sales_bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ms_sales_bff.config.SalesBsFeignClient;
import cl.duoc.ms_sales_bff.model.dto.SaleDTO;
import cl.duoc.ms_sales_bff.model.dto.WebPayTransactionResponseDTO;

@Service
public class SaleService {

    @Autowired
    SalesBsFeignClient bsFeignClient;

    public WebPayTransactionResponseDTO createSale(@RequestBody SaleDTO saleDTO) {
        return bsFeignClient.createSale(saleDTO);
    }

}
