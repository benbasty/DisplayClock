package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayClock extends Application {

    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + " : " + clock.getMinute() + " : " + clock.getSecond();

        Label currentTime = new Label(timeString);

        VBox pane = new VBox();
        HBox time = new HBox();
        time.getChildren().add(currentTime);
        pane.setPadding(new Insets(20,20,20,0));
        pane.getChildren().addAll(clock,time);
        time.setAlignment(Pos.BASELINE_CENTER);

        Scene scene = new Scene(pane,350,330);
        primaryStage.setTitle("Display CLock");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
