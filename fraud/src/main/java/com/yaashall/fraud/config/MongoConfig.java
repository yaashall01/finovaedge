package com.yaashall.fraud.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yassine CHALH
 */
@Configuration
public class MongoConfig {

    @Value("${spring.data.mongodb.uri}")
    private String mongoUri;


    @Bean
    public CommandLineRunner commandLineRunner(MongoClient mongoClient){

        return args -> {
            MongoDatabase database = mongoClient.getDatabase("fraud_db");
            database.drop();

            // MongoDatabase newDatabase = mongoClient.getDatabase(databaseName);
        };
    }

    @Bean
    public MongoClient mongoClient(){
        return MongoClients.create(mongoUri);
    }


}
