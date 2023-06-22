import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MissedP3TextEditor extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton save;
    private JButton load;

    public MissedP3TextEditor() {
        setTitle("Simple Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 550);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        save = new JButton("Save File");
        load = new JButton("Load File");

        save.addActionListener(this);
        load.addActionListener(this);

        JPanel button = new JPanel();
        button.add(save);
        button.add(load);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(new JScrollPane(textArea), BorderLayout.CENTER);
        container.add(button, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            saveFile(); // Call saveFile() method when the save button is clicked
        } else if (e.getSource() == load) {
            loadFile(); // Call loadFile() method when the load button is clicked
        }
    }

    private void saveFile() {
        String fileName = JOptionPane.showInputDialog(this, "Enter file name:");
        if (fileName != null && !fileName.trim().isEmpty()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(textArea.getText()); // Write the content of the textArea to the file
                JOptionPane.showMessageDialog(this, "File saved successfully.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void loadFile() {
        String fileName = JOptionPane.showInputDialog(this, "Enter file name:");
        if (fileName != null && !fileName.trim().isEmpty()) {
            try (BufferedReader readingfile = new BufferedReader(new FileReader(fileName))) {
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = readingfile.readLine()) != null) {
                    content.append(line).append("\n"); // Read each line from the file and append it to the content StringBuilder
                }
                textArea.setText(content.toString()); // Set the textArea's content to the loaded file content
                JOptionPane.showMessageDialog(this, "File loaded successfully.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error loading file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MissedP3TextEditor textEditor = new MissedP3TextEditor();
            textEditor.setVisible(true);
        });
    }
}
