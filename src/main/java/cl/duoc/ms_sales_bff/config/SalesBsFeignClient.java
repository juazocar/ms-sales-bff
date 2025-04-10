package cl.duoc.ms_sales_bff.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ms_sales_bff.model.dto.SaleDTO;
import cl.duoc.ms_sales_bff.model.dto.WebPayTransactionResponseDTO;

@FeignClient(name = "ms-sales-bs", url = "http://localhost:8182")
public interface SalesBsFeignClient {

     @PostMapping("/sales/sale")
    public WebPayTransactionResponseDTO createSale(@RequestBody SaleDTO saleDTO);
}
