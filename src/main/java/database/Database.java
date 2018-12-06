package database;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Database {
	
	private String ip = "yourIPAdress";
	private int port = 27017;
	
	//connect to mongo database
	public MongoDatabase connectMongo() {
	MongoClient mongo = new MongoClient(ip, port);
	MongoDatabase database = mongo.getDatabase("mongofeed");
	return database;
	}
	
	
		
	
}
