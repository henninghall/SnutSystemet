package gov.polisen.ainwebserver.createHandlers;

import gov.polisen.ainwebserver.Main;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

import org.apache.ibatis.session.SqlSession;

import com.google.gson.Gson;

public class CREATEUser implements HttpHandler {

	public void handleRequest(HttpServerExchange exchange) throws Exception {

		SqlSession session = Main.getSessionFactory().openSession();
		try {
			Gson gson = new Gson();
			// TODO: We need to first make a POST request from the app in order to
			// test this data.
		} finally {
			session.close();
		}
	}
}
