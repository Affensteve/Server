package kom.feuerwehr.gui;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings( "serial" )
public class GuiS extends JFrame {

   Map<String, Integer> map = new HashMap<String, Integer>();
   JFrame frame = null;
   JPanel vehiclePanel;

   String tlfMelbeckBild = "res/tlfMelbeck.png";
   JPanel tlfMelbeck;
   JPanel tlfMelbeck1;
   JPanel tlfMelbeck2;
   JPanel tlfMelbeck3;
   JPanel tlfMelbeck4;
   JPanel tlfMelbeck5;
   JPanel tlfMelbeck6;
   JPanel tlfMelbeck7;
   JPanel tlfMelbeck8;

   String lf16MelbeckBild = "res/lf16Melbeck.png";
   JPanel lf16Melbeck;
   JPanel lf16Melbeck1;
   JPanel lf16Melbeck2;
   JPanel lf16Melbeck3;
   JPanel lf16Melbeck4;
   JPanel lf16Melbeck5;
   JPanel lf16Melbeck6;
   JPanel lf16Melbeck7;
   JPanel lf16Melbeck8;

   String lf8MelbeckBild = "res/tlf.png";
   JPanel lf8Melbeck;
   JPanel lf8Melbeck1;
   JPanel lf8Melbeck2;
   JPanel lf8Melbeck3;
   JPanel lf8Melbeck4;
   JPanel lf8Melbeck5;
   JPanel lf8Melbeck6;
   JPanel lf8Melbeck7;
   JPanel lf8Melbeck8;

   String lf8DeutschEvernBild = "res/lf8DeutschEvern.png";
   JPanel lf8DeutschEvern;
   JPanel lf8DeutschEvern1;
   JPanel lf8DeutschEvern2;
   JPanel lf8DeutschEvern3;
   JPanel lf8DeutschEvern4;
   JPanel lf8DeutschEvern5;
   JPanel lf8DeutschEvern6;
   JPanel lf8DeutschEvern7;
   JPanel lf8DeutschEvern8;

   String tlfDeutschEvernBild = "res/tlf.png";
   JPanel tlfDeutschEvern;
   JPanel tlfDeutschEvern1;
   JPanel tlfDeutschEvern2;
   JPanel tlfDeutschEvern3;
   JPanel tlfDeutschEvern4;
   JPanel tlfDeutschEvern5;
   JPanel tlfDeutschEvern6;
   JPanel tlfDeutschEvern7;
   JPanel tlfDeutschEvern8;

   String rwEmbsenBild = "res/rwEmbsen.png";
   JPanel rwEmbsen;
   JPanel rwEmbsen1;
   JPanel rwEmbsen2;
   JPanel rwEmbsen3;
   JPanel rwEmbsen4;
   JPanel rwEmbsen5;
   JPanel rwEmbsen6;
   JPanel rwEmbsen7;
   JPanel rwEmbsen8;

   String lfEmbsenBild = "res/tlf.png";
   JPanel lfEmbsen;
   JPanel lfEmbsen1;
   JPanel lfEmbsen2;
   JPanel lfEmbsen3;
   JPanel lfEmbsen4;
   JPanel lfEmbsen5;
   JPanel lfEmbsen6;
   JPanel lfEmbsen7;
   JPanel lfEmbsen8;

   String tlfOerzenBild = "res/tlfOerzen.png";
   JPanel tlfOerzen;
   JPanel tlfOerzen1;
   JPanel tlfOerzen2;
   JPanel tlfOerzen3;
   JPanel tlfOerzen4;
   JPanel tlfOerzen5;
   JPanel tlfOerzen6;
   JPanel tlfOerzen7;
   JPanel tlfOerzen8;

   String tsfOerzenBild = "res/tsf.png";
   JPanel tsfOerzen;
   JPanel tsfOerzen1;
   JPanel tsfOerzen2;
   JPanel tsfOerzen3;
   JPanel tsfOerzen4;
   JPanel tsfOerzen5;
   JPanel tsfOerzen6;
   JPanel tsfOerzen7;
   JPanel tsfOerzen8;

   String tlfBarnstedtBild = "res/tlf.png";
   JPanel tlfBarnstedt;
   JPanel tlfBarnstedt1;
   JPanel tlfBarnstedt2;
   JPanel tlfBarnstedt3;
   JPanel tlfBarnstedt4;
   JPanel tlfBarnstedt5;
   JPanel tlfBarnstedt6;
   JPanel tlfBarnstedt7;
   JPanel tlfBarnstedt8;

   String tsfBarnstedtBild = "res/tsf.png";
   JPanel tsfBarnstedt;
   JPanel tsfBarnstedt1;
   JPanel tsfBarnstedt2;
   JPanel tsfBarnstedt3;
   JPanel tsfBarnstedt4;
   JPanel tsfBarnstedt5;
   JPanel tsfBarnstedt6;
   JPanel tsfBarnstedt7;
   JPanel tsfBarnstedt8;

   String lf8KolkhagenBild = "res/tlf.png";
   JPanel lf8Kolkhagen;
   JPanel lf8Kolkhagen1;
   JPanel lf8Kolkhagen2;
   JPanel lf8Kolkhagen3;
   JPanel lf8Kolkhagen4;
   JPanel lf8Kolkhagen5;
   JPanel lf8Kolkhagen6;
   JPanel lf8Kolkhagen7;
   JPanel lf8Kolkhagen8;


   // ################################################
   String gastBild = "res/gast.png";
   JPanel gast1;
   JPanel gast11;
   JPanel gast12;
   JPanel gast13;
   JPanel gast14;
   JPanel gast15;
   JPanel gast16;
   JPanel gast17;
   JPanel gast18;

   JPanel gast2;
   JPanel gast21;
   JPanel gast22;
   JPanel gast23;
   JPanel gast24;
   JPanel gast25;
   JPanel gast26;
   JPanel gast27;
   JPanel gast28;
   // ################################################


   JLabel lblOffeneVerbindungen;
   private JLabel lblIp;

