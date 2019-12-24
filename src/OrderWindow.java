import javax.swing.*;

public class OrderWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("OrderWindow");
        frame.setContentPane(new OrderWindow().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton menu1;
    private JButton menu2;
    private JButton menu3;
    private JButton menu4;
    private JButton menu5;
    private JButton menu10;
    private JButton menu9;
    private JButton menu8;
    private JButton menu7;
    private JButton menu11;
    private JButton menu12;
    private JButton menu13;
    private JButton menu14;
    private JButton comfirm;
    private JButton menu6;
    private JPanel Panel1;
    private JButton 早餐店Button;
}
