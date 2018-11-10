package applicationTwo;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

public class TwoController{
    @FXML
    private CheckBox HanBox;

    @FXML
    private CheckBox PineappleBox;

    @FXML
    private CheckBox CheeseBox;

    @FXML
    private Button OrderBtn;

    @FXML
    private Label PizzaOrderLabel;
    
    @FXML
    private ChoiceBox<String> ChoiceBox;

    @FXML
    private Button ChBtn;

    @FXML
    private Label ChLabel;
    
    @FXML
    private Label ComboBoxLabel;

    @FXML
    private ComboBox<String> ComboBox; 

    @FXML
    private Label CBLabel;
    
    @FXML
    private RadioButton r1;

    @FXML
    private RadioButton r2;

    @FXML
    private RadioButton r3;

    @FXML
    private RadioButton r4;
    
    @FXML
    private ListView<String> listView;
    
    @FXML
    private TextArea textArea;
    

    @FXML
    private Label RLabel;
    
    private ToggleGroup flToggleGroup;
    
    @FXML
    private void initialize() {
    	ChLabel.setText("");
    	CBLabel.setText("");
    	RLabel.setText("Hi I am radio!!!");
    	ChoiceBox.getItems().add("Apple");
    	ChoiceBox.getItems().add("banana");
    	ChoiceBox.getItems().addAll("pears","orange");
    	ChoiceBox.setValue("apple");
    	flToggleGroup = new ToggleGroup();
    	this.r1.setToggleGroup(flToggleGroup);
    	this.r2.setToggleGroup(flToggleGroup);
    	this.r3.setToggleGroup(flToggleGroup);
    	this.r4.setToggleGroup(flToggleGroup);
    	
    	//Combo box configure
    	
    	ComboBox.getItems().add("COMP1030");
    	ComboBox.getItems().addAll("1001","1002","1003");
    	
    	//ListView items 
    	listView.getItems().addAll("Golf Ball", "Tees", "Drive","Putter");
    	listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
    
    public void radioChange() {
    	if(this.flToggleGroup.getSelectedToggle().equals(this.r1))
    		RLabel.setText("This is r1");
    	if(this.flToggleGroup.getSelectedToggle().equals(this.r2))
    		RLabel.setText("This is r2");
    	if(this.flToggleGroup.getSelectedToggle().equals(this.r3))
    		RLabel.setText("This is r3");
    	if(this.flToggleGroup.getSelectedToggle().equals(this.r4))
    		RLabel.setText("This is r4");
    }
    
    public void comboBoxUpdated() {

    	this.CBLabel.setText("Course selected: \n" + ComboBox.getValue().toString());
    }
    
    public void choiceBoxBtnPushed() {
    	ChLabel.setText("My favourate fruit is: \n" + ChoiceBox.getValue().toString());
    }
    
    @FXML
    public void makeOrder() {
    	String order = "Toppings are: ";
    	if(PineappleBox.isSelected())
    		order += "\nPineapple";
    	
    	if(HanBox.isSelected())
    		order += "\nHan";
    	
    	if(CheeseBox.isSelected())
    		order += "\nCheese";
    	
    	this.PizzaOrderLabel.setText(order);
    }
    
//    Method will copy the string from the listView and put them in the text area
    @FXML
    
    public void listViewButtonPushed() {
    	String textAreaString = "";
    	ObservableList<String> listOfItems = listView.getSelectionModel().getSelectedItems();
    	for(String item : listOfItems) {
    		textAreaString += String.format("%s%n", (String) item);
    	}
    	this.textArea.setText(textAreaString);
    }
    
    
}
