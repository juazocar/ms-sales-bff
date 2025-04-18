package cl.duoc.ms_sales_bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsSalesBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSalesBffApplication.class, args);
	}

}
