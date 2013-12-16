package com.wine.shop.gui;

public class WineMasterPanel extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form WineMasterPanel
     */
    public WineMasterPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        WineNorthPanel = new javax.swing.JPanel();
        WineCenterPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        WineNorthPanel.setBackground(new java.awt.Color(85, 142, 221));

        javax.swing.GroupLayout WineNorthPanelLayout = new javax.swing.GroupLayout(WineNorthPanel);
        WineNorthPanel.setLayout(WineNorthPanelLayout);
        WineNorthPanelLayout.setHorizontalGroup(
            WineNorthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        WineNorthPanelLayout.setVerticalGroup(
            WineNorthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(WineNorthPanel, java.awt.BorderLayout.PAGE_START);

        WineCenterPanel.setBackground(new java.awt.Color(173, 222, 221));

        javax.swing.GroupLayout WineCenterPanelLayout = new javax.swing.GroupLayout(WineCenterPanel);
        WineCenterPanel.setLayout(WineCenterPanelLayout);
        WineCenterPanelLayout.setHorizontalGroup(
            WineCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        WineCenterPanelLayout.setVerticalGroup(
            WineCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        add(WineCenterPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>
    // Variables declaration - do not modify
    private javax.swing.JPanel WineCenterPanel;
    private javax.swing.JPanel WineNorthPanel;
    // End of variables declaration
}