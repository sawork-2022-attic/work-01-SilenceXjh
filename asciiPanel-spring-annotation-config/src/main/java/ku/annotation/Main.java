package ku.annotation;

import ku.annotation.asciiPanel.AsciiPanel;

import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main extends JFrame{

    private ApplicationContext context = new ClassPathXmlApplicationContext("config-annotation.xml");

    private static AsciiPanel terminal;

    public Main() {
        super();
        terminal = context.getBean(AsciiPanel.class);
        add(terminal);
        pack();
        repaint();
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        System.out.println(terminal.getAsciiFont().getFontFilename());
    }
}