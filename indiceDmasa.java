import javax.swing.JOptionPane;

public class indiceDmasa {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Escriba su peso en kg"));

        double estatura =  Double.parseDouble(JOptionPane.showInputDialog("Escriba altura en metros"));

        double imc = peso / (Math.pow(estatura, 2));

        if (imc < 18.5){
            JOptionPane.showMessageDialog(null,"Su indice de masa corporal está por de bajo de lo normal, debe alimentarce.");
        }else if(imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null,"Felicidades!!!. \nSu indice de masa corporal es adecuado.");
        }else if(imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null,"Su indice de masa corporal está en el rango de sobrepeso, debe hacer dieta.");
        }else {
            JOptionPane.showMessageDialog(null,"Su indice de masa corporal esta esta en el rango de obecidad, haga dieta de inmediato.");
        }


    }
}
