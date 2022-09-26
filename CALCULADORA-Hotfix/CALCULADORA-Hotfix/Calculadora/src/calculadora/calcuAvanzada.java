
package calculadora;


public class calcuAvanzada extends javax.swing.JFrame {
//Declaro atributos
    private boolean igual,inicio = true,operacion1,operacion2;
    private double a,b,c,cos, acos,sin,asin,tan,atan,memoria = 0,resultado,valor1,valor2;
    private String cadena,funciones,tipoOperaciones;
    
    public calcuAvanzada() {
        initComponents();
        this.setLocationRelativeTo(null);
        b_memoria.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txt_principal = new javax.swing.JTextField();
        txt_previo = new javax.swing.JTextField();
        b_memoria = new javax.swing.JLabel();
        btn_coseno = new javax.swing.JButton();
        btn_cosInverso = new javax.swing.JButton();
        btn_PI = new javax.swing.JButton();
        btn_E = new javax.swing.JButton();
        btn_factorial = new javax.swing.JButton();
        btn_Pote10 = new javax.swing.JButton();
        btn_seno = new javax.swing.JButton();
        btn_sinInverso = new javax.swing.JButton();
        btn_elevaMenos1 = new javax.swing.JButton();
        btn_raizX = new javax.swing.JButton();
        btn_raizCubica = new javax.swing.JButton();
        btn_exponenciacion = new javax.swing.JButton();
        btn_tangente = new javax.swing.JButton();
        btn_tanInverso = new javax.swing.JButton();
        btn_potenciar = new javax.swing.JButton();
        btn_cubo = new javax.swing.JButton();
        btn_cuadrado = new javax.swing.JButton();
        btn_Logaritmo = new javax.swing.JButton();
        btn_Mc = new javax.swing.JButton();
        btn_retroceder = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_CE = new javax.swing.JButton();
        btn_Mr = new javax.swing.JButton();
        btn_Ms = new javax.swing.JButton();
        btn_C = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_raiz = new javax.swing.JButton();
        btn_masMas = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_opInversa = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_cambioDeSigno = new javax.swing.JButton();
        btn_menosMa = new javax.swing.JButton();
        b_sexa = new javax.swing.JRadioButton();
        b_radianes = new javax.swing.JRadioButton();
        MODO = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_principal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_principal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_principal.setText("0");
        txt_principal.setFocusable(false);
        txt_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_principalActionPerformed(evt);
            }
        });

        txt_previo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        b_memoria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b_memoria.setText("M");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_principal)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(b_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addComponent(txt_previo)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(b_memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_previo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_coseno.setText("COS");
        btn_coseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosenoActionPerformed(evt);
            }
        });

        btn_cosInverso.setText("cos-1");
        btn_cosInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosInversoActionPerformed(evt);
            }
        });

        btn_PI.setText("pi(n)");
        btn_PI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PIActionPerformed(evt);
            }
        });

        btn_E.setText("e");
        btn_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EActionPerformed(evt);
            }
        });

        btn_factorial.setText(" π!");
        btn_factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_factorialActionPerformed(evt);
            }
        });

        btn_Pote10.setText("10^x");
        btn_Pote10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Pote10ActionPerformed(evt);
            }
        });

        btn_seno.setText("SIN");
        btn_seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_senoActionPerformed(evt);
            }
        });

        btn_sinInverso.setText("sin-1");
        btn_sinInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinInversoActionPerformed(evt);
            }
        });

        btn_elevaMenos1.setText("x^-1");
        btn_elevaMenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elevaMenos1ActionPerformed(evt);
            }
        });

        btn_raizX.setText("y√x");
        btn_raizX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raizXActionPerformed(evt);
            }
        });

        btn_raizCubica.setText("3√x");
        btn_raizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raizCubicaActionPerformed(evt);
            }
        });

        btn_exponenciacion.setText("EXP");
        btn_exponenciacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exponenciacionActionPerformed(evt);
            }
        });

        btn_tangente.setText("TAN");
        btn_tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tangenteActionPerformed(evt);
            }
        });

        btn_tanInverso.setText("tan-1");
        btn_tanInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanInversoActionPerformed(evt);
            }
        });

        btn_potenciar.setText("x^y");
        btn_potenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_potenciarActionPerformed(evt);
            }
        });

        btn_cubo.setText("x^3");
        btn_cubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuboActionPerformed(evt);
            }
        });

        btn_cuadrado.setText("x^2");
        btn_cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuadradoActionPerformed(evt);
            }
        });

        btn_Logaritmo.setText("LOG");
        btn_Logaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogaritmoActionPerformed(evt);
            }
        });

        btn_Mc.setText("MC");
        btn_Mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_McActionPerformed(evt);
            }
        });

        btn_retroceder.setText("<--");
        btn_retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retrocederActionPerformed(evt);
            }
        });

        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_CE.setForeground(new java.awt.Color(255, 51, 0));
        btn_CE.setText("CE");
        btn_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CEActionPerformed(evt);
            }
        });

        btn_Mr.setText("MR");
        btn_Mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MrActionPerformed(evt);
            }
        });

        btn_Ms.setText("MS");
        btn_Ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MsActionPerformed(evt);
            }
        });

        btn_C.setForeground(new java.awt.Color(204, 0, 0));
        btn_C.setText("C");
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });

        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_punto.setText(".");
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        btn_suma.setText("+");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        btn_resta.setText("-");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_multiplicar.setText("*");
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });

        btn_dividir.setText("/");
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });

        btn_raiz.setText("√");
        btn_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raizActionPerformed(evt);
            }
        });

        btn_masMas.setText("M+");
        btn_masMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masMasActionPerformed(evt);
            }
        });

        btn_igual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        btn_opInversa.setText("1/x");
        btn_opInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_opInversaActionPerformed(evt);
            }
        });

        btn_porcentaje.setText("%");
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });

        btn_cambioDeSigno.setText("±");
        btn_cambioDeSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambioDeSignoActionPerformed(evt);
            }
        });

        btn_menosMa.setText("M-");
        btn_menosMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosMaActionPerformed(evt);
            }
        });

        buttonGroup1.add(b_sexa);
        b_sexa.setSelected(true);
        b_sexa.setText("Sexages");

        buttonGroup1.add(b_radianes);
        b_radianes.setText("Radianes");

        MODO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASICA ", "AVANZADA" }));
        MODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_sexa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(b_radianes, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_cosInverso, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sinInverso, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tanInverso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_retroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_C, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cambioDeSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_PI, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_E, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Pote10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_elevaMenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_potenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_exponenciacion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_Logaritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_raizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_raizX, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_cubo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_opInversa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_coseno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_seno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_tangente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Mc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Mr, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Ms, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_masMas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_menosMa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(MODO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_sexa)
                            .addComponent(b_radianes)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MODO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_masMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Ms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Mr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Mc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tangente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_seno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_coseno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_menosMa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_raiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_CE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_retroceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tanInverso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_sinInverso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cosInverso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_C, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cambioDeSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_potenciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_elevaMenos1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_dividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_PI, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_E, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addComponent(btn_Pote10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_multiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cubo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_opInversa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_raizX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_cuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_raizCubica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_Logaritmo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_exponenciacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_punto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Botones numericos
    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("1");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"1");
        }
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("2");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"2");
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("3");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"3");
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
       // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("4");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"4");
        }
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
       // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("5");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"5");
        }
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("6");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"6");
        }
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
       // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("7");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"7");
        }
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("8");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"8");
        }
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("9");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"9");
        }
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
       // Condicion para la variable inicio
        if(inicio == true){
            txt_principal.setText("");
            txt_principal.setText("0");
            inicio = false;
        }
        else{
            txt_principal.setText(txt_principal.getText()+"0");
        }
    }//GEN-LAST:event_btn_0ActionPerformed
     //Boton con la funcion de punto decimal
    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        if(txt_principal.getText().contains(".")){
            
        }else{
            txt_principal.setText(txt_principal.getText()+".");
            inicio= false;
        }
        
    }//GEN-LAST:event_btn_puntoActionPerformed
       //Boton de la funcion Suma 
    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        igual = true;
        inicio= true;
        //Condicion para la variable operacion1
        if(operacion1 = true){
            valor1 = Double.parseDouble(txt_principal.getText());
            txt_previo.setText("");
            txt_previo.setText(txt_principal.getText()+"+");
            operacion1 = false;
        }
        else{
             igual = true;
        inicio= true;
        //Condicion para la variable operacion2
        if(operacion2 = true){
            valor1 = Double.parseDouble(txt_principal.getText());
            txt_previo.setText("");
            txt_previo.setText(txt_principal.getText()+"+");
            operacion2 = false;
        }
        else{
            txt_previo.setText(txt_principal.getText()+"+");
            Operaciones(resultado,valor2);
          }
        }
        tipoOperaciones = "+";
    }//GEN-LAST:event_btn_sumaActionPerformed
      //Boton de la funcion resta
    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        igual = true;
        inicio= true;
        //Condicion para la variable operacion1
        if(operacion1 = true){
            valor1 = Double.parseDouble(txt_principal.getText());
            txt_previo.setText("");
            txt_previo.setText(txt_principal.getText()+"-");
            operacion1 = false;
        }
        else{
             igual = true;
        inicio= true;
        //Condicion para la variable operacion2
        if(operacion2 = true){
            valor1 = Double.parseDouble(txt_principal.getText());
            txt_previo.setText("");
            txt_previo.setText(txt_principal.getText()+"-");
            operacion2 = false;
        }
        else{
            txt_previo.setText(txt_principal.getText()+"-");
            Operaciones(resultado,valor2);
          }
        }
        tipoOperaciones = "-";
    }//GEN-LAST:event_btn_restaActionPerformed
      //Boton funcion multiplicar 
    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicarActionPerformed
        igual = true;
        inicio= true;
        //Condicion para la variable operacion1
        if(operacion1 = true){
            valor1 = Double.parseDouble(txt_principal.getText());
            txt_previo.setText("");
            txt_previo.setText(txt_principal.getText()+"*");
            operacion1 = false;
        }
        else{
             igual = true;
        inicio= true;
        //Condicion para la variable operacion2
        if(operacion2 = true){
            valor1 = Double.parseDouble(txt_principal.getText());
            txt_previo.setText("");
            txt_previo.setText(txt_principal.getText()+"*");
            operacion2 = false;
        }
        else{
            txt_previo.setText(txt_principal.getText()+"*");
            Operaciones(resultado,valor2);
          }
        }
        tipoOperaciones = "*";
    }//GEN-LAST:event_btn_multiplicarActionPerformed
      //Boton funcion dividir
    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
      igual = true;
        inicio= true;
        //Condicion para la variable operacion1
        if(operacion1 = true){
            valor1 = Double.parseDouble(txt_principal.getText());
            txt_previo.setText("");
            txt_previo.setText(txt_principal.getText()+"/");
            operacion1 = false;
        }
        else{
             igual = true;
        inicio= true;
        //Condicion para la variable operacion2
        if(operacion2 = true){
            valor1 = Double.parseDouble(txt_principal.getText());
            txt_previo.setText("");
            txt_previo.setText(txt_principal.getText()+"/");
            operacion2 = false;
        }
        else{
            txt_previo.setText(txt_principal.getText()+"/");
            Operaciones(resultado,valor2);
          }
        }
        tipoOperaciones = "/";
    }//GEN-LAST:event_btn_dividirActionPerformed
     private void Operaciones(double valor1,double valor2){
         //switch que evalua  la variable tipoOperaciones
         switch (tipoOperaciones) {
             //Case con la funcion de suma
             case "+":
                 resultado = valor1 + valor2;
                 txt_principal.setText(resultado + "");
                 valor1 = Double.parseDouble(txt_principal.getText());
                 break;
             //Case con la funcion de resta
             case "-":
                 resultado = valor1 - valor2;
                 txt_principal.setText(resultado + "");
                 valor1 = Double.parseDouble(txt_principal.getText());
                 break;
             //Case con la funcion de multiplicar
             case "*":
                 resultado = valor1 * valor2;
                 txt_principal.setText(resultado + "");
                 valor1 = Double.parseDouble(txt_principal.getText());
                 break;
             //Case con la funcion de dividir
             case "/":
                 if (valor2 == 0) {
                     txt_principal.setText("ERROR");
                     break;
                 } else {
                     resultado = valor1 / valor2;
                     txt_principal.setText(resultado + "");
                     valor1 = Double.parseDouble(txt_principal.getText());
                     break;
                 }
                 //Case de la funcion de la potencia de un numero
             case "potencia":
                 resultado = Math.pow(valor1, valor2);
                 txt_principal.setText(resultado + " ");
                 break;
                 //Case de la funcion que saca la raiz x de un numero
             case "raizX":
                 if(valor2 <= 0){
                     txt_principal.setText("ERROR");
                     break;
                 }else{
                     txt_previo.setText(valor2 + " yroot ");
                     a = 1;
                     c= a / valor2;
                     txt_principal.setText(Math.pow(valor1, c)+ " ");
                     break;
                 }
         }
     }




     //Boton funcion igual 
    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        inicio = true;
        operacion1 = true;
        if (igual = true) {
            if (tipoOperaciones == null) {

            } else {
                valor2 = Double.parseDouble(txt_principal.getText());
                txt_previo.setText(txt_previo.getText() + txt_principal.getText());
                Operaciones(valor1, valor2);
                igual = false;
            }
        } else {
            txt_previo.setText("");
            Operaciones(valor1, valor2);
        }
    }//GEN-LAST:event_btn_igualActionPerformed
     //Boton funcion del pocerntaje
    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
          valor2 = Double.parseDouble(txt_principal.getText());
          txt_previo.setText(txt_previo.getText()+ txt_principal.getText());
          txt_principal.setText((valor1*valor2)/100 + "");
          igual = true;
        
    }//GEN-LAST:event_btn_porcentajeActionPerformed
     //Boton funcion raiz
    private void btn_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raizActionPerformed
         valor1 = Double.parseDouble(txt_principal.getText());
        if(valor1>=0){
            txt_previo.setText("sqrt(" + valor1 +" )");
            txt_principal.setText(Math.sqrt(valor1) + "");
        }else{
            txt_principal.setText("EROR");
        }
    }//GEN-LAST:event_btn_raizActionPerformed
       //Boton con la funcion de operacion inversa
    private void btn_opInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_opInversaActionPerformed
        valor1 = Double.parseDouble(txt_principal.getText());
        txt_previo.setText("reciproc( " + valor1 +" )");
        txt_principal.setText(1/valor1 + "");
    }//GEN-LAST:event_btn_opInversaActionPerformed
      //Boton con la funcion de cambio de signo 
    private void btn_cambioDeSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambioDeSignoActionPerformed
        double nu1 = 0,nu2,nu3;
        nu2 = Double.parseDouble(txt_principal.getText());
        nu3 = nu1 - nu2;
        txt_principal.setText(nu3 + "");
    }//GEN-LAST:event_btn_cambioDeSignoActionPerformed
       //Boton funcion borrar todo C
    private void btn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CActionPerformed
        txt_principal.setText("0");
        txt_previo.setText("");
        inicio = true;
        funciones = "";
        operacion1 = true;
        operacion2 =true;
        igual = true;
        valor1 = 0;
        valor2 = 0;
        resultado = 0;
    }//GEN-LAST:event_btn_CActionPerformed
     //Boton funcion CE
    private void btn_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CEActionPerformed
        txt_principal.setText("0");
        txt_previo.setText("");
        inicio = true;
        funciones = "";
    }//GEN-LAST:event_btn_CEActionPerformed

    private void txt_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_principalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_principalActionPerformed
    //Boton funcion retroceder
    private void btn_retrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retrocederActionPerformed
        if(txt_principal.getText().length()>0){
            txt_principal.setText(txt_principal.getText().substring(0,txt_principal.getText().length()-1));
            if(txt_principal.getText().length() == 0){
                txt_principal.setText("0");
                inicio = true;
            }
        }
    }//GEN-LAST:event_btn_retrocederActionPerformed
           //Metodo trigonometria
    public void trigonometria(){
        //Condicion que evalua el radio button si es seleccionado
        if(b_sexa.isSelected()){
            //switch que evalua la variable funciones
            switch(funciones){
                //Seno
                case "sin":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("sin( " + valor1 +" )");
                    sin = Math.sin(Math.PI*(valor1)/ 180);
                    txt_principal.setText(sin + "");
                    break;
                    //Seno inverso
                    case "asin":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("asin( " + valor1 +" )");
                    asin = Math.asin(valor1)* 180/Math.PI;
                    txt_principal.setText(asin + "");
                    break;
                    //Coseno
                    case "cos":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("cos( " + valor1 +" )");
                    cos = Math.cos(Math.PI*(valor1)/ 180);
                    txt_principal.setText(cos + "");
                    break;
                    //Coseno inverso
                    case "acos":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("acos( " + valor1 +" )");
                    acos = Math.acos(valor1)* 180/Math.PI;
                    txt_principal.setText(acos + "");
                    break;
                    //Tangente
                    case "tan":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("tan( " + valor1 +" )");
                    tan = Math.tan(Math.PI*(valor1)/ 180);
                    txt_principal.setText(tan + "");
                    break;
                    //Tangente inverso
                    case "atan":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("atan( " + valor1 +" )");
                    atan = Math.atan(valor1)* 180/Math.PI;
                    txt_principal.setText(atan + "");
                    break;
            }
        }else{
             if(b_radianes.isSelected()){
            //switch que evalua la variable funciones
            switch(funciones){
                //Seno
                case "sin":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("sinr( " + valor1 +" )");
                    sin = Math.sin(valor1);
                    txt_principal.setText(sin + "");
                    break;
                    //Seno inverso
                    case "asin":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("asinr( " + valor1 +" )");
                    asin = Math.asin(valor1);
                    txt_principal.setText(asin + "");
                    break;
                    //Coseno
                    case "cos":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("cosr( " + valor1 +" )");
                    cos = Math.cos(valor1);
                    txt_principal.setText(cos + "");
                    break;
                    //Coseno inverso
                    case "acos":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("acosr( " + valor1 +" )");
                    acos = Math.acos(valor1);
                    txt_principal.setText(acos + "");
                    break;
                    //Tangente
                    case "tan":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("tanr( " + valor1 +" )");
                    tan = Math.tan(valor1);
                    txt_principal.setText(tan + "");
                    break;
                    //Tangente inverso
                    case "atan":
                    valor1 = Double.parseDouble(txt_principal.getText());
                    txt_previo.setText("atanr( " + valor1 +" )");
                    atan = Math.atan(valor1);
                    txt_principal.setText(atan + "");
                    break;
            }
        }
        }
    }
    private void btn_cosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosenoActionPerformed
       funciones = "cos";
       trigonometria();
    }//GEN-LAST:event_btn_cosenoActionPerformed

    private void btn_senoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_senoActionPerformed
        funciones = "sin";
        trigonometria();
    }//GEN-LAST:event_btn_senoActionPerformed

    private void btn_tangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tangenteActionPerformed
       funciones = "tan";
       trigonometria();
    }//GEN-LAST:event_btn_tangenteActionPerformed

    private void btn_cosInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosInversoActionPerformed
        funciones = "acos";
        trigonometria();
    }//GEN-LAST:event_btn_cosInversoActionPerformed

    private void btn_sinInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinInversoActionPerformed
        funciones = "asin";
        trigonometria();
    }//GEN-LAST:event_btn_sinInversoActionPerformed

    private void btn_tanInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tanInversoActionPerformed
        funciones = "atan";
        trigonometria();
    }//GEN-LAST:event_btn_tanInversoActionPerformed
      //Boton que devuelve el valor de PI
    private void btn_PIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PIActionPerformed
        txt_previo.setText("PI");
        txt_principal.setText(Math.PI +" ");
    }//GEN-LAST:event_btn_PIActionPerformed
      //Boton que eleva a X a la menos 1
    private void btn_elevaMenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elevaMenos1ActionPerformed
        valor1 = Double.parseDouble(txt_principal.getText());
        txt_previo.setText(valor1+ " ^-1");
        txt_principal.setText(Math.pow(valor1, -1)+ " ");
    }//GEN-LAST:event_btn_elevaMenos1ActionPerformed
     //Boton que eleva a x potencia cualquier numero 
    private void btn_potenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_potenciarActionPerformed
        inicio = true;
        valor1 = Double.parseDouble(txt_principal.getText());
        txt_previo.setText(valor1+ "^");
        tipoOperaciones = "potencia";
        operacion1 = false;
        igual = true;
    }//GEN-LAST:event_btn_potenciarActionPerformed
      //Boton que saca la raiz de un numero
    private void btn_raizXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raizXActionPerformed
        inicio = true;
        valor1 = Double.parseDouble(txt_principal.getText());
        txt_previo.setText(valor1 +" yroot ");
        tipoOperaciones = "raizX";
        operacion1 = false;
        igual = true;
    }//GEN-LAST:event_btn_raizXActionPerformed
       //Boton que eleva al cubo
    private void btn_cuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuboActionPerformed
        valor1 = Double.parseDouble(txt_principal.getText());
        txt_previo.setText("cubo( " + valor1+ " )" );
        txt_principal.setText(Math.pow(valor1,3)+ " ");
    }//GEN-LAST:event_btn_cuboActionPerformed
       //Boton con la funcion factorial 
    private void btn_factorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_factorialActionPerformed
        a = 1;
         valor1 = Double.parseDouble(txt_principal.getText());
         txt_previo.setText("fact( " + valor1+ " )" );
         for ( b = 1; b <= valor1;b++){
             a= a * b;
         }
         txt_principal.setText(a + "");
    }//GEN-LAST:event_btn_factorialActionPerformed
        //Boton que devuelve el valor de E
    private void btn_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EActionPerformed
       txt_previo.setText("E");
        txt_principal.setText(Math.E + " ");
    }//GEN-LAST:event_btn_EActionPerformed
        //Boton de la raiz cubica
    private void btn_raizCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raizCubicaActionPerformed
        valor1 = Double.parseDouble(txt_principal.getText());
        a = 1;
        b = 3;
        c = a / b;
        txt_previo.setText("cuberoot (" + valor1 + ")");
        txt_principal.setText(Math.pow(valor1,c)+" ");
    }//GEN-LAST:event_btn_raizCubicaActionPerformed
           //Boton que eleva al caudrado
    private void btn_cuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuadradoActionPerformed
        valor1 = Double.parseDouble(txt_principal.getText());
        txt_previo.setText("srq( " + valor1 +" ) ");
        txt_principal.setText(Math.pow(valor1, 2) + " ");
    }//GEN-LAST:event_btn_cuadradoActionPerformed
         //Boton que eleva a la potencia de 10
    private void btn_Pote10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Pote10ActionPerformed
        valor1 = Double.parseDouble(txt_principal.getText());
        txt_previo.setText("powten( " + valor1 +" ) ");
        txt_principal.setText(Math.pow(10,valor1) + " ");
    }//GEN-LAST:event_btn_Pote10ActionPerformed
         //Boton con la funcion de exponenciacion neperiana
    private void btn_exponenciacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exponenciacionActionPerformed
        valor1 = Double.parseDouble(txt_principal.getText());
        txt_principal.setText(Math. exp(valor1) + " ");
    }//GEN-LAST:event_btn_exponenciacionActionPerformed

    private void btn_LogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogaritmoActionPerformed
        valor1 = Double.parseDouble(txt_principal.getText());
        txt_previo.setText("log( " + valor1 +" ) ");
        txt_principal.setText(Math.log(valor1) + " ");
    }//GEN-LAST:event_btn_LogaritmoActionPerformed
     //Boton con la funcion MC
    private void btn_McActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_McActionPerformed
        memoria = 0;
        b_memoria.setVisible(false);
    }//GEN-LAST:event_btn_McActionPerformed
       //Boton con la funcion MR
    private void btn_MrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MrActionPerformed
        txt_principal.setText(memoria+ " ");
    }//GEN-LAST:event_btn_MrActionPerformed
                    //Boton con la funcion MS
    private void btn_MsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MsActionPerformed
        memoria = Double.parseDouble(txt_principal.getText()) ;
        b_memoria.setVisible(true);
    }//GEN-LAST:event_btn_MsActionPerformed
      //Boton con M+
    private void btn_masMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masMasActionPerformed
        memoria = memoria + Double.parseDouble(txt_principal.getText()) ;
        b_memoria.setVisible(true);
    }//GEN-LAST:event_btn_masMasActionPerformed
         //Boton con la funcion M-
    private void btn_menosMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosMaActionPerformed
         memoria = memoria - Double.parseDouble(txt_principal.getText()) ;
        b_memoria.setVisible(true);
    }//GEN-LAST:event_btn_menosMaActionPerformed

    private void MODOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODOActionPerformed
        String calculadora =(String)MODO.getSelectedItem();
        if(calculadora.equals("AVANZADA"))  {
            this.dispose();
            calculadoraBasica ver= new calculadoraBasica();
            ver.setVisible(true);
        }

    }//GEN-LAST:event_MODOActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calcuAvanzada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcuAvanzada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcuAvanzada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcuAvanzada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcuAvanzada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MODO;
    private javax.swing.JLabel b_memoria;
    private javax.swing.JRadioButton b_radianes;
    private javax.swing.JRadioButton b_sexa;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_C;
    private javax.swing.JButton btn_CE;
    private javax.swing.JButton btn_E;
    private javax.swing.JButton btn_Logaritmo;
    private javax.swing.JButton btn_Mc;
    private javax.swing.JButton btn_Mr;
    private javax.swing.JButton btn_Ms;
    private javax.swing.JButton btn_PI;
    private javax.swing.JButton btn_Pote10;
    private javax.swing.JButton btn_cambioDeSigno;
    private javax.swing.JButton btn_cosInverso;
    private javax.swing.JButton btn_coseno;
    private javax.swing.JButton btn_cuadrado;
    private javax.swing.JButton btn_cubo;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_elevaMenos1;
    private javax.swing.JButton btn_exponenciacion;
    private javax.swing.JButton btn_factorial;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_masMas;
    private javax.swing.JButton btn_menosMa;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_opInversa;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_potenciar;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_raiz;
    private javax.swing.JButton btn_raizCubica;
    private javax.swing.JButton btn_raizX;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_retroceder;
    private javax.swing.JButton btn_seno;
    private javax.swing.JButton btn_sinInverso;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tanInverso;
    private javax.swing.JButton btn_tangente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_previo;
    private javax.swing.JTextField txt_principal;
    // End of variables declaration//GEN-END:variables
}
