/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base_de_donnée;
import Application.BDD;
import Application.Parameter;
import Application.ResultSetTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class Grille extends javax.swing.JFrame {
ResultSet rs;
BDD db;
    public Grille() {
         db= new BDD(new Parameter().HOST_DB, new Parameter().USERNAME_DB,new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        table();
    }
public void table(){
      String a[]={"Matricule ","Alias ","Conditionnement_produit_UAP1_emballage_et_étiquettage ", "Faisceaux_A380_NLG ", "Faisceaux_A350_NLG ", "Faisceaux_A320_41687_41688 ", "Faisceaux_A320_41689_41690_41989 ", "Faisceaux_A320_NEO ", "Faisceaux_A320_NEO_avec_Isoclip ", "Faisceaux_A320_MLG_autre_que_AXE ", "Faisceaux_A320_MLG_AXE ", "Faisceaux_A330_41489 ", "Faisceaux_A330_A340 ", "Faisceaux_A340_500_600 ", "Faisceaux_A330_MLG_251t ", "Faisceaux_A350MLG ", "Faisceaux_A380_MLG ", "Faisceaux_A380_SOV", "Faisceaux_G7000_8000", "Faisceaux_Global_Express ", "Gaine_A350_NLG ", "Gaines_G7000_8000 ", "Gaines_A320 ", "Gaines_A320_NEO ", "Gaines_A320_MLG ", "Gaines_A330_A340 ", "Gaines_A340_500_600 ", "Gaines_A350MLG ", "Gaines_A350MLG_avec_Surtressage ", "Gaines_A380 ", "Gaines_A380_avec_Band_it ", "Gaines_A380_avec_Drainage_DREMEL ", "Gaines_Global_Express ", "Kitting_A320_MLG ", "AB139 ", "ANSALDO ", "BTMU ", "Boites_électriques_43235 ", "Boites_électriques_43235_1 ", "Boites_électriques_43236_43237 ", "Boites_électriques_Montage_couvercle ", "Boites_électriques_Retouche_peinture ", "Gaines_ATR72 ", "Faisceaux_ATR72 ", "ERJ_MLG_175_et_195 ", "ERJ_DownLock ", "ERJ_NLG ", "E2_MLG ", "E2_NLG ", "E2_NLG_Lighting ", "Faisceaux_A350_LSDS_LVDT ", "SJ100R ", "G250 ", "P20 ", "A300_600 ", "Câbles_BOEING ", "Gaines_BOEING_autres_que_43133 ", "Gaines_BOEING_43133 ", "Préparation_montage_gaine_B737 ", "Montage_gaine_B737 ", "Boeing_787 ", "SEHLA ", "ECE ", "Falcon ", "Falcon_F7X ", "Gaines_NH90_autre_que_43683_et_43684_et_44060_et_44061 ", "Gaines_NH90_43683_et_43684_et_44060_et_44061 ", "Faisceaux_NH90_autres_que_43490_et_43494_et_44026_et_44027 ", "Oxygène ", "Faisceaux_NH90_43490_et_43494_44026_et_44027 ", "GA_Mats_moteur ", "Faisceaux_SICMA ", "TPIS_38985_et_43015 ", "TPIS_autres_que_38985_et_43015 ", "Câblage ", "Montage ", "Silvercrest ", "E2_Reservoir ", "MRJ_Reservoir ", "E2_OBIGGS ", "G7000_8000_OBIGGS ", "Gaine_A380SOV ", "Gaine_ABS1896 ", "Gaines_A330_MLG_251t ", "Faisceaux_MC21_NGS ", "Boeing_787_ND ", "ABS_2216_EMI ", "Gaines_A321_XLR ", "Faisceaux_A321_XLR_avec_Isoclip ", "Faisceaux_A321_XLR_AXLE ", "Faisceaux_A321_XLR_autre_que_AXLE_Isoclips ", "MC21_Reservoir ", "SLAT_CAN_HOSE_A320 ", "SLAT_CAN_HOSE_A330_et_A340_et_A350_et_C919 ", "Pourcentage_de_polyvalence_par_opérateur "};
      rs = db.querySelect(a, "programmes");
      table_programmes.setModel(new ResultSetTableModel(rs));
        }
    void actualiser(){
        txt_Matricule.setText("");
        txt_Alias.setText("");
        txt_Cond.setText("");
        txt_faisceaux_A380_NLG.setText("");
        txt_faisceaux_A350_NLG.setText("");
        txt_faisceaux_A320_41687_41688.setText("");
        txt_faisceaux_A320_41689_41690_41989.setText("");
        txt_faisceaux_A320_NEO.setText("");
        txt_faisceaux_A320_NEO_avec_Isoclip.setText("");
        txt_faisceaux_A320_MLG_autre_que_AXE.setText("");
        txt_faisceaux_A320_MLG_Axe.setText("");
        txt_faisceaux_A330_41489.setText("");
        txt_faisceaux_A330_A340.setText("");
        txt_faisceaux_A340_500_600.setText("");
        txt_faisceaux_A330_MLG_251t.setText("");
        txt_faisceaux_A350MLG.setText("");
        txt_faisceaux_A380MLG.setText("");
        txt_faisceaux_A380_50v.setText("");
        txt_faisceaux_G7000_8000.setText("");
        txt_faisceaux_Global_Express.setText("");
        txt_Gaine_A350_NLG.setText("");
        txt_Gaines_G7000_8000.setText("");
        txt_Gaines_A320.setText("");
        txt_Gaines_A320_NEO.setText("");
        txt_Gaines_A320_MLG.setText("");
        txt_Gaines_A330_A340.setText("");
        txt_Gaines_A340_500_600.setText("");
        txt_Gaines_A350MLG.setText("");
        txt_Gaines_A350MLG_avec_Surtressage.setText("");
        txt_Gaines_A380.setText("");
        txt_Gaines_A380_avec_Band_it.setText("");
        txt_Gaines_A380_avec_Drainage_DREMEL.setText("");
        txt_Gaines_Global_Express.setText("");
        txt_Kitting_A320_MLG.setText("");
        txt_AB139.setText("");
        txt_ANSALDO.setText("");
        txt_BTMU.setText("");
        txt_Boites_électriques_43235.setText("");
        txt_Boites_électriques_43235_1.setText("");
        txt_Boites_électriques_43236_43237.setText("");
        txt_Boites_électriques_Montage_Couvercle.setText("");
        txt_Boites_électriques_Retouche_peinture.setText("");
        txt_gaines_ATR72.setText("");
        txt_faisceaux_ATR72.setText("");
        txt_ERJ_MLG_175_195.setText("");
        txt_ERJ_DownLock.setText("");
        txt_ERJ_NLG.setText("");
        txt_E2_MLG.setText("");
        txt_E2_NLG.setText("");
        txt_E2_NLG_Lighting.setText("");
        txt_faisceaux_A350_LSDS_LVDT.setText("");
        txt_SJ_100_R.setText("");
        txt_G250.setText("");
        txt_P20.setText("");
        txt_A300_600.setText("");
        txt_Cables_BOEING.setText("");
        txt_gaines_BOEING_autres_que_43133.setText("");
        txt_gaines_BOEING_43133.setText("");
        txt_preparation_montage_gaine_B737.setText("");
        txt_montage_gaine_B737.setText("");
        txt_Boeing_787.setText("");
        txt_SEHLA.setText("");
        txt_ECE.setText("");
        txt_Falcon.setText("");
        txt_Falcon_F7X.setText("");
        txt_Gaines_NH90_autre_que_43683_43684_44060_44061.setText("");
        txt_Gaines_NH90_43683_43684_44060_1_44061.setText("");
        txt_faisceaux_NH90_autre_que_43490_43494_44026_44027.setText("");
        txt_Oxygéne.setText("");
        txt_faisceaux_NH90_43490_43494_44026_44027.setText("");
        txt_GA_Mats_moteur.setText("");
        txt_faisceaux_SICMA.setText("");
        txt_TPIS_38985_43015.setText("");
        txt_TPIS_autres_que_38985_43015.setText("");
        txt_Cablage.setText("");
        txt_Montage.setText("");
        txt_Silvercrest.setText("");
        txt_E2_Reservoir.setText("");
        txt_MRJ_Reservoir.setText("");
        txt_E2_OBIGGS.setText("");
        txt_G7000_8000_OBIGGS.setText("");
        txt_Gaine_A380SOV.setText("");
        txt_Gaines_ABS_1896.setText("");
        txt_Gaines_A30_MLG_251t.setText("");
        txt_faisceaux_MC21_NGS.setText("");
        txt_Boeing_787_ND.setText("");
        txt_ABS_2216_EMI.setText("");
        txt_Gaines_A321_XLR.setText("");
        txt_faisceaux_A321_XLR_avec_Isoclip.setText("");
        txt_faisceaux_A321_XLR_AXLE.setText("");
        txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips.setText("");
        txt_MC21_Reservoir.setText("");
        txt_SLAT_CAN_HOSE_A320.setText("");
        txt_SLAT_CAN_HOSE_A330.setText("");
        txt_A340_A350_C919.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_programmes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Matricule = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Alias = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Cond = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_faisceaux_A380_NLG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_faisceaux_A350_NLG = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_faisceaux_A320_41687_41688 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_faisceaux_A320_41689_41690_41989 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_faisceaux_A320_NEO = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_faisceaux_A320_NEO_avec_Isoclip = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_faisceaux_A320_MLG_autre_que_AXE = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_faisceaux_A320_MLG_Axe = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_faisceaux_A330_41489 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_faisceaux_A330_A340 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_faisceaux_A340_500_600 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_faisceaux_A330_MLG_251t = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_faisceaux_A350MLG = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_faisceaux_A380MLG = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_faisceaux_A380_50v = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_faisceaux_G7000_8000 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_faisceaux_Global_Express = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_Gaine_A350_NLG = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_Gaines_G7000_8000 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_Gaines_A320 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_Gaines_A320_NEO = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_Gaines_A320_MLG = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_Gaines_A330_A340 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_Gaines_A340_500_600 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_Gaines_A350MLG = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_Gaines_A350MLG_avec_Surtressage = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txt_Gaines_A380 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_Gaines_A380_avec_Band_it = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_Gaines_A380_avec_Drainage_DREMEL = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txt_Gaines_Global_Express = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_Kitting_A320_MLG = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txt_AB139 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txt_ANSALDO = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt_BTMU = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt_Boites_électriques_43235 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txt_Boites_électriques_43235_1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txt_Boites_électriques_43236_43237 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txt_Boites_électriques_Montage_Couvercle = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txt_Boites_électriques_Retouche_peinture = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txt_gaines_ATR72 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txt_faisceaux_ATR72 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txt_ERJ_MLG_175_195 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txt_ERJ_DownLock = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txt_ERJ_NLG = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txt_E2_MLG = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txt_E2_NLG = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txt_E2_NLG_Lighting = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txt_faisceaux_A350_LSDS_LVDT = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txt_SJ_100_R = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txt_G250 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txt_P20 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txt_A300_600 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txt_Cables_BOEING = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txt_gaines_BOEING_autres_que_43133 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txt_gaines_BOEING_43133 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txt_preparation_montage_gaine_B737 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txt_montage_gaine_B737 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txt_Boeing_787 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        txt_SEHLA = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txt_ECE = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txt_Falcon = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txt_Falcon_F7X = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txt_Gaines_NH90_autre_que_43683_43684_44060_44061 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txt_Gaines_NH90_43683_43684_44060_1_44061 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        txt_faisceaux_NH90_autre_que_43490_43494_44026_44027 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txt_Oxygéne = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        txt_faisceaux_NH90_43490_43494_44026_44027 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        txt_GA_Mats_moteur = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        txt_faisceaux_SICMA = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txt_TPIS_38985_43015 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txt_TPIS_autres_que_38985_43015 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        txt_Cablage = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        txt_Montage = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        txt_Silvercrest = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txt_E2_Reservoir = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        txt_MRJ_Reservoir = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        txt_E2_OBIGGS = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        txt_G7000_8000_OBIGGS = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        txt_Gaine_A380SOV = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txt_Gaines_ABS_1896 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txt_Gaines_A30_MLG_251t = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txt_faisceaux_MC21_NGS = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        txt_Boeing_787_ND = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        txt_ABS_2216_EMI = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        txt_Gaines_A321_XLR = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txt_faisceaux_A321_XLR_avec_Isoclip = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        txt_faisceaux_A321_XLR_AXLE = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        txt_MC21_Reservoir = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        txt_SLAT_CAN_HOSE_A320 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        txt_SLAT_CAN_HOSE_A330 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_A340_A350_C919 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txt_recherche = new javax.swing.JTextField();
        comrech = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_programmes.setBackground(new java.awt.Color(153, 153, 255));
        table_programmes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 102, 255), 2, true));
        table_programmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Matricule", "Alias", "Conditionnement produit UAP1(emballage+étiquettage):", "Faisceaux A380 NLG", "Faisceaux A350 NLG", "Faisceaux A320 41687 41688", "Faisceaux A320 41689 41690 41989", "Faisceaux A320 NEO", "Faisceaux A320 NEO avec Isoclip", "Faisceaux A320-MLG autre que AXE", "Faisceaux A320-MLG AXE", "Faisceaux A330 41489", "Faisceaux A330 A340", "Faisceaux A340 500/600", "Faisceaux A330 MLG 251t", "Faisceaux A350MLG", "Faisceaux A380 MLG", "Faisceaux A380 SOV", "Faisceaux G7000/8000", "Faisceaux Global Express", "Gaine A350 NLG", "Gaines G7000/8000", "Gaines A320", "Gaines A320 NEO", "Gaines A320-MLG", "Gaines A330 A340", "Gaines A340 500/600", "Gaines A350MLG", "Gaines A350MLG avec Surtressage", "Gaines A380", "Gaines A380 avec Band-it", "Gaines A380 avec Drainage DREMEL", "Gaines Global Express", "Kitting A320-MLG", "AB139", "ANSALDO", "BTMU", "Boites électriques 43235", "Boites électriques 43235-1", "Boites électriques 43236 43237", "Boites électriques-Montage Couvercle", "Boites électriques-Retouche peinture", "Gaines ATR72", "Faisceaux ATR72", "ERJ MLG(175 & 195)", "ERJ DownLock", "ERJ NLG", "E2 MLG", "E2 NLG", "E2 NLG(Lighting)", "Faisceaux A350 LSDS/LVDT", "SJ 100 R", "G250", "P20", "A 300/600", "Câbles BOEING", "Gaines BOEING autres que 43133", "Gaines BOEING 43133", "Préparation montage gaine B737", "Montage gaine B737", "Boeing 787", "SEHLA", "ECE", "Falcon", "Falcon F7X ", "Gaines NH90 autre que 43683/43684/44060 & 44061", "Gaines NH90 43683/43684/44060 1 44061", "Faisceaux NH90 autres que 43490/43494 44026 & 44027", "Oxygéne", "Faisceaux NH90 43490/43494 44026 & 44027", "GA Mats moteur", "Faisceaux SICMA", "TPIS 38985 & 43015", "TPIS autres que 38985 & 43015", "Câblage", "Montage", "Silvercrest", "E2 Reservoir", "MRJ Reservoir", "E2 OBIGGS", "G7000-8000 OBIGGS", "Gaine A380SOV", "Gaines ABS 1896", "Gaines A30 MLG 251t", "Faisceaux MC21 NGS", "Boeing 787 ND ", "ABS 2216 EMI", "Gaines A321 XLR", "Faisceaux A321 XLR avec Isoclip", "Faisceaux A321 XLR AXLE", "Faisceaux A321 XLR(autre que AXLE/Isoclips)", "MC21 Reservoir", "SLAT CAN HOSE A320", "SLAT CAN HOSE A330", "A340 & A350 &C919"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_programmes.setAutoResizeMode(0);
        table_programmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_programmesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_programmes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Grille UAP Câblage");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("Actualiser");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Matricule");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Alias");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Conditionnement produit UAP1(emballage+étiquettage)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Faisceaux A380 NLG");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Faisceaux A350 NLG");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Faisceaux A320 41687 41688");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Faisceaux A320 41689 41690 41989");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Faisceaux A320 NEO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Faisceaux A320 NEO avec Isoclip");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Faisceaux A320-MLG autre que AXE");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Faisceaux A320-MLG AXE");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Faisceaux A330 41489");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Faisceaux A330 A340");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Faisceaux A340 500/600");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Faisceaux A330 MLG 251t");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Faisceaux A350MLG");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Faisceaux A380 MLG");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Faisceaux A380 50v");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Faisceaux G7000/8000");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Faisceaux Global Express");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Gaine A350 NLG");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Gaines G7000/8000");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Gaines A320");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Gaines A320 NEO");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Gaines A320-MLG");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Gaines A330 A340");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Gaines A340 500/600");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Gaines A350MLG");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Gaines A350MLG avec Surtressage");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Gaines A380");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Gaines A380 avec Band-it");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Gaines A380 avec Drainage DREMEL");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Gaines Global Express");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Kitting A320-MLG");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("AB139");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("ANSALDO");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("BTMU");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Boites électriques 43235");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Boites électriques 43235-1");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Boites électriques 43236 43237");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Boites électriques-Montage Couvercle");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Boites électriques-Retouche peinture");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Gaines ATR72");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Faisceaux ATR72");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("ERJ MLG(175 & 195)");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("ERJ DownLock");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("ERJ NLG");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("E2 MLG");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("E2 NLG");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("E2 NLG(Lighting)");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Faisceaux A350 LSDS/LVDT");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("SJ 100 R");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("G250");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("P20");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("A 300/600");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("Câbles BOEING");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("Gaines BOEING autres que 43133");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("Gaines BOEING 43133");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setText("Préparation montage gaine B737");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setText("Montage gaine B737");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setText("Boeing 787");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setText("SEHLA");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setText("ECE");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setText("Falcon");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setText("Falcon F7X ");

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setText("Gaines NH90 autre que 43683/43684/44060 & 44061");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setText("Gaines NH90 43683/43684/44060 1 44061");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setText("Faisceaux NH90 autres que 43490/43494 44026 & 44027");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setText("Oxygéne");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setText("Faisceaux NH90 43490/43494 44026 & 44027");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setText("GA Mats moteur");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setText("Faisceaux SICMA");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setText("TPIS 38985 & 43015");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setText("TPIS autres que 38985 & 43015");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setText("Câblage");

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setText("Montage");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setText("Silvercrest");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setText("E2 Reservoir");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setText("MRJ Reservoir");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel83.setText("E2 OBIGGS");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setText("G7000-8000 OBIGGS");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setText("Gaine A380SOV");

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setText("Gaines ABS 1896");

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel87.setText("Gaines A30 MLG 251t");

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel88.setText("Faisceaux MC21 NGS");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setText("Boeing 787 ND ");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setText("ABS 2216 EMI");

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setText("Gaines A321 XLR");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setText("Faisceaux A321 XLR avec Isoclip");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel93.setText("Faisceaux A321 XLR AXLE");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel94.setText("Faisceaux A321 XLR(autre que AXLE/Isoclips)");

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel95.setText("MC21 Reservoir");

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setText("SLAT CAN HOSE A320");

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel97.setText("SLAT CAN HOSE A330");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("A340 & A350 &C919");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Recherche par Catégorie:");

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("Recherche");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txt_recherche.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        comrech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matricule", "Alias", "Conditionnement produit UAP1(emballage+étiquettage)", "Faisceaux A380 NLG", "Faisceaux A350 NLG", "Faisceaux A320 41687 41688", "Faisceaux A320 41689 41690 41989", "Faisceaux A320 NEO", "Faisceaux A320 NEO avec Isoclip", "Faisceaux A320-MLG autre que AXE", "Faisceaux A320-MLG AXE", "Faisceaux A330 41489", "Faisceaux A330 A340", "Faisceaux A340 500/600", "Faisceaux A330 MLG 251t", "Faisceaux A350MLG", "Faisceaux A380 MLG", "Faisceaux A380 SOV", "Faisceaux G7000/8000", "Faisceaux Global Express", "Gaine A350 NLG", "Gaines G7000/8000", "Gaines A320", "Gaines A320 NEO", "Gaines A320-MLG", "Gaines A330 A340", "Gaines A340 500/600", "Gaines A350MLG", "Gaines A350MLG avec Surtressage", "Gaines A380", "Gaines A380 avec Band-it", "Gaines A380 avec Drainage DREMEL", "Gaines Global Express", "Kitting A320-MLG", "AB139", "ANSALDO", "BTMU", "Boites électriques 43235", "Boites électriques 43235-1", "Boites électriques 43236 43237", "Boites électriques-Montage Couvercle", "Boites électriques-Retouche peinture", "Gaines ATR72", "Faisceaux ATR72", "ERJ MLG(175 & 195)", "ERJ DownLock", "ERJ NLG", "E2 MLG", "E2 NLG", "E2 NLG (Lighting)", "Faisceaux A350 LSDS/LVDT", "SJ100R", "G250", "P20", "A300/600", "Câbles BOEING", "Gaines BOEING autres que 43133", "Gaines BOEING 43133", "Préparation montage gaine B737", "Montage gaine B737", "Boeing 787", "SEHLA", "ECE", "Falcon", "Falcon F7X", "Gaines NH90 autre que 43683/43684/44060 & 44061", "Gaines NH90 43683/43684/44060 & 44061", "Faisceaux  NH90 autres que 43490 /43494 44026 & 44027", "Oxygène", "Faisceaux  NH90 43490 /43494 44026 & 44027", "GA Mats moteur", "Faisceaux SICMA", "TPIS 38985 & 43015", "TPIS autres que 38985 & 43015", "Câblage", "Montage", "Silvercrest", "E2 Reservoir", "MRJ Reservoir", "E2 OBIGGS", "G7000_8000 OBIGGS", "Gaine A380SOV", "Gaine ABS1896", "Gaines A330 MLG 251t", "Faisceaux MC21 NGS", "Boeing 787 ND", "ABS 2216 EMI", "Gaines A321 XLR", "Faisceaux A321 XLR avec Isoclip", "Faisceaux A321 XLR AXLE", "Faisceaux A321 XLR (autre que AXLE/Isoclips)", "MC21 Reservoir", "SLAT CAN HOSE A320", "SLAT CAN HOSE A330/A340 & A350 & C919", "Pourcentage de polyvalence par opérateur" }));

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6.setText("Retour");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel100.setText("0: Non formé(e)");

        jLabel101.setText("1: Formé(e)");

        jLabel102.setText("2: Qualifié(e) en période  (en Jaune)");

        jLabel103.setText("3: Qualifié(e) (en Vert)");

        jLabel104.setText("4: Formateur / Formatrice");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel104)
                            .addComponent(jLabel103))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(jLabel103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(jLabel104))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel102))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(382, 382, 382)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_faisceaux_A320_41687_41688, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A320_41689_41690_41989, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A320_NEO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A320_NEO_avec_Isoclip, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A320_MLG_autre_que_AXE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A320_MLG_Axe, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A330_41489, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A330_A340, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A340_500_600, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A330_MLG_251t, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A350MLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A380MLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A380_50v, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_G7000_8000, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_G7000_8000, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A320, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A320_NEO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A320_MLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A330_A340, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_Global_Express, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaine_A350_NLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A350MLG_avec_Surtressage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_Global_Express, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_BTMU, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Boites_électriques_43235, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A350MLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A340_500_600, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_gaines_ATR72, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ERJ_MLG_175_195, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ERJ_DownLock, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ERJ_NLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_E2_NLG_Lighting, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A350_LSDS_LVDT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A380_avec_Drainage_DREMEL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A380_avec_Band_it, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_montage_gaine_B737, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Boeing_787, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_SEHLA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Falcon_F7X, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_NH90_autre_que_43683_43684_44060_44061, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_NH90_43683_43684_44060_1_44061, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A380, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_preparation_montage_gaine_B737, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_SICMA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_TPIS_autres_que_38985_43015, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Cablage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Montage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Silvercrest, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_E2_Reservoir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_G7000_8000_OBIGGS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_MRJ_Reservoir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_E2_OBIGGS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_gaines_BOEING_autres_que_43133, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_gaines_BOEING_43133, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A30_MLG_251t, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_MC21_NGS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ECE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Falcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Boeing_787_ND, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_NH90_autre_que_43490_43494_44026_44027, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Oxygéne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ABS_2216_EMI, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_A321_XLR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_P20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_G250, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_SJ_100_R, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_E2_MLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_E2_NLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_ATR72, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Kitting_A320_MLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_AB139, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ANSALDO, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Boites_électriques_43235_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Boites_électriques_43236_43237, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Boites_électriques_Montage_Couvercle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Boites_électriques_Retouche_peinture, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A321_XLR_avec_Isoclip, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A321_XLR_AXLE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_A300_600, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Cables_BOEING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_MC21_Reservoir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_SLAT_CAN_HOSE_A320, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_SLAT_CAN_HOSE_A330, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_faisceaux_NH90_43490_43494_44026_44027, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_GA_Mats_moteur, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaine_A380SOV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Gaines_ABS_1896, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_A340_A350_C919, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(txt_faisceaux_A350_NLG, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(111, 111, 111)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(16, 16, 16))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(txt_Cond, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(76, 76, 76)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txt_faisceaux_A380_NLG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(comrech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txt_Matricule, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jButton3)
                                        .addGap(104, 104, 104)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(txt_TPIS_38985_43015, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1))
                            .addComponent(jButton6))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Matricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_Cond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_faisceaux_A380_NLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(comrech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_faisceaux_A350_NLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_faisceaux_A320_41687_41688, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_faisceaux_A320_41689_41690_41989, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_faisceaux_A320_NEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_faisceaux_A320_NEO_avec_Isoclip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_faisceaux_A320_MLG_autre_que_AXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_faisceaux_A320_MLG_Axe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_A330_41489, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_A330_A340, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_A340_500_600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_A330_MLG_251t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_A350MLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_A380MLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_A380_50v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_G7000_8000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_faisceaux_Global_Express, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaine_A350_NLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_G7000_8000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A320, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A320_NEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A320_MLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A330_A340, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A340_500_600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A350MLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A350MLG_avec_Surtressage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A380, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A380_avec_Band_it, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_A380_avec_Drainage_DREMEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_Global_Express, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Kitting_A320_MLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AB139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ANSALDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_BTMU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Boites_électriques_43235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Boites_électriques_43235_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Boites_électriques_43236_43237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Boites_électriques_Montage_Couvercle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Boites_électriques_Retouche_peinture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gaines_ATR72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_ATR72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ERJ_MLG_175_195, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ERJ_DownLock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ERJ_NLG, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_E2_MLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_E2_NLG, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_E2_NLG_Lighting, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_faisceaux_A350_LSDS_LVDT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SJ_100_R, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_G250, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_P20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_A300_600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Cables_BOEING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gaines_BOEING_autres_que_43133, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_gaines_BOEING_43133, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_preparation_montage_gaine_B737, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_montage_gaine_B737, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Boeing_787, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SEHLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ECE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Falcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Falcon_F7X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Gaines_NH90_autre_que_43683_43684_44060_44061, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Gaines_NH90_43683_43684_44060_1_44061, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_faisceaux_NH90_autre_que_43490_43494_44026_44027, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Oxygéne, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_faisceaux_NH90_43490_43494_44026_44027, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_GA_Mats_moteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_faisceaux_SICMA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel76))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_TPIS_38985_43015, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_TPIS_autres_que_38985_43015, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Cablage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Montage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Silvercrest, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_E2_Reservoir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_MRJ_Reservoir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_E2_OBIGGS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_G7000_8000_OBIGGS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Gaine_A380SOV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Gaines_ABS_1896, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Gaines_A30_MLG_251t, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_faisceaux_MC21_NGS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Boeing_787_ND, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_ABS_2216_EMI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Gaines_A321_XLR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_faisceaux_A321_XLR_avec_Isoclip, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_faisceaux_A321_XLR_AXLE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MC21_Reservoir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_SLAT_CAN_HOSE_A320, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_SLAT_CAN_HOSE_A330, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_A340_A350_C919, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3623, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_programmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_programmesMouseClicked
        txt_Matricule.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),0)));
        txt_Alias.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),1)));
        txt_Cond.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),2)));
        txt_faisceaux_A380_NLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),3)));
        txt_faisceaux_A350_NLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),4)));
        txt_faisceaux_A320_41687_41688.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),5)));
        txt_faisceaux_A320_41689_41690_41989.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),6)));
        txt_faisceaux_A320_NEO.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),7)));
        txt_faisceaux_A320_NEO_avec_Isoclip.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),8)));
        txt_faisceaux_A320_MLG_autre_que_AXE.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),9)));
        txt_faisceaux_A320_MLG_Axe.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),10)));
        txt_faisceaux_A330_41489.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),11)));
        txt_faisceaux_A330_A340.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),12)));
        txt_faisceaux_A340_500_600.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),13)));
        txt_faisceaux_A330_MLG_251t.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),14)));
        txt_faisceaux_A350MLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),15)));
        txt_faisceaux_A380MLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),16)));
        txt_faisceaux_A380_50v.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),17)));
        txt_faisceaux_G7000_8000.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),18)));
        txt_faisceaux_Global_Express.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),19)));
        txt_Gaine_A350_NLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),20)));
        txt_Gaines_G7000_8000.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),21)));
        txt_Gaines_A320.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),22)));
        txt_Gaines_A320_NEO.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),23)));
        txt_Gaines_A320_MLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),24)));
        txt_Gaines_A330_A340.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),25)));
        txt_Gaines_A340_500_600.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),26)));
        txt_Gaines_A350MLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),27)));
        txt_Gaines_A350MLG_avec_Surtressage.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),28)));
        txt_Gaines_A380.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),29)));
        txt_Gaines_A380_avec_Band_it.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),30)));
        txt_Gaines_A380_avec_Drainage_DREMEL.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),31)));
        txt_Gaines_Global_Express.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),32)));
        txt_Kitting_A320_MLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),33)));
        txt_AB139.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),34)));
        txt_ANSALDO.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),35)));
        txt_BTMU.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),36)));
        txt_Boites_électriques_43235.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),37)));
        txt_Boites_électriques_43235_1.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),38)));
        txt_Boites_électriques_43236_43237.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),39)));
        txt_Boites_électriques_Montage_Couvercle.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),40)));
        txt_Boites_électriques_Retouche_peinture.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),41)));
        txt_gaines_ATR72.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),42)));
        txt_faisceaux_ATR72.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),43)));
        txt_ERJ_MLG_175_195.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),44)));
        txt_ERJ_DownLock.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),45)));
        txt_ERJ_NLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),46)));
        txt_E2_MLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),47)));
        txt_E2_NLG.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),48)));
        txt_E2_NLG_Lighting.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),49)));
        txt_faisceaux_A350_LSDS_LVDT.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),50)));
        txt_SJ_100_R.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),51)));
        txt_G250.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),52)));
        txt_P20.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),53)));
        txt_A300_600.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),54)));
        txt_Cables_BOEING.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),55)));
        txt_gaines_BOEING_autres_que_43133.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),56)));
        txt_gaines_BOEING_43133.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),57)));
        txt_preparation_montage_gaine_B737.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),58)));
        txt_montage_gaine_B737.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),59)));
        txt_Boeing_787.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),60)));
        txt_SEHLA.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),61)));
        txt_ECE.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),62)));
        txt_Falcon.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),63)));
        txt_Falcon_F7X.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),64)));
        txt_Gaines_NH90_autre_que_43683_43684_44060_44061.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),65)));
        txt_Gaines_NH90_43683_43684_44060_1_44061.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),66)));
        txt_faisceaux_NH90_autre_que_43490_43494_44026_44027.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),67)));
        txt_Oxygéne.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),68)));
        txt_faisceaux_NH90_43490_43494_44026_44027.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),69)));
        txt_GA_Mats_moteur.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),70)));
        txt_faisceaux_SICMA.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),71)));
        txt_TPIS_38985_43015.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),72)));
        txt_TPIS_autres_que_38985_43015.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),73)));
        txt_Cablage.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),74)));
        txt_Montage.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),75)));
        txt_Silvercrest.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),76)));
        txt_E2_Reservoir.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),77)));
        txt_MRJ_Reservoir.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),78)));
        txt_E2_OBIGGS.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),79)));
        txt_G7000_8000_OBIGGS.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),80)));
        txt_Gaine_A380SOV.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),81)));
        txt_Gaines_ABS_1896.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),82)));
        txt_Gaines_A30_MLG_251t.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),83)));
        txt_faisceaux_MC21_NGS.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),84)));
        txt_Boeing_787_ND.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),85)));
        txt_ABS_2216_EMI.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),86)));
        txt_Gaines_A321_XLR.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),87)));
        txt_faisceaux_A321_XLR_avec_Isoclip.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),88)));
        txt_faisceaux_A321_XLR_AXLE.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),89)));
        txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),90)));
        txt_MC21_Reservoir.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),91)));
        txt_SLAT_CAN_HOSE_A320.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),92)));
        txt_SLAT_CAN_HOSE_A330.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),93)));
        txt_A340_A350_C919.setText(String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(),94)));
    }//GEN-LAST:event_table_programmesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txt_Matricule.getText().equals("") || txt_Alias.getText().equals("") || txt_Cond.getText().equals("") || txt_faisceaux_A380_NLG.getText().equals("")
            || txt_faisceaux_A350_NLG.getText().equals("") || txt_faisceaux_A320_41687_41688.getText().equals("") || txt_faisceaux_A320_41689_41690_41989.getText().equals("") ||
            txt_faisceaux_A320_NEO.getText().equals("") || txt_faisceaux_A320_NEO_avec_Isoclip.getText().equals("") || txt_faisceaux_A320_MLG_autre_que_AXE.getText().equals("") ||
            txt_faisceaux_A320_MLG_Axe.getText().equals("") || txt_faisceaux_A330_41489.getText().equals("") || txt_faisceaux_A330_A340.getText().equals("") || txt_faisceaux_A340_500_600.getText().equals("")
            || txt_faisceaux_A330_MLG_251t.getText().equals("") || txt_faisceaux_A350MLG.getText().equals("") || txt_faisceaux_A380MLG.getText().equals("") || txt_faisceaux_A380_50v.getText().equals("") ||
            txt_faisceaux_G7000_8000.getText().equals("") || txt_faisceaux_Global_Express.getText().equals("") || txt_Gaine_A350_NLG.getText().equals("") || txt_Gaines_G7000_8000.getText().equals("") ||
            txt_Gaines_A320.getText().equals("") || txt_Gaines_A320_NEO.getText().equals("") || txt_Gaines_A320_MLG.getText().equals("") || txt_Gaines_A330_A340.getText().equals("") || txt_Gaines_A340_500_600.getText().equals("")
            || txt_Gaines_A350MLG.getText().equals("") || txt_Gaines_A350MLG_avec_Surtressage.getText().equals("") || txt_Gaines_A380.getText().equals("") || txt_Gaines_A380_avec_Band_it.getText().equals("") ||
            txt_Gaines_A380_avec_Drainage_DREMEL.getText().equals("") || txt_Gaines_Global_Express.getText().equals("") || txt_Kitting_A320_MLG.getText().equals("") || txt_AB139.getText().equals("") || txt_ANSALDO.getText().equals("")
            || txt_BTMU.getText().equals("") || txt_Boites_électriques_43235.getText().equals("") || txt_Boites_électriques_43235_1.getText().equals("") || txt_Boites_électriques_43236_43237.getText().equals("") ||
            txt_Boites_électriques_Montage_Couvercle.getText().equals("") || txt_Boites_électriques_Retouche_peinture.getText().equals("") || txt_gaines_ATR72.getText().equals("") || txt_faisceaux_ATR72.getText().equals("")
            || txt_ERJ_MLG_175_195.getText().equals("") || txt_ERJ_DownLock.getText().equals("") ||  txt_ERJ_NLG.getText().equals("") || txt_E2_MLG.getText().equals("") ||  txt_E2_NLG.getText().equals("") || txt_E2_NLG_Lighting.getText().equals("")
            || txt_faisceaux_A350_LSDS_LVDT.getText().equals("") || txt_SJ_100_R.getText().equals("") || txt_G250.getText().equals("") ||  txt_P20.getText().equals("") || txt_A300_600.getText().equals("") || txt_Cables_BOEING.getText().equals("") ||
            txt_gaines_BOEING_autres_que_43133.getText().equals("") || txt_gaines_BOEING_43133.getText().equals("") || txt_preparation_montage_gaine_B737.getText().equals("") || txt_montage_gaine_B737.getText().equals("") ||
            txt_Boeing_787.getText().equals("") ||txt_SEHLA.getText().equals("") || txt_ECE.getText().equals("") ||  txt_Falcon.getText().equals("") || txt_Falcon_F7X.getText().equals("") || txt_Gaines_NH90_autre_que_43683_43684_44060_44061.getText().equals("")
            || txt_Gaines_NH90_43683_43684_44060_1_44061.getText().equals("") || txt_faisceaux_NH90_autre_que_43490_43494_44026_44027.getText().equals("") ||  txt_Oxygéne.getText().equals("") || txt_faisceaux_NH90_43490_43494_44026_44027.getText().equals("")
            || txt_GA_Mats_moteur.getText().equals("") || txt_faisceaux_SICMA.getText().equals("") || txt_TPIS_38985_43015.getText().equals("") || txt_TPIS_autres_que_38985_43015.getText().equals("") || txt_Cablage.getText().equals("") || txt_Montage.getText().equals("")
            || txt_Silvercrest.getText().equals("") || txt_E2_Reservoir.getText().equals("") ||  txt_MRJ_Reservoir.getText().equals("") || txt_E2_OBIGGS.getText().equals("") || txt_G7000_8000_OBIGGS.getText().equals("") || txt_Gaine_A380SOV.getText().equals("")
            ||  txt_Gaines_ABS_1896.getText().equals("") ||  txt_Gaines_A30_MLG_251t.getText().equals("") ||  txt_faisceaux_MC21_NGS.getText().equals("") ||  txt_Boeing_787_ND.getText().equals("") || txt_ABS_2216_EMI.getText().equals("") || txt_Gaines_A321_XLR.getText().equals("")
            || txt_faisceaux_A321_XLR_avec_Isoclip.getText().equals("") ||  txt_faisceaux_A321_XLR_AXLE.getText().equals("") || txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips.getText().equals("") || txt_MC21_Reservoir.getText().equals("") || txt_SLAT_CAN_HOSE_A320.getText().equals("")
            || txt_SLAT_CAN_HOSE_A330.getText().equals("") || txt_A340_A350_C919.getText().equals("")){
            JOptionPane.showMessageDialog (this, "SVP entrer les informations complétes");
        } else {
            String[] colon = {"Matricule ","Alias ","Conditionnement_produit_UAP1_emballage_et_étiquettage ", "Faisceaux_A380_NLG ", "Faisceaux_A350_NLG ", "Faisceaux_A320_41687_41688 ", "Faisceaux_A320_41689_41690_41989 ", "Faisceaux_A320_NEO ", "Faisceaux_A320_NEO_avec_Isoclip ", "Faisceaux_A320_MLG_autre_que_AXE ", "Faisceaux_A320_MLG_AXE ", "Faisceaux_A330_41489 ", "Faisceaux_A330_A340 ", "Faisceaux_A340_500_600 ", "Faisceaux_A330_MLG_251t ", "Faisceaux_A350MLG ", "Faisceaux_A380_MLG ", "Faisceaux_A380_SOV", "Faisceaux_G7000_8000", "Faisceaux_Global_Express ", "Gaine_A350_NLG ", "Gaines_G7000_8000 ", "Gaines_A320 ", "Gaines_A320_NEO ", "Gaines_A320_MLG ", "Gaines_A330_A340 ", "Gaines_A340_500_600 ", "Gaines_A350MLG ", "Gaines_A350MLG_avec_Surtressage ", "Gaines_A380 ", "Gaines_A380_avec_Band_it ", "Gaines_A380_avec_Drainage_DREMEL ", "Gaines_Global_Express ", "Kitting_A320_MLG ", "AB139 ", "ANSALDO ", "BTMU ", "Boites_électriques_43235 ", "Boites_électriques_43235_1 ", "Boites_électriques_43236_43237 ", "Boites_électriques_Montage_couvercle ", "Boites_électriques_Retouche_peinture ", "Gaines_ATR72 ", "Faisceaux_ATR72 ", "ERJ_MLG_175_et_195 ", "ERJ_DownLock ", "ERJ_NLG ", "E2_MLG ", "E2_NLG ", "E2_NLG_Lighting ", "Faisceaux_A350_LSDS_LVDT ", "SJ100R ", "G250 ", "P20 ", "A300_600 ", "Câbles_BOEING ", "Gaines_BOEING_autres_que_43133 ", "Gaines_BOEING_43133 ", "Préparation_montage_gaine_B737 ", "Montage_gaine_B737 ", "Boeing_787 ", "SEHLA ", "ECE ", "Falcon ", "Falcon_F7X ", "Gaines_NH90_autre_que_43683_et_43684_et_44060_et_44061 ", "Gaines_NH90_43683_et_43684_et_44060_et_44061 ", "Faisceaux_NH90_autres_que_43490_et_43494_et_44026_et_44027 ", "Oxygène ", "Faisceaux_NH90_43490_et_43494_44026_et_44027 ", "GA_Mats_moteur ", "Faisceaux_SICMA ", "TPIS_38985_et_43015 ", "TPIS_autres_que_38985_et_43015 ", "Câblage ", "Montage ", "Silvercrest ", "E2_Reservoir ", "MRJ_Reservoir ", "E2_OBIGGS ", "G7000_8000_OBIGGS ", "Gaine_A380SOV ", "Gaine_ABS1896 ", "Gaines_A330_MLG_251t ", "Faisceaux_MC21_NGS ", "Boeing_787_ND ", "ABS_2216_EMI ", "Gaines_A321_XLR ", "Faisceaux_A321_XLR_avec_Isoclip ", "Faisceaux_A321_XLR_AXLE ", "Faisceaux_A321_XLR_autre_que_AXLE_Isoclips ", "MC21_Reservoir ", "SLAT_CAN_HOSE_A320 ", "SLAT_CAN_HOSE_A330_et_A340_et_A350_et_C919 ", "Pourcentage_de_polyvalence_par_opérateur "};
            String[] inf = {txt_Matricule.getText(), txt_Alias.getText(), txt_Cond.getText(), txt_faisceaux_A380_NLG.getText(),
                txt_faisceaux_A350_NLG.getText(), txt_faisceaux_A320_41687_41688.getText(), txt_faisceaux_A320_41689_41690_41989.getText(),
                txt_faisceaux_A320_NEO.getText(), txt_faisceaux_A320_NEO_avec_Isoclip.getText(), txt_faisceaux_A320_MLG_autre_que_AXE.getText(),
                txt_faisceaux_A320_MLG_Axe.getText(), txt_faisceaux_A330_41489.getText(), txt_faisceaux_A330_A340.getText(), txt_faisceaux_A340_500_600.getText(),
                txt_faisceaux_A330_MLG_251t.getText(), txt_faisceaux_A350MLG.getText(), txt_faisceaux_A380MLG.getText(), txt_faisceaux_A380_50v.getText(),
                txt_faisceaux_G7000_8000.getText(), txt_faisceaux_Global_Express.getText(), txt_Gaine_A350_NLG.getText(), txt_Gaines_G7000_8000.getText(),
                txt_Gaines_A320.getText(), txt_Gaines_A320_NEO.getText(), txt_Gaines_A320_MLG.getText(), txt_Gaines_A330_A340.getText(), txt_Gaines_A340_500_600.getText(),
                txt_Gaines_A350MLG.getText(), txt_Gaines_A350MLG_avec_Surtressage.getText(), txt_Gaines_A380.getText(), txt_Gaines_A380_avec_Band_it.getText(),
                txt_Gaines_A380_avec_Drainage_DREMEL.getText(), txt_Gaines_Global_Express.getText(), txt_Kitting_A320_MLG.getText(), txt_AB139.getText(), txt_ANSALDO.getText(),
                txt_BTMU.getText(), txt_Boites_électriques_43235.getText(), txt_Boites_électriques_43235_1.getText(), txt_Boites_électriques_43236_43237.getText(),
                txt_Boites_électriques_Montage_Couvercle.getText(), txt_Boites_électriques_Retouche_peinture.getText(), txt_gaines_ATR72.getText(), txt_faisceaux_ATR72.getText(),
                txt_ERJ_MLG_175_195.getText(), txt_ERJ_DownLock.getText(),  txt_ERJ_NLG.getText(), txt_E2_MLG.getText(), txt_E2_NLG.getText(), txt_E2_NLG_Lighting.getText(),
                txt_faisceaux_A350_LSDS_LVDT.getText(), txt_SJ_100_R.getText(), txt_G250.getText(),  txt_P20.getText(), txt_A300_600.getText(), txt_Cables_BOEING.getText(),
                txt_gaines_BOEING_autres_que_43133.getText(), txt_gaines_BOEING_43133.getText(), txt_preparation_montage_gaine_B737.getText(), txt_montage_gaine_B737.getText(),
                txt_Boeing_787.getText(), txt_SEHLA.getText(), txt_ECE.getText(),  txt_Falcon.getText(), txt_Falcon_F7X.getText(), txt_Gaines_NH90_autre_que_43683_43684_44060_44061.getText(),
                txt_Gaines_NH90_43683_43684_44060_1_44061.getText(), txt_faisceaux_NH90_autre_que_43490_43494_44026_44027.getText(),  txt_Oxygéne.getText(), txt_faisceaux_NH90_43490_43494_44026_44027.getText(),
                txt_GA_Mats_moteur.getText(), txt_faisceaux_SICMA.getText(), txt_TPIS_38985_43015.getText(), txt_TPIS_autres_que_38985_43015.getText(), txt_Cablage.getText(), txt_Montage.getText(),
                txt_Silvercrest.getText(), txt_E2_Reservoir.getText(), txt_MRJ_Reservoir.getText(), txt_E2_OBIGGS.getText(), txt_G7000_8000_OBIGGS.getText(), txt_Gaine_A380SOV.getText(),
                txt_Gaines_ABS_1896.getText(),  txt_Gaines_A30_MLG_251t.getText(),  txt_faisceaux_MC21_NGS.getText(), txt_Boeing_787_ND.getText(), txt_ABS_2216_EMI.getText(), txt_Gaines_A321_XLR.getText(),
                txt_faisceaux_A321_XLR_avec_Isoclip.getText(),  txt_faisceaux_A321_XLR_AXLE.getText(), txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips.getText(), txt_MC21_Reservoir.getText(), txt_SLAT_CAN_HOSE_A320.getText(),
                txt_SLAT_CAN_HOSE_A330.getText(), txt_A340_A350_C919.getText()};
            System.out.println(db.queryInsert("programmes", colon, inf));
            table();
            actualiser();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if (txt_Matricule.getText().equals("") || txt_Alias.getText().equals("") || txt_Cond.getText().equals("") || txt_faisceaux_A380_NLG.getText().equals("") 
    || txt_faisceaux_A350_NLG.getText().equals("") || txt_faisceaux_A320_41687_41688.getText().equals("") || txt_faisceaux_A320_41689_41690_41989.getText().equals("") ||
    txt_faisceaux_A320_NEO.getText().equals("") || txt_faisceaux_A320_NEO_avec_Isoclip.getText().equals("") || txt_faisceaux_A320_MLG_autre_que_AXE.getText().equals("") || 
    txt_faisceaux_A320_MLG_Axe.getText().equals("") || txt_faisceaux_A330_41489.getText().equals("") || txt_faisceaux_A330_A340.getText().equals("") || txt_faisceaux_A340_500_600.getText().equals("") 
    || txt_faisceaux_A330_MLG_251t.getText().equals("") || txt_faisceaux_A350MLG.getText().equals("") || txt_faisceaux_A380MLG.getText().equals("") || txt_faisceaux_A380_50v.getText().equals("") ||  
    txt_faisceaux_G7000_8000.getText().equals("") || txt_faisceaux_Global_Express.getText().equals("") || txt_Gaine_A350_NLG.getText().equals("") || txt_Gaines_G7000_8000.getText().equals("") || 
    txt_Gaines_A320.getText().equals("") || txt_Gaines_A320_NEO.getText().equals("") || txt_Gaines_A320_MLG.getText().equals("") || txt_Gaines_A330_A340.getText().equals("") || txt_Gaines_A340_500_600.getText().equals("")
    || txt_Gaines_A350MLG.getText().equals("") || txt_Gaines_A350MLG_avec_Surtressage.getText().equals("") || txt_Gaines_A380.getText().equals("") || txt_Gaines_A380_avec_Band_it.getText().equals("") || 
    txt_Gaines_A380_avec_Drainage_DREMEL.getText().equals("") || txt_Gaines_Global_Express.getText().equals("") || txt_Kitting_A320_MLG.getText().equals("") || txt_AB139.getText().equals("") || txt_ANSALDO.getText().equals("")
    || txt_BTMU.getText().equals("") || txt_Boites_électriques_43235.getText().equals("") || txt_Boites_électriques_43235_1.getText().equals("") || txt_Boites_électriques_43236_43237.getText().equals("") ||
    txt_Boites_électriques_Montage_Couvercle.getText().equals("") || txt_Boites_électriques_Retouche_peinture.getText().equals("") || txt_gaines_ATR72.getText().equals("") || txt_faisceaux_ATR72.getText().equals("") 
    || txt_ERJ_MLG_175_195.getText().equals("") || txt_ERJ_DownLock.getText().equals("") ||  txt_ERJ_NLG.getText().equals("") || txt_E2_MLG.getText().equals("") ||  txt_E2_NLG.getText().equals("") || txt_E2_NLG_Lighting.getText().equals("")
    || txt_faisceaux_A350_LSDS_LVDT.getText().equals("") || txt_SJ_100_R.getText().equals("") || txt_G250.getText().equals("") ||  txt_P20.getText().equals("") || txt_A300_600.getText().equals("") || txt_Cables_BOEING.getText().equals("") ||
    txt_gaines_BOEING_autres_que_43133.getText().equals("") || txt_gaines_BOEING_43133.getText().equals("") || txt_preparation_montage_gaine_B737.getText().equals("") || txt_montage_gaine_B737.getText().equals("") ||
    txt_Boeing_787.getText().equals("") ||txt_SEHLA.getText().equals("") || txt_ECE.getText().equals("") ||  txt_Falcon.getText().equals("") || txt_Falcon_F7X.getText().equals("") || txt_Gaines_NH90_autre_que_43683_43684_44060_44061.getText().equals("")
    || txt_Gaines_NH90_43683_43684_44060_1_44061.getText().equals("") || txt_faisceaux_NH90_autre_que_43490_43494_44026_44027.getText().equals("") ||  txt_Oxygéne.getText().equals("") || txt_faisceaux_NH90_43490_43494_44026_44027.getText().equals("")
    || txt_GA_Mats_moteur.getText().equals("") || txt_faisceaux_SICMA.getText().equals("") || txt_TPIS_38985_43015.getText().equals("") || txt_TPIS_autres_que_38985_43015.getText().equals("") || txt_Cablage.getText().equals("") || txt_Montage.getText().equals("") 
    || txt_Silvercrest.getText().equals("") || txt_E2_Reservoir.getText().equals("") ||  txt_MRJ_Reservoir.getText().equals("") || txt_E2_OBIGGS.getText().equals("") || txt_G7000_8000_OBIGGS.getText().equals("") || txt_Gaine_A380SOV.getText().equals("") 
    ||  txt_Gaines_ABS_1896.getText().equals("") ||  txt_Gaines_A30_MLG_251t.getText().equals("") ||  txt_faisceaux_MC21_NGS.getText().equals("") ||  txt_Boeing_787_ND.getText().equals("") || txt_ABS_2216_EMI.getText().equals("") || txt_Gaines_A321_XLR.getText().equals("")
    || txt_faisceaux_A321_XLR_avec_Isoclip.getText().equals("") ||  txt_faisceaux_A321_XLR_AXLE.getText().equals("") || txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips.getText().equals("") || txt_MC21_Reservoir.getText().equals("") || txt_SLAT_CAN_HOSE_A320.getText().equals("") 
    || txt_SLAT_CAN_HOSE_A330.getText().equals("") || txt_A340_A350_C919.getText().equals("")){  
         JOptionPane.showMessageDialog (this, "SVP entrer les informations complétes");   
        }else{ String[] colon = {"Matricule ","Alias ","Conditionnement_produit_UAP1_emballage_et_étiquettage ", "Faisceaux_A380_NLG ", "Faisceaux_A350_NLG ", "Faisceaux_A320_41687_41688 ", "Faisceaux_A320_41689_41690_41989 ", "Faisceaux_A320_NEO ", "Faisceaux_A320_NEO_avec_Isoclip ", "Faisceaux_A320_MLG_autre_que_AXE ", "Faisceaux_A320_MLG_AXE ", "Faisceaux_A330_41489 ", "Faisceaux_A330_A340 ", "Faisceaux_A340_500_600 ", "Faisceaux_A330_MLG_251t ", "Faisceaux_A350MLG ", "Faisceaux_A380_MLG ", "Faisceaux_A380_SOV", "Faisceaux_G7000_8000", "Faisceaux_Global_Express ", "Gaine_A350_NLG ", "Gaines_G7000_8000 ", "Gaines_A320 ", "Gaines_A320_NEO ", "Gaines_A320_MLG ", "Gaines_A330_A340 ", "Gaines_A340_500_600 ", "Gaines_A350MLG ", "Gaines_A350MLG_avec_Surtressage ", "Gaines_A380 ", "Gaines_A380_avec_Band_it ", "Gaines_A380_avec_Drainage_DREMEL ", "Gaines_Global_Express ", "Kitting_A320_MLG ", "AB139 ", "ANSALDO ", "BTMU ", "Boites_électriques_43235 ", "Boites_électriques_43235_1 ", "Boites_électriques_43236_43237 ", "Boites_électriques_Montage_couvercle ", "Boites_électriques_Retouche_peinture ", "Gaines_ATR72 ", "Faisceaux_ATR72 ", "ERJ_MLG_175_et_195 ", "ERJ_DownLock ", "ERJ_NLG ", "E2_MLG ", "E2_NLG ", "E2_NLG_Lighting ", "Faisceaux_A350_LSDS_LVDT ", "SJ100R ", "G250 ", "P20 ", "A300_600 ", "Câbles_BOEING ", "Gaines_BOEING_autres_que_43133 ", "Gaines_BOEING_43133 ", "Préparation_montage_gaine_B737 ", "Montage_gaine_B737 ", "Boeing_787 ", "SEHLA ", "ECE ", "Falcon ", "Falcon_F7X ", "Gaines_NH90_autre_que_43683_et_43684_et_44060_et_44061 ", "Gaines_NH90_43683_et_43684_et_44060_et_44061 ", "Faisceaux_NH90_autres_que_43490_et_43494_et_44026_et_44027 ", "Oxygène ", "Faisceaux_NH90_43490_et_43494_44026_et_44027 ", "GA_Mats_moteur ", "Faisceaux_SICMA ", "TPIS_38985_et_43015 ", "TPIS_autres_que_38985_et_43015 ", "Câblage ", "Montage ", "Silvercrest ", "E2_Reservoir ", "MRJ_Reservoir ", "E2_OBIGGS ", "G7000_8000_OBIGGS ", "Gaine_A380SOV ", "Gaine_ABS1896 ", "Gaines_A330_MLG_251t ", "Faisceaux_MC21_NGS ", "Boeing_787_ND ", "ABS_2216_EMI ", "Gaines_A321_XLR ", "Faisceaux_A321_XLR_avec_Isoclip ", "Faisceaux_A321_XLR_AXLE ", "Faisceaux_A321_XLR_autre_que_AXLE_Isoclips ", "MC21_Reservoir ", "SLAT_CAN_HOSE_A320 ", "SLAT_CAN_HOSE_A330_et_A340_et_A350_et_C919 ", "Pourcentage_de_polyvalence_par_opérateur "};
        String[] inf = {txt_Matricule.getText(), txt_Alias.getText(), txt_Cond.getText(), txt_faisceaux_A380_NLG.getText(),
txt_faisceaux_A350_NLG.getText(), txt_faisceaux_A320_41687_41688.getText(), txt_faisceaux_A320_41689_41690_41989.getText(),
txt_faisceaux_A320_NEO.getText(), txt_faisceaux_A320_NEO_avec_Isoclip.getText(), txt_faisceaux_A320_MLG_autre_que_AXE.getText(),  
txt_faisceaux_A320_MLG_Axe.getText(), txt_faisceaux_A330_41489.getText(), txt_faisceaux_A330_A340.getText(), txt_faisceaux_A340_500_600.getText(),  
txt_faisceaux_A330_MLG_251t.getText(), txt_faisceaux_A350MLG.getText(), txt_faisceaux_A380MLG.getText(), txt_faisceaux_A380_50v.getText(),   
txt_faisceaux_G7000_8000.getText(), txt_faisceaux_Global_Express.getText(), txt_Gaine_A350_NLG.getText(), txt_Gaines_G7000_8000.getText(),  
txt_Gaines_A320.getText(), txt_Gaines_A320_NEO.getText(), txt_Gaines_A320_MLG.getText(), txt_Gaines_A330_A340.getText(), txt_Gaines_A340_500_600.getText(), 
txt_Gaines_A350MLG.getText(), txt_Gaines_A350MLG_avec_Surtressage.getText(), txt_Gaines_A380.getText(), txt_Gaines_A380_avec_Band_it.getText(),  
txt_Gaines_A380_avec_Drainage_DREMEL.getText(), txt_Gaines_Global_Express.getText(), txt_Kitting_A320_MLG.getText(), txt_AB139.getText(), txt_ANSALDO.getText(),
txt_BTMU.getText(), txt_Boites_électriques_43235.getText(), txt_Boites_électriques_43235_1.getText(), txt_Boites_électriques_43236_43237.getText(), 
txt_Boites_électriques_Montage_Couvercle.getText(), txt_Boites_électriques_Retouche_peinture.getText(), txt_gaines_ATR72.getText(), txt_faisceaux_ATR72.getText(), 
txt_ERJ_MLG_175_195.getText(), txt_ERJ_DownLock.getText(),  txt_ERJ_NLG.getText(), txt_E2_MLG.getText(), txt_E2_NLG.getText(), txt_E2_NLG_Lighting.getText(), 
txt_faisceaux_A350_LSDS_LVDT.getText(), txt_SJ_100_R.getText(), txt_G250.getText(),  txt_P20.getText(), txt_A300_600.getText(), txt_Cables_BOEING.getText(),
txt_gaines_BOEING_autres_que_43133.getText(), txt_gaines_BOEING_43133.getText(), txt_preparation_montage_gaine_B737.getText(), txt_montage_gaine_B737.getText(), 
txt_Boeing_787.getText(), txt_SEHLA.getText(), txt_ECE.getText(),  txt_Falcon.getText(), txt_Falcon_F7X.getText(), txt_Gaines_NH90_autre_que_43683_43684_44060_44061.getText(),
txt_Gaines_NH90_43683_43684_44060_1_44061.getText(), txt_faisceaux_NH90_autre_que_43490_43494_44026_44027.getText(),  txt_Oxygéne.getText(), txt_faisceaux_NH90_43490_43494_44026_44027.getText(),
txt_GA_Mats_moteur.getText(), txt_faisceaux_SICMA.getText(), txt_TPIS_38985_43015.getText(), txt_TPIS_autres_que_38985_43015.getText(), txt_Cablage.getText(), txt_Montage.getText(),  
txt_Silvercrest.getText(), txt_E2_Reservoir.getText(), txt_MRJ_Reservoir.getText(), txt_E2_OBIGGS.getText(), txt_G7000_8000_OBIGGS.getText(), txt_Gaine_A380SOV.getText(), 
txt_Gaines_ABS_1896.getText(),  txt_Gaines_A30_MLG_251t.getText(),  txt_faisceaux_MC21_NGS.getText(), txt_Boeing_787_ND.getText(), txt_ABS_2216_EMI.getText(), txt_Gaines_A321_XLR.getText(),
txt_faisceaux_A321_XLR_avec_Isoclip.getText(),  txt_faisceaux_A321_XLR_AXLE.getText(), txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips.getText(), txt_MC21_Reservoir.getText(), txt_SLAT_CAN_HOSE_A320.getText(), 
txt_SLAT_CAN_HOSE_A330.getText(), txt_A340_A350_C919.getText()};
String Matricule = String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(), 0));
System.out.println(db.queryUpdate("programmes", colon, inf,"Matricule='" + Matricule + "'"));
table();
actualiser();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     String Matricule= String.valueOf(table_programmes.getValueAt(table_programmes.getSelectedRow(), 0));
        if(JOptionPane.showConfirmDialog(this, "est ce que vous êtes sûr que vous veuillez supprimer", "attention!!!",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
        {db.queryDelete("programmes", "Matricule=" + Matricule);
   
        }else{
            return;
        }
        table();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    actualiser(); table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     if(txt_recherche.getText().equals(""))// si le textfield de recherche est vide
       {
           JOptionPane.showMessageDialog(this, "SVP entrer quelque chose");
       } else{
           if (comrech.getSelectedItem().equals("Matricule")){
               rs = db.querySelectAll("programmes", "Matricule LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           } else if (comrech.getSelectedItem().equals("Alias")){
               rs = db.querySelectAll("programmes", "Alias LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           } else if (comrech.getSelectedItem().equals("Conditionnement produit UAP1(emballage+étiquettage)")){
               rs = db.querySelectAll("programmes", "Conditionnement_produit_UAP1_emballage_et_étiquettage LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A380 NLG")){
               rs = db.querySelectAll("programmes", "Faisceaux_A380_NLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A350 NLG")){
               rs = db.querySelectAll("programmes", "Faisceaux_A350_NLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A320 41687 41688")){
               rs = db.querySelectAll("programmes", "Faisceaux_A320_41687_41688 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A320 41689 41690 41989")){
               rs = db.querySelectAll("programmes", "Faisceaux_A320_41689_41690_41989 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A320 NEO")){
               rs = db.querySelectAll("programmes", "Faisceaux_A320_NEO LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A320 NEO avec Isoclip")){
               rs = db.querySelectAll("programmes", "Faisceaux_A320_NEO_avec_Isoclip LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A320-MLG autre que AXE")){
               rs = db.querySelectAll("programmes", "Faisceaux_A320_MLG_autre_que_AXE LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A320-MLG AXE")){
               rs = db.querySelectAll("programmes", "Faisceaux_A320_MLG_AXE LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A330 41489")){
               rs = db.querySelectAll("programmes", "Faisceaux_A330_41489 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A330 A340")){
               rs = db.querySelectAll("programmes", "Faisceaux_A330_A340 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A340 500/600")){
               rs = db.querySelectAll("programmes", "Faisceaux_A340_500_600 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A330 MLG 251t")){
               rs = db.querySelectAll("programmes", "Faisceaux_A330_MLG_251t LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A350MLG")){
               rs = db.querySelectAll("programmes", "Faisceaux_A350MLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A380 MLG")){
               rs = db.querySelectAll("programmes", "Faisceaux_A380_MLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A380 SOV")){
               rs = db.querySelectAll("programmes", "Faisceaux_A380_SOV LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux G7000/8000")){
               rs = db.querySelectAll("programmes", "Faisceaux_G7000_8000 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux Global Express")){
               rs = db.querySelectAll("programmes", "Faisceaux_Global_Express LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaine A350 NLG")){
               rs = db.querySelectAll("programmes", "Gaine_A350_NLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines G7000/8000")){
               rs = db.querySelectAll("programmes", "Gaines_G7000_8000 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A320")){
               rs = db.querySelectAll("programmes", "Gaines_A320 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A320 NEO")){
               rs = db.querySelectAll("programmes", "Gaines_A320_NEO LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A320-MLG")){
               rs = db.querySelectAll("programmes", "Gaines_A320_MLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A330 A340")){
               rs = db.querySelectAll("programmes", "Gaines_A330_A340 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A340 500/600")){
               rs = db.querySelectAll("programmes", "Gaines_A340_500_600 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A350MLG")){
               rs = db.querySelectAll("programmes", "Gaines_A350MLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A350MLG avec Surtressage")){
               rs = db.querySelectAll("programmes", "Gaines_A350MLG_avec_Surtressage LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A380")){
               rs = db.querySelectAll("programmes", "Gaines_A380 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A380 avec Band-it")){
               rs = db.querySelectAll("programmes", "Gaines_A380_avec_Band_it LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A380 avec Drainage DREMEL")){
               rs = db.querySelectAll("programmes", "Gaines_A380_avec_Drainage_DREMEL LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines Global Express")){
               rs = db.querySelectAll("programmes", "Gaines_Global_Express LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Kitting A320-MLG")){
               rs = db.querySelectAll("programmes", "Kitting_A320_MLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("AB139")){
               rs = db.querySelectAll("programmes", "AB139 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("ANSALDO")){
               rs = db.querySelectAll("programmes", "ANSALDO LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("BTMU")){
               rs = db.querySelectAll("programmes", "BTMU LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Boites électriques 43235")){
               rs = db.querySelectAll("programmes", "Boites_électriques_43235 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Boites électriques 43235-1")){
               rs = db.querySelectAll("programmes", "Boites_électriques_43235_1 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Boites électriques 43236 43237")){
               rs = db.querySelectAll("programmes", "Boites_électriques_43236_43237 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Boites électriques-Montage Couvercle")){
               rs = db.querySelectAll("programmes", "Boites_électriques_Montage_Couvercle LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Boites électriques-Retouche peinture")){
               rs = db.querySelectAll("programmes", "Boites_électriques_Retouche_peinture LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines ATR72")){
               rs = db.querySelectAll("programmes", "Gaines_ATR72 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux ATR72")){
               rs = db.querySelectAll("programmes", "Faisceaux_ATR72 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("ERJ MLG(175 & 195)")){
               rs = db.querySelectAll("programmes", "ERJ_MLG_175_et_195 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("ERJ DownLock")){
               rs = db.querySelectAll("programmes", "ERJ_DownLock LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("ERJ NLG")){
               rs = db.querySelectAll("programmes", "ERJ_NLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("E2 MLG")){
               rs = db.querySelectAll("programmes", "E2_MLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("E2 NLG")){
               rs = db.querySelectAll("programmes", "E2_NLG LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("E2 NLG (Lighting)")){
               rs = db.querySelectAll("programmes", "E2_NLG_Lighting LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A350 LSDS/LVDT")){
               rs = db.querySelectAll("programmes", "Faisceaux_A350_LSDS_LVDT LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("SJ100R")){
               rs = db.querySelectAll("programmes", "SJ100R LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("G250")){
               rs = db.querySelectAll("programmes", "G250 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("P20")){
               rs = db.querySelectAll("programmes", "P20 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("A300/600")){
               rs = db.querySelectAll("programmes", "A300_600 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Câbles BOEING")){
               rs = db.querySelectAll("programmes", "Câbles_BOEING LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines BOEING autres que 43133")){
               rs = db.querySelectAll("programmes", "Gaines_BOEING_autres_que_43133 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines BOEING 43133")){
               rs = db.querySelectAll("programmes", "Gaines_BOEING_43133 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Préparation montage gaine B737")){
               rs = db.querySelectAll("programmes", "Préparation_montage_gaine_B737 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Montage gaine B737")){
               rs = db.querySelectAll("programmes", "Montage_gaine_B737 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Boeing 787")){
               rs = db.querySelectAll("programmes", "Boeing_787 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("SEHLA")){
               rs = db.querySelectAll("programmes", "SEHLA LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("ECE")){
               rs = db.querySelectAll("programmes", "ECE LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Falcon")){
               rs = db.querySelectAll("programmes", "Falcon LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Falcon F7X")){
               rs = db.querySelectAll("programmes", "Falcon_F7X LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines NH90 autre que 43683/43684/44060 & 44061")){
               rs = db.querySelectAll("programmes", "Gaines_NH90_autre_que_43683_et_43684_et_44060_et_44061 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines NH90 43683/43684/44060 & 44061")){
               rs = db.querySelectAll("programmes", "Gaines_NH90_43683_et_43684_et_44060_et_44061 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux  NH90 autres que 43490 /43494 44026 & 44027")){
               rs = db.querySelectAll("programmes", "Faisceaux_NH90_autres_que_43490_et_43494_et_44026_et_44027 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Oxygène")){
               rs = db.querySelectAll("programmes", "Oxygène LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux  NH90 43490 /43494 44026 & 44027")){
               rs = db.querySelectAll("programmes", "Faisceaux_NH90_43490_et_43494_44026_et_44027 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("GA Mats moteur")){
               rs = db.querySelectAll("programmes", "GA_Mats_moteur LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux SICMA")){
               rs = db.querySelectAll("programmes", "Faisceaux_SICMA LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("TPIS 38985 & 43015")){
               rs = db.querySelectAll("programmes", "TPIS_38985_et_43015 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("TPIS autres que 38985 & 43015")){
               rs = db.querySelectAll("programmes", "TPIS_autres_que_38985_et_43015 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Câblage")){
               rs = db.querySelectAll("programmes", "Câblage LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Montage")){
               rs = db.querySelectAll("programmes", "Montage LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Silvercrest")){
               rs = db.querySelectAll("programmes", "Silvercrest LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("E2 Reservoir")){
               rs = db.querySelectAll("programmes", "E2_Reservoir LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("MRJ Reservoir")){
               rs = db.querySelectAll("programmes", "MRJ_Reservoir LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("E2 OBIGGS")){
               rs = db.querySelectAll("programmes", "E2_OBIGGS LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("G7000_8000 OBIGGS")){
               rs = db.querySelectAll("programmes", "G7000_8000_OBIGGS LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaine A380SOV")){
               rs = db.querySelectAll("programmes", "Gaine_A380SOV LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs)); 
           }else if (comrech.getSelectedItem().equals("Gaine ABS1896")){
               rs = db.querySelectAll("programmes", "Gaine_ABS1896 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A330 MLG 251t")){
               rs = db.querySelectAll("programmes", "Gaines_A330_MLG_251t LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux MC21 NGS")){
               rs = db.querySelectAll("programmes", "Faisceaux_MC21_NGS LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Boeing 787 ND")){
               rs = db.querySelectAll("programmes", "Boeing_787_ND LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("ABS 2216 EMI")){
               rs = db.querySelectAll("programmes", "ABS_2216_EMI LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Gaines A321 XLR")){
               rs = db.querySelectAll("programmes", "Gaines_A321_XLR LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A321 XLR avec Isoclip")){
               rs = db.querySelectAll("programmes", "Faisceaux_A321_XLR_avec_Isoclip LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A321 XLR AXLE")){
               rs = db.querySelectAll("programmes", "Faisceaux_A321_XLR_AXLE LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Faisceaux A321 XLR (autre que AXLE/Isoclips)")){
               rs = db.querySelectAll("programmes", "Faisceaux_A321_XLR_autre_que_AXLE_Isoclips LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("MC21 Reservoir")){
               rs = db.querySelectAll("programmes", "MC21_Reservoir LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("SLAT CAN HOSE A320")){
               rs = db.querySelectAll("programmes", "SLAT_CAN_HOSE_A320 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("SLAT CAN HOSE A330/A340 & A350 & C919")){
               rs = db.querySelectAll("programmes", "SLAT_CAN_HOSE_A330_et_A340_et_A350_et_C919 LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }else if (comrech.getSelectedItem().equals("Pourcentage de polyvalence par opérateur")){
               rs = db.querySelectAll("programmes", "Pourcentage_de_polyvalence_par_opérateur LIKE '%" + txt_recherche.getText() + "%' ");
               table_programmes.setModel(new ResultSetTableModel(rs));
           }
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Principale a=new Principale();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Grille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grille.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grille().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comrech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table_programmes;
    private javax.swing.JTextField txt_A300_600;
    private javax.swing.JTextField txt_A340_A350_C919;
    private javax.swing.JTextField txt_AB139;
    private javax.swing.JTextField txt_ABS_2216_EMI;
    private javax.swing.JTextField txt_ANSALDO;
    private javax.swing.JTextField txt_Alias;
    private javax.swing.JTextField txt_BTMU;
    private javax.swing.JTextField txt_Boeing_787;
    private javax.swing.JTextField txt_Boeing_787_ND;
    private javax.swing.JTextField txt_Boites_électriques_43235;
    private javax.swing.JTextField txt_Boites_électriques_43235_1;
    private javax.swing.JTextField txt_Boites_électriques_43236_43237;
    private javax.swing.JTextField txt_Boites_électriques_Montage_Couvercle;
    private javax.swing.JTextField txt_Boites_électriques_Retouche_peinture;
    private javax.swing.JTextField txt_Cablage;
    private javax.swing.JTextField txt_Cables_BOEING;
    private javax.swing.JTextField txt_Cond;
    private javax.swing.JTextField txt_E2_MLG;
    private javax.swing.JTextField txt_E2_NLG;
    private javax.swing.JTextField txt_E2_NLG_Lighting;
    private javax.swing.JTextField txt_E2_OBIGGS;
    private javax.swing.JTextField txt_E2_Reservoir;
    private javax.swing.JTextField txt_ECE;
    private javax.swing.JTextField txt_ERJ_DownLock;
    private javax.swing.JTextField txt_ERJ_MLG_175_195;
    private javax.swing.JTextField txt_ERJ_NLG;
    private javax.swing.JTextField txt_Falcon;
    private javax.swing.JTextField txt_Falcon_F7X;
    private javax.swing.JTextField txt_G250;
    private javax.swing.JTextField txt_G7000_8000_OBIGGS;
    private javax.swing.JTextField txt_GA_Mats_moteur;
    private javax.swing.JTextField txt_Gaine_A350_NLG;
    private javax.swing.JTextField txt_Gaine_A380SOV;
    private javax.swing.JTextField txt_Gaines_A30_MLG_251t;
    private javax.swing.JTextField txt_Gaines_A320;
    private javax.swing.JTextField txt_Gaines_A320_MLG;
    private javax.swing.JTextField txt_Gaines_A320_NEO;
    private javax.swing.JTextField txt_Gaines_A321_XLR;
    private javax.swing.JTextField txt_Gaines_A330_A340;
    private javax.swing.JTextField txt_Gaines_A340_500_600;
    private javax.swing.JTextField txt_Gaines_A350MLG;
    private javax.swing.JTextField txt_Gaines_A350MLG_avec_Surtressage;
    private javax.swing.JTextField txt_Gaines_A380;
    private javax.swing.JTextField txt_Gaines_A380_avec_Band_it;
    private javax.swing.JTextField txt_Gaines_A380_avec_Drainage_DREMEL;
    private javax.swing.JTextField txt_Gaines_ABS_1896;
    private javax.swing.JTextField txt_Gaines_G7000_8000;
    private javax.swing.JTextField txt_Gaines_Global_Express;
    private javax.swing.JTextField txt_Gaines_NH90_43683_43684_44060_1_44061;
    private javax.swing.JTextField txt_Gaines_NH90_autre_que_43683_43684_44060_44061;
    private javax.swing.JTextField txt_Kitting_A320_MLG;
    private javax.swing.JTextField txt_MC21_Reservoir;
    private javax.swing.JTextField txt_MRJ_Reservoir;
    private javax.swing.JTextField txt_Matricule;
    private javax.swing.JTextField txt_Montage;
    private javax.swing.JTextField txt_Oxygéne;
    private javax.swing.JTextField txt_P20;
    private javax.swing.JTextField txt_SEHLA;
    private javax.swing.JTextField txt_SJ_100_R;
    private javax.swing.JTextField txt_SLAT_CAN_HOSE_A320;
    private javax.swing.JTextField txt_SLAT_CAN_HOSE_A330;
    private javax.swing.JTextField txt_Silvercrest;
    private javax.swing.JTextField txt_TPIS_38985_43015;
    private javax.swing.JTextField txt_TPIS_autres_que_38985_43015;
    private javax.swing.JTextField txt_faisceaux_A320_41687_41688;
    private javax.swing.JTextField txt_faisceaux_A320_41689_41690_41989;
    private javax.swing.JTextField txt_faisceaux_A320_MLG_Axe;
    private javax.swing.JTextField txt_faisceaux_A320_MLG_autre_que_AXE;
    private javax.swing.JTextField txt_faisceaux_A320_NEO;
    private javax.swing.JTextField txt_faisceaux_A320_NEO_avec_Isoclip;
    private javax.swing.JTextField txt_faisceaux_A321_XLR_AXLE;
    private javax.swing.JTextField txt_faisceaux_A321_XLR_autre_que_AXLE_Isoclips;
    private javax.swing.JTextField txt_faisceaux_A321_XLR_avec_Isoclip;
    private javax.swing.JTextField txt_faisceaux_A330_41489;
    private javax.swing.JTextField txt_faisceaux_A330_A340;
    private javax.swing.JTextField txt_faisceaux_A330_MLG_251t;
    private javax.swing.JTextField txt_faisceaux_A340_500_600;
    private javax.swing.JTextField txt_faisceaux_A350MLG;
    private javax.swing.JTextField txt_faisceaux_A350_LSDS_LVDT;
    private javax.swing.JTextField txt_faisceaux_A350_NLG;
    private javax.swing.JTextField txt_faisceaux_A380MLG;
    private javax.swing.JTextField txt_faisceaux_A380_50v;
    private javax.swing.JTextField txt_faisceaux_A380_NLG;
    private javax.swing.JTextField txt_faisceaux_ATR72;
    private javax.swing.JTextField txt_faisceaux_G7000_8000;
    private javax.swing.JTextField txt_faisceaux_Global_Express;
    private javax.swing.JTextField txt_faisceaux_MC21_NGS;
    private javax.swing.JTextField txt_faisceaux_NH90_43490_43494_44026_44027;
    private javax.swing.JTextField txt_faisceaux_NH90_autre_que_43490_43494_44026_44027;
    private javax.swing.JTextField txt_faisceaux_SICMA;
    private javax.swing.JTextField txt_gaines_ATR72;
    private javax.swing.JTextField txt_gaines_BOEING_43133;
    private javax.swing.JTextField txt_gaines_BOEING_autres_que_43133;
    private javax.swing.JTextField txt_montage_gaine_B737;
    private javax.swing.JTextField txt_preparation_montage_gaine_B737;
    private javax.swing.JTextField txt_recherche;
    // End of variables declaration//GEN-END:variables
}
