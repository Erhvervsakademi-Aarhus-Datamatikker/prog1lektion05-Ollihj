package opgave01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {
    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
        // Replace the statement here with your code.
        int x = 100;
        int y = 75;

        int horrizontal = 20;
        int vertical = 8;

        gc.strokeLine(x,y,x+horrizontal,y-vertical);
        gc.strokeLine(x,y,x+horrizontal,y+vertical);

        x = 100;
        y = 125;

        gc.strokeLine(x,y,x+horrizontal,y-vertical);
        gc.strokeLine(x,y,x+horrizontal,y+vertical);

        x = 20;
        y = 50;

        gc.strokeLine(x,y,x+horrizontal,y-vertical);
        gc.strokeLine(x,y,x+horrizontal,y+vertical);

    }
}
