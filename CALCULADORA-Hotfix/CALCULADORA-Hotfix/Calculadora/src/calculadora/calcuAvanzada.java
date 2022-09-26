
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_principal.setBackground(new java.awt.Color(38, 41, 44));
        txt_principal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_principal.setForeground(new java.awt.Color(254, 254, 254));
        txt_principal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_principal.setText("0");
        txt_principal.setFocusable(false);
        txt_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_principalActionPerformed(evt);
            }
        });

        txt_previo.setBackground(new java.awt.Color(27, 27, 27));
        txt_previo.setForeground(new java.awt.Color(254, 254, 254));
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 38, 586, -1));

        btn_coseno.setBackground(new java.awt.Color(45, 54, 64));
        btn_coseno.setForeground(new java.awt.Color(254, 254, 254));
        btn_coseno.setText("COS");
        btn_coseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosenoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_coseno, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 241, 67, 35));

        btn_cosInverso.setBackground(new java.awt.Color(45, 54, 64));
        btn_cosInverso.setForeground(new java.awt.Color(254, 254, 254));
        btn_cosInverso.setText("cos-1");
        btn_cosInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosInversoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cosInverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 288, 67, 35));

        btn_PI.setBackground(new java.awt.Color(45, 54, 64));
        btn_PI.setForeground(new java.awt.Color(254, 254, 254));
        btn_PI.setText("pi(n)");
        btn_PI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PIActionPerformed(evt);
            }
        });
        getContentPane().add(btn_PI, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 329, 67, 35));

        btn_E.setBackground(new java.awt.Color(45, 54, 64));
        btn_E.setForeground(new java.awt.Color(254, 254, 254));
        btn_E.setText("e");
        btn_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EActionPerformed(evt);
            }
        });
        getContentPane().add(btn_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 370, 67, 36));

        btn_factorial.setBackground(new java.awt.Color(45, 54, 64));
        btn_factorial.setForeground(new java.awt.Color(254, 254, 254));
        btn_factorial.setText(" π!");
        btn_factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_factorialActionPerformed(evt);
            }
        });
        getContentPane().add(btn_factorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 410, 67, 35));

        btn_Pote10.setBackground(new java.awt.Color(45, 54, 64));
        btn_Pote10.setForeground(new java.awt.Color(254, 254, 254));
        btn_Pote10.setText("10^x");
        btn_Pote10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Pote10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Pote10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 449, 67, 37));

        btn_seno.setBackground(new java.awt.Color(45, 54, 64));
        btn_seno.setForeground(new java.awt.Color(254, 254, 254));
        btn_seno.setText("SIN");
        btn_seno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_senoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_seno, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 241, 67, 35));

        btn_sinInverso.setBackground(new java.awt.Color(45, 54, 64));
        btn_sinInverso.setForeground(new java.awt.Color(254, 254, 254));
        btn_sinInverso.setText("sin-1");
        btn_sinInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinInversoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sinInverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 288, 67, 35));

        btn_elevaMenos1.setBackground(new java.awt.Color(45, 54, 64));
        btn_elevaMenos1.setForeground(new java.awt.Color(254, 254, 254));
        btn_elevaMenos1.setText("x^-1");
        btn_elevaMenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elevaMenos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_elevaMenos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 329, 67, 35));

        btn_raizX.setBackground(new java.awt.Color(45, 54, 64));
        btn_raizX.setForeground(new java.awt.Color(254, 254, 254));
        btn_raizX.setText("y√x");
        btn_raizX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raizXActionPerformed(evt);
            }
        });
        getContentPane().add(btn_raizX, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 370, 67, 34));

        btn_raizCubica.setBackground(new java.awt.Color(45, 54, 64));
        btn_raizCubica.setForeground(new java.awt.Color(254, 254, 254));
        btn_raizCubica.setText("3√x");
        btn_raizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raizCubicaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_raizCubica, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 410, 67, 35));

        btn_exponenciacion.setBackground(new java.awt.Color(45, 54, 64));
        btn_exponenciacion.setForeground(new java.awt.Color(254, 254, 254));
        btn_exponenciacion.setText("EXP");
        btn_exponenciacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exponenciacionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exponenciacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 451, 67, 35));

        btn_tangente.setBackground(new java.awt.Color(45, 54, 64));
        btn_tangente.setForeground(new java.awt.Color(254, 254, 254));
        btn_tangente.setText("TAN");
        btn_tangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tangenteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tangente, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 241, 73, 35));

        btn_tanInverso.setBackground(new java.awt.Color(45, 54, 64));
        btn_tanInverso.setForeground(new java.awt.Color(254, 254, 254));
        btn_tanInverso.setText("tan-1");
        btn_tanInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanInversoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tanInverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 288, 73, 35));

        btn_potenciar.setBackground(new java.awt.Color(45, 54, 64));
        btn_potenciar.setForeground(new java.awt.Color(254, 254, 254));
        btn_potenciar.setText("x^y");
        btn_potenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_potenciarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_potenciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 329, 73, 35));

        btn_cubo.setBackground(new java.awt.Color(45, 54, 64));
        btn_cubo.setForeground(new java.awt.Color(254, 254, 254));
        btn_cubo.setText("x^3");
        btn_cubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuboActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cubo, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 370, 73, 34));

        btn_cuadrado.setBackground(new java.awt.Color(45, 54, 64));
        btn_cuadrado.setForeground(new java.awt.Color(254, 254, 254));
        btn_cuadrado.setText("x^2");
        btn_cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuadradoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 410, 73, 35));

        btn_Logaritmo.setBackground(new java.awt.Color(45, 54, 64));
        btn_Logaritmo.setForeground(new java.awt.Color(254, 254, 254));
        btn_Logaritmo.setText("LOG");
        btn_Logaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogaritmoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Logaritmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 451, 73, 35));

        btn_Mc.setBackground(new java.awt.Color(45, 54, 64));
        btn_Mc.setForeground(new java.awt.Color(254, 254, 254));
        btn_Mc.setText("MC");
        btn_Mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_McActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Mc, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 241, 73, 35));

        btn_retroceder.setBackground(new java.awt.Color(45, 54, 64));
        btn_retroceder.setForeground(new java.awt.Color(254, 254, 254));
        btn_retroceder.setText("<--");
        btn_retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retrocederActionPerformed(evt);
            }
        });
        getContentPane().add(btn_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 288, 73, 35));

        btn_7.setBackground(new java.awt.Color(45, 54, 64));
        btn_7.setForeground(new java.awt.Color(254, 254, 254));
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 329, 73, 35));

        btn_4.setBackground(new java.awt.Color(45, 54, 64));
        btn_4.setForeground(new java.awt.Color(254, 254, 254));
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 370, 73, 34));

        btn_1.setBackground(new java.awt.Color(45, 54, 64));
        btn_1.setForeground(new java.awt.Color(254, 254, 254));
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 410, 73, 35));

        btn_0.setBackground(new java.awt.Color(45, 54, 64));
        btn_0.setForeground(new java.awt.Color(254, 254, 254));
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 451, 152, 35));

        btn_2.setBackground(new java.awt.Color(45, 54, 64));
        btn_2.setForeground(new java.awt.Color(254, 254, 254));
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 410, 73, 35));

        btn_5.setBackground(new java.awt.Color(45, 54, 64));
        btn_5.setForeground(new java.awt.Color(254, 254, 254));
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 370, 73, 34));

        btn_8.setBackground(new java.awt.Color(45, 54, 64));
        btn_8.setForeground(new java.awt.Color(254, 254, 254));
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 329, 73, 35));

        btn_CE.setBackground(new java.awt.Color(45, 54, 64));
        btn_CE.setForeground(new java.awt.Color(255, 51, 0));
        btn_CE.setText("CE");
        btn_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CEActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CE, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 288, 73, 35));

        btn_Mr.setBackground(new java.awt.Color(45, 54, 64));
        btn_Mr.setForeground(new java.awt.Color(254, 254, 254));
        btn_Mr.setText("MR");
        btn_Mr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MrActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Mr, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 241, 73, 35));

        btn_Ms.setBackground(new java.awt.Color(45, 54, 64));
        btn_Ms.setForeground(new java.awt.Color(254, 254, 254));
        btn_Ms.setText("MS");
        btn_Ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 241, 73, 35));

        btn_C.setBackground(new java.awt.Color(45, 54, 64));
        btn_C.setForeground(new java.awt.Color(204, 0, 0));
        btn_C.setText("C");
        btn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CActionPerformed(evt);
            }
        });
        getContentPane().add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 288, 73, 35));

        btn_9.setBackground(new java.awt.Color(45, 54, 64));
        btn_9.setForeground(new java.awt.Color(254, 254, 254));
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 329, 73, 35));

        btn_6.setBackground(new java.awt.Color(45, 54, 64));
        btn_6.setForeground(new java.awt.Color(254, 254, 254));
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 370, 73, 34));

        btn_3.setBackground(new java.awt.Color(45, 54, 64));
        btn_3.setForeground(new java.awt.Color(254, 254, 254));
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 410, 73, 35));

        btn_punto.setBackground(new java.awt.Color(45, 54, 64));
        btn_punto.setForeground(new java.awt.Color(254, 254, 254));
        btn_punto.setText(".");
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 451, 73, 35));

        btn_suma.setBackground(new java.awt.Color(45, 54, 64));
        btn_suma.setForeground(new java.awt.Color(254, 254, 254));
        btn_suma.setText("+");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 451, 73, 35));

        btn_resta.setBackground(new java.awt.Color(45, 54, 64));
        btn_resta.setForeground(new java.awt.Color(254, 254, 254));
        btn_resta.setText("-");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 410, 73, 35));

        btn_multiplicar.setBackground(new java.awt.Color(45, 54, 64));
        btn_multiplicar.setForeground(new java.awt.Color(254, 254, 254));
        btn_multiplicar.setText("*");
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 370, 73, 34));

        btn_dividir.setBackground(new java.awt.Color(45, 54, 64));
        btn_dividir.setForeground(new java.awt.Color(254, 254, 254));
        btn_dividir.setText("/");
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 329, 73, 35));

        btn_raiz.setBackground(new java.awt.Color(45, 54, 64));
        btn_raiz.setForeground(new java.awt.Color(254, 254, 254));
        btn_raiz.setText("√");
        btn_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raizActionPerformed(evt);
            }
        });
        getContentPane().add(btn_raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 288, 73, 35));

        btn_masMas.setBackground(new java.awt.Color(45, 54, 64));
        btn_masMas.setForeground(new java.awt.Color(254, 254, 254));
        btn_masMas.setText("M+");
        btn_masMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masMasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 241, 73, 35));

        btn_igual.setBackground(new java.awt.Color(45, 54, 64));
        btn_igual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(254, 254, 254));
        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        getContentPane().add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 410, 73, 75));

        btn_opInversa.setBackground(new java.awt.Color(45, 54, 64));
        btn_opInversa.setForeground(new java.awt.Color(254, 254, 254));
        btn_opInversa.setText("1/x");
        btn_opInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_opInversaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_opInversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 370, 73, 34));

        btn_porcentaje.setBackground(new java.awt.Color(45, 54, 64));
        btn_porcentaje.setText("%");
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 329, 73, 35));

        btn_cambioDeSigno.setBackground(new java.awt.Color(45, 54, 64));
        btn_cambioDeSigno.setForeground(new java.awt.Color(254, 254, 254));
        btn_cambioDeSigno.setText("±");
        btn_cambioDeSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambioDeSignoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cambioDeSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 288, 73, 35));

        btn_menosMa.setBackground(new java.awt.Color(45, 54, 64));
        btn_menosMa.setForeground(new java.awt.Color(254, 254, 254));
        btn_menosMa.setText("M-");
        btn_menosMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosMaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menosMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 241, 73, 35));

        b_sexa.setBackground(new java.awt.Color(45, 54, 64));
        buttonGroup1.add(b_sexa);
        b_sexa.setForeground(new java.awt.Color(242, 246, 254));
        b_sexa.setSelected(true);
        b_sexa.setText("Sexages");
        getContentPane().add(b_sexa, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 193, 83, -1));

        b_radianes.setBackground(new java.awt.Color(45, 54, 64));
        buttonGroup1.add(b_radianes);
        b_radianes.setForeground(new java.awt.Color(242, 246, 254));
        b_radianes.setText("Radianes");
        getContentPane().add(b_radianes, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 193, 83, -1));

        MODO.setBackground(new java.awt.Color(45, 54, 64));
        MODO.setForeground(new java.awt.Color(254, 254, 254));
        MODO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AVANZADA", "BASICA" }));
        MODO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODOActionPerformed(evt);
            }
        });
        getContentPane().add(MODO, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 195, 110, 40));

        jLabel1.setBackground(new java.awt.Color(45, 54, 64));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 510));

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
        if(MODO.getSelectedItem().equals("BASICA"))  {
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_previo;
    private javax.swing.JTextField txt_principal;
    // End of variables declaration//GEN-END:variables
}
