//Annas Abdurrahman
//M0519017 Kelas A
package Notepad;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.*;
import java.io.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public class Notepad extends javax.swing.JFrame {
    //IDE Netbeans JavaSwing
    //Tempat isian teks merupakan object JTextArea bernama textField
    
    //Membuat filter tipe file untuk dialog save dan open
    FileNameExtensionFilter fileType = new FileNameExtensionFilter("Text file (*.txt)", "txt");
    //Boolean apakah text telah diedit
    Boolean edited = false;
    
    public Notepad() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);              //Membuat tidak ada operasi yang dilakukan saat close diklik
        addWindowListener(new WindowAdapter() {                                 //Membuat listener window
            @Override
            public void windowClosing(WindowEvent we){                          //Event saat window closing
                if(edited == false){                                            //Maka akan dicek apakah telah teredit
                   System.exit(0);                                              //Jika tidak maka langsung close
                }
                else{                                                           //Jika sudah teredit maka menampilkan dialog konfirmasi
                    int result = JOptionPane.showOptionDialog(Notepad.this, 
                        "Simpan dahulu berkas teks saat ini sebelum ditutup?", 
                        "Notepad", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                        switch(result){
                            case JOptionPane.YES_OPTION:
                                saveFile();
                                if(edited == false) System.exit(0);
                                break;
                            case JOptionPane.NO_OPTION:
                                System.exit(0);
                                break;
                            case JOptionPane.CLOSED_OPTION:
                                break;
                        }           
               }
            }
        });
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textField = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        pmenuFile = new javax.swing.JMenu();
        menuNew = new javax.swing.JMenuItem();
        menuOpen = new javax.swing.JMenuItem();
        menuSave = new javax.swing.JMenuItem();
        pmenuEdit = new javax.swing.JMenu();
        menuSelectAll = new javax.swing.JMenuItem();
        menuCopy = new javax.swing.JMenuItem();
        menuCut = new javax.swing.JMenuItem();
        menuPaste = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Untitled - Notepad");
        setMinimumSize(new java.awt.Dimension(500, 420));
        setName("Notepad"); // NOI18N

        textField.setColumns(20);
        textField.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        textField.setRows(5);
        textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textField);

        pmenuFile.setText("File");

        menuNew.setText("New");
        menuNew.setIconTextGap(0);
        menuNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuNewMousePressed(evt);
            }
        });
        pmenuFile.add(menuNew);

        menuOpen.setText("Open");
        menuOpen.setIconTextGap(0);
        menuOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuOpenMousePressed(evt);
            }
        });
        pmenuFile.add(menuOpen);

        menuSave.setText("Save As...");
        menuSave.setIconTextGap(0);
        menuSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuSaveMousePressed(evt);
            }
        });
        pmenuFile.add(menuSave);

        jMenuBar1.add(pmenuFile);

        pmenuEdit.setText("Edit");
        pmenuEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pmenuEditMousePressed(evt);
            }
        });

        menuSelectAll.setText("Select All");
        menuSelectAll.setToolTipText("");
        menuSelectAll.setIconTextGap(0);
        menuSelectAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuSelectAllMousePressed(evt);
            }
        });
        pmenuEdit.add(menuSelectAll);

        menuCopy.setText("Copy Selected");
        menuCopy.setIconTextGap(0);
        menuCopy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuCopyMousePressed(evt);
            }
        });
        pmenuEdit.add(menuCopy);

        menuCut.setText("Cut Selected");
        menuCut.setIconTextGap(0);
        menuCut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuCutMousePressed(evt);
            }
        });
        pmenuEdit.add(menuCut);

        menuPaste.setText("Paste");
        menuPaste.setIconTextGap(0);
        menuPaste.setInheritsPopupMenu(true);
        menuPaste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuPasteMousePressed(evt);
            }
        });
        pmenuEdit.add(menuPaste);

        jMenuBar1.add(pmenuEdit);

        menuAbout.setText("About");
        menuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuAboutMousePressed(evt);
            }
        });
        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Fungsi ketika menu open diklik
    //Pertama akan dicek apakah text telah diedit atau tidak
    //Jika belum diedit maka akan langsung memanggil fungsi openFile()
    //Jika sudah diedit maka akan menampilkan dialog konfirmasi
    //Jika dijawab Yes maka akan memanggil fungsi saveFile() dan jika disimpan maka memanggil openFile()
    //Jika dijawab No maka langsung panggil fungsi openFile()
    //Jika cancel maka break
    private void menuOpenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuOpenMousePressed
       if(edited == false){
           openFile();
       }
       else{
            int result = JOptionPane.showOptionDialog(this, 
                "Simpan dahulu berkas teks saat ini?", 
                "Notepad", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, null, null);
            switch(result){
                case JOptionPane.YES_OPTION: 
                    saveFile();
                    if(edited == false) openFile();
                    break;
                case JOptionPane.NO_OPTION:
                    openFile();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    break;
                }           
       }
    }//GEN-LAST:event_menuOpenMousePressed
    
    //Fungsi ketika menu new diklik
    //Pertama akan dicek apakah text telah diedit atau tidak
    //Jika belum diedit maka akan langsung memanggil fungsi newFile()
    //Jika sudah diedit maka akan menampilkan dialog konfirmasi
    //Jika dijawab Yes maka akan memanggil fungsi saveFile() dan jika disimpan maka memanggil newFile()
    //Jika dijawab No maka langsung panggil fungsi newFile()
    //Jika cancel maka break
    private void menuNewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuNewMousePressed
        if(edited == false){
           newFile();
        }
        else{
            int result = JOptionPane.showOptionDialog(this, 
                "Simpan dahulu berkas teks saat ini?", 
                "Notepad", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, null, null);
            switch(result){
                case JOptionPane.YES_OPTION:
                    saveFile();
                    if(edited == false) newFile();
                    break;
                case JOptionPane.NO_OPTION:
                    newFile();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    break;
                }           
       }
    }//GEN-LAST:event_menuNewMousePressed
    
    //Fungsi saveFile() dipanggil saat menu save diklik
    private void menuSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSaveMousePressed
        saveFile();
    }//GEN-LAST:event_menuSaveMousePressed
    
    //Ketika key typed maka memanggil fungsi textEdited
    private void textFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldKeyTyped
        textEdited();
    }//GEN-LAST:event_textFieldKeyTyped
    
    //Jika menu copy diklik maka akan memanggil method copy() milik textField
    //Sehingga teks yang terseleksi di-copy
    private void menuCopyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCopyMousePressed
        textField.copy();
    }//GEN-LAST:event_menuCopyMousePressed

    //Jika menu select all diklik maka akan memanggil method selectAll() milik textField
    //Sehingga semua teks terseleksi
    private void menuSelectAllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSelectAllMousePressed
        textField.selectAll();
    }//GEN-LAST:event_menuSelectAllMousePressed
    
    //Jika menu cut diklik maka akan memanggil method cut() milik textField
    //Sehingga teks yang terseleksi di-cut
    //Memanggil fungsi textEdited
    private void menuCutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCutMousePressed
        textField.cut();
        textEdited();
    }//GEN-LAST:event_menuCutMousePressed

    //Jika menu paste diklik maka akan memanggil method paste() milik textField
    //Sehingga teks pada clipboard di-paste di textField
    //Memanggil fungsi textEdited
    private void menuPasteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPasteMousePressed
        textField.paste();
        textEdited();
    }//GEN-LAST:event_menuPasteMousePressed

    //Jika menu bar edit diklik
    //Dicek apakah clipboard kosong
    //Dicek apakah textField terseleksi
    //Jika clipboard kosong maka menu paste disabled dan sebaliknya
    //Jika tidak ada teks terseleksi maka menu cut dan copy disabled dan sebaliknya
    private void pmenuEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmenuEditMousePressed
        String tempClipboard = "";
        try{
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = toolkit.getSystemClipboard();
            tempClipboard = (String) clipboard.getData(DataFlavor.stringFlavor);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(tempClipboard == ""){
            menuPaste.setEnabled(false);
        }
        else{
            menuPaste.setEnabled(true);
        }
        if(textField.getSelectedText() == null){
            menuCut.setEnabled(false);
            menuCopy.setEnabled(false);
        }
        else{
            menuCut.setEnabled(true);
            menuCopy.setEnabled(true);
        }
    }//GEN-LAST:event_pmenuEditMousePressed
    
    //Dialog ketika menu About diklik
    private void menuAboutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAboutMousePressed
        JOptionPane.showMessageDialog(this, "Annas Abdurrahman\nM0519017\nKelas A\nPraktikum PBO"); 
    }//GEN-LAST:event_menuAboutMousePressed
    
    //Fungsi untuk megosongkan textField
    //Mengubah title window menjadi "Untitled - Notepad"
    //Mengubah boolean edited menjadi false
    private void newFile(){
        textField.setText("");
        this.setTitle("Untitled - Notepad");
        edited = false;
    }
    
    //Apabila tempat isian text terubah
    //Maka boolean edited diubah menjadi true
    //Title ditambahi dengan lambang asterik
    private void textEdited(){
        edited = true;
        String oldTitle = this.getTitle();
        if(!oldTitle.startsWith("*")){ 
            this.setTitle("*" + oldTitle);
        }
    }
    //Fungsi untuk membuka file dengan menampilkan dialog file picker
    //Menggunakan komponen JFileChooser
    private void openFile(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(fileType);                    //Mengeset filechooser dengan filter ekstensi txt
        int result = fileChooser.showOpenDialog(getParent());   //Integer result berisi nilai kondisi dari filechooser
        if (result == JFileChooser.APPROVE_OPTION) {            //Jika file terpilih maka kondisi result APPROVE_OPTION
            File file = fileChooser.getSelectedFile();          //Membuat objek File yang didapatkan dari file terpilih dari fileChooser
            FileReader reader = null;                           //Membuat objek FileReader bernama Reader
            try {                                               //try
                reader = new FileReader(file.toString());       //reader diisi dengan path file terpilih
                textField.read(reader, null);                   //textField membaca isi file terpilih melalui FileReader reader
                reader.close();                                 
                this.setTitle(file.getName() + "- Notepad");    //Judul window diubah menjadi <nama file terpilih> - Notepad
                edited = false;                                 //edited false
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    //Fungsi untuk menyimpan file dengan menampilkan dialog file picker
    //Menggunakan komponen JFileChooser
    //Proses hampir sama dengan openFile()
    private void saveFile(){
        JFileChooser fileChooser = new JFileChooser();                  
        fileChooser.setFileFilter(fileType);                            
        int result = fileChooser.showSaveDialog(getParent());           
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            FileWriter writer = null;                                   //Membuat objek FileWriter writer
            try {
                if(file.exists() == true){                              //Apabila file terpilih telah ada
                    writer = new FileWriter(file.toString());           //Maka writer akan diberi nama file sesuai nama file terpilih
                }
                else{
                    writer = new FileWriter(file.toString() + ".txt");  //Jika belum ada maka witer menoutputkan dengan ekstensi txt
                }
                writer.write(textField.getText());                      //writer menuliskan output isi teks textField
                writer.close();                                         
                this.setTitle(file.getName() + "- Notepad");            //Mengubah judul window sesuai nama file tersimpan
                edited = false;                                         //edited false
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuItem menuCopy;
    private javax.swing.JMenuItem menuCut;
    private javax.swing.JMenuItem menuNew;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuPaste;
    private javax.swing.JMenuItem menuSave;
    private javax.swing.JMenuItem menuSelectAll;
    private javax.swing.JMenu pmenuEdit;
    private javax.swing.JMenu pmenuFile;
    private javax.swing.JTextArea textField;
    // End of variables declaration//GEN-END:variables
}
