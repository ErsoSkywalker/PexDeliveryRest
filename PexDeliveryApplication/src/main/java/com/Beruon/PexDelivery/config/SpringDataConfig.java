package com.Beruon.PexDelivery.config;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


 @EnableTransactionManagement
 @EnableJpaRepositories("com.Beruon.PexDelivery.Repositories")
public class SpringDataConfig {
	 //Agregar Persistencia con JPA
}
