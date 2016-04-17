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

	  GridPane gridpane = new GridPane();
	  gridpane.setAlignment(Pos.TOP_CENTER);
	  gridpane.setHgap(5);
	  gridpane.setVgap(5);

	  VBox vbox = new VBox();
	  Group group = new Group();
	
	  TextField text = new TextField();

    MenuBar menuBar = new MenuBar();
	  menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
    Menu menuV = new Menu("檢視(V)");
    Menu menuE = new Menu("編輯(E)");  
    Menu menuH = new Menu("說明(H)");
    menuBar.getMenus().addAll(menuV, menuE, menuH);

    gridpane.add(text, 1, 6, 5, 5);

    text.setMinSize(225,60);
    text.setEditable(false);

	  Pane pane = new Pane();
   
    Button buttonMC = new Button("MC");
    buttonMC.setMinSize(40, 40);
    gridpane.add(buttonMC, 1, 12);
    
    Button buttonMR = new Button("MR");
    buttonMR.setMinSize(40, 40);
    gridpane.add(buttonMR, 2, 12);

    Button buttonMS = new Button("MS");
    buttonMS.setMinSize(40, 40);
    gridpane.add(buttonMS, 3, 12);

    Button buttonMadd = new Button("M+");
    buttonMadd.setMinSize(40, 40);
    gridpane.add(buttonMadd, 4, 12);

	  Button buttonMsub = new Button("M-");
	  buttonMsub.setMinSize(40, 40);
    gridpane.add(buttonMsub, 5, 12);

	  Button buttonDel = new Button("DEL");
	  buttonDel.setMinSize(40, 40);
    gridpane.add(buttonDel, 1, 14);
    
	  Button buttonCE = new Button("CE");
	  buttonCE.setMinSize(40, 40);
    gridpane.add(buttonCE, 2, 14);
  
	  Button buttonC = new Button("C");
	  buttonC.setMinSize(40, 40);
    gridpane.add(buttonC, 3, 14);
    
	  Button buttonPM = new Button("+/-");
	  buttonPM.setMinSize(40, 40);
    gridpane.add(buttonPM, 4, 14);
  
	  Button buttonSqrt = new Button("Sqrt");
	  buttonSqrt.setMinSize(40, 40);
    gridpane.add(buttonSqrt, 5, 14);
   
	  Button buttonSeven = new Button("7");
	  buttonSeven.setMinSize(40, 40);
    gridpane.add(buttonSeven, 1, 16);
    
	  Button buttonEight = new Button("8");
	  buttonEight.setMinSize(40, 40);
    gridpane.add(buttonEight, 2, 16);
    
	  Button buttonNine = new Button("9");
	  buttonNine.setMinSize(40, 40);
    gridpane.add(buttonNine, 3, 16);
    
	  Button buttonDivide = new Button("/");
	  buttonDivide.setMinSize(40, 40);
    gridpane.add(buttonDivide, 4, 16);
  
	  Button buttonPercent = new Button("%");
	  buttonPercent.setMinSize(40, 40);
    gridpane.add(buttonPercent, 5, 16);
   
	  Button buttonFour = new Button("4");
	  buttonFour.setMinSize(40, 40);
    gridpane.add(buttonFour, 1, 18);
   
	  Button buttonFive = new Button("5");
	  buttonFive.setMinSize(40, 40);
    gridpane.add(buttonFive, 2, 18);
  
	  Button buttonSix = new Button("6");
	  buttonSix.setMinSize(40, 40);
    gridpane.add(buttonSix, 3, 18);
  
	  Button buttonMultiply = new Button("*");
	  buttonMultiply.setMinSize(40, 40);
    gridpane.add(buttonMultiply, 4, 18);
  
	  Button button1dx = new Button("1/x");
	  button1dx.setMinSize(40, 40);
    gridpane.add(button1dx, 5, 18);
    
    Button buttonAdd = new Button("+");
	  buttonAdd.setMinSize(40, 40);
    gridpane.add(buttonAdd, 4, 21);
    
	  Button buttonOne = new Button("1");
	  buttonOne.setMinSize(40, 40);
    gridpane.add(buttonOne, 1, 20);
    
	  Button buttonTwo = new Button("2");
	  buttonTwo.setMinSize(40, 40);
    gridpane.add(buttonTwo,2,20);
    
	  Button buttonThree = new Button("3");
	  buttonThree.setMinSize(40, 40);
    gridpane.add(buttonThree, 3, 20);
	
	  Button buttonSub = new Button("-");
	  buttonSub.setMinSize(40, 40);
    gridpane.add(buttonSub, 4, 20);
  
	  Button buttonZero = new Button("0");
	  buttonZero.setMinSize(82, 40);
    gridpane.add(buttonZero, 1, 21, 2, 1);
 
	  Button buttonPoint = new Button(".");
	  buttonPoint.setMinSize(40, 40);
    gridpane.add(buttonPoint, 3, 21);
    
	  Button buttonEqual = new Button("=");
	  buttonEqual.setMinSize(40, 82);
    gridpane.add(buttonEqual, 5, 20, 1, 2);

	  HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
	
	  Scene scene = new Scene(group, 230, 401);
   
    group.getChildren().add(gridpane);
    group.getChildren().add(menuBar);
	
	  primaryStage.setTitle("My Calculator");
    primaryStage.setScene(scene);
	  primaryStage.setResizable(false);
    primaryStage.show(); 
  }
}
