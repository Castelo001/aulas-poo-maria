import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
     int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 10 para visualisar tabuada: "));
        int i;
        for (i=0;i<=10 ;i++ ) {
            System.out.println(num + "*"+i+"="+num*i);
        }
    }
}