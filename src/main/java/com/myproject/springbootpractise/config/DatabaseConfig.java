package com.myproject.springbootpractise.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.myproject.springbootpractise.repository")
@EnableTransactionManagement
public class DatabaseConfig {
}
