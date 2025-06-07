package cl.duoc.ms_sales_bff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.ms_sales_bff.model.dto.SalesDTO;

@FeignClient(name = "ms-sales-bs-svc", url = "http://localhost:8081/api/sales")
public interface SalesBsFeignClient {

    @GetMapping("/{id}")
    public ResponseEntity<SalesDTO> findSalesById(@PathVariable("id") Long id);
}
