
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Helloworld extends Application {
    public static void main(String[] args) {
        launch(args);//will call javafx constructor
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn = new Button("Click Me");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene=new Scene(root,500,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}