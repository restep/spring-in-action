package com.ch12.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author restep
 * @date 2018/6/23
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.ch12.dao")
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "OrderDB";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient();
    }
}
