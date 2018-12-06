package database;

import java.util.Date;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
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
	
	
	// create new collection
	public void createCollection(String collectionName) {
		MongoDatabase database= connectMongo();
		database.createCollection(collectionName);		
		}
	
	//add feed
	public void insertFeedDocument(String author, String content) {
		MongoDatabase database= connectMongo();
		MongoCollection<Document> feeds = database.getCollection("feedsCollection");
		Date timestamp = new Date();
		int likes = 0;
		Document feed = new Document()
				.append("Author", author)
				.append("Date", timestamp)
				.append("Content", content)
				.append("Likes", likes);
		feeds.insertOne(feed);
	}

}
