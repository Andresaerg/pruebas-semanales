import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String title = "Reto #40, tabla de multiplicar";
        var message = JOptionPane.showInputDialog(null, "Por favor, ingrese el numero a multiplicar", title, 3);

        if(message == null)
            return;

        if(message != "" && message != null) {

            int number = Integer.parseInt(message);
    
            if(number > 0)
                JOptionPane.showMessageDialog(null, table(number), title, 1);
            else
                JOptionPane.showMessageDialog(null, "El numero debe ser mayor a cero (0)", title, 0);

        } else {

            JOptionPane.showMessageDialog(null, "Debe ingresar un valor", title, 0);

        }
    }

    private static String table(int number){
        
        String output = "";

        for(int i = 1; i <= 10; i++){
            int result = number * i;
            output += number+" x "+i+" = "+result+"\n";
        }

        return output;

    }
}
