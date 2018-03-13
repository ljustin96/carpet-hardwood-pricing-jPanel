import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FinalWhichChoice extends JFrame{

   private Container contentPane;
   private JLabel messageLabel;    // To display a message
   private JButton hardwoodButton;      
   private JButton carpetButton;       
   private JButton bothButton;     
   private JPanel panel1;           // A panel to hold components
   private JPanel panel2;
   private JPanel panel3;
   private final int WINDOW_WIDTH = 500; // Window width
   private final int WINDOW_HEIGHT = 150; // Window height
   int result = 0;
   String option1;
   String option2;
   
   public FinalWhichChoice(String one, String two)
   {
   option1 = one;
   option2 = two;
   // Set the title bar text.
      setTitle("Floor Chooser");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Add a BorderLayout manager to the content pane.
      contentPane = getContentPane();
      contentPane.setLayout(new BorderLayout());
      
      // Create a label.
      messageLabel = new JLabel("Choose the type of floor you want priced.");


      hardwoodButton = new JButton("Hardwood");
      
      carpetButton = new JButton("Carpet");
      
      bothButton = new JButton("Both");
      
      
      // Register an event listener with all 4 buttons.
      hardwoodButton.addActionListener(new HardwoodButtonListener());
      carpetButton.addActionListener(new CarpetButtonListener());
      bothButton.addActionListener(new BothButtonListener());
      
      // Create a first panel and add the components to it.
      panel1 = new JPanel();
      panel1.add(messageLabel);
      
      // Create a second panel and add the components to it.
      panel2 = new JPanel();
      panel2.add(hardwoodButton);
      panel2.add(carpetButton);
      panel2.add(bothButton);
      
      // Create a first panel and add the components to it.
      panel3 = new JPanel();

      // Add the panels to the content pane.
      add(panel1, BorderLayout.NORTH);
      add(panel2, BorderLayout.CENTER);
      add(panel3, BorderLayout.SOUTH);
      // Display the window.
      setVisible(true);

   }
   
   public FinalWhichChoice()
   {
   
      // Set the title bar text.
      setTitle("Floor Chooser");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Add a BorderLayout manager to the content pane.
      contentPane = getContentPane();
      contentPane.setLayout(new BorderLayout());
      
      // Create a label.
      messageLabel = new JLabel("Choose the type of floor you want priced.");


      hardwoodButton = new JButton("Hardwood");
      
      carpetButton = new JButton("Carpet");
      
      bothButton = new JButton("Both");
      
      
      // Register an event listener with all 4 buttons.
      hardwoodButton.addActionListener(new HardwoodButtonListener());
      carpetButton.addActionListener(new CarpetButtonListener());
      bothButton.addActionListener(new BothButtonListener());
      
      // Create a first panel and add the components to it.
      panel1 = new JPanel();
      panel1.add(messageLabel);
      
      // Create a second panel and add the components to it.
      panel2 = new JPanel();
      panel2.add(hardwoodButton);
      panel2.add(carpetButton);
      panel2.add(bothButton);
      
      // Create a first panel and add the components to it.
      panel3 = new JPanel();

      // Add the panels to the content pane.
      add(panel1, BorderLayout.NORTH);
      add(panel2, BorderLayout.CENTER);
      add(panel3, BorderLayout.SOUTH);
      // Display the window.
      setVisible(true);
   }
   
     private class HardwoodButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println(option1);
        System.exit(1);
      }
   }
   
    private class CarpetButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.out.println(option2);
         System.exit(1);
      }
   }
   
    private class BothButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.out.println(option1);
         System.out.println(option2);
         System.exit(1);
      }
   }

   public static void main(String[] args)
   {
      FinalWhichChoice em = new FinalWhichChoice();
   }
   

      
}



