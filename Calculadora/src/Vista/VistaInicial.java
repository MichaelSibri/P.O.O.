package Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaInicial extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelBotones;
    private JTextField display;
    private JButton boton[];
    private double valor1=0,valor2=0;
    private String operacion="";
    private boolean nueva=true;
 

    public VistaInicial(){
        
        //TITULO
        setTitle("CALCULADORA BASICA");
        //TAMAÑO
        setSize(250,300);
        //DIMENSIONABLE O NO
        setResizable(false);
        //LOCACION
        setLocationRelativeTo(null);
        //SALIR AL CLICKEAR LA X
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //METODO PARA CREAR INTERFAZ Y AGREGAR EVENTOS A BOTONES
        inicializar();
        agregarBotones();
       
    }

    private void inicializar() {
        //INTERFAZ Y FUNCIONALIDAD
     //CREAMOS PANEL PRINCIPAL CON LAYOUT BORDERLAYOUT
     panelPrincipal = new JPanel();
     panelPrincipal.setLayout(new BorderLayout());
     //EN EL NORTE IRA LA CAJA DE TEXTO
     display = new JTextField();
     panelPrincipal.add("North",display);
     //EN EL CENTRO IRA EL PANEL DE BOTONES
     panelBotones = new JPanel();
     //El GRIDLAYOUT RECIBE COMO PARAMETROS:
     //FILAS,COLUMNAS ESPACIADO ENTRE FILAS,
     //ESPACIADO ENTRE COLUMNAS
     panelBotones.setLayout(new GridLayout(5,4,8,8));
     panelBotones.setBackground(Color.black);
     //agregarBotones();
     panelPrincipal.add("Center",panelBotones);
     //AGREGAMOS el PANEL_PRINCIPAL A EL PANEL DEL FORMULARIO
     getContentPane().add(panelPrincipal);
        
    }
    
    private void agregarBotones() {
        //INICIALIZAMOS EL ARREGLO DE BOTONES
        boton = new JButton[20];
        //INICIALIZAMOS LOS BOTONES
        boton[0]=new JButton("CE");
        boton[1]=new JButton("");
        boton[2]=new JButton("");
        boton[3]=new JButton("");
        boton[4]=new JButton("7");
        boton[5]=new JButton("8");
        boton[6]=new JButton("9");
        boton[7]=new JButton("/");
        boton[8]=new JButton("4");
        boton[9]=new JButton("5");
        boton[10]=new JButton("6");
        boton[11]=new JButton("*");
        boton[12]=new JButton("1");
        boton[13]=new JButton("2");
        boton[14]=new JButton("3");
        boton[15]=new JButton("-");
        boton[16]=new JButton("0");
        boton[17]=new JButton(".");
        boton[18]=new JButton("=");
        boton[19]=new JButton("+");
        //AGREAMOS LOS BOTONES AL PANEL BOTONES
        for(int i = 0 ; i < 20; i++){
            panelBotones.add(boton[i]);
        }
        for(int i = 4 ; i < 20; i++){
            boton[i].setBackground(Color.CYAN);
        }
        for(int i = 1 ; i < 4; i++){
            boton[i].setBackground(Color.BLACK);
        }
        
        boton[0].setBackground(Color.ORANGE);
        boton[7].setBackground(Color.GREEN);
        boton[11].setBackground(Color.GREEN);
        boton[15].setBackground(Color.GREEN);
        boton[19].setBackground(Color.GREEN);
        
        //EVENTOS DE LOS BOTONES
        //OPERACIONES
        boton[19].addActionListener(new ActionListener(){  //SUMA
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(valor1!=0)
                        valor1=valor1+Double.parseDouble(display.getText());
                    else
                        valor1=Double.parseDouble(display.getText());
                    operacion="suma";
                    display.setText("");
                }catch(Exception err){}
            }
        });
        boton[15].addActionListener(new ActionListener(){ //RESTA
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(valor1!=0)
                        valor1=valor1-Double.parseDouble(display.getText());
                    else
                        valor1=Double.parseDouble(display.getText());
                    operacion="resta";
                    display.setText("");
                }catch(Exception err){}
            }
        });
        boton[11].addActionListener(new ActionListener(){  //MULTIPLICACION
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(valor1!=0)
                        valor1=valor1*Double.parseDouble(display.getText());
                    else
                        valor1=Double.parseDouble(display.getText());
                    operacion="multiplicacion";
                    display.setText("");
                }catch(Exception err){}
            }
        });
        boton[7].addActionListener(new ActionListener(){  //DIVISION
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    if(valor1!=0)
                        valor1=valor1/Double.parseDouble(display.getText());
                    else
                        valor1=Double.parseDouble(display.getText());
                    operacion="division";
                    display.setText("");
                }catch(Exception err){}
            }
        });
        
        //Botones de numeros y boton de decimal
        boton[4].addActionListener(new ActionListener(){  //7
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"7");
            }
        });
        boton[5].addActionListener(new ActionListener(){ //8
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"8");
            }
        });
        boton[6].addActionListener(new ActionListener(){  //9
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"9");
            }
        });
        boton[8].addActionListener(new ActionListener(){  //4
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"4");
            }
        });
        boton[9].addActionListener(new ActionListener(){  //5
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"5");
            }
        });
        boton[10].addActionListener(new ActionListener(){  //6
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"6");
            }
        });
        boton[12].addActionListener(new ActionListener(){  //1
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"1");
            }
        });
        boton[13].addActionListener(new ActionListener(){  //2
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"2");
            }
        });
        boton[14].addActionListener(new ActionListener(){ //3
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"3");
            }
        });
        boton[16].addActionListener(new ActionListener(){  //0
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"0");
            }
        });
        boton[17].addActionListener(new ActionListener(){  //.
            @Override
            public void actionPerformed(ActionEvent evt){
                if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+".");
            }
        });
        
        //Boton =
        boton[18].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                try{
                    valor2=Double.parseDouble(display.getText());
                }catch(Exception err){}
                if(operacion.equals("suma")){
                    double res=valor1+valor2;
                    display.setText(String.valueOf(res));
                    valor1=valor2=0;
                    operacion="";
                }else if(operacion.equals("resta")){
                    double res=valor1-valor2;
                    display.setText(String.valueOf(res));
                    valor1=valor2=0;
                    operacion="";
                }else if(operacion.equals("multiplicacion")){
                    double res=valor1*valor2;
                    display.setText(String.valueOf(res));
                    valor1=valor2=0;
                    operacion="";
                }else if(operacion.equals("division")){
                    double res=valor1/valor2;
                    display.setText(String.valueOf(res));
                    valor1=valor2=0;
                    operacion="";
                }
                nueva=true;
            }
        });
        
        //Boton CE
        boton[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                display.setText("");
                valor1=valor2=0;
                operacion="";
            }
        });
    }

    }
    
    
    
   