/*
    Nombre: Wilson Andrés Mosquera Zapata
    Cogigo: 202182116-3743
    Correo: mosquera.wilson@correounivalle.edu.co
*/

package Modulo_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class ProcesadorII {
	public static void main(String[] args) {
		MenuPocesadorII Marco = new MenuPocesadorII();
		Marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MenuPocesadorII extends JFrame{
	public MenuPocesadorII() {
		setVisible(true);
		setBounds(500,300,550,300);
		add(new LaminaProcesadorII());	
	}
}

class LaminaProcesadorII extends JPanel{
	public LaminaProcesadorII() {
		
		setLayout(new BorderLayout());
		JPanel LabelMenu = new JPanel();
		JMenuBar Barra = new JMenuBar();
                
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamanio = new JMenu("Tamaño");
		ConfiguraMenu("Arial","fuente","Arial",9,10,"");
                
		ConfiguraMenu("Courier","fuente","Courier",9,10,"");
		ConfiguraMenu("Verdana","fuente","Verdana",9,10,"");
		ConfiguraMenu("Negrita","estilo","",Font.BOLD,1,"bin/graficos/negrita.gif");
		ConfiguraMenu("Cursiva","estilo","",Font.ITALIC,1,"bin/graficos/cursiva.gif");
                
		ButtonGroup tamanioLetra = new ButtonGroup();
		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
                
		tamanioLetra.add(doce);
		tamanioLetra.add(dieciseis);
		tamanioLetra.add(veinte);
		tamanioLetra.add(veinticuatro);
                
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",12));
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",10));
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",24));
                
		tamanio.add(doce);
		tamanio.add(dieciseis);
		tamanio.add(veinte);
		tamanio.add(veinticuatro);
                
		Barra.add(fuente);
		Barra.add(estilo);
		Barra.add(tamanio);
                
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		emergente.add(negritaE);
		emergente.add(cursivaE);
		
		LabelMenu.add(Barra);
		add(LabelMenu, BorderLayout.NORTH);
		
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
		
		miArea.setComponentPopupMenu(emergente);	
		
		barra = new JToolBar();
		configuraBarra("N").addActionListener(new StyledEditorKit.BoldAction());
		configuraBarra("K").addActionListener(new StyledEditorKit.ItalicAction());
		configuraBarra("S").addActionListener(new StyledEditorKit.UnderlineAction());
		barra.addSeparator();
                
		configuraBarra("BLUE").addActionListener(new StyledEditorKit.ForegroundAction("PoneAzul",Color.BLUE));
		configuraBarra("YELLOW").addActionListener(new StyledEditorKit.ForegroundAction("PoneAmarillo",Color.YELLOW));
		configuraBarra("RED").addActionListener(new StyledEditorKit.ForegroundAction("PoneRojo",Color.RED));
		barra.addSeparator();
                
		configuraBarra("IZQ <-").addActionListener(new StyledEditorKit.AlignmentAction("Alineado izquierda", 0));
		configuraBarra("Centro <->").addActionListener(new StyledEditorKit.AlignmentAction("Alineado centro", 1));
		configuraBarra("DER ->").addActionListener(new StyledEditorKit.AlignmentAction("Alineado derecha", 2));
		configuraBarra("Justificado |-|").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));

		barra.setOrientation(1);
		add(barra, BorderLayout.WEST);
	}
	
	public JButton configuraBarra(String nombre) {
		
		JButton boton = new JButton(nombre);
		barra.add(boton);
		return boton;
	}
	
	public void ConfiguraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String rutaIcono) {
		
		JMenuItem elemMenu = new JMenuItem(rotulo,new ImageIcon(rutaIcono));
		
		if(menu=="Fuente") {
			fuente.add(elemMenu);
			
			if(tipoLetra=="Arial") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra","Arial"));
			}
                        else if(tipoLetra=="Courier") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra","Courier"));
			}
                        else if(tipoLetra=="Verdana") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("CambiaLetra","Verdana"));
			}

		}
                else if(menu=="estilo") {
			
			estilo.add(elemMenu);
			
			if(estilos==Font.BOLD) {
				
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
				
			}
                        else if(estilos==Font.ITALIC) {
				
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
				
		}
                else if( menu == "tamaño" ) {
			tamanio.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",tam));
		}
	}
	JTextPane miArea;
	JMenu fuente,estilo,tamanio;
	JToolBar barra;
}
