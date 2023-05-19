import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Событие - это действие юзера и можно обработать это событие
//Чтобы можно было реагировать на событие, события нужно зарегистрировать

public class TestWindow extends JFrame {
    private JLabel text1,text2,textResult;
    private JTextField pole1,pole2;
    private JButton button;
    public TestWindow() throws HeadlessException {
        setTitle("Первое окно");
        setSize(350,400);//размер окна
        setLocationRelativeTo(null);//для размещения окна по центру
        setDefaultCloseOperation(EXIT_ON_CLOSE);//завершаем программу по клику на крестик в окне
//        setBounds(200,100,500,500);
        setResizable(false);//запрет менять размеры окна

        text1 = getLabelWithVisualEffects("Первое число");
        text2 = getLabelWithVisualEffects("Второе число");
        textResult = getLabelWithVisualEffects("");
        button = new JButton("ОК");
//        addActionListener - слушатель клика мышки на кнопку
//        Метод ожидает объект, который активируется по клику и выполняет какое-либо действие


        Container c = getContentPane();//получили контейнер
//        Контейнер требует настройки менеджера размещения
//        FlowLayout - размещение компонентов слева направо
        c.setLayout(new FlowLayout(FlowLayout.CENTER,20,50));

        pole1 = new JTextField(10);
        pole2 = new JTextField(10);

        c.add(text1);
        c.add(pole1);
        c.add(text2);
        c.add(pole2);
        c.add(button);
        c.add(textResult);


        MyListener myListener = new MyListener();//myListener - слушатель события
        button.addActionListener(myListener);//регистрация слушателя

        setVisible(true);//сделали окно видимым
    }

    public class MyListener implements ActionListener {
//        Внутренние классы могут обращаться в том числе и приватным
//        полям внешнего класса
        @Override
        public void actionPerformed(ActionEvent e) {//метод запустится по клику на кнопку
            int number1 = Integer.parseInt(pole1.getText());//получили введенное число в первое поле
            int number2 = Integer.parseInt(pole2.getText());//получили введенное число во второе поле
            int res = number1 + number2;
//            JOptionPane.showMessageDialog(null,res + "");
            textResult.setText(res + "");
        }
    }

    static JLabel getLabelWithVisualEffects(String text){
        JLabel label = new JLabel(text);
        label.setForeground(Color.RED);
        label.setFont(new Font("verdana",Font.BOLD | Font.ITALIC,20));
        return label;
    }

    public static void main(String[] args) {
        TestWindow window = new TestWindow();
    }

    public JLabel getText1() {
        return text1;
    }

    public JLabel getText2() {
        return text2;
    }

    public JTextField getPole1() {
        return pole1;
    }

    public JTextField getPole2() {
        return pole2;
    }

    public JButton getButton() {
        return button;
    }
}
