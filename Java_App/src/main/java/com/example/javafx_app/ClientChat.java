package com.example.javafx_app;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ClientChat extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStge) throws Exception {
		primaryStge.setTitle("Client Chat");
		VBox root = new VBox();
		root.setSpacing(10);
		root.setPadding(new Insets(10));
		root.setBackground(new Background(new BackgroundFill(Color.LIGHTCORAL, null, null)));

		HBox hBox = new HBox();
		hBox.setSpacing(20);
		hBox.setAlignment(Pos.CENTER);
		Label labelHost = new Label("Host:");
		TextField textFieldHost = new TextField("localhost");
		Label labelPort = new Label("Port:");
		TextField textFieldPort = new TextField("2002");
		Button buttonConnector = new Button("Connect");
		labelHost.setFont(Font.font("Poppins", 16));
		labelPort.setFont(Font.font("Poppins",  16));

		hBox.getChildren().addAll(labelHost, textFieldHost, labelPort, textFieldPort, buttonConnector);

		ListView<String> listView = new ListView<>();
		listView.setPrefHeight(500);
		root.getChildren().addAll(hBox, listView);

		Scene scene = new Scene(root, 800, 600);
		primaryStge.setScene(scene);
		primaryStge.show();

		buttonConnector.setOnAction((event)->{
			String host = textFieldHost.getText();
			int port = Integer.parseInt(textFieldPort.getText());
			try {
				Socket socket = new Socket(host,port);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				new Thread(()->{
					try {
						while(true) {
							String response = bufferedReader.readLine();
							Platform.runLater(() -> listView.getItems().add(response));
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}).start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
