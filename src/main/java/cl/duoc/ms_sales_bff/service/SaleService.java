package cl.duoc.ms_sales_bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_sales_bff.config.SalesBsFeignClient;
import cl.duoc.ms_sales_bff.model.dto.SaleDTO;
import cl.duoc.ms_sales_bff.model.dto.WebPayTransacionDTO;
import cl.duoc.ms_sales_bff.model.dto.WebPayTransactionQueryResponseDTO;
import cl.duoc.ms_sales_bff.model.dto.WebPayTransactionResponseDTO;

@Service
public class SaleService {

    @Autowired
    SalesBsFeignClient bsFeignClient;

    public WebPayTransactionResponseDTO createSale(SaleDTO saleDTO) {
        return bsFeignClient.createSale(saleDTO);
    }

     public WebPayTransactionQueryResponseDTO queryTransaction(WebPayTransacionDTO webPayTransacionDTO) {
       return bsFeignClient.queryTransaction(webPayTransacionDTO);
     }

     public String confirmTransaction(WebPayTransacionDTO webPayTransacionDTO) {
        return bsFeignClient.confirmTransaction(webPayTransacionDTO);
    }
}
