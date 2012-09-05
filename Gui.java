/*
 * Created by JFormDesigner on Mon Sep 03 17:16:02 MST 2012
 */

package BankOrganiser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui extends JFrame {
    public Gui() {
        initComponents();
        BankOrganiser.guiWait = false;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void toggleButton1ActionPerformed(ActionEvent e) {

        Values.MiscValue = MiscValue.getSelectedIndex() + 2;
        Values.FamilarsValue = FamilarsValue.getSelectedIndex() + 2;
        Values.AmmoValue = AmmoValue.getSelectedIndex() + 2;
        Values.ArrowsValue = ArrowsValue.getSelectedIndex() + 2;
        Values.FletchingValue = MiscValue.getSelectedIndex()+2;
        Values.FamilarsValue = FamilarsValue.getSelectedIndex() + 2;
        Values.BoltsValue = BoltsValue.getSelectedIndex() + 2;
        Values.ConstructionValue = ConstructionValue.getSelectedIndex() + 2;
        Values.CostumesValue = CostumesValue.getSelectedIndex() + 2;
        Values.CraftingValue = CraftingValue.getSelectedIndex() + 2;
        Values.FarmingValue = FarmingValue.getSelectedIndex() + 2;
        Values.FoodValue = FoodValue.getSelectedIndex() + 2;
        Values.HerbloreValue = HerbloreValue.getSelectedIndex() + 2;
        Values.JewelleryValue = JewelleryValue.getSelectedIndex() + 2;
        Values.MageArmorValue = MageValue.getSelectedIndex() + 2;
        Values.MageWeaponsValue = MageValue.getSelectedIndex() + 2;
        Values.MageMaterialsValue = MageValue.getSelectedIndex() + 2;
        Values.MeleeArmorValue = MeleeArmorValue.getSelectedIndex() + 2;
        Values.MeleeWeaponsValue=MeleeWeaponsValue.getSelectedIndex()+2;
        Values.MiningAndSmithingValue = MiningValue.getSelectedIndex() + 2;
        Values.PotionsValue = PotionsValue.getSelectedIndex() + 2;
        Values.PrayerValue = PrayerValue.getSelectedIndex() + 2;
        Values.RangeArmorValue = RangeArmorValue.getSelectedIndex() + 2;
        Values.RangeWeaponsValue = RangeWeaponsValue.getSelectedIndex() + 2;
        Values.RunecraftingValue = RangeArmorValue.getSelectedIndex() + 2;
        Values.SeedsValue = SeedsValue.getSelectedIndex() + 2;
        Values.SummoningValue = SummoningScrollsValue.getSelectedIndex() + 2;
        Values.ToolsValue = ToolsValue.getSelectedIndex() + 2;
        Values.WoodcuttingValue = WoodcuttingValue.getSelectedIndex() + 2;

        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Preston Hanford
        scrollPane1 = new JScrollPane();
        panel1 = new JPanel();
        MiscValue = new JComboBox();
        label1 = new JLabel();
        AmmoValue = new JComboBox();
        label2 = new JLabel();
        ArrowsValue = new JComboBox();
        label3 = new JLabel();
        BoltsValue = new JComboBox();
        label4 = new JLabel();
        ConstructionValue = new JComboBox();
        label5 = new JLabel();
        CostumesValue = new JComboBox();
        label13 = new JLabel();
        CraftingValue = new JComboBox();
        label14 = new JLabel();
        FamilarsValue = new JComboBox();
        label15 = new JLabel();
        FarmingValue = new JComboBox();
        label16 = new JLabel();
        FoodValue = new JComboBox();
        label12 = new JLabel();
        HerbloreValue = new JComboBox();
        label22 = new JLabel();
        HuntingValue = new JComboBox();
        label21 = new JLabel();
        JewelleryValue = new JComboBox();
        label20 = new JLabel();
        MageValue = new JComboBox();
        label19 = new JLabel();
        MeleeArmorValue = new JComboBox();
        label18 = new JLabel();
        MeleeWeaponsValue = new JComboBox();
        label17 = new JLabel();
        MiningValue = new JComboBox();
        label24 = new JLabel();
        PotionsValue = new JComboBox();
        label25 = new JLabel();
        PrayerValue = new JComboBox();
        label26 = new JLabel();
        RangeArmorValue = new JComboBox();
        label27 = new JLabel();
        RangeWeaponsValue = new JComboBox();
        label23 = new JLabel();
        RunecraftingValue = new JComboBox();
        label28 = new JLabel();
        RunesValue = new JComboBox();
        SeedsValue = new JComboBox();
        label29 = new JLabel();
        label30 = new JLabel();
        SummoningScrollsValue = new JComboBox();
        label31 = new JLabel();
        ToolsValue = new JComboBox();
        label33 = new JLabel();
        WoodcuttingValue = new JComboBox();
        label32 = new JLabel();
        toggleButton1 = new JToggleButton();
        CostumesValue2 = new JComboBox();
        label34 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //======== panel1 ========
            {

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


                //---- MiscValue ----
                MiscValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label1 ----
                label1.setText("Misc/Uncatagorised");

                //---- AmmoValue ----
                AmmoValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label2 ----
                label2.setText("Ammo");

                //---- ArrowsValue ----
                ArrowsValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label3 ----
                label3.setText("Arrows");

                //---- BoltsValue ----
                BoltsValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label4 ----
                label4.setText("Bolts");

                //---- ConstructionValue ----
                ConstructionValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label5 ----
                label5.setText("Construction");

                //---- CostumesValue ----
                CostumesValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label13 ----
                label13.setText("Costumes");

                //---- CraftingValue ----
                CraftingValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label14 ----
                label14.setText("Crafting");

                //---- FamilarsValue ----
                FamilarsValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label15 ----
                label15.setText("Familiars");

                //---- FarmingValue ----
                FarmingValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label16 ----
                label16.setText("Farming");

                //---- FoodValue ----
                FoodValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label12 ----
                label12.setText("Food");

                //---- HerbloreValue ----
                HerbloreValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label22 ----
                label22.setText("Herblore");

                //---- HuntingValue ----
                HuntingValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label21 ----
                label21.setText("Hunting");

                //---- JewelleryValue ----
                JewelleryValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label20 ----
                label20.setText("Jewellery");

                //---- MageValue ----
                MageValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label19 ----
                label19.setText("Mage Armor, Mage Weapons");

                //---- MeleeArmorValue ----
                MeleeArmorValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label18 ----
                label18.setText("Melee Armor");

                //---- MeleeWeaponsValue ----
                MeleeWeaponsValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label17 ----
                label17.setText("Melee Weapons");

                //---- MiningValue ----
                MiningValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label24 ----
                label24.setText("Mining/Smithing");

                //---- PotionsValue ----
                PotionsValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label25 ----
                label25.setText("Potions");

                //---- PrayerValue ----
                PrayerValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label26 ----
                label26.setText("Prayer");

                //---- RangeArmorValue ----
                RangeArmorValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label27 ----
                label27.setText("Range Armor");

                //---- RangeWeaponsValue ----
                RangeWeaponsValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label23 ----
                label23.setText("Range Weapons");

                //---- RunecraftingValue ----
                RunecraftingValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label28 ----
                label28.setText("Runecrafting");

                //---- RunesValue ----
                RunesValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- SeedsValue ----
                SeedsValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label29 ----
                label29.setText("Runes, Teletabs");

                //---- label30 ----
                label30.setText("Seeds");

                //---- SummoningScrollsValue ----
                SummoningScrollsValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label31 ----
                label31.setText("Summoning scrolls");

                //---- ToolsValue ----
                ToolsValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label33 ----
                label33.setText("Tools");

                //---- WoodcuttingValue ----
                WoodcuttingValue.setModel(new DefaultComboBoxModel(new String[] {
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "8",
                    "9"
                }));

                //---- label32 ----
                label32.setText("Woodcutting");

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(MiscValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(AmmoValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(ArrowsValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(BoltsValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(ConstructionValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(CostumesValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(CraftingValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(FamilarsValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label15, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(FarmingValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label16, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(FoodValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label12, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(HerbloreValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label22, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(HuntingValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label21, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(JewelleryValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label20, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(MageValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label19, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(MeleeArmorValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label18, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(MeleeWeaponsValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label17, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(MiningValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label24, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(PotionsValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label25, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(PrayerValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label26, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(RangeArmorValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label27, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(RangeWeaponsValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label23, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(RunecraftingValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label28, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(SeedsValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label29, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(RunesValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label30, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(SummoningScrollsValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label31, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(ToolsValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label33, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(WoodcuttingValue, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(label32, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)))
                            .addGap(24, 24, 24))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(MiscValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label1)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(AmmoValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label2)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(ArrowsValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label3)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(BoltsValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label4)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(ConstructionValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label5)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(CostumesValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label13)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(CraftingValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label14)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(FamilarsValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label15)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(FarmingValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label16)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(FoodValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label12)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(HerbloreValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label22)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(HuntingValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label21)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(JewelleryValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label20)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(MageValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label19)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(MeleeArmorValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label18)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(MeleeWeaponsValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label17)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(MiningValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label24)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(PotionsValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label25)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(PrayerValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label26)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(RangeArmorValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label27)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(RangeWeaponsValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label23)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(RunecraftingValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label28)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(SeedsValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label29)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(RunesValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label30)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(SummoningScrollsValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label31)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(ToolsValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label33)))
                            .addGap(5, 5, 5)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(WoodcuttingValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(label32)))
                            .addContainerGap())
                );
            }
            scrollPane1.setViewportView(panel1);
        }

        //---- toggleButton1 ----
        toggleButton1.setText("Start");
        toggleButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleButton1ActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(toggleButton1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE))
                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(toggleButton1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- CostumesValue2 ----
        CostumesValue2.setModel(new DefaultComboBoxModel(new String[] {
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9"
        }));

        //---- label34 ----
        label34.setText("Costumes");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Preston Hanford
    private JScrollPane scrollPane1;
    private JPanel panel1;
    private JComboBox MiscValue;
    private JLabel label1;
    private JComboBox AmmoValue;
    private JLabel label2;
    private JComboBox ArrowsValue;
    private JLabel label3;
    private JComboBox BoltsValue;
    private JLabel label4;
    private JComboBox ConstructionValue;
    private JLabel label5;
    private JComboBox CostumesValue;
    private JLabel label13;
    private JComboBox CraftingValue;
    private JLabel label14;
    private JComboBox FamilarsValue;
    private JLabel label15;
    private JComboBox FarmingValue;
    private JLabel label16;
    private JComboBox FoodValue;
    private JLabel label12;
    private JComboBox HerbloreValue;
    private JLabel label22;
    private JComboBox HuntingValue;
    private JLabel label21;
    private JComboBox JewelleryValue;
    private JLabel label20;
    private JComboBox MageValue;
    private JLabel label19;
    private JComboBox MeleeArmorValue;
    private JLabel label18;
    private JComboBox MeleeWeaponsValue;
    private JLabel label17;
    private JComboBox MiningValue;
    private JLabel label24;
    private JComboBox PotionsValue;
    private JLabel label25;
    private JComboBox PrayerValue;
    private JLabel label26;
    private JComboBox RangeArmorValue;
    private JLabel label27;
    private JComboBox RangeWeaponsValue;
    private JLabel label23;
    private JComboBox RunecraftingValue;
    private JLabel label28;
    private JComboBox RunesValue;
    private JComboBox SeedsValue;
    private JLabel label29;
    private JLabel label30;
    private JComboBox SummoningScrollsValue;
    private JLabel label31;
    private JComboBox ToolsValue;
    private JLabel label33;
    private JComboBox WoodcuttingValue;
    private JLabel label32;
    private JToggleButton toggleButton1;
    private JComboBox CostumesValue2;
    private JLabel label34;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
