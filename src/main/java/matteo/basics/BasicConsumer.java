package matteo.basics;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.util.List;

public class BasicConsumer {

    private final String USER = System.getenv("MONGO_USR");
    private final String PWD = System.getenv("MONGO_PWD");
    private final MongoCredential credential = MongoCredential.createScramSha1Credential(USER, "homechecklistdb", PWD.toCharArray());
    private final MongoClientSettings settings = MongoClientSettings.builder()
            .applyToClusterSettings(builder -> builder.hosts(List.of(new ServerAddress("localhost", 27017))))
            .credential(credential)
            .build();

    public MongoDatabase getConnection() {
        MongoClient mongoClient = MongoClients.create(settings);
        return mongoClient.getDatabase("homechecklistdb");
    }
}
