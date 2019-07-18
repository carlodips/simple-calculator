package dipasupil.carlo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


public class Controller {

    @FXML
    private TextArea inputArea;
    @FXML
    private TextArea answerArea;

    //solve equations using javascript
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");

    String input = "";
    int answer = 0;

    public void pressNumber1(ActionEvent event){
        System.out.println("You pressed 1");
        input = input + "1";
        inputArea.setText(input);
    }
    public void pressNumber2(ActionEvent event){
        System.out.println("You pressed 2");
        input = input + "2";
        inputArea.setText(input);
    }
    public void pressNumber3(ActionEvent event){
        System.out.println("You pressed 3");
        input = input + "3";
        inputArea.setText(input);
    }
    public void pressNumber4(ActionEvent event){
        System.out.println("You pressed 4");
        input = input + "4";
        inputArea.setText(input);
    }
    public void pressNumber5(ActionEvent event){
        System.out.println("You pressed 5");
        input = input + "5";
        inputArea.setText(input);
    }
    public void pressNumber6(ActionEvent event){
        System.out.println("You pressed 6");
        input = input + "6";
        inputArea.setText(input);
    }
    public void pressNumber7(ActionEvent event){
        System.out.println("You pressed 7");
        input = input + "7";
        inputArea.setText(input);
    }
    public void pressNumber8(ActionEvent event){
        System.out.println("You pressed 8");
        input = input + "8";
        inputArea.setText(input);
    }
    public void pressNumber9(ActionEvent event){
        System.out.println("You pressed 9");
        input = input + "9";
        inputArea.setText(input);
    }
    public void pressNumber0(ActionEvent event){
        System.out.println("You pressed 0");
        input = input + "0";
        inputArea.setText(input);
    }
    public void pressPlus(ActionEvent event){
        System.out.println("You pressed +");
        input = input + "+";
        inputArea.setText(input);
    }
    public void pressMinus(ActionEvent event){
        System.out.println("You pressed -");
        input = input + "-";
        inputArea.setText(input);
    }
    public void pressMultiply(ActionEvent event){
        System.out.println("You pressed *");
        input = input + "*";
        inputArea.setText(input);
    }
    public void pressDivide(ActionEvent event){
        System.out.println("You pressed /");
        input = input + "/";
        inputArea.setText(input);

    }
    public void pressDelete(ActionEvent event){
        System.out.println("You pressed Del");
        input = input.substring(0, input.length() - 1);
        inputArea.setText(input);
    }
    public void pressClear(ActionEvent event){
        System.out.println("You pressed Clear");
        input = "";
        inputArea.clear();
        answerArea.setText("0");
    }

    //Compute
    public void pressEqual(ActionEvent event) throws ScriptException{
        System.out.println("You pressed equal");
        String answer = engine.eval(input).toString();
        answerArea.setText(answer);
        input = answer;
        inputArea.clear();

    }




}
