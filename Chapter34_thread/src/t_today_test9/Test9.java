package t_today_test9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Test9 {
	public static void main(String[] args) {
        ThreadCount threadCount = new ThreadCount();
        threadCount.start();
        
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
        System.out.println("입력하신 값은 " + input + "입니다.");
	}

}

