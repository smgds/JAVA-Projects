//QR_Code.java		Author: Amy Noyes

package application;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class QR_Code extends Application {

  @Override
  public void start(Stage stage) {
    Group root = new Group();
    Scene scene = new Scene(root, 512, 512);
    stage.setScene(scene);
    stage.setTitle("QR Code Generator");

    VBox vb = new VBox();

    Pane canvas = new Pane();
    canvas.setStyle("-fx-background-color: WHITE;");
    canvas.setPrefSize(512,512);
    
    //Upper Left
    Rectangle rectangle1 = new Rectangle(140,140,Color.WHITE);
    rectangle1.relocate(0,0);
    Rectangle rectangle2 = new Rectangle(120,120,Color.BLACK);
    rectangle2.relocate(5,5);
    Rectangle rectangle3 = new Rectangle(85,85,Color.WHITE);
    rectangle3.relocate(20,20);
    Rectangle rectangle4 = new Rectangle(50,50,Color.BLACK);
    rectangle4.relocate(38,38);
    
    //Upper Right
    Rectangle rectangle5 = new Rectangle(140,140,Color.WHITE);
    rectangle5.relocate(372,0);
    Rectangle rectangle6 = new Rectangle(120,120,Color.BLACK);
    rectangle6.relocate(378,5);
    Rectangle rectangle7 = new Rectangle(85,85,Color.WHITE);
    rectangle7.relocate(395,20);
    Rectangle rectangle8 = new Rectangle(50,50,Color.BLACK);
    rectangle8.relocate(413,38);
    
    //Lower Left
    Rectangle rectangle9 = new Rectangle(140,140,Color.WHITE);
    rectangle9.relocate(0,372);
    Rectangle rectangle10 = new Rectangle(120,120,Color.BLACK);
    rectangle10.relocate(5,378);
    Rectangle rectangle11 = new Rectangle(85,85,Color.WHITE);
    rectangle11.relocate(20,395);
    Rectangle rectangle12 = new Rectangle(50,50,Color.BLACK);
    rectangle12.relocate(38,413);
    
    //Lower Right
    Rectangle rectangle13 = new Rectangle(140,140,Color.WHITE);
    rectangle13.relocate(372,372);
    Rectangle rectangle14 = new Rectangle(120,120,Color.BLACK);
    rectangle14.relocate(378,378);
    Rectangle rectangle15 = new Rectangle(85,85,Color.WHITE);
    rectangle15.relocate(395,395);
    Rectangle rectangle16 = new Rectangle(50,50,Color.BLACK);
    rectangle16.relocate(413, 413);
    
    
    //Random Rectangles
    Paint white = Color.WHITE;
	Paint black = Color.BLACK;
    Pane Generator = new Pane();
    Paint squareColor = black ;
    
    Random rand = new Random();
    
    for (int x = 0; x <= 512; x+=20) {
		for (int y = 0; y <= 512; y+=20) {
			int n = rand.nextInt(2); 
			if (n == 0){
			squareColor = white;
			} else {
				squareColor = black;
			}
            Rectangle rec = new Rectangle(x, y , 20, 20);
            rec.setFill(squareColor);
            Generator.getChildren().add(rec);	        
		}
    }
    
    vb.getChildren().add(canvas);
    scene.setRoot(vb);
    stage.show();
    canvas.getChildren().addAll(Generator, rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, rectangle6, 
    		rectangle7, rectangle8, rectangle9, rectangle10, rectangle11, rectangle12, rectangle13, rectangle14, rectangle15, rectangle16);

		
  }
  	       
 public static void main(String[] args) {
    launch(args);
  }
}

