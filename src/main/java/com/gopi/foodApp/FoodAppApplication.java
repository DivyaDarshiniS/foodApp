package com.gopi.foodApp;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
@EnableSwagger2
public class FoodAppApplication {

	public static void main(String[] args) throws IOException {
		ClassLoader classLoader = FoodAppApplication.class.getClassLoader();
		File file = new File(Objects.requireNonNull(classLoader.getResource("gopi-food-app-firebase-adminsdk-key.json")).getFile());
		FileInputStream serviceAccount = new FileInputStream(file.getAbsoluteFile());
		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.setDatabaseUrl("https://gopi-food-app-default-rtdb.firebaseio.com")
				.build();

		FirebaseApp.initializeApp(options);
		SpringApplication.run(FoodAppApplication.class, args);
	}
}
