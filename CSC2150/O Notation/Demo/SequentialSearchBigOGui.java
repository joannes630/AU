import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SequentialSearchBigOGui
{
   public static String sequentialSearch(int[] array, int value)
   {
      int index = 0;        // Loop control variable
      int position = -1;     // Position the value is found at
      boolean found = false;    // Flag indicating search results
      String output = "";

     output += "Searcing for " + value + "\n\n";
     while (!found && index < array.length)
      {
         if (array[index] == value)
         {
            found = true;
            position = index;
         }
         output += "array[" + index + "] = " + array[index] + "\n";
         index++;
      }
      output += "Searched " + String.format("%,d", index) + " times\n\n";

      if (position != -1)
         output += "FOUND " + value + "\n";
      else
         output += "DID NOT FIND " + value + "\n";

      return output;
   }

   public static void showResults() {
      final int SIZE = 10_000;
      // Create a JFrame (window)
      JFrame frame = new JFrame("Sequential search demo");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400, 300);

      // Create a button to show the message
      JButton showButton = new JButton("Search for number in array of size " + String.format("%,d", SIZE));

      // Add an ActionListener to the button
      showButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // Create a JTextArea with scrollbars
            JTextArea textArea = new JTextArea(40, 30); // 10 rows and 30 columns
            textArea.setWrapStyleWord(true);
            textArea.setLineWrap(true);

            JScrollPane scrollPane = new JScrollPane(textArea);

            Random rand = new Random();
            int[] array = new int[SIZE];
            for(int i=0; i<SIZE; i++)
               array[i] = rand.nextInt(SIZE) + 1;

            String output;
            int searchNumber = rand.nextInt(SIZE) + 1;
            output = sequentialSearch(array, searchNumber);

            textArea.setText(output);

            // Show the message in a JOptionPane with a JScrollPane
            JOptionPane.showMessageDialog(frame, scrollPane, "Sequential search result", JOptionPane.PLAIN_MESSAGE);
         }
      });

      // Create a panel to hold the button
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      panel.add(showButton, BorderLayout.CENTER);

      // Add the panel to the frame
      frame.add(panel);

      // Display the frame
      frame.setVisible(true);
   }

   public static void main(String[] args)
   {
      showResults();
   }
}