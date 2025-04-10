package cl.duoc.ms_sales_bff.config;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ms-sales-bs", url = "http://localhost:8182")
public interface SalesBsFeignClient {

}
