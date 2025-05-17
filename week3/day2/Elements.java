package week3.day2;

class Elements extends Button {
    public static void main(String[] args) {

        // Button usage
        Button btn = new Button();
        btn.click();
        btn.setText("Button text");
        btn.submit();

        // TextField usage
        TextField tf = new TextField();
        tf.click();
        tf.setText("TextField text");
        tf.getText();

        // CheckBoxButton usage
        CheckButton cb = new CheckButton();
        cb.click();
        cb.setText("Checkbox text");
        cb.clickCheckButton();

        // RadioButton usage
        RadioButton rb = new RadioButton();
        rb.click();
        rb.setText("Radio text");
        rb.selectRadioButton();

        // Elements usage
        Elements el = new Elements();
        el.click();
        el.setText("Element text");
        el.submit();
    }
}