   public GuiS( ) {
      map.put( "tlfMelbeckIndex", 0 );
      map.put( "lf16MelbeckIndex", 0 );
      map.put( "lf8MelbeckIndex", 0 );
      map.put( "mtwMelbeckIndex", 0 );

      map.put( "lf8DeutschEvernIndex", 0 );
      map.put( "tlfDeutschEvernIndex", 0 );
      map.put( "mtwDeutschEvernIndex", 0 );

      map.put( "rwEmbsenIndex", 0 );
      map.put( "lfEmbsenIndex", 0 );
      map.put( "mtwEmbsenIndex", 0 );

      map.put( "tlfOerzenIndex", 0 );
      map.put( "tsfOerzenIndex", 0 );
      map.put( "mtwOerzenIndex", 0 );

      map.put( "tlfBarnstedtIndex", 0 );
      map.put( "tsfBarnstedtIndex", 0 );
      map.put( "mtwBarnstedtIndex", 0 );

      map.put( "lf8KolkhagenIndex", 0 );
      map.put( "gast1Index", 0 );
      map.put( "gast2Index", 0 );

      try {
         UIManager
               .setLookAndFeel( "com.sun.java.swing.plaf.windows.WindowsLookAndFeel" );
      } catch( ClassNotFoundException e ) {
         e.printStackTrace();
      } catch( InstantiationException e ) {
         e.printStackTrace();
      } catch( IllegalAccessException e ) {
         e.printStackTrace();
      } catch( UnsupportedLookAndFeelException e ) {
         e.printStackTrace();
      }
      vehiclePanel = new JPanel();
      vehiclePanel
            .setLayout( new MigLayout(
                  "wrap 9",
                  "[100px][100px][100px][100px][100px][100px][100px]",
                  "[12px][15px][15px][33px][33px][33px][15px][33px][33px][15px][33px][33px][15px][33px][33px][15px][33px][33px][15px][33px][15px][33px][33px]" ) );

      JMenuBar menuBar = new JMenuBar();

      JMenu mnDatei = new JMenu( "Datei" );
      menuBar.add( mnDatei );

      JMenuItem mntmBeenden = new JMenuItem( "Beenden" );

      mntmBeenden.addActionListener( new ActionListener() {
         @Override
         public void actionPerformed( ActionEvent arg0 ) {
            System.exit( 1 );
         }
      } );
      mnDatei.add( mntmBeenden );

      JMenu helpMenu = new JMenu( "Hilfe" );

      JMenuItem aboutMenuItem = new JMenuItem( "Über" );
      aboutMenuItem.addActionListener( new ActionListener() {
         @Override
         public void actionPerformed( ActionEvent arg0 ) {
            JOptionPane.showMessageDialog( frame,
                  "Funkfahrübung Übersicht by ©S.Kunz\n"
                        + "Developer: Steffen Kunz\n"
                        + "Version: 1.1 \n"
                        + "\n©S.Kunz. All rights reserved",
                  "Über Funkfahrübung Übersicht by ©S.Kunz",
                  JOptionPane.INFORMATION_MESSAGE );
         }
      } );
      helpMenu.add( aboutMenuItem );
      menuBar.add( helpMenu );

      frame = new JFrame( "Funkfahrübung Übersicht by ©S.Kunz" );
      frame.setResizable( false );
      frame.setAlwaysOnTop( true );
      frame.getContentPane().add( vehiclePanel );

      lblOffeneVerbindungen = new JLabel( "verbunden: 0" );
      vehiclePanel.add( lblOffeneVerbindungen, "hidemode 3, cell 4 0" );

      try {
         lblIp = new JLabel( "IP: " + InetAddress.getLocalHost().getHostAddress() );
      } catch( UnknownHostException e ) {
         e.printStackTrace();
      }
      vehiclePanel.add( lblIp, "hidemode 3, cell 6 0" );

      JLabel lblStart = new JLabel( "Start" );
      vehiclePanel.add( lblStart, "cell 1 1" );

      JLabel lblZiel = new JLabel( "Ziel" );
      vehiclePanel.add( lblZiel, "cell 8 1" );

      JLabel lblMelbeck = new JLabel( "Melbeck" );
      vehiclePanel.add( lblMelbeck, "cell 0 2" );

      JPanel label = new JPanel();
      label.setBackground( Color.RED );
      vehiclePanel.add( label, "cell 1 2, grow" );

      JPanel label3 = new JPanel();
      label3.setBackground( Color.YELLOW );
      vehiclePanel.add( label3, "cell 2 2, grow" );

      JPanel label4 = new JPanel();
      label4.setBackground( Color.GREEN );
      vehiclePanel.add( label4, "cell 3 2, grow" );

      JPanel label5 = new JPanel();
      label5.setBackground( Color.CYAN );
      vehiclePanel.add( label5, "cell 4 2, grow" );

      JPanel label6 = new JPanel();
      label6.setBackground( Color.ORANGE );
      vehiclePanel.add( label6, "cell 5 2, grow" );

      JPanel label7 = new JPanel();
      label7.setBackground( Color.MAGENTA );
      vehiclePanel.add( label7, "cell 6 2, grow" );

      JPanel label8 = new JPanel();
      label8.setBackground( Color.LIGHT_GRAY );
      vehiclePanel.add( label8, "cell 6 2, grow" );

      JPanel label9 = new JPanel();
      label9.setBackground( Color.BLUE );
      vehiclePanel.add( label9, "cell 8 2,grow" );

      tlfMelbeck = new JPanel();
      tlfMelbeck.add( new JLabel( new ImageIcon( tlfMelbeckBild ) ) );
      vehiclePanel.add( tlfMelbeck, "cell 0 3" );

      tlfMelbeck1 = new JPanel();
      tlfMelbeck1.add( new JLabel( new ImageIcon( tlfMelbeckBild ) ) );
      tlfMelbeck1.setVisible( false );
      vehiclePanel.add( tlfMelbeck1, "cell 1 3" );

      tlfMelbeck2 = new JPanel();
      tlfMelbeck2.add( new JLabel( new ImageIcon( tlfMelbeckBild ) ) );
      tlfMelbeck2.setVisible( false );
      vehiclePanel.add( tlfMelbeck2, "cell 2 3" );

      tlfMelbeck3 = new JPanel();
      tlfMelbeck3.add( new JLabel( new ImageIcon( tlfMelbeckBild ) ) );
      tlfMelbeck3.setVisible( false );
      vehiclePanel.add( tlfMelbeck3, "cell 3 3" );

      tlfMelbeck4 = new JPanel();
      tlfMelbeck4.add( new JLabel( new ImageIcon( tlfMelbeckBild ) ) );
      tlfMelbeck4.setVisible( false );
      vehiclePanel.add( tlfMelbeck4, "cell 4 3" );

      tlfMelbeck5 = new JPanel();
      tlfMelbeck5.add( new JLabel( new ImageIcon( tlfMelbeckBild ) ) );
      tlfMelbeck5.setVisible( false );
      vehiclePanel.add( tlfMelbeck5, "cell 5 3" );

      tlfMelbeck6 = new JPanel();
      tlfMelbeck6.add( new JLabel( new ImageIcon( tlfMelbeckBild ) ) );
      tlfMelbeck6.setVisible( false );
      vehiclePanel.add( tlfMelbeck6, "cell 6 3,alignx left" );

      tlfMelbeck7 = new JPanel();
      tlfMelbeck7.add( new JLabel( new ImageIcon( tlfMelbeckBild ) ) );
      tlfMelbeck7.setVisible( false );
      vehiclePanel.add( tlfMelbeck7, "cell 6 3,alignx right" );

      tlfMelbeck8 = new JPanel();
      tlfMelbeck8.add( new JLabel( new ImageIcon( tlfMelbeckBild ) ) );
      tlfMelbeck8.setVisible( false );
      vehiclePanel.add( tlfMelbeck8, "cell 8 3" );

      lf16Melbeck = new JPanel();
      lf16Melbeck.add( new JLabel( new ImageIcon( lf16MelbeckBild ) ) );
      vehiclePanel.add( lf16Melbeck, "cell 0 4" );

      lf16Melbeck1 = new JPanel();
      lf16Melbeck1.add( new JLabel( new ImageIcon( lf16MelbeckBild ) ) );
      lf16Melbeck1.setVisible( false );
      vehiclePanel.add( lf16Melbeck1, "cell 1 4" );

      lf16Melbeck2 = new JPanel();
      lf16Melbeck2.add( new JLabel( new ImageIcon( lf16MelbeckBild ) ) );
      lf16Melbeck2.setVisible( false );
      vehiclePanel.add( lf16Melbeck2, "cell 2 4" );

      lf16Melbeck3 = new JPanel();
      lf16Melbeck3.add( new JLabel( new ImageIcon( lf16MelbeckBild ) ) );
      lf16Melbeck3.setVisible( false );
      vehiclePanel.add( lf16Melbeck3, "cell 3 4" );

      lf16Melbeck4 = new JPanel();
      lf16Melbeck4.add( new JLabel( new ImageIcon( lf16MelbeckBild ) ) );
      lf16Melbeck4.setVisible( false );
      vehiclePanel.add( lf16Melbeck4, "cell 4 4" );

      lf16Melbeck5 = new JPanel();
      lf16Melbeck5.add( new JLabel( new ImageIcon( lf16MelbeckBild ) ) );
      lf16Melbeck5.setVisible( false );
      vehiclePanel.add( lf16Melbeck5, "cell 5 4" );

      lf16Melbeck6 = new JPanel();
      lf16Melbeck6.add( new JLabel( new ImageIcon( lf16MelbeckBild ) ) );
      lf16Melbeck6.setVisible( false );
      vehiclePanel.add( lf16Melbeck6, "cell 6 4,alignx left" );

      lf16Melbeck7 = new JPanel();
      lf16Melbeck7.add( new JLabel( new ImageIcon( lf16MelbeckBild ) ) );
      lf16Melbeck7.setVisible( false );
      vehiclePanel.add( lf16Melbeck7, "cell 6 4,alignx right" );

      lf16Melbeck8 = new JPanel();
      lf16Melbeck8.add( new JLabel( new ImageIcon( lf16MelbeckBild ) ) );
      lf16Melbeck8.setVisible( false );
      vehiclePanel.add( lf16Melbeck8, "cell 8 4" );

      lf8Melbeck = new JPanel();
      lf8Melbeck.add( new JLabel( new ImageIcon( lf8MelbeckBild ) ) );
      vehiclePanel.add( lf8Melbeck, "cell 0 5" );

      lf8Melbeck1 = new JPanel();
      lf8Melbeck1.add( new JLabel( new ImageIcon( lf8MelbeckBild ) ) );
      lf8Melbeck1.setVisible( false );
      vehiclePanel.add( lf8Melbeck1, "cell 1 5" );

      lf8Melbeck2 = new JPanel();
      lf8Melbeck2.add( new JLabel( new ImageIcon( lf8MelbeckBild ) ) );
      lf8Melbeck2.setVisible( false );
      vehiclePanel.add( lf8Melbeck2, "cell 2 5" );

      lf8Melbeck3 = new JPanel();
      lf8Melbeck3.add( new JLabel( new ImageIcon( lf8MelbeckBild ) ) );
      lf8Melbeck3.setVisible( false );
      vehiclePanel.add( lf8Melbeck3, "cell 3 5" );

      lf8Melbeck4 = new JPanel();
      lf8Melbeck4.add( new JLabel( new ImageIcon( lf8MelbeckBild ) ) );
      lf8Melbeck4.setVisible( false );
      vehiclePanel.add( lf8Melbeck4, "cell 4 5" );

      lf8Melbeck5 = new JPanel();
      lf8Melbeck5.add( new JLabel( new ImageIcon( lf8MelbeckBild ) ) );
      lf8Melbeck5.setVisible( false );
      vehiclePanel.add( lf8Melbeck5, "cell 5 5" );

      lf8Melbeck6 = new JPanel();
      lf8Melbeck6.add( new JLabel( new ImageIcon( lf8MelbeckBild ) ) );
      lf8Melbeck6.setVisible( false );
      vehiclePanel.add( lf8Melbeck6, "cell 6 5,alignx left" );

      lf8Melbeck7 = new JPanel();
      lf8Melbeck7.add( new JLabel( new ImageIcon( lf8MelbeckBild ) ) );
      lf8Melbeck7.setVisible( false );
      vehiclePanel.add( lf8Melbeck7, "cell 6 5,alignx right" );

      lf8Melbeck8 = new JPanel();
      lf8Melbeck8.add( new JLabel( new ImageIcon( lf8MelbeckBild ) ) );
      lf8Melbeck8.setVisible( false );
      vehiclePanel.add( lf8Melbeck8, "cell 8 5" );

      JLabel lblDeutschEvern = new JLabel( "Deutsch Evern" );
      vehiclePanel.add( lblDeutschEvern, "cell 0 6" );

      lf8DeutschEvern = new JPanel();
      lf8DeutschEvern.add( new JLabel( new ImageIcon( lf8DeutschEvernBild ) ) );
      vehiclePanel.add( lf8DeutschEvern, "cell 0 7" );

      lf8DeutschEvern1 = new JPanel();
      lf8DeutschEvern1.add( new JLabel( new ImageIcon( lf8DeutschEvernBild ) ) );
      lf8DeutschEvern1.setVisible( false );
      vehiclePanel.add( lf8DeutschEvern1, "cell 1 7" );

      lf8DeutschEvern2 = new JPanel();
      lf8DeutschEvern2.add( new JLabel( new ImageIcon( lf8DeutschEvernBild ) ) );
      lf8DeutschEvern2.setVisible( false );
      vehiclePanel.add( lf8DeutschEvern2, "cell 2 7" );

      lf8DeutschEvern3 = new JPanel();
      lf8DeutschEvern3.add( new JLabel( new ImageIcon( lf8DeutschEvernBild ) ) );
      lf8DeutschEvern3.setVisible( false );
      vehiclePanel.add( lf8DeutschEvern3, "cell 3 7" );

      lf8DeutschEvern4 = new JPanel();
      lf8DeutschEvern4.add( new JLabel( new ImageIcon( lf8DeutschEvernBild ) ) );
      lf8DeutschEvern4.setVisible( false );
      vehiclePanel.add( lf8DeutschEvern4, "cell 4 7" );

      lf8DeutschEvern5 = new JPanel();
      lf8DeutschEvern5.add( new JLabel( new ImageIcon( lf8DeutschEvernBild ) ) );
      lf8DeutschEvern5.setVisible( false );
      vehiclePanel.add( lf8DeutschEvern5, "cell 5 7" );

      lf8DeutschEvern6 = new JPanel();
      lf8DeutschEvern6.add( new JLabel( new ImageIcon( lf8DeutschEvernBild ) ) );
      lf8DeutschEvern6.setVisible( false );
      vehiclePanel.add( lf8DeutschEvern6, "cell 6 7,alignx left" );

      lf8DeutschEvern7 = new JPanel();
      lf8DeutschEvern7.add( new JLabel( new ImageIcon( lf8DeutschEvernBild ) ) );
      lf8DeutschEvern7.setVisible( false );
      vehiclePanel.add( lf8DeutschEvern7, "cell 6 7,alignx right" );

      lf8DeutschEvern8 = new JPanel();
      lf8DeutschEvern8.add( new JLabel( new ImageIcon( lf8DeutschEvernBild ) ) );
      lf8DeutschEvern8.setVisible( false );
      vehiclePanel.add( lf8DeutschEvern8, "cell 8 7" );

      tlfDeutschEvern = new JPanel();
      tlfDeutschEvern.add( new JLabel( new ImageIcon( tlfDeutschEvernBild ) ) );
      vehiclePanel.add( tlfDeutschEvern, "cell 0 8" );

      tlfDeutschEvern1 = new JPanel();
      tlfDeutschEvern1.add( new JLabel( new ImageIcon( tlfDeutschEvernBild ) ) );
      tlfDeutschEvern1.setVisible( false );
      vehiclePanel.add( tlfDeutschEvern1, "cell 1 8" );

      tlfDeutschEvern2 = new JPanel();
      tlfDeutschEvern2.add( new JLabel( new ImageIcon( tlfDeutschEvernBild ) ) );
      tlfDeutschEvern2.setVisible( false );
      vehiclePanel.add( tlfDeutschEvern2, "cell 2 8" );

      tlfDeutschEvern3 = new JPanel();
      tlfDeutschEvern3.add( new JLabel( new ImageIcon( tlfDeutschEvernBild ) ) );
      tlfDeutschEvern3.setVisible( false );
      vehiclePanel.add( tlfDeutschEvern3, "cell 3 8" );

      tlfDeutschEvern4 = new JPanel();
      tlfDeutschEvern4.add( new JLabel( new ImageIcon( tlfDeutschEvernBild ) ) );
      tlfDeutschEvern4.setVisible( false );
      vehiclePanel.add( tlfDeutschEvern4, "cell 4 8" );

      tlfDeutschEvern5 = new JPanel();
      tlfDeutschEvern5.add( new JLabel( new ImageIcon( tlfDeutschEvernBild ) ) );
      tlfDeutschEvern5.setVisible( false );
      vehiclePanel.add( tlfDeutschEvern5, "cell 5 8" );

      tlfDeutschEvern6 = new JPanel();
      tlfDeutschEvern6.add( new JLabel( new ImageIcon( tlfDeutschEvernBild ) ) );
      tlfDeutschEvern6.setVisible( false );
      vehiclePanel.add( tlfDeutschEvern6, "cell 6 8,alignx left" );

      tlfDeutschEvern7 = new JPanel();
      tlfDeutschEvern7.add( new JLabel( new ImageIcon( tlfDeutschEvernBild ) ) );
      tlfDeutschEvern7.setVisible( false );
      vehiclePanel.add( tlfDeutschEvern7, "cell 6 8,alignx right" );

      tlfDeutschEvern8 = new JPanel();
      tlfDeutschEvern8.add( new JLabel( new ImageIcon( tlfDeutschEvernBild ) ) );
      tlfDeutschEvern8.setVisible( false );
      vehiclePanel.add( tlfDeutschEvern8, "cell 8 8" );

      JLabel lblEmbsen = new JLabel( "Embsen" );
      vehiclePanel.add( lblEmbsen, "cell 0 9" );

      rwEmbsen = new JPanel();
      rwEmbsen.add( new JLabel( new ImageIcon( rwEmbsenBild ) ) );
      vehiclePanel.add( rwEmbsen, "cell 0 10" );

      rwEmbsen1 = new JPanel();
      rwEmbsen1.add( new JLabel( new ImageIcon( rwEmbsenBild ) ) );
      rwEmbsen1.setVisible( false );
      vehiclePanel.add( rwEmbsen1, "cell 1 10" );

      rwEmbsen2 = new JPanel();
      rwEmbsen2.add( new JLabel( new ImageIcon( rwEmbsenBild ) ) );
      rwEmbsen2.setVisible( false );
      vehiclePanel.add( rwEmbsen2, "cell 2 10" );

      rwEmbsen3 = new JPanel();
      rwEmbsen3.add( new JLabel( new ImageIcon( rwEmbsenBild ) ) );
      rwEmbsen3.setVisible( false );
      vehiclePanel.add( rwEmbsen3, "cell 3 10" );

      rwEmbsen4 = new JPanel();
      rwEmbsen4.add( new JLabel( new ImageIcon( rwEmbsenBild ) ) );
      rwEmbsen4.setVisible( false );
      vehiclePanel.add( rwEmbsen4, "cell 4 10" );

      rwEmbsen5 = new JPanel();
      rwEmbsen5.add( new JLabel( new ImageIcon( rwEmbsenBild ) ) );
      rwEmbsen5.setVisible( false );
      vehiclePanel.add( rwEmbsen5, "cell 5 10" );

      rwEmbsen6 = new JPanel();
      rwEmbsen6.add( new JLabel( new ImageIcon( rwEmbsenBild ) ) );
      rwEmbsen6.setVisible( false );
      vehiclePanel.add( rwEmbsen6, "cell 6 10,alignx left" );

      rwEmbsen7 = new JPanel();
      rwEmbsen7.add( new JLabel( new ImageIcon( rwEmbsenBild ) ) );
      rwEmbsen7.setVisible( false );
      vehiclePanel.add( rwEmbsen7, "cell 6 10,alignx right" );

      rwEmbsen8 = new JPanel();
      rwEmbsen8.add( new JLabel( new ImageIcon( rwEmbsenBild ) ) );
      rwEmbsen8.setVisible( false );
      vehiclePanel.add( rwEmbsen8, "cell 8 10" );

      lfEmbsen = new JPanel();
      lfEmbsen.add( new JLabel( new ImageIcon( lfEmbsenBild ) ) );
      vehiclePanel.add( lfEmbsen, "cell 0 11" );

      lfEmbsen1 = new JPanel();
      lfEmbsen1.add( new JLabel( new ImageIcon( lfEmbsenBild ) ) );
      lfEmbsen1.setVisible( false );
      vehiclePanel.add( lfEmbsen1, "cell 1 11" );

      lfEmbsen2 = new JPanel();
      lfEmbsen2.add( new JLabel( new ImageIcon( lfEmbsenBild ) ) );
      lfEmbsen2.setVisible( false );
      vehiclePanel.add( lfEmbsen2, "cell 2 11" );

      lfEmbsen3 = new JPanel();
      lfEmbsen3.add( new JLabel( new ImageIcon( lfEmbsenBild ) ) );
      lfEmbsen3.setVisible( false );
      vehiclePanel.add( lfEmbsen3, "cell 3 11" );

      lfEmbsen4 = new JPanel();
      lfEmbsen4.add( new JLabel( new ImageIcon( lfEmbsenBild ) ) );
      lfEmbsen4.setVisible( false );
      vehiclePanel.add( lfEmbsen4, "cell 4 11" );

      lfEmbsen5 = new JPanel();
      lfEmbsen5.add( new JLabel( new ImageIcon( lfEmbsenBild ) ) );
      lfEmbsen5.setVisible( false );
      vehiclePanel.add( lfEmbsen5, "cell 5 11" );

      lfEmbsen6 = new JPanel();
      lfEmbsen6.add( new JLabel( new ImageIcon( lfEmbsenBild ) ) );
      lfEmbsen6.setVisible( false );
      vehiclePanel.add( lfEmbsen6, "cell 6 11,alignx left" );

      lfEmbsen7 = new JPanel();
      lfEmbsen7.add( new JLabel( new ImageIcon( lfEmbsenBild ) ) );
      lfEmbsen7.setVisible( false );
      vehiclePanel.add( lfEmbsen7, "cell 6 11,alignx right" );

      lfEmbsen8 = new JPanel();
      lfEmbsen8.add( new JLabel( new ImageIcon( lfEmbsenBild ) ) );
      lfEmbsen8.setVisible( false );
      vehiclePanel.add( lfEmbsen8, "cell 8 11" );

      JLabel lblOerzen = new JLabel( "Oerzen" );
      vehiclePanel.add( lblOerzen, "cell 0 12" );

      tlfOerzen = new JPanel();
      tlfOerzen.add( new JLabel( new ImageIcon( tlfOerzenBild ) ) );
      vehiclePanel.add( tlfOerzen, "cell 0 13" );

      tlfOerzen1 = new JPanel();
      tlfOerzen1.add( new JLabel( new ImageIcon( tlfOerzenBild ) ) );
      tlfOerzen1.setVisible( false );
      vehiclePanel.add( tlfOerzen1, "cell 1 13" );

      tlfOerzen2 = new JPanel();
      tlfOerzen2.add( new JLabel( new ImageIcon( tlfOerzenBild ) ) );
      tlfOerzen2.setVisible( false );
      vehiclePanel.add( tlfOerzen2, "cell 2 13" );

      tlfOerzen3 = new JPanel();
      tlfOerzen3.add( new JLabel( new ImageIcon( tlfOerzenBild ) ) );
      tlfOerzen3.setVisible( false );
      vehiclePanel.add( tlfOerzen3, "cell 3 13" );

      tlfOerzen4 = new JPanel();
      tlfOerzen4.add( new JLabel( new ImageIcon( tlfOerzenBild ) ) );
      tlfOerzen4.setVisible( false );
      vehiclePanel.add( tlfOerzen4, "cell 4 13" );

      tlfOerzen5 = new JPanel();
      tlfOerzen5.add( new JLabel( new ImageIcon( tlfOerzenBild ) ) );
      tlfOerzen5.setVisible( false );
      vehiclePanel.add( tlfOerzen5, "cell 5 13" );

      tlfOerzen6 = new JPanel();
      tlfOerzen6.add( new JLabel( new ImageIcon( tlfOerzenBild ) ) );
      tlfOerzen6.setVisible( false );
      vehiclePanel.add( tlfOerzen6, "cell 6 13,alignx left" );

      tlfOerzen7 = new JPanel();
      tlfOerzen7.add( new JLabel( new ImageIcon( tlfOerzenBild ) ) );
      tlfOerzen7.setVisible( false );
      vehiclePanel.add( tlfOerzen7, "cell 6 13,alignx right" );

      tlfOerzen8 = new JPanel();
      tlfOerzen8.add( new JLabel( new ImageIcon( tlfOerzenBild ) ) );
      tlfOerzen8.setVisible( false );
      vehiclePanel.add( tlfOerzen8, "cell 8 13" );

      tsfOerzen = new JPanel();
      tsfOerzen.add( new JLabel( new ImageIcon( tsfOerzenBild ) ) );
      vehiclePanel.add( tsfOerzen, "cell 0 14" );

      tsfOerzen1 = new JPanel();
      tsfOerzen1.add( new JLabel( new ImageIcon( tsfOerzenBild ) ) );
      tsfOerzen1.setVisible( false );
      vehiclePanel.add( tsfOerzen1, "cell 1 14" );

      tsfOerzen2 = new JPanel();
      tsfOerzen2.add( new JLabel( new ImageIcon( tsfOerzenBild ) ) );
      tsfOerzen2.setVisible( false );
      vehiclePanel.add( tsfOerzen2, "cell 2 14" );

      tsfOerzen3 = new JPanel();
      tsfOerzen3.add( new JLabel( new ImageIcon( tsfOerzenBild ) ) );
      tsfOerzen3.setVisible( false );
      vehiclePanel.add( tsfOerzen3, "cell 3 14" );

      tsfOerzen4 = new JPanel();
      tsfOerzen4.add( new JLabel( new ImageIcon( tsfOerzenBild ) ) );
      tsfOerzen4.setVisible( false );
      vehiclePanel.add( tsfOerzen4, "cell 4 14" );

      tsfOerzen5 = new JPanel();
      tsfOerzen5.add( new JLabel( new ImageIcon( tsfOerzenBild ) ) );
      tsfOerzen5.setVisible( false );
      vehiclePanel.add( tsfOerzen5, "cell 5 14" );

      tsfOerzen6 = new JPanel();
      tsfOerzen6.add( new JLabel( new ImageIcon( tsfOerzenBild ) ) );
      tsfOerzen6.setVisible( false );
      vehiclePanel.add( tsfOerzen6, "cell 6 14,alignx left" );

      tsfOerzen7 = new JPanel();
      tsfOerzen7.add( new JLabel( new ImageIcon( tsfOerzenBild ) ) );
      tsfOerzen7.setVisible( false );
      vehiclePanel.add( tsfOerzen7, "cell 6 14,alignx right" );

      tsfOerzen8 = new JPanel();
      tsfOerzen8.add( new JLabel( new ImageIcon( tsfOerzenBild ) ) );
      tsfOerzen8.setVisible( false );
      vehiclePanel.add( tsfOerzen8, "cell 8 14" );

      JLabel lblBarnstedt = new JLabel( "Barnstedt" );
      vehiclePanel.add( lblBarnstedt, "cell 0 15" );

      tlfBarnstedt = new JPanel();
      tlfBarnstedt.add( new JLabel( new ImageIcon( tlfBarnstedtBild ) ) );
      vehiclePanel.add( tlfBarnstedt, "cell 0 16" );

      tlfBarnstedt1 = new JPanel();
      tlfBarnstedt1.add( new JLabel( new ImageIcon( tlfBarnstedtBild ) ) );
      tlfBarnstedt1.setVisible( false );
      vehiclePanel.add( tlfBarnstedt1, "cell 1 16" );

      tlfBarnstedt2 = new JPanel();
      tlfBarnstedt2.add( new JLabel( new ImageIcon( tlfBarnstedtBild ) ) );
      tlfBarnstedt2.setVisible( false );
      vehiclePanel.add( tlfBarnstedt2, "cell 2 16" );

      tlfBarnstedt3 = new JPanel();
      tlfBarnstedt3.add( new JLabel( new ImageIcon( tlfBarnstedtBild ) ) );
      tlfBarnstedt3.setVisible( false );
      vehiclePanel.add( tlfBarnstedt3, "cell 3 16" );

      tlfBarnstedt4 = new JPanel();
      tlfBarnstedt4.add( new JLabel( new ImageIcon( tlfBarnstedtBild ) ) );
      tlfBarnstedt4.setVisible( false );
      vehiclePanel.add( tlfBarnstedt4, "cell 4 16" );

      tlfBarnstedt5 = new JPanel();
      tlfBarnstedt5.add( new JLabel( new ImageIcon( tlfBarnstedtBild ) ) );
      tlfBarnstedt5.setVisible( false );
      vehiclePanel.add( tlfBarnstedt5, "cell 5 16" );

      tlfBarnstedt6 = new JPanel();
      tlfBarnstedt6.add( new JLabel( new ImageIcon( tlfBarnstedtBild ) ) );
      tlfBarnstedt6.setVisible( false );
      vehiclePanel.add( tlfBarnstedt6, "cell 6 16,alignx left" );

      tlfBarnstedt7 = new JPanel();
      tlfBarnstedt7.add( new JLabel( new ImageIcon( tlfBarnstedtBild ) ) );
      tlfBarnstedt7.setVisible( false );
      vehiclePanel.add( tlfBarnstedt7, "cell 6 16,alignx right" );

      tlfBarnstedt8 = new JPanel();
      tlfBarnstedt8.add( new JLabel( new ImageIcon( tlfBarnstedtBild ) ) );
      tlfBarnstedt8.setVisible( false );
      vehiclePanel.add( tlfBarnstedt8, "cell 8 16" );

      tsfBarnstedt = new JPanel();
      tsfBarnstedt.add( new JLabel( new ImageIcon( tsfBarnstedtBild ) ) );
      vehiclePanel.add( tsfBarnstedt, "cell 0 17" );

      tsfBarnstedt1 = new JPanel();
      tsfBarnstedt1.add( new JLabel( new ImageIcon( tsfBarnstedtBild ) ) );
      tsfBarnstedt1.setVisible( false );
      vehiclePanel.add( tsfBarnstedt1, "cell 1 17" );

      tsfBarnstedt2 = new JPanel();
      tsfBarnstedt2.add( new JLabel( new ImageIcon( tsfBarnstedtBild ) ) );
      tsfBarnstedt2.setVisible( false );
      vehiclePanel.add( tsfBarnstedt2, "cell 2 17" );

      tsfBarnstedt3 = new JPanel();
      tsfBarnstedt3.add( new JLabel( new ImageIcon( tsfBarnstedtBild ) ) );
      tsfBarnstedt3.setVisible( false );
      vehiclePanel.add( tsfBarnstedt3, "cell 3 17" );

      tsfBarnstedt4 = new JPanel();
      tsfBarnstedt4.add( new JLabel( new ImageIcon( tsfBarnstedtBild ) ) );
      tsfBarnstedt4.setVisible( false );
      vehiclePanel.add( tsfBarnstedt4, "cell 4 17" );

      tsfBarnstedt5 = new JPanel();
      tsfBarnstedt5.add( new JLabel( new ImageIcon( tsfBarnstedtBild ) ) );
      tsfBarnstedt5.setVisible( false );
      vehiclePanel.add( tsfBarnstedt5, "cell 5 17" );

      tsfBarnstedt6 = new JPanel();
      tsfBarnstedt6.add( new JLabel( new ImageIcon( tsfBarnstedtBild ) ) );
      tsfBarnstedt6.setVisible( false );
      vehiclePanel.add( tsfBarnstedt6, "cell 6 17,alignx left" );

      tsfBarnstedt7 = new JPanel();
      tsfBarnstedt7.add( new JLabel( new ImageIcon( tsfBarnstedtBild ) ) );
      tsfBarnstedt7.setVisible( false );
      vehiclePanel.add( tsfBarnstedt7, "cell 6 17,alignx right" );

      tsfBarnstedt8 = new JPanel();
      tsfBarnstedt8.add( new JLabel( new ImageIcon( tsfBarnstedtBild ) ) );
      tsfBarnstedt8.setVisible( false );
      vehiclePanel.add( tsfBarnstedt8, "cell 8 17" );

      JLabel lblKolkhagen = new JLabel( "Kolkhagen" );
      vehiclePanel.add( lblKolkhagen, "cell 0 18" );

      lf8Kolkhagen = new JPanel();
      lf8Kolkhagen.add( new JLabel( new ImageIcon( lf8KolkhagenBild ) ) );
      vehiclePanel.add( lf8Kolkhagen, "cell 0 19" );

      lf8Kolkhagen1 = new JPanel();
      lf8Kolkhagen1.add( new JLabel( new ImageIcon( lf8KolkhagenBild ) ) );
      lf8Kolkhagen1.setVisible( false );
      vehiclePanel.add( lf8Kolkhagen1, "cell 1 19" );

      lf8Kolkhagen2 = new JPanel();
      lf8Kolkhagen2.add( new JLabel( new ImageIcon( lf8KolkhagenBild ) ) );
      lf8Kolkhagen2.setVisible( false );
      vehiclePanel.add( lf8Kolkhagen2, "cell 2 19" );

      lf8Kolkhagen3 = new JPanel();
      lf8Kolkhagen3.add( new JLabel( new ImageIcon( lf8KolkhagenBild ) ) );
      lf8Kolkhagen3.setVisible( false );
      vehiclePanel.add( lf8Kolkhagen3, "cell 3 19" );

      lf8Kolkhagen4 = new JPanel();
      lf8Kolkhagen4.add( new JLabel( new ImageIcon( lf8KolkhagenBild ) ) );
      lf8Kolkhagen4.setVisible( false );
      vehiclePanel.add( lf8Kolkhagen4, "cell 4 19" );

      lf8Kolkhagen5 = new JPanel();
      lf8Kolkhagen5.add( new JLabel( new ImageIcon( lf8KolkhagenBild ) ) );
      lf8Kolkhagen5.setVisible( false );
      vehiclePanel.add( lf8Kolkhagen5, "cell 5 19" );

      lf8Kolkhagen6 = new JPanel();
      lf8Kolkhagen6.add( new JLabel( new ImageIcon( lf8KolkhagenBild ) ) );
      lf8Kolkhagen6.setVisible( false );
      vehiclePanel.add( lf8Kolkhagen6, "cell 6 19,alignx left" );

      lf8Kolkhagen7 = new JPanel();
      lf8Kolkhagen7.add( new JLabel( new ImageIcon( lf8KolkhagenBild ) ) );
      lf8Kolkhagen7.setVisible( false );
      vehiclePanel.add( lf8Kolkhagen7, "cell 6 19,alignx right" );

      lf8Kolkhagen8 = new JPanel();
      lf8Kolkhagen8.add( new JLabel( new ImageIcon( lf8KolkhagenBild ) ) );
      lf8Kolkhagen8.setVisible( false );
      vehiclePanel.add( lf8Kolkhagen8, "cell 8 19" );


      // ####################################################################
      JLabel lblGast = new JLabel( "Gast" );
      vehiclePanel.add( lblKolkhagen, "cell 0 20" );
      // ####################################################################
      gast1 = new JPanel();
      gast1.add( new JLabel( new ImageIcon( gastBild ) ) );
      vehiclePanel.add( gast1, "cell 0 21" );

      gast11 = new JPanel();
      gast11.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast11.setVisible( false );
      vehiclePanel.add( gast11, "cell 1 21" );

      gast12 = new JPanel();
      gast12.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast12.setVisible( false );
      vehiclePanel.add( gast12, "cell 2 21" );

      gast13 = new JPanel();
      gast13.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast13.setVisible( false );
      vehiclePanel.add( gast13, "cell 3 21" );

      gast14 = new JPanel();
      gast14.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast14.setVisible( false );
      vehiclePanel.add( gast14, "cell 4 21" );

      gast15 = new JPanel();
      gast15.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast15.setVisible( false );
      vehiclePanel.add( gast15, "cell 5 21" );

      gast16 = new JPanel();
      gast16.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast16.setVisible( false );
      vehiclePanel.add( gast16, "cell 6 21,alignx left" );

      gast17 = new JPanel();
      gast17.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast17.setVisible( false );
      vehiclePanel.add( gast17, "cell 6 21,alignx right" );

      gast18 = new JPanel();
      gast18.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast18.setVisible( false );
      vehiclePanel.add( gast18, "cell 8 21" );

      // ####################################################################
      gast2 = new JPanel();
      gast2.add( new JLabel( new ImageIcon( gastBild ) ) );
      vehiclePanel.add( gast2, "cell 0 22" );

      gast21 = new JPanel();
      gast21.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast21.setVisible( false );
      vehiclePanel.add( gast21, "cell 1 22" );

      gast22 = new JPanel();
      gast22.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast22.setVisible( false );
      vehiclePanel.add( gast22, "cell 2 22" );

      gast23 = new JPanel();
      gast23.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast23.setVisible( false );
      vehiclePanel.add( gast23, "cell 3 22" );

      gast24 = new JPanel();
      gast24.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast24.setVisible( false );
      vehiclePanel.add( gast24, "cell 4 22" );

      gast25 = new JPanel();
      gast25.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast25.setVisible( false );
      vehiclePanel.add( gast25, "cell 5 22" );

      gast26 = new JPanel();
      gast26.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast26.setVisible( false );
      vehiclePanel.add( gast26, "cell 6 22,alignx left" );

      gast27 = new JPanel();
      gast27.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast27.setVisible( false );
      vehiclePanel.add( gast27, "cell 6 22,alignx right" );

      gast28 = new JPanel();
      gast28.add( new JLabel( new ImageIcon( gastBild ) ) );
      gast28.setVisible( false );
      vehiclePanel.add( gast28, "cell 8 22" );
      // ####################################################################


      frame.setJMenuBar( menuBar );
      frame.setSize( 800, 800 );
      frame.setVisible( true );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   public void setSettings( String auto, int zwischenStand ) {
      map.put( auto, zwischenStand );
      switch( auto ) {
         case "tlfMelbeckIndex":
            if( map.get( "tlfMelbeckIndex" ) == 0 ) {
               tlfMelbeck.setVisible( true );
               tlfMelbeck1.setVisible( false );
               tlfMelbeck2.setVisible( false );
               tlfMelbeck3.setVisible( false );
               tlfMelbeck4.setVisible( false );
               tlfMelbeck5.setVisible( false );
               tlfMelbeck6.setVisible( false );
               tlfMelbeck7.setVisible( false );
               tlfMelbeck8.setVisible( false );
            } else if( map.get( "tlfMelbeckIndex" ) == 1 ) {
               tlfMelbeck.setVisible( false );
               tlfMelbeck1.setVisible( true );
               tlfMelbeck2.setVisible( false );
               tlfMelbeck3.setVisible( false );
               tlfMelbeck4.setVisible( false );
               tlfMelbeck5.setVisible( false );
               tlfMelbeck6.setVisible( false );
               tlfMelbeck7.setVisible( false );
               tlfMelbeck8.setVisible( false );
            } else if( map.get( "tlfMelbeckIndex" ) == 2 ) {
               tlfMelbeck.setVisible( false );
               tlfMelbeck1.setVisible( false );
               tlfMelbeck2.setVisible( true );
               tlfMelbeck3.setVisible( false );
               tlfMelbeck4.setVisible( false );
               tlfMelbeck5.setVisible( false );
               tlfMelbeck6.setVisible( false );
               tlfMelbeck7.setVisible( false );
               tlfMelbeck8.setVisible( false );
            } else if( map.get( "tlfMelbeckIndex" ) == 3 ) {
               tlfMelbeck.setVisible( false );
               tlfMelbeck1.setVisible( false );
               tlfMelbeck2.setVisible( false );
               tlfMelbeck3.setVisible( true );
               tlfMelbeck4.setVisible( false );
               tlfMelbeck5.setVisible( false );
               tlfMelbeck6.setVisible( false );
               tlfMelbeck7.setVisible( false );
               tlfMelbeck8.setVisible( false );
            } else if( map.get( "tlfMelbeckIndex" ) == 4 ) {
               tlfMelbeck.setVisible( false );
               tlfMelbeck1.setVisible( false );
               tlfMelbeck2.setVisible( false );
               tlfMelbeck3.setVisible( false );
               tlfMelbeck4.setVisible( true );
               tlfMelbeck5.setVisible( false );
               tlfMelbeck6.setVisible( false );
               tlfMelbeck7.setVisible( false );
               tlfMelbeck8.setVisible( false );
            } else if( map.get( "tlfMelbeckIndex" ) == 5 ) {
               tlfMelbeck.setVisible( false );
               tlfMelbeck1.setVisible( false );
               tlfMelbeck2.setVisible( false );
               tlfMelbeck3.setVisible( false );
               tlfMelbeck4.setVisible( false );
               tlfMelbeck5.setVisible( true );
               tlfMelbeck6.setVisible( false );
               tlfMelbeck7.setVisible( false );
               tlfMelbeck8.setVisible( false );
            } else if( map.get( "tlfMelbeckIndex" ) == 6 ) {
               tlfMelbeck.setVisible( false );
               tlfMelbeck1.setVisible( false );
               tlfMelbeck2.setVisible( false );
               tlfMelbeck3.setVisible( false );
               tlfMelbeck4.setVisible( false );
               tlfMelbeck5.setVisible( false );
               tlfMelbeck6.setVisible( true );
               tlfMelbeck7.setVisible( false );
               tlfMelbeck8.setVisible( false );
            } else if( map.get( "tlfMelbeckIndex" ) == 7 ) {
               tlfMelbeck.setVisible( false );
               tlfMelbeck1.setVisible( false );
               tlfMelbeck2.setVisible( false );
               tlfMelbeck3.setVisible( false );
               tlfMelbeck4.setVisible( false );
               tlfMelbeck5.setVisible( false );
               tlfMelbeck6.setVisible( false );
               tlfMelbeck7.setVisible( true );
               tlfMelbeck8.setVisible( false );
            } else if( map.get( "tlfMelbeckIndex" ) == 8 ) {
               tlfMelbeck.setVisible( false );
               tlfMelbeck1.setVisible( false );
               tlfMelbeck2.setVisible( false );
               tlfMelbeck3.setVisible( false );
               tlfMelbeck4.setVisible( false );
               tlfMelbeck5.setVisible( false );
               tlfMelbeck6.setVisible( false );
               tlfMelbeck7.setVisible( false );
               tlfMelbeck8.setVisible( true );
            }
            break;
         case "lf16MelbeckIndex":
            if( map.get( "lf16MelbeckIndex" ) == 0 ) {
               lf16Melbeck.setVisible( true );
               lf16Melbeck1.setVisible( false );
               lf16Melbeck2.setVisible( false );
               lf16Melbeck3.setVisible( false );
               lf16Melbeck4.setVisible( false );
               lf16Melbeck5.setVisible( false );
               lf16Melbeck6.setVisible( false );
               lf16Melbeck7.setVisible( false );
               lf16Melbeck8.setVisible( false );
            } else if( map.get( "lf16MelbeckIndex" ) == 1 ) {
               lf16Melbeck.setVisible( false );
               lf16Melbeck1.setVisible( true );
               lf16Melbeck2.setVisible( false );
               lf16Melbeck3.setVisible( false );
               lf16Melbeck4.setVisible( false );
               lf16Melbeck5.setVisible( false );
               lf16Melbeck6.setVisible( false );
               lf16Melbeck7.setVisible( false );
               lf16Melbeck8.setVisible( false );
            } else if( map.get( "lf16MelbeckIndex" ) == 2 ) {
               lf16Melbeck.setVisible( false );
               lf16Melbeck1.setVisible( false );
               lf16Melbeck2.setVisible( true );
               lf16Melbeck3.setVisible( false );
               lf16Melbeck4.setVisible( false );
               lf16Melbeck5.setVisible( false );
               lf16Melbeck6.setVisible( false );
               lf16Melbeck7.setVisible( false );
               lf16Melbeck8.setVisible( false );
            } else if( map.get( "lf16MelbeckIndex" ) == 3 ) {
               lf16Melbeck.setVisible( false );
               lf16Melbeck1.setVisible( false );
               lf16Melbeck2.setVisible( false );
               lf16Melbeck3.setVisible( true );
               lf16Melbeck4.setVisible( false );
               lf16Melbeck5.setVisible( false );
               lf16Melbeck6.setVisible( false );
               lf16Melbeck7.setVisible( false );
               lf16Melbeck8.setVisible( false );
            } else if( map.get( "lf16MelbeckIndex" ) == 4 ) {
               lf16Melbeck.setVisible( false );
               lf16Melbeck1.setVisible( false );
               lf16Melbeck2.setVisible( false );
               lf16Melbeck3.setVisible( false );
               lf16Melbeck4.setVisible( true );
               lf16Melbeck5.setVisible( false );
               lf16Melbeck6.setVisible( false );
               lf16Melbeck7.setVisible( false );
               lf16Melbeck8.setVisible( false );
            } else if( map.get( "lf16MelbeckIndex" ) == 5 ) {
               lf16Melbeck.setVisible( false );
               lf16Melbeck1.setVisible( false );
               lf16Melbeck2.setVisible( false );
               lf16Melbeck3.setVisible( false );
               lf16Melbeck4.setVisible( false );
               lf16Melbeck5.setVisible( true );
               lf16Melbeck6.setVisible( false );
               lf16Melbeck7.setVisible( false );
               lf16Melbeck8.setVisible( false );
            } else if( map.get( "lf16MelbeckIndex" ) == 6 ) {
               lf16Melbeck.setVisible( false );
               lf16Melbeck1.setVisible( false );
               lf16Melbeck2.setVisible( false );
               lf16Melbeck3.setVisible( false );
               lf16Melbeck4.setVisible( false );
               lf16Melbeck5.setVisible( false );
               lf16Melbeck6.setVisible( true );
               lf16Melbeck7.setVisible( false );
               lf16Melbeck8.setVisible( false );
            } else if( map.get( "lf16MelbeckIndex" ) == 7 ) {
               lf16Melbeck.setVisible( false );
               lf16Melbeck1.setVisible( false );
               lf16Melbeck2.setVisible( false );
               lf16Melbeck3.setVisible( false );
               lf16Melbeck4.setVisible( false );
               lf16Melbeck5.setVisible( false );
               lf16Melbeck6.setVisible( false );
               lf16Melbeck7.setVisible( true );
               lf16Melbeck8.setVisible( false );
            } else if( map.get( "lf16MelbeckIndex" ) == 8 ) {
               lf16Melbeck.setVisible( false );
               lf16Melbeck1.setVisible( false );
               lf16Melbeck2.setVisible( false );
               lf16Melbeck3.setVisible( false );
               lf16Melbeck4.setVisible( false );
               lf16Melbeck5.setVisible( false );
               lf16Melbeck6.setVisible( false );
               lf16Melbeck7.setVisible( false );
               lf16Melbeck8.setVisible( true );
            }
            break;
         case "lf8MelbeckIndex":
            if( map.get( "lf8MelbeckIndex" ) == 0 ) {
               lf8Melbeck.setVisible( true );
               lf8Melbeck1.setVisible( false );
               lf8Melbeck2.setVisible( false );
               lf8Melbeck3.setVisible( false );
               lf8Melbeck4.setVisible( false );
               lf8Melbeck5.setVisible( false );
               lf8Melbeck6.setVisible( false );
               lf8Melbeck7.setVisible( false );
               lf8Melbeck8.setVisible( false );
            } else if( map.get( "lf8MelbeckIndex" ) == 1 ) {
               lf8Melbeck.setVisible( false );
               lf8Melbeck1.setVisible( true );
               lf8Melbeck2.setVisible( false );
               lf8Melbeck3.setVisible( false );
               lf8Melbeck4.setVisible( false );
               lf8Melbeck5.setVisible( false );
               lf8Melbeck6.setVisible( false );
               lf8Melbeck7.setVisible( false );
               lf8Melbeck8.setVisible( false );
            } else if( map.get( "lf8MelbeckIndex" ) == 2 ) {
               lf8Melbeck.setVisible( false );
               lf8Melbeck1.setVisible( false );
               lf8Melbeck2.setVisible( true );
               lf8Melbeck3.setVisible( false );
               lf8Melbeck4.setVisible( false );
               lf8Melbeck5.setVisible( false );
               lf8Melbeck6.setVisible( false );
               lf8Melbeck7.setVisible( false );
               lf8Melbeck8.setVisible( false );
            } else if( map.get( "lf8MelbeckIndex" ) == 3 ) {
               lf8Melbeck.setVisible( false );
               lf8Melbeck1.setVisible( false );
               lf8Melbeck2.setVisible( false );
               lf8Melbeck3.setVisible( true );
               lf8Melbeck4.setVisible( false );
               lf8Melbeck5.setVisible( false );
               lf8Melbeck6.setVisible( false );
               lf8Melbeck7.setVisible( false );
               lf8Melbeck8.setVisible( false );
            } else if( map.get( "lf8MelbeckIndex" ) == 4 ) {
               lf8Melbeck.setVisible( false );
               lf8Melbeck1.setVisible( false );
               lf8Melbeck2.setVisible( false );
               lf8Melbeck3.setVisible( false );
               lf8Melbeck4.setVisible( true );
               lf8Melbeck5.setVisible( false );
               lf8Melbeck6.setVisible( false );
               lf8Melbeck7.setVisible( false );
               lf8Melbeck8.setVisible( false );
            } else if( map.get( "lf8MelbeckIndex" ) == 5 ) {
               lf8Melbeck.setVisible( false );
               lf8Melbeck1.setVisible( false );
               lf8Melbeck2.setVisible( false );
               lf8Melbeck3.setVisible( false );
               lf8Melbeck4.setVisible( false );
               lf8Melbeck5.setVisible( true );
               lf8Melbeck6.setVisible( false );
               lf8Melbeck7.setVisible( false );
               lf8Melbeck8.setVisible( false );
            } else if( map.get( "lf8MelbeckIndex" ) == 6 ) {
               lf8Melbeck.setVisible( false );
               lf8Melbeck1.setVisible( false );
               lf8Melbeck2.setVisible( false );
               lf8Melbeck3.setVisible( false );
               lf8Melbeck4.setVisible( false );
               lf8Melbeck5.setVisible( false );
               lf8Melbeck6.setVisible( true );
               lf8Melbeck7.setVisible( false );
               lf8Melbeck8.setVisible( false );
            } else if( map.get( "lf8MelbeckIndex" ) == 7 ) {
               lf8Melbeck.setVisible( false );
               lf8Melbeck1.setVisible( false );
               lf8Melbeck2.setVisible( false );
               lf8Melbeck3.setVisible( false );
               lf8Melbeck4.setVisible( false );
               lf8Melbeck5.setVisible( false );
               lf8Melbeck6.setVisible( false );
               lf8Melbeck7.setVisible( true );
               lf8Melbeck8.setVisible( false );
            } else if( map.get( "lf8MelbeckIndex" ) == 8 ) {
               lf8Melbeck.setVisible( false );
               lf8Melbeck1.setVisible( false );
               lf8Melbeck2.setVisible( false );
               lf8Melbeck3.setVisible( false );
               lf8Melbeck4.setVisible( false );
               lf8Melbeck5.setVisible( false );
               lf8Melbeck6.setVisible( false );
               lf8Melbeck7.setVisible( false );
               lf8Melbeck8.setVisible( true );
            }
            break;
         case "tlfDeutschEvernIndex":
            if( map.get( "tlfDeutschEvernIndex" ) == 0 ) {
               tlfDeutschEvern.setVisible( true );
               tlfDeutschEvern1.setVisible( false );
               tlfDeutschEvern2.setVisible( false );
               tlfDeutschEvern3.setVisible( false );
               tlfDeutschEvern4.setVisible( false );
               tlfDeutschEvern5.setVisible( false );
               tlfDeutschEvern6.setVisible( false );
               tlfDeutschEvern7.setVisible( false );
               tlfDeutschEvern8.setVisible( false );
            } else if( map.get( "tlfDeutschEvernIndex" ) == 1 ) {
               tlfDeutschEvern.setVisible( false );
               tlfDeutschEvern1.setVisible( true );
               tlfDeutschEvern2.setVisible( false );
               tlfDeutschEvern3.setVisible( false );
               tlfDeutschEvern4.setVisible( false );
               tlfDeutschEvern5.setVisible( false );
               tlfDeutschEvern6.setVisible( false );
               tlfDeutschEvern7.setVisible( false );
               tlfDeutschEvern8.setVisible( false );
            } else if( map.get( "tlfDeutschEvernIndex" ) == 2 ) {
               tlfDeutschEvern.setVisible( false );
               tlfDeutschEvern1.setVisible( false );
               tlfDeutschEvern2.setVisible( true );
               tlfDeutschEvern3.setVisible( false );
               tlfDeutschEvern4.setVisible( false );
               tlfDeutschEvern5.setVisible( false );
               tlfDeutschEvern6.setVisible( false );
               tlfDeutschEvern7.setVisible( false );
               tlfDeutschEvern8.setVisible( false );
            } else if( map.get( "tlfDeutschEvernIndex" ) == 3 ) {
               tlfDeutschEvern.setVisible( false );
               tlfDeutschEvern1.setVisible( false );
               tlfDeutschEvern2.setVisible( false );
               tlfDeutschEvern3.setVisible( true );
               tlfDeutschEvern4.setVisible( false );
               tlfDeutschEvern5.setVisible( false );
               tlfDeutschEvern6.setVisible( false );
               tlfDeutschEvern7.setVisible( false );
               tlfDeutschEvern8.setVisible( false );
            } else if( map.get( "tlfDeutschEvernIndex" ) == 4 ) {
               tlfDeutschEvern.setVisible( false );
               tlfDeutschEvern1.setVisible( false );
               tlfDeutschEvern2.setVisible( false );
               tlfDeutschEvern3.setVisible( false );
               tlfDeutschEvern4.setVisible( true );
               tlfDeutschEvern5.setVisible( false );
               tlfDeutschEvern6.setVisible( false );
               tlfDeutschEvern7.setVisible( false );
               tlfDeutschEvern8.setVisible( false );
            } else if( map.get( "tlfDeutschEvernIndex" ) == 5 ) {
               tlfDeutschEvern.setVisible( false );
               tlfDeutschEvern1.setVisible( false );
               tlfDeutschEvern2.setVisible( false );
               tlfDeutschEvern3.setVisible( false );
               tlfDeutschEvern4.setVisible( false );
               tlfDeutschEvern5.setVisible( true );
               tlfDeutschEvern6.setVisible( false );
               tlfDeutschEvern7.setVisible( false );
               tlfDeutschEvern8.setVisible( false );
            } else if( map.get( "tlfDeutschEvernIndex" ) == 6 ) {
               tlfDeutschEvern.setVisible( false );
               tlfDeutschEvern1.setVisible( false );
               tlfDeutschEvern2.setVisible( false );
               tlfDeutschEvern3.setVisible( false );
               tlfDeutschEvern4.setVisible( false );
               tlfDeutschEvern5.setVisible( false );
               tlfDeutschEvern6.setVisible( true );
               tlfDeutschEvern7.setVisible( false );
               tlfDeutschEvern8.setVisible( false );
            } else if( map.get( "tlfDeutschEvernIndex" ) == 7 ) {
               tlfDeutschEvern.setVisible( false );
               tlfDeutschEvern1.setVisible( false );
               tlfDeutschEvern2.setVisible( false );
               tlfDeutschEvern3.setVisible( false );
               tlfDeutschEvern4.setVisible( false );
               tlfDeutschEvern5.setVisible( false );
               tlfDeutschEvern6.setVisible( false );
               tlfDeutschEvern7.setVisible( true );
               tlfDeutschEvern8.setVisible( false );
            } else if( map.get( "tlfDeutschEvernIndex" ) == 8 ) {
               tlfDeutschEvern.setVisible( false );
               tlfDeutschEvern1.setVisible( false );
               tlfDeutschEvern2.setVisible( false );
               tlfDeutschEvern3.setVisible( false );
               tlfDeutschEvern4.setVisible( false );
               tlfDeutschEvern5.setVisible( false );
               tlfDeutschEvern6.setVisible( false );
               tlfDeutschEvern7.setVisible( false );
               tlfDeutschEvern8.setVisible( true );
            }
            break;
         case "lf8DeutschEvernIndex":
            if( map.get( "lf8DeutschEvernIndex" ) == 0 ) {
               lf8DeutschEvern.setVisible( true );
               lf8DeutschEvern1.setVisible( false );
               lf8DeutschEvern2.setVisible( false );
               lf8DeutschEvern3.setVisible( false );
               lf8DeutschEvern4.setVisible( false );
               lf8DeutschEvern5.setVisible( false );
               lf8DeutschEvern6.setVisible( false );
               lf8DeutschEvern7.setVisible( false );
               lf8DeutschEvern8.setVisible( false );
            } else if( map.get( "lf8DeutschEvernIndex" ) == 1 ) {
               lf8DeutschEvern.setVisible( false );
               lf8DeutschEvern1.setVisible( true );
               lf8DeutschEvern2.setVisible( false );
               lf8DeutschEvern3.setVisible( false );
               lf8DeutschEvern4.setVisible( false );
               lf8DeutschEvern5.setVisible( false );
               lf8DeutschEvern6.setVisible( false );
               lf8DeutschEvern7.setVisible( false );
               lf8DeutschEvern8.setVisible( false );
            } else if( map.get( "lf8DeutschEvernIndex" ) == 2 ) {
               lf8DeutschEvern.setVisible( false );
               lf8DeutschEvern1.setVisible( false );
               lf8DeutschEvern2.setVisible( true );
               lf8DeutschEvern3.setVisible( false );
               lf8DeutschEvern4.setVisible( false );
               lf8DeutschEvern5.setVisible( false );
               lf8DeutschEvern6.setVisible( false );
               lf8DeutschEvern7.setVisible( false );
               lf8DeutschEvern8.setVisible( false );
            } else if( map.get( "lf8DeutschEvernIndex" ) == 3 ) {
               lf8DeutschEvern.setVisible( false );
               lf8DeutschEvern1.setVisible( false );
               lf8DeutschEvern2.setVisible( false );
               lf8DeutschEvern3.setVisible( true );
               lf8DeutschEvern4.setVisible( false );
               lf8DeutschEvern5.setVisible( false );
               lf8DeutschEvern6.setVisible( false );
               lf8DeutschEvern7.setVisible( false );
               lf8DeutschEvern8.setVisible( false );
            } else if( map.get( "lf8DeutschEvernIndex" ) == 4 ) {
               lf8DeutschEvern.setVisible( false );
               lf8DeutschEvern1.setVisible( false );
               lf8DeutschEvern2.setVisible( false );
               lf8DeutschEvern3.setVisible( false );
               lf8DeutschEvern4.setVisible( true );
               lf8DeutschEvern5.setVisible( false );
               lf8DeutschEvern6.setVisible( false );
               lf8DeutschEvern7.setVisible( false );
               lf8DeutschEvern8.setVisible( false );
            } else if( map.get( "lf8DeutschEvernIndex" ) == 5 ) {
               lf8DeutschEvern.setVisible( false );
               lf8DeutschEvern1.setVisible( false );
               lf8DeutschEvern2.setVisible( false );
               lf8DeutschEvern3.setVisible( false );
               lf8DeutschEvern4.setVisible( false );
               lf8DeutschEvern5.setVisible( true );
               lf8DeutschEvern6.setVisible( false );
               lf8DeutschEvern7.setVisible( false );
               lf8DeutschEvern8.setVisible( false );
            } else if( map.get( "lf8DeutschEvernIndex" ) == 6 ) {
               lf8DeutschEvern.setVisible( false );
               lf8DeutschEvern1.setVisible( false );
               lf8DeutschEvern2.setVisible( false );
               lf8DeutschEvern3.setVisible( false );
               lf8DeutschEvern4.setVisible( false );
               lf8DeutschEvern5.setVisible( false );
               lf8DeutschEvern6.setVisible( true );
               lf8DeutschEvern7.setVisible( false );
               lf8DeutschEvern8.setVisible( false );
            } else if( map.get( "lf8DeutschEvernIndex" ) == 7 ) {
               lf8DeutschEvern.setVisible( false );
               lf8DeutschEvern1.setVisible( false );
               lf8DeutschEvern2.setVisible( false );
               lf8DeutschEvern3.setVisible( false );
               lf8DeutschEvern4.setVisible( false );
               lf8DeutschEvern5.setVisible( false );
               lf8DeutschEvern6.setVisible( false );
               lf8DeutschEvern7.setVisible( true );
               lf8DeutschEvern8.setVisible( false );
            } else if( map.get( "lf8DeutschEvernIndex" ) == 8 ) {
               lf8DeutschEvern.setVisible( false );
               lf8DeutschEvern1.setVisible( false );
               lf8DeutschEvern2.setVisible( false );
               lf8DeutschEvern3.setVisible( false );
               lf8DeutschEvern4.setVisible( false );
               lf8DeutschEvern5.setVisible( false );
               lf8DeutschEvern6.setVisible( false );
               lf8DeutschEvern7.setVisible( false );
               lf8DeutschEvern8.setVisible( true );
            }
            break;
         case "rwEmbsenIndex":
            if( map.get( "rwEmbsenIndex" ) == 0 ) {
               rwEmbsen.setVisible( true );
               rwEmbsen1.setVisible( false );
               rwEmbsen2.setVisible( false );
               rwEmbsen3.setVisible( false );
               rwEmbsen4.setVisible( false );
               rwEmbsen5.setVisible( false );
               rwEmbsen6.setVisible( false );
               rwEmbsen7.setVisible( false );
               rwEmbsen8.setVisible( false );
            } else if( map.get( "rwEmbsenIndex" ) == 1 ) {
               rwEmbsen.setVisible( false );
               rwEmbsen1.setVisible( true );
               rwEmbsen2.setVisible( false );
               rwEmbsen3.setVisible( false );
               rwEmbsen4.setVisible( false );
               rwEmbsen5.setVisible( false );
               rwEmbsen6.setVisible( false );
               rwEmbsen7.setVisible( false );
               rwEmbsen8.setVisible( false );
            } else if( map.get( "rwEmbsenIndex" ) == 2 ) {
               rwEmbsen.setVisible( false );
               rwEmbsen1.setVisible( false );
               rwEmbsen2.setVisible( true );
               rwEmbsen3.setVisible( false );
               rwEmbsen4.setVisible( false );
               rwEmbsen5.setVisible( false );
               rwEmbsen6.setVisible( false );
               rwEmbsen7.setVisible( false );
               rwEmbsen8.setVisible( false );
            } else if( map.get( "rwEmbsenIndex" ) == 3 ) {
               rwEmbsen.setVisible( false );
               rwEmbsen1.setVisible( false );
               rwEmbsen2.setVisible( false );
               rwEmbsen3.setVisible( true );
               rwEmbsen4.setVisible( false );
               rwEmbsen5.setVisible( false );
               rwEmbsen6.setVisible( false );
               rwEmbsen7.setVisible( false );
               rwEmbsen8.setVisible( false );
            } else if( map.get( "rwEmbsenIndex" ) == 4 ) {
               rwEmbsen.setVisible( false );
               rwEmbsen1.setVisible( false );
               rwEmbsen2.setVisible( false );
               rwEmbsen3.setVisible( false );
               rwEmbsen4.setVisible( true );
               rwEmbsen5.setVisible( false );
               rwEmbsen6.setVisible( false );
               rwEmbsen7.setVisible( false );
               rwEmbsen8.setVisible( false );
            } else if( map.get( "rwEmbsenIndex" ) == 5 ) {
               rwEmbsen.setVisible( false );
               rwEmbsen1.setVisible( false );
               rwEmbsen2.setVisible( false );
               rwEmbsen3.setVisible( false );
               rwEmbsen4.setVisible( false );
               rwEmbsen5.setVisible( true );
               rwEmbsen6.setVisible( false );
               rwEmbsen7.setVisible( false );
               rwEmbsen8.setVisible( false );
            } else if( map.get( "rwEmbsenIndex" ) == 6 ) {
               rwEmbsen.setVisible( false );
               rwEmbsen1.setVisible( false );
               rwEmbsen2.setVisible( false );
               rwEmbsen3.setVisible( false );
               rwEmbsen4.setVisible( false );
               rwEmbsen5.setVisible( false );
               rwEmbsen6.setVisible( true );
               rwEmbsen7.setVisible( false );
               rwEmbsen8.setVisible( false );
            } else if( map.get( "rwEmbsenIndex" ) == 7 ) {
               rwEmbsen.setVisible( false );
               rwEmbsen1.setVisible( false );
               rwEmbsen2.setVisible( false );
               rwEmbsen3.setVisible( false );
               rwEmbsen4.setVisible( false );
               rwEmbsen5.setVisible( false );
               rwEmbsen6.setVisible( false );
               rwEmbsen7.setVisible( true );
               rwEmbsen8.setVisible( false );
            } else if( map.get( "rwEmbsenIndex" ) == 8 ) {
               rwEmbsen.setVisible( false );
               rwEmbsen1.setVisible( false );
               rwEmbsen2.setVisible( false );
               rwEmbsen3.setVisible( false );
               rwEmbsen4.setVisible( false );
               rwEmbsen5.setVisible( false );
               rwEmbsen6.setVisible( false );
               rwEmbsen7.setVisible( false );
               rwEmbsen8.setVisible( true );
            }
            break;
         case "lfEmbsenIndex":
            if( map.get( "lfEmbsenIndex" ) == 0 ) {
               lfEmbsen.setVisible( true );
               lfEmbsen1.setVisible( false );
               lfEmbsen2.setVisible( false );
               lfEmbsen3.setVisible( false );
               lfEmbsen4.setVisible( false );
               lfEmbsen5.setVisible( false );
               lfEmbsen6.setVisible( false );
               lfEmbsen7.setVisible( false );
               lfEmbsen8.setVisible( false );
            } else if( map.get( "lfEmbsenIndex" ) == 1 ) {
               lfEmbsen.setVisible( false );
               lfEmbsen1.setVisible( true );
               lfEmbsen2.setVisible( false );
               lfEmbsen3.setVisible( false );
               lfEmbsen4.setVisible( false );
               lfEmbsen5.setVisible( false );
               lfEmbsen6.setVisible( false );
               lfEmbsen7.setVisible( false );
               lfEmbsen8.setVisible( false );
            } else if( map.get( "lfEmbsenIndex" ) == 2 ) {
               lfEmbsen.setVisible( false );
               lfEmbsen1.setVisible( false );
               lfEmbsen2.setVisible( true );
               lfEmbsen3.setVisible( false );
               lfEmbsen4.setVisible( false );
               lfEmbsen5.setVisible( false );
               lfEmbsen6.setVisible( false );
               lfEmbsen7.setVisible( false );
               lfEmbsen8.setVisible( false );
            } else if( map.get( "lfEmbsenIndex" ) == 3 ) {
               lfEmbsen.setVisible( false );
               lfEmbsen1.setVisible( false );
               lfEmbsen2.setVisible( false );
               lfEmbsen3.setVisible( true );
               lfEmbsen4.setVisible( false );
               lfEmbsen5.setVisible( false );
               lfEmbsen6.setVisible( false );
               lfEmbsen7.setVisible( false );
               lfEmbsen8.setVisible( false );
            } else if( map.get( "lfEmbsenIndex" ) == 4 ) {
               lfEmbsen.setVisible( false );
               lfEmbsen1.setVisible( false );
               lfEmbsen2.setVisible( false );
               lfEmbsen3.setVisible( false );
               lfEmbsen4.setVisible( true );
               lfEmbsen5.setVisible( false );
               lfEmbsen6.setVisible( false );
               lfEmbsen7.setVisible( false );
               lfEmbsen8.setVisible( false );
            } else if( map.get( "lfEmbsenIndex" ) == 5 ) {
               lfEmbsen.setVisible( false );
               lfEmbsen1.setVisible( false );
               lfEmbsen2.setVisible( false );
               lfEmbsen3.setVisible( false );
               lfEmbsen4.setVisible( false );
               lfEmbsen5.setVisible( true );
               lfEmbsen6.setVisible( false );
               lfEmbsen7.setVisible( false );
               lfEmbsen8.setVisible( false );
            } else if( map.get( "lfEmbsenIndex" ) == 6 ) {
               lfEmbsen.setVisible( false );
               lfEmbsen1.setVisible( false );
               lfEmbsen2.setVisible( false );
               lfEmbsen3.setVisible( false );
               lfEmbsen4.setVisible( false );
               lfEmbsen5.setVisible( false );
               lfEmbsen6.setVisible( true );
               lfEmbsen7.setVisible( false );
               lfEmbsen8.setVisible( false );
            } else if( map.get( "lfEmbsenIndex" ) == 7 ) {
               lfEmbsen.setVisible( false );
               lfEmbsen1.setVisible( false );
               lfEmbsen2.setVisible( false );
               lfEmbsen3.setVisible( false );
               lfEmbsen4.setVisible( false );
               lfEmbsen5.setVisible( false );
               lfEmbsen6.setVisible( false );
               lfEmbsen7.setVisible( true );
               lfEmbsen8.setVisible( false );
            } else if( map.get( "lfEmbsenIndex" ) == 8 ) {
               lfEmbsen.setVisible( false );
               lfEmbsen1.setVisible( false );
               lfEmbsen2.setVisible( false );
               lfEmbsen3.setVisible( false );
               lfEmbsen4.setVisible( false );
               lfEmbsen5.setVisible( false );
               lfEmbsen6.setVisible( false );
               lfEmbsen7.setVisible( false );
               lfEmbsen8.setVisible( true );
            }
            break;
         case "tlfOerzenIndex":
            if( map.get( "tlfOerzenIndex" ) == 0 ) {
               tlfOerzen.setVisible( true );
               tlfOerzen1.setVisible( false );
               tlfOerzen2.setVisible( false );
               tlfOerzen3.setVisible( false );
               tlfOerzen4.setVisible( false );
               tlfOerzen5.setVisible( false );
               tlfOerzen6.setVisible( false );
               tlfOerzen7.setVisible( false );
               tlfOerzen8.setVisible( false );
            } else if( map.get( "tlfOerzenIndex" ) == 1 ) {
               tlfOerzen.setVisible( false );
               tlfOerzen1.setVisible( true );
               tlfOerzen2.setVisible( false );
               tlfOerzen3.setVisible( false );
               tlfOerzen4.setVisible( false );
               tlfOerzen5.setVisible( false );
               tlfOerzen6.setVisible( false );
               tlfOerzen7.setVisible( false );
               tlfOerzen8.setVisible( false );
            } else if( map.get( "tlfOerzenIndex" ) == 2 ) {
               tlfOerzen.setVisible( false );
               tlfOerzen1.setVisible( false );
               tlfOerzen2.setVisible( true );
               tlfOerzen3.setVisible( false );
               tlfOerzen4.setVisible( false );
               tlfOerzen5.setVisible( false );
               tlfOerzen6.setVisible( false );
               tlfOerzen7.setVisible( false );
               tlfOerzen8.setVisible( false );
            } else if( map.get( "tlfOerzenIndex" ) == 3 ) {
               tlfOerzen.setVisible( false );
               tlfOerzen1.setVisible( false );
               tlfOerzen2.setVisible( false );
               tlfOerzen3.setVisible( true );
               tlfOerzen4.setVisible( false );
               tlfOerzen5.setVisible( false );
               tlfOerzen6.setVisible( false );
               tlfOerzen7.setVisible( false );
               tlfOerzen8.setVisible( false );
            } else if( map.get( "tlfOerzenIndex" ) == 4 ) {
               tlfOerzen.setVisible( false );
               tlfOerzen1.setVisible( false );
               tlfOerzen2.setVisible( false );
               tlfOerzen3.setVisible( false );
               tlfOerzen4.setVisible( true );
               tlfOerzen5.setVisible( false );
               tlfOerzen6.setVisible( false );
               tlfOerzen7.setVisible( false );
               tlfOerzen8.setVisible( false );
            } else if( map.get( "tlfOerzenIndex" ) == 5 ) {
               tlfOerzen.setVisible( false );
               tlfOerzen1.setVisible( false );
               tlfOerzen2.setVisible( false );
               tlfOerzen3.setVisible( false );
               tlfOerzen4.setVisible( false );
               tlfOerzen5.setVisible( true );
               tlfOerzen6.setVisible( false );
               tlfOerzen7.setVisible( false );
               tlfOerzen8.setVisible( false );
            } else if( map.get( "tlfOerzenIndex" ) == 6 ) {
               tlfOerzen.setVisible( false );
               tlfOerzen1.setVisible( false );
               tlfOerzen2.setVisible( false );
               tlfOerzen3.setVisible( false );
               tlfOerzen4.setVisible( false );
               tlfOerzen5.setVisible( false );
               tlfOerzen6.setVisible( true );
               tlfOerzen7.setVisible( false );
               tlfOerzen8.setVisible( false );
            } else if( map.get( "tlfOerzenIndex" ) == 7 ) {
               tlfOerzen.setVisible( false );
               tlfOerzen1.setVisible( false );
               tlfOerzen2.setVisible( false );
               tlfOerzen3.setVisible( false );
               tlfOerzen4.setVisible( false );
               tlfOerzen5.setVisible( false );
               tlfOerzen6.setVisible( false );
               tlfOerzen7.setVisible( true );
               tlfOerzen8.setVisible( false );
            } else if( map.get( "tlfOerzenIndex" ) == 8 ) {
               tlfOerzen.setVisible( false );
               tlfOerzen1.setVisible( false );
               tlfOerzen2.setVisible( false );
               tlfOerzen3.setVisible( false );
               tlfOerzen4.setVisible( false );
               tlfOerzen5.setVisible( false );
               tlfOerzen6.setVisible( false );
               tlfOerzen7.setVisible( false );
               tlfOerzen8.setVisible( true );
            }
            break;
         case "tsfOerzenIndex":
            if( map.get( "tsfOerzenIndex" ) == 0 ) {
               tsfOerzen.setVisible( true );
               tsfOerzen1.setVisible( false );
               tsfOerzen2.setVisible( false );
               tsfOerzen3.setVisible( false );
               tsfOerzen4.setVisible( false );
               tsfOerzen5.setVisible( false );
               tsfOerzen6.setVisible( false );
               tsfOerzen7.setVisible( false );
               tsfOerzen8.setVisible( false );
            } else if( map.get( "tsfOerzenIndex" ) == 1 ) {
               tsfOerzen.setVisible( false );
               tsfOerzen1.setVisible( true );
               tsfOerzen2.setVisible( false );
               tsfOerzen3.setVisible( false );
               tsfOerzen4.setVisible( false );
               tsfOerzen5.setVisible( false );
               tsfOerzen6.setVisible( false );
               tsfOerzen7.setVisible( false );
               tsfOerzen8.setVisible( false );
            } else if( map.get( "tsfOerzenIndex" ) == 2 ) {
               tsfOerzen.setVisible( false );
               tsfOerzen1.setVisible( false );
               tsfOerzen2.setVisible( true );
               tsfOerzen3.setVisible( false );
               tsfOerzen4.setVisible( false );
               tsfOerzen5.setVisible( false );
               tsfOerzen6.setVisible( false );
               tsfOerzen7.setVisible( false );
               tsfOerzen8.setVisible( false );
            } else if( map.get( "tsfOerzenIndex" ) == 3 ) {
               tsfOerzen.setVisible( false );
               tsfOerzen1.setVisible( false );
               tsfOerzen2.setVisible( false );
               tsfOerzen3.setVisible( true );
               tsfOerzen4.setVisible( false );
               tsfOerzen5.setVisible( false );
               tsfOerzen6.setVisible( false );
               tsfOerzen7.setVisible( false );
               tsfOerzen8.setVisible( false );
            } else if( map.get( "tsfOerzenIndex" ) == 4 ) {
               tsfOerzen.setVisible( false );
               tsfOerzen1.setVisible( false );
               tsfOerzen2.setVisible( false );
               tsfOerzen3.setVisible( false );
               tsfOerzen4.setVisible( true );
               tsfOerzen5.setVisible( false );
               tsfOerzen6.setVisible( false );
               tsfOerzen7.setVisible( false );
               tsfOerzen8.setVisible( false );
            } else if( map.get( "tsfOerzenIndex" ) == 5 ) {
               tsfOerzen.setVisible( false );
               tsfOerzen1.setVisible( false );
               tsfOerzen2.setVisible( false );
               tsfOerzen3.setVisible( false );
               tsfOerzen4.setVisible( false );
               tsfOerzen5.setVisible( true );
               tsfOerzen6.setVisible( false );
               tsfOerzen7.setVisible( false );
               tsfOerzen8.setVisible( false );
            } else if( map.get( "tsfOerzenIndex" ) == 6 ) {
               tsfOerzen.setVisible( false );
               tsfOerzen1.setVisible( false );
               tsfOerzen2.setVisible( false );
               tsfOerzen3.setVisible( false );
               tsfOerzen4.setVisible( false );
               tsfOerzen5.setVisible( false );
               tsfOerzen6.setVisible( true );
               tsfOerzen7.setVisible( false );
               tsfOerzen8.setVisible( false );
            } else if( map.get( "tsfOerzenIndex" ) == 7 ) {
               tsfOerzen.setVisible( false );
               tsfOerzen1.setVisible( false );
               tsfOerzen2.setVisible( false );
               tsfOerzen3.setVisible( false );
               tsfOerzen4.setVisible( false );
               tsfOerzen5.setVisible( false );
               tsfOerzen6.setVisible( false );
               tsfOerzen7.setVisible( true );
               tsfOerzen8.setVisible( false );
            } else if( map.get( "tsfOerzenIndex" ) == 8 ) {
               tsfOerzen.setVisible( false );
               tsfOerzen1.setVisible( false );
               tsfOerzen2.setVisible( false );
               tsfOerzen3.setVisible( false );
               tsfOerzen4.setVisible( false );
               tsfOerzen5.setVisible( false );
               tsfOerzen6.setVisible( false );
               tsfOerzen7.setVisible( false );
               tsfOerzen8.setVisible( true );
            }
            break;
         case "tlfBarnstedtIndex":
            if( map.get( "tlfBarnstedtIndex" ) == 0 ) {
               tlfBarnstedt.setVisible( true );
               tlfBarnstedt1.setVisible( false );
               tlfBarnstedt2.setVisible( false );
               tlfBarnstedt3.setVisible( false );
               tlfBarnstedt4.setVisible( false );
               tlfBarnstedt5.setVisible( false );
               tlfBarnstedt6.setVisible( false );
               tlfBarnstedt7.setVisible( false );
               tlfBarnstedt8.setVisible( false );
            } else if( map.get( "tlfBarnstedtIndex" ) == 1 ) {
               tlfBarnstedt.setVisible( false );
               tlfBarnstedt1.setVisible( true );
               tlfBarnstedt2.setVisible( false );
               tlfBarnstedt3.setVisible( false );
               tlfBarnstedt4.setVisible( false );
               tlfBarnstedt5.setVisible( false );
               tlfBarnstedt6.setVisible( false );
               tlfBarnstedt7.setVisible( false );
               tlfBarnstedt8.setVisible( false );
            } else if( map.get( "tlfBarnstedtIndex" ) == 2 ) {
               tlfBarnstedt.setVisible( false );
               tlfBarnstedt1.setVisible( false );
               tlfBarnstedt2.setVisible( true );
               tlfBarnstedt3.setVisible( false );
               tlfBarnstedt4.setVisible( false );
               tlfBarnstedt5.setVisible( false );
               tlfBarnstedt6.setVisible( false );
               tlfBarnstedt7.setVisible( false );
               tlfBarnstedt8.setVisible( false );
            } else if( map.get( "tlfBarnstedtIndex" ) == 3 ) {
               tlfBarnstedt.setVisible( false );
               tlfBarnstedt1.setVisible( false );
               tlfBarnstedt2.setVisible( false );
               tlfBarnstedt3.setVisible( true );
               tlfBarnstedt4.setVisible( false );
               tlfBarnstedt5.setVisible( false );
               tlfBarnstedt6.setVisible( false );
               tlfBarnstedt7.setVisible( false );
               tlfBarnstedt8.setVisible( false );
            } else if( map.get( "tlfBarnstedtIndex" ) == 4 ) {
               tlfBarnstedt.setVisible( false );
               tlfBarnstedt1.setVisible( false );
               tlfBarnstedt2.setVisible( false );
               tlfBarnstedt3.setVisible( false );
               tlfBarnstedt4.setVisible( true );
               tlfBarnstedt5.setVisible( false );
               tlfBarnstedt6.setVisible( false );
               tlfBarnstedt7.setVisible( false );
               tlfBarnstedt8.setVisible( false );
            } else if( map.get( "tlfBarnstedtIndex" ) == 5 ) {
               tlfBarnstedt.setVisible( false );
               tlfBarnstedt1.setVisible( false );
               tlfBarnstedt2.setVisible( false );
               tlfBarnstedt3.setVisible( false );
               tlfBarnstedt4.setVisible( false );
               tlfBarnstedt5.setVisible( true );
               tlfBarnstedt6.setVisible( false );
               tlfBarnstedt7.setVisible( false );
               tlfBarnstedt8.setVisible( false );
            } else if( map.get( "tlfBarnstedtIndex" ) == 6 ) {
               tlfBarnstedt.setVisible( false );
               tlfBarnstedt1.setVisible( false );
               tlfBarnstedt2.setVisible( false );
               tlfBarnstedt3.setVisible( false );
               tlfBarnstedt4.setVisible( false );
               tlfBarnstedt5.setVisible( false );
               tlfBarnstedt6.setVisible( true );
               tlfBarnstedt7.setVisible( false );
               tlfBarnstedt8.setVisible( false );
            } else if( map.get( "tlfBarnstedtIndex" ) == 7 ) {
               tlfBarnstedt.setVisible( false );
               tlfBarnstedt1.setVisible( false );
               tlfBarnstedt2.setVisible( false );
               tlfBarnstedt3.setVisible( false );
               tlfBarnstedt4.setVisible( false );
               tlfBarnstedt5.setVisible( false );
               tlfBarnstedt6.setVisible( false );
               tlfBarnstedt7.setVisible( true );
               tlfBarnstedt8.setVisible( false );
            } else if( map.get( "tlfBarnstedtIndex" ) == 8 ) {
               tlfBarnstedt.setVisible( false );
               tlfBarnstedt1.setVisible( false );
               tlfBarnstedt2.setVisible( false );
               tlfBarnstedt3.setVisible( false );
               tlfBarnstedt4.setVisible( false );
               tlfBarnstedt5.setVisible( false );
               tlfBarnstedt6.setVisible( false );
               tlfBarnstedt7.setVisible( false );
               tlfBarnstedt8.setVisible( true );
            }
            break;
         case "tsfBarnstedtIndex":
            if( map.get( "tsfBarnstedtIndex" ) == 0 ) {
               tsfBarnstedt.setVisible( true );
               tsfBarnstedt1.setVisible( false );
               tsfBarnstedt2.setVisible( false );
               tsfBarnstedt3.setVisible( false );
               tsfBarnstedt4.setVisible( false );
               tsfBarnstedt5.setVisible( false );
               tsfBarnstedt6.setVisible( false );
               tsfBarnstedt7.setVisible( false );
               tsfBarnstedt8.setVisible( false );
            } else if( map.get( "tsfBarnstedtIndex" ) == 1 ) {
               tsfBarnstedt.setVisible( false );
               tsfBarnstedt1.setVisible( true );
               tsfBarnstedt2.setVisible( false );
               tsfBarnstedt3.setVisible( false );
               tsfBarnstedt4.setVisible( false );
               tsfBarnstedt5.setVisible( false );
               tsfBarnstedt6.setVisible( false );
               tsfBarnstedt7.setVisible( false );
               tsfBarnstedt8.setVisible( false );
            } else if( map.get( "tsfBarnstedtIndex" ) == 2 ) {
               tsfBarnstedt.setVisible( false );
               tsfBarnstedt1.setVisible( false );
               tsfBarnstedt2.setVisible( true );
               tsfBarnstedt3.setVisible( false );
               tsfBarnstedt4.setVisible( false );
               tsfBarnstedt5.setVisible( false );
               tsfBarnstedt6.setVisible( false );
               tsfBarnstedt7.setVisible( false );
               tsfBarnstedt8.setVisible( false );
            } else if( map.get( "tsfBarnstedtIndex" ) == 3 ) {
               tsfBarnstedt.setVisible( false );
               tsfBarnstedt1.setVisible( false );
               tsfBarnstedt2.setVisible( false );
               tsfBarnstedt3.setVisible( true );
               tsfBarnstedt4.setVisible( false );
               tsfBarnstedt5.setVisible( false );
               tsfBarnstedt6.setVisible( false );
               tsfBarnstedt7.setVisible( false );
               tsfBarnstedt8.setVisible( false );
            } else if( map.get( "tsfBarnstedtIndex" ) == 4 ) {
               tsfBarnstedt.setVisible( false );
               tsfBarnstedt1.setVisible( false );
               tsfBarnstedt2.setVisible( false );
               tsfBarnstedt3.setVisible( false );
               tsfBarnstedt4.setVisible( true );
               tsfBarnstedt5.setVisible( false );
               tsfBarnstedt6.setVisible( false );
               tsfBarnstedt7.setVisible( false );
               tsfBarnstedt8.setVisible( false );
            } else if( map.get( "tsfBarnstedtIndex" ) == 5 ) {
               tsfBarnstedt.setVisible( false );
               tsfBarnstedt1.setVisible( false );
               tsfBarnstedt2.setVisible( false );
               tsfBarnstedt3.setVisible( false );
               tsfBarnstedt4.setVisible( false );
               tsfBarnstedt5.setVisible( true );
               tsfBarnstedt6.setVisible( false );
               tsfBarnstedt7.setVisible( false );
               tsfBarnstedt8.setVisible( false );
            } else if( map.get( "tsfBarnstedtIndex" ) == 6 ) {
               tsfBarnstedt.setVisible( false );
               tsfBarnstedt1.setVisible( false );
               tsfBarnstedt2.setVisible( false );
               tsfBarnstedt3.setVisible( false );
               tsfBarnstedt4.setVisible( false );
               tsfBarnstedt5.setVisible( false );
               tsfBarnstedt6.setVisible( true );
               tsfBarnstedt7.setVisible( false );
               tsfBarnstedt8.setVisible( false );
            } else if( map.get( "tsfBarnstedtIndex" ) == 7 ) {
               tsfBarnstedt.setVisible( false );
               tsfBarnstedt1.setVisible( false );
               tsfBarnstedt2.setVisible( false );
               tsfBarnstedt3.setVisible( false );
               tsfBarnstedt4.setVisible( false );
               tsfBarnstedt5.setVisible( false );
               tsfBarnstedt6.setVisible( false );
               tsfBarnstedt7.setVisible( true );
               tsfBarnstedt8.setVisible( false );
            } else if( map.get( "tsfBarnstedtIndex" ) == 8 ) {
               tsfBarnstedt.setVisible( false );
               tsfBarnstedt1.setVisible( false );
               tsfBarnstedt2.setVisible( false );
               tsfBarnstedt3.setVisible( false );
               tsfBarnstedt4.setVisible( false );
               tsfBarnstedt5.setVisible( false );
               tsfBarnstedt6.setVisible( false );
               tsfBarnstedt7.setVisible( false );
               tsfBarnstedt8.setVisible( true );
            }
            break;
         case "lf8KolkhagenIndex":
            if( map.get( "lf8KolkhagenIndex" ) == 0 ) {
               lf8Kolkhagen.setVisible( true );
               lf8Kolkhagen1.setVisible( false );
               lf8Kolkhagen2.setVisible( false );
               lf8Kolkhagen3.setVisible( false );
               lf8Kolkhagen4.setVisible( false );
               lf8Kolkhagen5.setVisible( false );
               lf8Kolkhagen6.setVisible( false );
               lf8Kolkhagen7.setVisible( false );
               lf8Kolkhagen8.setVisible( false );
            } else if( map.get( "lf8KolkhagenIndex" ) == 1 ) {
               lf8Kolkhagen.setVisible( false );
               lf8Kolkhagen1.setVisible( true );
               lf8Kolkhagen2.setVisible( false );
               lf8Kolkhagen3.setVisible( false );
               lf8Kolkhagen4.setVisible( false );
               lf8Kolkhagen5.setVisible( false );
               lf8Kolkhagen6.setVisible( false );
               lf8Kolkhagen7.setVisible( false );
               lf8Kolkhagen8.setVisible( false );
            } else if( map.get( "lf8KolkhagenIndex" ) == 2 ) {
               lf8Kolkhagen.setVisible( false );
               lf8Kolkhagen1.setVisible( false );
               lf8Kolkhagen2.setVisible( true );
               lf8Kolkhagen3.setVisible( false );
               lf8Kolkhagen4.setVisible( false );
               lf8Kolkhagen5.setVisible( false );
               lf8Kolkhagen6.setVisible( false );
               lf8Kolkhagen7.setVisible( false );
               lf8Kolkhagen8.setVisible( false );
            } else if( map.get( "lf8KolkhagenIndex" ) == 3 ) {
               lf8Kolkhagen.setVisible( false );
               lf8Kolkhagen1.setVisible( false );
               lf8Kolkhagen2.setVisible( false );
               lf8Kolkhagen3.setVisible( true );
               lf8Kolkhagen4.setVisible( false );
               lf8Kolkhagen5.setVisible( false );
               lf8Kolkhagen6.setVisible( false );
               lf8Kolkhagen7.setVisible( false );
               lf8Kolkhagen8.setVisible( false );
            } else if( map.get( "lf8KolkhagenIndex" ) == 4 ) {
               lf8Kolkhagen.setVisible( false );
               lf8Kolkhagen1.setVisible( false );
               lf8Kolkhagen2.setVisible( false );
               lf8Kolkhagen3.setVisible( false );
               lf8Kolkhagen4.setVisible( true );
               lf8Kolkhagen5.setVisible( false );
               lf8Kolkhagen6.setVisible( false );
               lf8Kolkhagen7.setVisible( false );
               lf8Kolkhagen8.setVisible( false );
            } else if( map.get( "lf8KolkhagenIndex" ) == 5 ) {
               lf8Kolkhagen.setVisible( false );
               lf8Kolkhagen1.setVisible( false );
               lf8Kolkhagen2.setVisible( false );
               lf8Kolkhagen3.setVisible( false );
               lf8Kolkhagen4.setVisible( false );
               lf8Kolkhagen5.setVisible( true );
               lf8Kolkhagen6.setVisible( false );
               lf8Kolkhagen7.setVisible( false );
               lf8Kolkhagen8.setVisible( false );
            } else if( map.get( "lf8KolkhagenIndex" ) == 6 ) {
               lf8Kolkhagen.setVisible( false );
               lf8Kolkhagen1.setVisible( false );
               lf8Kolkhagen2.setVisible( false );
               lf8Kolkhagen3.setVisible( false );
               lf8Kolkhagen4.setVisible( false );
               lf8Kolkhagen5.setVisible( false );
               lf8Kolkhagen6.setVisible( true );
               lf8Kolkhagen7.setVisible( false );
               lf8Kolkhagen8.setVisible( false );
            } else if( map.get( "lf8KolkhagenIndex" ) == 7 ) {
               lf8Kolkhagen.setVisible( false );
               lf8Kolkhagen1.setVisible( false );
               lf8Kolkhagen2.setVisible( false );
               lf8Kolkhagen3.setVisible( false );
               lf8Kolkhagen4.setVisible( false );
               lf8Kolkhagen5.setVisible( false );
               lf8Kolkhagen6.setVisible( false );
               lf8Kolkhagen7.setVisible( true );
               lf8Kolkhagen8.setVisible( false );
            } else if( map.get( "lf8KolkhagenIndex" ) == 8 ) {
               lf8Kolkhagen.setVisible( false );
               lf8Kolkhagen1.setVisible( false );
               lf8Kolkhagen2.setVisible( false );
               lf8Kolkhagen3.setVisible( false );
               lf8Kolkhagen4.setVisible( false );
               lf8Kolkhagen5.setVisible( false );
               lf8Kolkhagen6.setVisible( false );
               lf8Kolkhagen7.setVisible( false );
               lf8Kolkhagen8.setVisible( true );
            }
            break;
            // ######################################################################
         case "gast1Index":
            if( map.get( "gast1Index" ) == 0 ) {
               gast1.setVisible( true );
               gast11.setVisible( false );
               gast12.setVisible( false );
               gast13.setVisible( false );
               gast14.setVisible( false );
               gast15.setVisible( false );
               gast16.setVisible( false );
               gast17.setVisible( false );
               gast18.setVisible( false );
            } else if( map.get( "gast1Index" ) == 1 ) {
               gast1.setVisible( false );
               gast11.setVisible( true );
               gast12.setVisible( false );
               gast13.setVisible( false );
               gast14.setVisible( false );
               gast15.setVisible( false );
               gast16.setVisible( false );
               gast17.setVisible( false );
               gast18.setVisible( false );
            } else if( map.get( "gast1Index" ) == 2 ) {
               gast1.setVisible( false );
               gast11.setVisible( false );
               gast12.setVisible( true );
               gast13.setVisible( false );
               gast14.setVisible( false );
               gast15.setVisible( false );
               gast16.setVisible( false );
               gast17.setVisible( false );
               gast18.setVisible( false );
            } else if( map.get( "gast1Index" ) == 3 ) {
               gast1.setVisible( false );
               gast11.setVisible( false );
               gast12.setVisible( false );
               gast13.setVisible( true );
               gast14.setVisible( false );
               gast15.setVisible( false );
               gast16.setVisible( false );
               gast17.setVisible( false );
               gast18.setVisible( false );
            } else if( map.get( "gast1Index" ) == 4 ) {
               gast1.setVisible( false );
               gast11.setVisible( false );
               gast12.setVisible( false );
               gast13.setVisible( false );
               gast14.setVisible( true );
               gast15.setVisible( false );
               gast16.setVisible( false );
               gast17.setVisible( false );
               gast18.setVisible( false );
            } else if( map.get( "gast1Index" ) == 5 ) {
               gast1.setVisible( false );
               gast11.setVisible( false );
               gast12.setVisible( false );
               gast13.setVisible( false );
               gast14.setVisible( false );
               gast15.setVisible( true );
               gast16.setVisible( false );
               gast17.setVisible( false );
               gast18.setVisible( false );
            } else if( map.get( "gast1Index" ) == 6 ) {
               gast1.setVisible( false );
               gast11.setVisible( false );
               gast12.setVisible( false );
               gast13.setVisible( false );
               gast14.setVisible( false );
               gast15.setVisible( false );
               gast16.setVisible( true );
               gast17.setVisible( false );
               gast18.setVisible( false );
            } else if( map.get( "gast1Index" ) == 7 ) {
               gast1.setVisible( false );
               gast11.setVisible( false );
               gast12.setVisible( false );
               gast13.setVisible( false );
               gast14.setVisible( false );
               gast15.setVisible( false );
               gast16.setVisible( false );
               gast17.setVisible( true );
               gast18.setVisible( false );
            } else if( map.get( "gast1Index" ) == 8 ) {
               gast1.setVisible( false );
               gast11.setVisible( false );
               gast12.setVisible( false );
               gast13.setVisible( false );
               gast14.setVisible( false );
               gast15.setVisible( false );
               gast16.setVisible( false );
               gast17.setVisible( false );
               gast18.setVisible( true );
            }

            // ######################################################################
         case "gast2Index":
            if( map.get( "gast2Index" ) == 0 ) {
               gast2.setVisible( true );
               gast21.setVisible( false );
               gast22.setVisible( false );
               gast23.setVisible( false );
               gast24.setVisible( false );
               gast25.setVisible( false );
               gast26.setVisible( false );
               gast27.setVisible( false );
               gast28.setVisible( false );
            } else if( map.get( "gast2Index" ) == 1 ) {
               gast2.setVisible( false );
               gast21.setVisible( true );
               gast22.setVisible( false );
               gast23.setVisible( false );
               gast24.setVisible( false );
               gast25.setVisible( false );
               gast26.setVisible( false );
               gast27.setVisible( false );
               gast28.setVisible( false );
            } else if( map.get( "gast2Index" ) == 2 ) {
               gast2.setVisible( false );
               gast21.setVisible( false );
               gast22.setVisible( true );
               gast23.setVisible( false );
               gast24.setVisible( false );
               gast25.setVisible( false );
               gast26.setVisible( false );
               gast27.setVisible( false );
               gast28.setVisible( false );
            } else if( map.get( "gast2Index" ) == 3 ) {
               gast2.setVisible( false );
               gast21.setVisible( false );
               gast22.setVisible( false );
               gast23.setVisible( true );
               gast24.setVisible( false );
               gast25.setVisible( false );
               gast26.setVisible( false );
               gast27.setVisible( false );
               gast28.setVisible( false );
            } else if( map.get( "gast2Index" ) == 4 ) {
               gast2.setVisible( false );
               gast21.setVisible( false );
               gast22.setVisible( false );
               gast23.setVisible( false );
               gast24.setVisible( true );
               gast25.setVisible( false );
               gast26.setVisible( false );
               gast27.setVisible( false );
               gast28.setVisible( false );
            } else if( map.get( "gast2Index" ) == 5 ) {
               gast2.setVisible( false );
               gast21.setVisible( false );
               gast22.setVisible( false );
               gast23.setVisible( false );
               gast24.setVisible( false );
               gast25.setVisible( true );
               gast26.setVisible( false );
               gast27.setVisible( false );
               gast28.setVisible( false );
            } else if( map.get( "gast2Index" ) == 6 ) {
               gast2.setVisible( false );
               gast21.setVisible( false );
               gast22.setVisible( false );
               gast23.setVisible( false );
               gast24.setVisible( false );
               gast25.setVisible( false );
               gast26.setVisible( true );
               gast27.setVisible( false );
               gast28.setVisible( false );
            } else if( map.get( "gast2Index" ) == 7 ) {
               gast2.setVisible( false );
               gast21.setVisible( false );
               gast22.setVisible( false );
               gast23.setVisible( false );
               gast24.setVisible( false );
               gast25.setVisible( false );
               gast26.setVisible( false );
               gast27.setVisible( true );
               gast28.setVisible( false );
            } else if( map.get( "gast2Index" ) == 8 ) {
               gast2.setVisible( false );
               gast21.setVisible( false );
               gast22.setVisible( false );
               gast23.setVisible( false );
               gast24.setVisible( false );
               gast25.setVisible( false );
               gast26.setVisible( false );
               gast27.setVisible( false );
               gast28.setVisible( true );
            }
            // ######################################################################
         default:
            break;
      }

   }

   public void setOffeneVerbindungen( int anzahl ) {
      lblOffeneVerbindungen.setText( "verbunden: " + anzahl );
   }
}