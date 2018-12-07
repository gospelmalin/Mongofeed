package database;

public class Main {

	public static void main(String[] args) {
		Database db = new Database();
		//db.connectMongo();
		//String collectionName = "feedsCollection";
	//	db.createCollection(collectionName);
		//String author = "Malin Albinsson";
		//String author = "Markus Holmberg";
		//String content = "My first feed";
		//String content = "My second feed";
		//String content = "A mongofeed";
		//String content = "A second feed from another user";
		//db.insertFeedDocument(author, content);
		//db.getAllDocuments();
		String username ="Malin Albinsson";
		db.getDocumentsForUser(username);
		PropertiesReader pr = new PropertiesReader();
		pr.getIpProperty();



	}

}
