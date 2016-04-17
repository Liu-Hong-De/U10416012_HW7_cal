//U10416012 劉宏德
import javafx.application.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.Group;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyCalculator extends Application {
	
	// Override
  	@Override
  	public void start(Stage primaryStage) {

		// Set gap of pane
		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.TOP_CENTER);
		gridpane.setHgap(5);
		gridpane.setVgap(5);

		VBox vbox = new VBox();
		Group group = new Group();
	
		TextField text = new TextField();

    		double[] temporary = {0, 0};

		// Create four function for + - * /
    		boolean[] function = new boolean[4];

		// Set initial function is false
    		for(int i = 0; i < 4; i++) {
    			function[0] = false;
    		}

		// Create menu for V E H and put them into menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
    		Menu menuV = new Menu("檢視(V)");
    		Menu menuE = new Menu("編輯(E)");  
    		Menu menuH = new Menu("說明(H)");
    		menuBar.getMenus().addAll(menuV, menuE, menuH);

    		gridpane.add(text, 1, 6, 5, 5);
    		text.setMinSize(225,60);
    		text.setEditable(false);	// Let the text can not be edited

		// Create a new pane
		Pane pane = new Pane();
		
		// Create button MC
    		Button buttonMC = new Button("MC");
	 	buttonMC.setMinSize(40, 40);
    		gridpane.add(buttonMC, 1, 12);
    
    		// Create button MR
    		Button buttonMR = new Button("MR");
    		buttonMR.setMinSize(40, 40);
    		gridpane.add(buttonMR, 2, 12);

		// Create button MS
    		Button buttonMS = new Button("MS");
    		buttonMS.setMinSize(40, 40);
    		gridpane.add(buttonMS, 3, 12);

		// Create button M+
    		Button buttonMadd = new Button("M+");
    		buttonMadd.setMinSize(40, 40);
    		gridpane.add(buttonMadd, 4, 12);

		// Create button M-
		Button buttonMsub = new Button("M-");
		buttonMsub.setMinSize(40, 40);
    		gridpane.add(buttonMsub, 5, 12);

		// Create button DEL and let it can delete the number which the user input in
		Button buttonDel = new Button("DEL");
		buttonDel.setMinSize(40, 40);
    		gridpane.add(buttonDel, 1, 14);
    		buttonDel.setOnAction(e -> {
    			String result = text.getText();
    			result = result.substring(0, result.length() - 1);
    			text.setText(result);
    		});
    
    		// Create button CE and let it can clear the pane
		Button buttonCE = new Button("CE");
		buttonCE.setMinSize(40, 40);
    		gridpane.add(buttonCE, 2, 14);
    		buttonCE.setOnAction(e -> {
			text.clear();
    			text.setText("");
    		});
  
  		// Create button C and let it can clear the pane
		Button buttonC = new Button("C");
		buttonC.setMinSize(40, 40);
    		gridpane.add(buttonC, 3, 14);
    		buttonC.setOnAction(e -> {
    			text.clear();
    			text.setText("");
    		});
    
    		// Create button +/- and let it can add -
		Button buttonPM = new Button("+/-");
		buttonPM.setMinSize(40, 40);
    		gridpane.add(buttonPM, 4, 14);
    		buttonPM.setOnAction(e -> {
    			double result = Double.parseDouble(text.getText());
    			result = result * (-1);
    			text.setText(Double.toString(result));
    		});
  
  		// Create button sqrt and let it can sqrt the number which the user input in
		Button buttonSqrt = new Button("Sqrt");
		buttonSqrt.setMinSize(40, 40);
    		gridpane.add(buttonSqrt, 5, 14);
    		buttonSqrt.setOnAction(e -> {
    			double result = Math.sqrt(Double.parseDouble(text.getText())); 
    			text.setText(Double.toString(result));
    		});
   
   		// Create button seven and let it display on the pane
		Button buttonSeven = new Button("7");
		buttonSeven.setMinSize(40, 40);
    		gridpane.add(buttonSeven, 1, 16);
    		buttonSeven.setOnAction(e -> {
        		int num = 7;
        		text.setText(text.getText() + num);
		});
    
    		// Create button eight and let it display on the pane
		Button buttonEight = new Button("8");
		buttonEight.setMinSize(40, 40);
    		gridpane.add(buttonEight, 2, 16);
    		buttonEight.setOnAction(e -> {
        		int num = 8;
        		text.setText(text.getText() + num);
    		});
    
		// Create button nine and let it display on the pane
		Button buttonNine = new Button("9");
		buttonNine.setMinSize(40, 40);
    		gridpane.add(buttonNine, 3, 16);
    		buttonNine.setOnAction(e -> {
        		int num = 9;
        		text.setText(text.getText() + num);
    		});
    
    		// Create button / and let it can operate
		Button buttonDivide = new Button("/");
		buttonDivide.setMinSize(40, 40);
    		gridpane.add(buttonDivide, 4, 16);
    		buttonDivide.setOnAction(e -> {
    			temporary[0] = Double.parseDouble(text.getText());
    			text.setText("/");
    			function[3] = true;
    		});
  
  		// Create button % and let it can operate
		Button buttonPercent = new Button("%");
		buttonPercent.setMinSize(40, 40);
    		gridpane.add(buttonPercent, 5, 16);
    		buttonPercent.setOnAction(e -> {
    			double result = Double.parseDouble(text.getText()); 
    			result = result / 100;
    			text.setText(Double.toString(result));
    		});
   
   		// Create button four and let it display on the pane
		Button buttonFour = new Button("4");
		buttonFour.setMinSize(40, 40);
    		gridpane.add(buttonFour, 1, 18);
    		buttonFour.setOnAction(e -> {
        		int num = 4;
        		text.setText(text.getText() + num);
    		});
   
   		// Create button five and let it display on the pane
		Button buttonFive = new Button("5");
		buttonFive.setMinSize(40, 40);
    		gridpane.add(buttonFive, 2, 18);
    		buttonFive.setOnAction(e -> {
        		int num = 5;
        		text.setText(text.getText() + num);
    		});
  
  		// Create button six and let it display on the pane
		Button buttonSix = new Button("6");
		buttonSix.setMinSize(40, 40);
    		gridpane.add(buttonSix, 3, 18);
    		buttonSix.setOnAction(e -> {
        		int num = 6;
        		text.setText(text.getText() + num);
    		});
  
  		// Create button * and let it can operate
		Button buttonMultiply = new Button("*");
		buttonMultiply.setMinSize(40, 40);
    		gridpane.add(buttonMultiply, 4, 18);
    		buttonMultiply.setOnAction(e -> {
    			temporary[0] = Double.parseDouble(text.getText());
    			text.setText("*");
    			function[2] = true;
    		});
  
  		// Create button 1/x and let it can operate
		Button button1dx = new Button("1/x");
		button1dx.setMinSize(40, 40);
    		gridpane.add(button1dx, 5, 18);
    		button1dx.setOnAction(e -> {
    			double result = Double.parseDouble(text.getText()); 
    			result = 1 / result;
    			text.setText(Double.toString(result));
    		});
    
    		// Create button + and let it can operate
    		Button buttonAdd = new Button("+");
		buttonAdd.setMinSize(40, 40);
    		gridpane.add(buttonAdd, 4, 21);
    		buttonAdd.setOnAction(e -> {
    			temporary[0] = Double.parseDouble(text.getText());
    			text.setText("+");
    			function[0] = true;
    		});
   
   		// Create button one and let it display on the pane
		Button buttonOne = new Button("1");
		buttonOne.setMinSize(40, 40);
    		gridpane.add(buttonOne, 1, 20);
    		buttonOne.setOnAction(e -> {
        		int num = 1;
        		text.setText(text.getText() + num);
    		});
   
   		// Create button two and let it display on the pane
		Button buttonTwo = new Button("2");
		buttonTwo.setMinSize(40, 40);
    		gridpane.add(buttonTwo,2,20);
    		buttonTwo.setOnAction(e -> {
        		int num = 2;
        		text.setText(text.getText() + num);
    		});
    
    		// Create button three and let it display on the pane
		Button buttonThree = new Button("3");
		buttonThree.setMinSize(40, 40);
    		gridpane.add(buttonThree, 3, 20);
		buttonThree.setOnAction(e -> {
        		int num = 3;
        		text.setText(text.getText() + num);
    		});
   
   		// Create button - and let it can operate
		Button buttonSub = new Button("-");
		buttonSub.setMinSize(40, 40);
    		gridpane.add(buttonSub, 4, 20);
    		buttonSub.setOnAction(e -> {
    			temporary[0] = Double.parseDouble(text.getText());
    			text.setText("-");
    			function[1] = true;
    		});
  
  		// Create button zero and let it display on the pane
		Button buttonZero = new Button("0");
		buttonZero.setMinSize(82, 40);
    		gridpane.add(buttonZero, 1, 21, 2, 1);
    		buttonZero.setOnAction(e -> {
        		int num = 0;
        		text.setText(text.getText() + num);
    		});	
 
 		// Create button . and let it display on the pane
		Button buttonPoint = new Button(".");
		buttonPoint.setMinSize(40, 40);
    		gridpane.add(buttonPoint, 3, 21);
    		buttonPoint.setOnAction(e -> {
        		String num = .;
        		text.setText(text.getText() + num);
		});
 
 		// Create button = and let it can operate
		Button buttonEqual = new Button("=");
		buttonEqual.setMinSize(40, 82);
    		gridpane.add(buttonEqual, 5, 20, 1, 2);
    		buttonEqual.setOnAction(e -> {
    			temporary[1] = Double.parseDouble(text.getText());
   
   			// Calculate the +
    			if(function[0] == true) {
    				double result = temporary[0] + temporary[1];
    				text.setText(Double.toString(result));
    			}
 
 			// Calculate the -
    			if(function[1] == true) {
    				double result = temporary[0] - temporary[1];
    				text.setText(Double.toString(result));
    			}
 
 			// Calculate the *
    			if(function[2] == true) {
    				double result = temporary[0] * temporary[1];
    				text.setText(Double.toString(result));
    			}
  
  			// Calculate the /
    			if(function[3] == true) {
    				double result = temporary[0] / temporary[1];
    				text.setText(Double.toString(result));
    			}
    		});

		HBox hBox = new HBox();
    		hBox.setSpacing(10);
    		hBox.setAlignment(Pos.CENTER);
	
		// Decide the scene's height and width
		Scene scene = new Scene(group, 230, 401);
   
   		//add gridpane and menuBar into group
    		group.getChildren().add(gridpane);
    		group.getChildren().add(menuBar);
	
		primaryStage.setTitle("My Calculator");		// Title
    		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
    		primaryStage.show(); 
  	}
}
