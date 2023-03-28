import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PixelSorting extends Frame{
   private Label labelCount;
   private TextField textFieldCount;
   private Button buttonCount;
   private int count = 0;

   public PixelSorting(){
       setLayout(new FlowLayout());

       labelCount = new Label("Count");
       add(labelCount);

       textFieldCount = new TextField(count + "", 10);
       textFieldCount.setEditable(false);
       add(textFieldCount);

       buttonCount = new Button("Count");
       add(buttonCount);

       ButtonCountListener listener = new ButtonCountListener();
       buttonCount.addActionListener(listener);

       setTitle("Pixel Sorting");
       setSize(300, 100);
       setVisible(true);
   }

   public static void main(String[] args){
       PixelSorting app = new PixelSorting();
   }

   private class ButtonCountListener implements ActionListener{
       @Override
       public void actionPerformed(ActionEvent event){
           ++count;
           textFieldCount.setText(count + "");
       }
   }
}