

package form;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author welton
 */
public class Formulario extends javax.swing.JFrame {

    private final List<Senha> listaSenha;
    private int cont;
    

    public Formulario() {
        initComponents();
        this.listaSenha = new ArrayList<>(); 
        painelSenha.setText(listaSenha.toString());
        cont = 1;
       
    }
       
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPclientes = new javax.swing.JPanel();
        jBcomum = new javax.swing.JToggleButton();
        jLsuasenha = new javax.swing.JLabel();
        jLescolha = new javax.swing.JLabel();
        jBrapido = new javax.swing.JToggleButton();
        jBprioritario = new javax.swing.JToggleButton();
        senhaGerada = new javax.swing.JTextField();
        jLclientes = new javax.swing.JLabel();
        jPcaixas = new javax.swing.JPanel();
        jBcaixa1 = new javax.swing.JToggleButton();
        jBcaixa2 = new javax.swing.JToggleButton();
        jBcaixa3 = new javax.swing.JToggleButton();
        jBcaixa4 = new javax.swing.JToggleButton();
        jLcaixas = new javax.swing.JLabel();
        painelSenha = new javax.swing.JTextField();
        caixaTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPclientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(jBcomum);
        jBcomum.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jBcomum.setText("Comum");
        jBcomum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcomumMouseClicked(evt);
            }
        });
        jBcomum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcomumActionPerformed(evt);
            }
        });

        jLsuasenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLsuasenha.setText("Sua senha é:");

        jLescolha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLescolha.setText("Escolha o seu tipo de atendimento");

        buttonGroup1.add(jBrapido);
        jBrapido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jBrapido.setText("Rápido");
        jBrapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrapidoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jBprioritario);
        jBprioritario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jBprioritario.setText("Prioritário");
        jBprioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprioritarioActionPerformed(evt);
            }
        });

        senhaGerada.setEditable(false);
        senhaGerada.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        senhaGerada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaGerada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaGeradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPclientesLayout = new javax.swing.GroupLayout(jPclientes);
        jPclientes.setLayout(jPclientesLayout);
        jPclientesLayout.setHorizontalGroup(
            jPclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPclientesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLescolha)
                    .addGroup(jPclientesLayout.createSequentialGroup()
                        .addGroup(jPclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBcomum)
                            .addComponent(jLsuasenha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jBrapido))
                    .addComponent(senhaGerada, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPclientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBprioritario)
                .addGap(79, 79, 79))
        );
        jPclientesLayout.setVerticalGroup(
            jPclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPclientesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLescolha)
                .addGap(48, 48, 48)
                .addGroup(jPclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBprioritario)
                    .addComponent(jBcomum)
                    .addComponent(jBrapido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLsuasenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaGerada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLclientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLclientes.setText("Para clientes:");

        jPcaixas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup2.add(jBcaixa1);
        jBcaixa1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jBcaixa1.setText("Caixa 1");
        jBcaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcaixa1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jBcaixa2);
        jBcaixa2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jBcaixa2.setText("Caixa 2");
        jBcaixa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcaixa2MouseClicked(evt);
            }
        });
        jBcaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcaixa2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jBcaixa3);
        jBcaixa3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jBcaixa3.setText("Caixa 3");
        jBcaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcaixa3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jBcaixa4);
        jBcaixa4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jBcaixa4.setText("Caixa 4");
        jBcaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcaixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPcaixasLayout = new javax.swing.GroupLayout(jPcaixas);
        jPcaixas.setLayout(jPcaixasLayout);
        jPcaixasLayout.setHorizontalGroup(
            jPcaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcaixasLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPcaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBcaixa1)
                    .addComponent(jBcaixa3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPcaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBcaixa4)
                    .addComponent(jBcaixa2))
                .addGap(49, 49, 49))
        );
        jPcaixasLayout.setVerticalGroup(
            jPcaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcaixasLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPcaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcaixa1)
                    .addComponent(jBcaixa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPcaixasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcaixa4)
                    .addComponent(jBcaixa3))
                .addGap(55, 55, 55))
        );

        jLcaixas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLcaixas.setText("Para caixas:");

        painelSenha.setEditable(false);
        painelSenha.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        painelSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        painelSenha.setBorder(null);
        painelSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelSenhaActionPerformed(evt);
            }
        });

        caixaTipo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        caixaTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caixaTipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLclientes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLcaixas)
                            .addComponent(jPcaixas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(caixaTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caixaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcaixas)
                    .addComponent(jLclientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPcaixas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcaixa1ActionPerformed
   
  Iterator<Senha> itr = this.listaSenha.iterator();
          
  
        while (itr.hasNext()) {
        Senha s = itr.next();
        if(s.getTipo() == 'P'){
            painelSenha.setText(s.toString());
            caixaTipo.setText("Caixa 1");
            itr.remove();
            return;
           }   
        }
        
         Iterator<Senha> itr2 = this.listaSenha.iterator();
         if(listaSenha.size()>0){
            while(itr2.hasNext()){
                Senha r = itr2.next();
                painelSenha.setText(r.toString());
                caixaTipo.setText("Caixa 1");
                itr2.remove();
                break;
     
            }
      }
    }//GEN-LAST:event_jBcaixa1ActionPerformed
                 

    private void jBprioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprioritarioActionPerformed
        
        Senha p = new Senha();   
   
        p.setTipo('P');
        p.setNumero(cont++);
        
        listaSenha.add(p);
        senhaGerada.setText(p.toString());
        
    }//GEN-LAST:event_jBprioritarioActionPerformed
          
    private void senhaGeradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaGeradaActionPerformed
     
      
    }//GEN-LAST:event_senhaGeradaActionPerformed

    private void jBrapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrapidoActionPerformed
        
        
        Senha r = new Senha();        
       
        r.setTipo('R');
        r.setNumero(cont++);
       
        listaSenha.add(r);
        senhaGerada.setText(r.toString());
       
    }//GEN-LAST:event_jBrapidoActionPerformed

    private void jBcaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcaixa2ActionPerformed
    Iterator<Senha> itr = this.listaSenha.iterator();
        
        while (itr.hasNext()) {
        Senha s = itr.next();
        if (s.getTipo() == 'R'){ 
        painelSenha.setText(s.toString());
        caixaTipo.setText("Caixa 2");
        itr.remove();
        return;
        }
      }
         Iterator<Senha> itr2 = this.listaSenha.iterator();
        if(listaSenha.size()>0){
            while(itr2.hasNext()){
                Senha r = itr2.next();
                painelSenha.setText(r.toString());
                caixaTipo.setText("Caixa 2");
                itr2.remove();
                break;
         
      }
        }
    }//GEN-LAST:event_jBcaixa2ActionPerformed

    private void jBcaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcaixa3ActionPerformed
     Iterator<Senha> itr = this.listaSenha.iterator();
       
        while (itr.hasNext()) {
        Senha s = itr.next();
        if (s.getTipo() == 'R'){ 
        painelSenha.setText(s.toString());
        caixaTipo.setText("Caixa 3");
        itr.remove();
        return;
        }
      }
         Iterator<Senha> itr2 = this.listaSenha.iterator();
            if(listaSenha.size()>0){
            while(itr2.hasNext()){
                Senha r = itr2.next();
                painelSenha.setText(r.toString());
                caixaTipo.setText("Caixa 3");
                itr2.remove();
                break;
         
             }
            }
    }//GEN-LAST:event_jBcaixa3ActionPerformed

    private void jBcaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcaixa4ActionPerformed
    Iterator<Senha> itr = this.listaSenha.iterator();
        
        while (itr.hasNext()) {
        Senha s = itr.next();
        if (s.getTipo() == 'C'){ 
        painelSenha.setText(s.toString());
        caixaTipo.setText("Caixa 4");
        itr.remove();
        return;
        }
      }
        
        Iterator<Senha> itr2 = this.listaSenha.iterator();
        if(listaSenha.size()>0){
            while(itr2.hasNext()){
                Senha r = itr2.next();
                painelSenha.setText(r.toString());
                caixaTipo.setText("Caixa 4");
                itr2.remove();
                break;
            }
       
      }
    }//GEN-LAST:event_jBcaixa4ActionPerformed

    private void painelSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelSenhaActionPerformed
        
    }//GEN-LAST:event_painelSenhaActionPerformed

    private void jBcaixa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcaixa2MouseClicked
    
    }//GEN-LAST:event_jBcaixa2MouseClicked

    private void jBcomumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcomumActionPerformed

        Senha c = new Senha();

        c.setTipo('C');
        c.setNumero(cont++);

        listaSenha.add(c);
        senhaGerada.setText(c.toString());

    }//GEN-LAST:event_jBcomumActionPerformed

    private void jBcomumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcomumMouseClicked

    }//GEN-LAST:event_jBcomumMouseClicked
  
  
        
    public static void main(String args[]) {
        
        
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
                  
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel caixaTipo;
    private javax.swing.JToggleButton jBcaixa1;
    private javax.swing.JToggleButton jBcaixa2;
    private javax.swing.JToggleButton jBcaixa3;
    private javax.swing.JToggleButton jBcaixa4;
    private javax.swing.JToggleButton jBcomum;
    private javax.swing.JToggleButton jBprioritario;
    private javax.swing.JToggleButton jBrapido;
    private javax.swing.JLabel jLcaixas;
    private javax.swing.JLabel jLclientes;
    private javax.swing.JLabel jLescolha;
    private javax.swing.JLabel jLsuasenha;
    private javax.swing.JPanel jPcaixas;
    private javax.swing.JPanel jPclientes;
    private javax.swing.JTextField painelSenha;
    private javax.swing.JTextField senhaGerada;
    // End of variables declaration//GEN-END:variables
}
