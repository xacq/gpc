/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prog.calculator;

public class calculadora extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;
    
    public calculadora() {
        initComponents();
        this.setTitle("Proyecto de Calculadora");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        botonC = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        etiquetaNumeros = new javax.swing.JLabel();
        etiquetaMuestra = new javax.swing.JLabel();
        botonCuadrado = new javax.swing.JButton();
        botonCubo = new javax.swing.JButton();
        botonPi = new javax.swing.JButton();
        botonSeno = new javax.swing.JButton();
        botonCoseno = new javax.swing.JButton();
        botonTangente = new javax.swing.JButton();
        botonE = new javax.swing.JButton();
        botonLog = new javax.swing.JButton();
        botonRam = new javax.swing.JButton();
        botonRound = new javax.swing.JButton();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        botonC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });

        botonRaiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRaiz.setText("√");
        botonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizActionPerformed(evt);
            }
        });

        botonDivision.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonDivision.setText("/");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });

        jButton35.setBackground(new java.awt.Color(204, 204, 204));
        jButton35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton35.setText("7");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(204, 204, 204));
        jButton28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton28.setText("8");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(204, 204, 204));
        jButton29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton29.setText("9");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        botonMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonMultiplicar.setText("*");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(204, 204, 204));
        jButton32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton32.setText("4");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(204, 204, 204));
        jButton33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton33.setText("5");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(204, 204, 204));
        jButton34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton34.setText("6");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        botonRestar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(204, 204, 204));
        jButton37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton37.setText("1");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(204, 204, 204));
        jButton40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton40.setText("2");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(204, 204, 204));
        jButton38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton38.setText("3");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        botonSumar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });

        jButton41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton41.setText("+/-");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton42.setText("0");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        botonPunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });

        botonIgual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });

        etiquetaNumeros.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaNumeros.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");
        etiquetaNumeros.setOpaque(true);

        etiquetaMuestra.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaMuestra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaMuestra.setOpaque(true);

        botonCuadrado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCuadrado.setText("x²");
        botonCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuadradoActionPerformed(evt);
            }
        });

        botonCubo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCubo.setText("x³");
        botonCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuboActionPerformed(evt);
            }
        });

        botonPi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonPi.setText("π");
        botonPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPiActionPerformed(evt);
            }
        });

        botonSeno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSeno.setText("sen");
        botonSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSenoActionPerformed(evt);
            }
        });

        botonCoseno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonCoseno.setText("cos");
        botonCoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCosenoActionPerformed(evt);
            }
        });

        botonTangente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonTangente.setText("tan");
        botonTangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTangenteActionPerformed(evt);
            }
        });

        botonE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonE.setText("e");
        botonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEActionPerformed(evt);
            }
        });

        botonLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonLog.setText("log");
        botonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogActionPerformed(evt);
            }
        });

        botonRam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonRam.setText("Random");
        botonRam.setActionCommand("");
        botonRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRamActionPerformed(evt);
            }
        });

        botonRound.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRound.setText("round");
        botonRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRoundActionPerformed(evt);
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
                            .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaNumeros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonLog, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonPi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonE, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonCoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonRam, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonTangente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonRound, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonE, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLog, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonRam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonTangente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRound, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        operacion = "nula";
        cadenaNumeros = "";
        activado = true;
        punto = true;
    }//GEN-LAST:event_botonCActionPerformed

    private void botonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizActionPerformed
        if (!"".equals(cadenaNumeros)){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText("sqrt("+cadenaNumeros+")");
            resultado = Math.sqrt(primerNumero);
            etiquetaNumeros.setText(String.format("%.5f", resultado));
            cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
        }
        else {
            etiquetaNumeros.setText("No existe valor.");
        }
    }//GEN-LAST:event_botonRaizActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";
            activado = false;
        }
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "7";
        }else{
            cadenaNumeros += "7";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "8";
        }else{
            cadenaNumeros += "8";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "9";
        }else{
            cadenaNumeros += "9";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton29ActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";
            activado = false;
        }
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "4";
        }else{
            cadenaNumeros += "4";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "5";
        }else{
            cadenaNumeros += "5";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "6";
        }else{
            cadenaNumeros += "6";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton34ActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";
            activado = false;
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "1";
        }else{
            cadenaNumeros += "1";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "2";
        }else{
            cadenaNumeros += "2";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "3";
        }else{
            cadenaNumeros += "3";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton38ActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        if(activado == true){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";
            activado = false;
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        if(cadenaNumeros.charAt(0) != '-'){
            cadenaNumeros = "-" + cadenaNumeros;
        }else{
            cadenaNumeros = cadenaNumeros.substring(1,cadenaNumeros.length());
        }
        etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "0";
        }else{
            cadenaNumeros += "0";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_jButton42ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if(punto == true){
            if(cadenaNumeros.equals("")){
                cadenaNumeros = "0.";
            }else{
                cadenaNumeros += ".";
            }
            etiquetaNumeros.setText(cadenaNumeros);
            punto = false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double segundoNumero;
        switch (operacion) {
            case "nula":
                etiquetaNumeros.setText(cadenaNumeros);
                break;
            case "sumar":
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = primerNumero + segundoNumero;
                ;
                etiquetaNumeros.setText(String.format("% .5f",resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
                break;
            case "restar":
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = primerNumero - segundoNumero;
                ;
                etiquetaNumeros.setText(String.format("% .5f",resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
                break;
            case "multiplicar":
                segundoNumero = Double.parseDouble(cadenaNumeros);
                resultado = primerNumero * segundoNumero;
                ;
                etiquetaNumeros.setText(String.format("% .5f",resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
                break;
            case "dividir":
                segundoNumero = Double.parseDouble(cadenaNumeros);
                if (segundoNumero == 0) {
                    etiquetaNumeros.setText("NoSeDividePor0");
                } else {
                    resultado = primerNumero / segundoNumero;;
                    etiquetaNumeros.setText(String.format("% .5f", resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                }   break;
            default:
                break;
        }
        etiquetaMuestra.setText("");
        activado = true;
        punto = false;
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuadradoActionPerformed
        if (!"".equals(cadenaNumeros)){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText("("+cadenaNumeros+")²");
            resultado = (primerNumero*primerNumero);
            etiquetaNumeros.setText(String.format("%.5f", resultado));
            cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
        }
        else {
            etiquetaNumeros.setText("No existe valor.");
        }
    }//GEN-LAST:event_botonCuadradoActionPerformed

    private void botonCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuboActionPerformed
        if (!"".equals(cadenaNumeros)){
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText("("+cadenaNumeros+")²");
            resultado = (primerNumero*primerNumero*primerNumero);
            etiquetaNumeros.setText(String.format("%.5f", resultado));
            cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
        }
        else {
            etiquetaNumeros.setText("No existe valor.");
        }
    }//GEN-LAST:event_botonCuboActionPerformed

    private void botonPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPiActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "3.141592653";
        }else{
            cadenaNumeros = "3.141592653";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_botonPiActionPerformed

    private void botonSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSenoActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        if (primerNumero == 0.00){
            etiquetaMuestra.setText("sen(0)");
            resultado = 0;
            etiquetaNumeros.setText(String.format("%.5f", resultado));
            cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
        }
        else if (primerNumero >=0 && primerNumero < 360){
            etiquetaMuestra.setText("sen("+cadenaNumeros+")");
            resultado = Math.sin(primerNumero);
            etiquetaNumeros.setText(String.format("%.5f", resultado));
            cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
        }
        else{
            etiquetaNumeros.setText("No se puede realizar calculo");
        }
    }//GEN-LAST:event_botonSenoActionPerformed

    private void botonCosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCosenoActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        if (primerNumero >=0 && primerNumero < 360){
            etiquetaMuestra.setText("cos("+cadenaNumeros+")");
            resultado = Math.cos(primerNumero);
            etiquetaNumeros.setText(String.format("%.5f", resultado));
            cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
        }
        else{
            etiquetaNumeros.setText("No se puede realizar calculo");
        }
    }//GEN-LAST:event_botonCosenoActionPerformed

    private void botonTangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTangenteActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        if (primerNumero == 0.00){
            etiquetaMuestra.setText("tan(0)");
            resultado = 0;
            etiquetaNumeros.setText(String.format("%.5f", resultado));
            cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
        }
        else if (primerNumero >=0 && primerNumero < 360){
            etiquetaMuestra.setText("tan("+cadenaNumeros+")");
            resultado = Math.tan(primerNumero);
            etiquetaNumeros.setText(String.format("%.5f", resultado));
            cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
        }
        else{
            etiquetaNumeros.setText("No se puede realizar calculo");
        }
    }//GEN-LAST:event_botonTangenteActionPerformed

    private void botonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEActionPerformed
        if(etiquetaNumeros.getText().equals("0")){
            cadenaNumeros = "2.718281828459";
        }else{
            cadenaNumeros = "2.718281828459";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true; //voy a usar la calculadora
    }//GEN-LAST:event_botonEActionPerformed

    private void botonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("log("+cadenaNumeros+")");
        resultado = Math.log(primerNumero);
        etiquetaNumeros.setText(String.format("%.5f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonLogActionPerformed

    private void botonRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRamActionPerformed
        resultado = Math.random();
        etiquetaNumeros.setText(String.format("%.10f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonRamActionPerformed

    private void botonRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRoundActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("round("+cadenaNumeros+")");
        resultado = Math.round  (primerNumero);
        etiquetaNumeros.setText(String.format("%.5f", resultado));
        cadenaNumeros = String.valueOf(resultado); //convertimos el valor a cadena
    }//GEN-LAST:event_botonRoundActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCoseno;
    private javax.swing.JButton botonCuadrado;
    private javax.swing.JButton botonCubo;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonE;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonLog;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonPi;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonRam;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonRound;
    private javax.swing.JButton botonSeno;
    private javax.swing.JButton botonSumar;
    private javax.swing.JButton botonTangente;
    private java.awt.Button button1;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    // End of variables declaration//GEN-END:variables
}
