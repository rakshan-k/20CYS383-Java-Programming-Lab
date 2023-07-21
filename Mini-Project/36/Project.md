# 20CYS383 Java Programming Lab
![](https://img.shields.io/badge/Batch-21CYS-lightgreen) ![](https://img.shields.io/badge/UG-blue) ![](https://img.shields.io/badge/Subject-JPL-blue)
 
## Time Tracker+

### Project Description

<p text-align: justify;>TimeTracker+ is an advanced time management and productivity enhancement tool built with Java's Swing library. It offers a sleek and intuitive user interface with a real-time timer, task categorization, and progress tracking. Users can efficiently manage their workflow, track time spent on different tasks, and set productivity goals. Additionally, TimeTracker+ includes a leaderboard feature that fosters healthy competition among users, encouraging them to achieve higher ranks based on their accomplishments. This open-source project aims to improve time management and boost productivity, making it a valuable tool for individuals and teams seeking efficient task tracking and improved time allocation.</p>

### Module Split-up

| Name | Topic |
|------|-------|
| Ashwatha Prasad | File Management |
| Nithya Pranav | Algorithm implementations in Java, LeaderboardUI class |
| Rakshan | TimeTrackerUI Class |

### Code

```
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class LeaderboardUI extends JFrame {
    private JTable leaderboardTable;

    public LeaderboardUI(Object[][] leaderboardData, String[] columnNames) {
        setTitle("Leaderboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Leaderboard table
        DefaultTableModel tableModel = new DefaultTableModel(leaderboardData, columnNames);
        leaderboardTable = new JTable(tableModel);
        leaderboardTable.setGridColor(Color.LIGHT_GRAY);

        // Center-align the content in the cells
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        leaderboardTable.setDefaultRenderer(Object.class, renderer);

        JScrollPane scrollPane = new JScrollPane(leaderboardTable);
        add(scrollPane, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Example data for the leaderboard
                Object[][] leaderboardData = {
                        {"1", "John", "10"},
                        {"2", "Emma", "8"},
                        {"3", "David", "7"},
                        {"4", "Sophia", "6"},
                        {"5", "James", "5"}
                };
                String[] columnNames = {"Rank", "Name", "Score"};

                new LeaderboardUI(leaderboardData, columnNames);
            }
        });
    }
}

#Time TrackerUI class

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeTrackerUI extends JFrame {
    private JLabel timerLabel;
    private JButton startButton;
    private JButton stopButton;
    private JComboBox<String> categoryComboBox;

    public TimeTrackerUI() {
        setTitle("Time Tracker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Timer label
        timerLabel = new JLabel("00:00:00");
        timerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timerLabel);

        // Start button
        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });
        add(startButton);

        // Stop button
        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });
        add(stopButton);

        // Category selection
        String[] categories = {"Work", "Study", "Exercise", "Break"};
        categoryComboBox = new JComboBox<>(categories);
        add(categoryComboBox);

        pack();
        setVisible(true);
    }

    private void startTimer() {
        // TODO: Implement timer logic
    }

    private void stopTimer() {
        // TODO: Implement timer stop logic
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TimeTrackerUI();
            }
        });
    }
}

````


### Demo

 <p align="center">
 <img width="479" alt="MainFrame" src="Assets/demo.png">
 </p>

 #### Subdomain Finder

<p align="center">
 <img width="458" alt="SubDomain" src="Assets/S1.png">
</p>

 ##### Results
 
<p align="center">
 <img width="458" alt="SubDomainResults" src="Assets/S2.png">
</p>

 #### Link Scrper

<p align="center">
 <img width="579" alt="LinkScraper" src="Assets/S3.png">
</p>

 ##### Results

<p align="center">
 <img width="900" alt="LinkScraperResults" src="Assets/S4.png">
</p>

 #### Port Scanner

<p align="center">
 <img width="479" alt="PortScanner" src="Assets/S5.png">
</p>

##### Results

<p align="center">
<img width="765" alt="PortScannerResults" src="Assets/S6.png">
</p>

#### Download Results

<p align="center">
<img width="572" alt="DownloadResults" src="Assets/S7.png">
</p>
