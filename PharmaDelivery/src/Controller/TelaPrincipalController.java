
package Controller;

import View.TelaLogin;
import View.TelaClientes;
import View.TelaPedidos;
import View.TelaProdutos;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author WILK TEIXEIRA
 */
public class TelaPrincipalController {
    
    static boolean tempTelaAtiva = false;
    TelaLogin telaLogin = new TelaLogin();
    TelaClientes telaClientes = new TelaClientes();
    TelaPedidos telaPedidos = new TelaPedidos();
    TelaProdutos telaProdutos = new TelaProdutos();
    
    public void botaoTelaClientes(JDesktopPane telaInterna){
        if(tempTelaAtiva == false){
            telaInterna.add(telaClientes);
            telaClientes.setVisible(true);
            tempTelaAtiva = true;            
        }else{
            JOptionPane.showMessageDialog(null, "Finalize sua atividade antes de começar outra!");
        } 
    }
    
    public void botaoTelaPedidos(JDesktopPane telaInterna){
        if(tempTelaAtiva == false){
            telaInterna.add(telaPedidos);
            telaPedidos.setVisible(true);
            tempTelaAtiva = true;
        }else{
            JOptionPane.showMessageDialog(null, "Finalize sua atividade antes de começar outra!");
        }
    }
    
    public void botaoTelaProdutos(JDesktopPane telaInterna){        
        if(tempTelaAtiva == false){            
            telaInterna.add(telaProdutos);
            telaProdutos.setVisible(true);
            tempTelaAtiva = true;           
        }else{
            JOptionPane.showMessageDialog(null, "Finalize sua atividade antes de começar outra!");
        }  
    }
    
    public void botaoDeslogar(JFrame tela){
        if(JOptionPane.showConfirmDialog(null, "DESEJA DESLOGAR DO SISTEMA?", "CONFIRMAÇÃO", 0) == 0){
            tela.dispose();
            new TelaLogin().show();
            tempTelaAtiva = false;
        }        
    }
    
    public void botaoSair(){
        if(JOptionPane.showConfirmDialog(null, "DESEJA SAIR DO SISTEMA?", "CONFIRMAÇÃO", 0) == 0){
            System.exit(0); 
        }
    }
    
}
