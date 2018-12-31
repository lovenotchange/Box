package mybox;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import javax.swing.*;

/**
 * Created by fox-forever on 2018/12/31.
 */
public class MainFrame extends JFrame{

    public MainFrame(){
        init();

    }

    private void init(){
        this.setTitle("music");
        this.setLocation(100,100);
        this.setResizable(false);
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String args[]){
       MainFrame frame = new MainFrame();

    }


}
