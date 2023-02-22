package views;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import classes.*;

public class Home extends JFrame implements ActionListener{

    public JMenuBar barraMenu = new JMenuBar();

    //BARRA DE TAREAS//////////////////////////////////////////////////////////////
    public JToolBar barraHerramientas = new JToolBar(null, JToolBar.VERTICAL);
    public JButton agregarObjeto = new JButton("agregar");
    public JButton elegirObjeto = new JButton("elegir");
    public JButton eliminarObjeto = new JButton("eliminar");
    public JButton modificarObjeto = new JButton("modificar");
    public JButton seleccionMultiple = new JButton("seleccion");

    //MENU EN BARRA/////////////////////////////////////////////////////////////////////
    //ELECTRONICA
    public JMenu electronica_menu = new JMenu("Electronica");

    //ARCHIVO
    public JMenu archivo_menu = new JMenu("Archivo");
    public JMenuItem imprimir_csv = new JMenuItem("Imprimir CSV");
    public JMenuItem cambiar_destino = new JMenuItem("Cambiar Destino");
    public JMenuItem importar_csv = new JMenuItem("Importar CSV");

    //CASILLEROS
    public JMenu casillero_menu = new JMenu("Casilleros");
    public JMenuItem anadir_casillero = new JMenuItem("Añadir Casillero");
    public JMenuItem eliminar_casillero = new JMenuItem("Eliminar Casillero");
    public JMenuItem mover_objeto = new JMenuItem("Mover Objeto");

    //REPORTE
    public JMenu reporte_menu = new JMenu("Reporte");
    public JMenuItem crear_pdf = new JMenuItem("Crear PDF");
    /////////////////////////////////////////////////////////////////////////////////////

    //TABS DE HOJAS/////////////////////////////////////////////////////////////////////
    JTabbedPane pestanas_hojas=new JTabbedPane();
    JPanel panel1=new JPanel();
    JLabel et_p1=new JLabel("Estas en el panel 1");

    Database con = new Database();

    public Home(){

        con.createNewDatabase("prueba.db");
        //BARRA DE MENU/////////////////////////////////////////////
        barraMenu.add(electronica_menu);
        barraMenu.add(archivo_menu);
        archivo_menu.add(imprimir_csv);
        archivo_menu.add(cambiar_destino);
        archivo_menu.add(importar_csv);
        barraMenu.add(casillero_menu);
        casillero_menu.add(anadir_casillero);
        casillero_menu.add(eliminar_casillero);
        casillero_menu.add(mover_objeto);
        barraMenu.add(reporte_menu);
        reporte_menu.add(crear_pdf);
        barraMenu.setBounds(0,0,1080,40);
        /////////////////////////////////////////////////////////

        //TABS//////////////////////////////////////////////////////
        pestanas_hojas.setBounds(0,40,100,50);
        panel1.add(et_p1);
        pestanas_hojas.addTab("Panel 1", panel1);

        ////////////////////////////////////////////////////////////

        //BARRA DE HERRAMIENTAS
        barraHerramientas.setBounds(0,0,100,1080);
        barraHerramientas.add(agregarObjeto);
        agregarObjeto.setFocusPainted(false);
        barraHerramientas.add(new JSeparator(SwingConstants.HORIZONTAL));
        barraHerramientas.add(elegirObjeto);
        elegirObjeto.setFocusPainted(false);
        barraHerramientas.add(new JSeparator(SwingConstants.HORIZONTAL));
        barraHerramientas.add(eliminarObjeto);
        eliminarObjeto.setFocusPainted(false);
        barraHerramientas.add(new JSeparator(SwingConstants.HORIZONTAL));
        barraHerramientas.add(modificarObjeto);
        modificarObjeto.setFocusPainted(false);
        barraHerramientas.add(new JSeparator(SwingConstants.HORIZONTAL));
        barraHerramientas.add(seleccionMultiple);
        seleccionMultiple.setFocusPainted(false);
        barraHerramientas.add(new JSeparator(SwingConstants.HORIZONTAL));

        //LOS COMPONENTES SE AGREGAN
        add(barraMenu, BorderLayout.PAGE_START);
        add(pestanas_hojas, BorderLayout.CENTER);
        add(barraHerramientas, BorderLayout.WEST);

        //PROPIEDADES DEL FRAME
        setSize(250, 100);
        setLocationRelativeTo(null);
        setTitle("HOME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public void actionPerformed(ActionEvent event)
			{

			}
}
