package database;

public class Main {

	public static void main(String[] args) {
		Database db = new Database();
		//db.connectMongo();
		String collectionName = "feedsCollection";
		db.createCollection(collectionName);



	}

}
