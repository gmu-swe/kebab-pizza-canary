import javax.swing.JComboBox;


public class Foo {

	public static void main(String[] args) {
        final JComboBox modesCombobox = new JComboBox<>();
        modesCombobox.setSelectedIndex(0);
        modesCombobox.addActionListener(e -> {
//            model.setParseMode((ParseMode) modesCombobox.getSelectedItem());
//            reloadAction.actionPerformed(null);
        	System.out.println("Hello!");
        });
	}
}
