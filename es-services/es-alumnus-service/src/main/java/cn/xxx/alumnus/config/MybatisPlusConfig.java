package cn.xxx.alumnus.config;

import javax.sql.DataSource;

import org.bytesoft.bytejta.supports.jdbc.LocalXADataSource;
import org.bytesoft.bytetcc.TransactionManagerImpl;
import org.bytesoft.bytetcc.supports.springcloud.config.SpringCloudConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan("cn.xxx.alumnus.mapper*")
@Import(SpringCloudConfiguration.class)
@ImportResource({ "classpath:bytetcc-supports-springcloud.xml"})
public class MybatisPlusConfig {
    @Bean
    public DataSource dataSource(@Autowired TransactionManagerImpl transactionManager) {
        LocalXADataSource localXADataSource = new LocalXADataSource();
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("521");
        hikariDataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/alumnus?tinyInt1isBit=false&characterEncoding=utf8");
        hikariDataSource.setAutoCommit(false);
        localXADataSource.setTransactionManager(transactionManager);
        return hikariDataSource;
    }
    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
