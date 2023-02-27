package com.example.messagingjms;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.messagingjms.ResponseAndRequest.ras;

@SpringBootApplication
public class MessagingJmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingJmsApplication.class, args);

		String xml = ras("2023-02-24");

		System.out.println("__________________________________");

		try {
			JSONObject json = XML.toJSONObject(xml);
			//String jsonPrettyPrintString = json.toString(PRETTY_PRINT_INDENT_FACTOR);
			System.out.println(json);
		} catch (JSONException je) {
			System.out.println(je.toString());
		}


	}

}
