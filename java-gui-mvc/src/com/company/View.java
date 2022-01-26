package com.company;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View<listener, str> {
    private JFrame frame;

    private JLabel label;
    private JTextField text;
    private JButton button;

    public View() {
        //Khởi tạo cửa sổ
        frame = new JFrame("Titlebar Name");  //Chuỗi sẽ nằm trong thanh tiêu đề của cửa sổ
        frame.setSize(800, 600);    // Kích thước cửa sổ
        frame.setLayout(null);                  // Chỉ cần đặt nó thành null
        frame.setVisible(true);                 // Đặt nó thành true (mặc định được đặt thành false)

        // Theo mặc định, nút đóng [x] sẽ không làm gì cả
        // chúng ta phải đặt nó thành JFrame.EXIT_ON_CLOSE, điều này sẽ
        // đóng cửa sổ đúng cách
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Thành phần đơn giản
        // JLabel - Thêm văn bản không thể chỉnh sửa vào cửa sổ của bạn

        label = new JLabel("Hello");   // Bạn có thể khởi tạo nhãn bằng văn bản
        // hoặc bạn có thể làm một label.setText ({String}); để thay đổi giá trị của nó
        label.setBounds(100, 100, 100, 25);     // Đặt vị trí và kích thước của thành phần vào cửa sổ
        frame.add(label);        // Cùng một quy trình thêm vào khung

        // JTextField - Thêm một trường văn bản vào cửa sổ của bạn
        text = new JTextField();        // Bạn cũng có thể thực hiện một JTextField ({String}) để thêm một chuỗi ban đầu vào trường văn bản của bạn
        text.setBounds(100, 200, 100, 25);
        frame.add(text);            // Cùng một quy trình thêm vào khung

        // JButton - Thêm một nút có thể làm điều gì đó khi được nhấp vào
        button = new JButton("CLICK ME");
        button.setBounds(100,300,100,25);
        frame.add(button);

        frame.revalidate();
        frame.repaint();
    }


    public String getText() {
        return text.getText();
    }


    public void setLabelText(String str) {
        label.setText(str);
    }


    public void addButtonActionListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}
