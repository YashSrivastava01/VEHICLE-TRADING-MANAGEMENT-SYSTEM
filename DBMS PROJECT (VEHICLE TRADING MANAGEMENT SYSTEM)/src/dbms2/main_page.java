/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms2;

import static dbms2.DbConnect.conn;
import dbms2.createAcc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rohan
 */
public class main_page extends javax.swing.JFrame {

    /**
     * Creates new form main_page
     */
    
        String index = null,temp_car_id = null,temp_person_id = null;
        String index1 = null,temp_car_id1 = null,temp_person_id1 = null;
        String index2 = null,temp_car_id2 = null,temp_person_id2 = null;
        String index3 = null,temp_car_id3 = null,temp_person_id3 = null;
        String index4 = null,temp_car_id4 = null,temp_person_id4 = null;
        String index5 = null,temp_car_id5 = null,temp_person_id5 = null;
        String car_id2=null,buy_id=null;
    public main_page() {
        int i = 0;
        
        
        
        initComponents();
        
        //this.repaint();
        
        i=i;
        //String sql1="SELECT MAX(`car_id`) as m FROM `car_info`";
        String sql1;
        sql1 = "SELECT car_id from  car_info2 order by car_id desc limit 1 offset ?";
        
        try(PreparedStatement pst3 = conn.prepareStatement(sql1)){
            
            pst3.setInt(1,i);
            ResultSet rs = pst3.executeQuery();
            if(rs.next()){
                index =rs.getString("car_id");
            }
           
            
            
        }

        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
          String sql2;
          sql2="select * from car_info2 where car_id= ?";
          try{
                
                PreparedStatement pst3;
                pst3=conn.prepareStatement(sql2);
                
                pst3.setString(1,index);
            
                
                ResultSet rs3;
               
                rs3=pst3.executeQuery();
           
               if(rs3.next()){
              // jLabel3.setText(rs3.getString("company"));
              // jLabel5.setText(rs3.getString("model_id"));
              // jLabel4.setText(rs3.getString("model_id"));
               jLabel22.setText(rs3.getString("color"));
              // jLabel23.setText(rs3.getString("category"));
               jLabel24.setText(rs3.getString("KM_driven"));
               jLabel26.setText(rs3.getString("transmission"));
               jLabel27.setText(rs3.getString("purchase_date"));
               jLabel5.setText(rs3.getString("amount"));
               temp_car_id=rs3.getString("model_id");
               temp_person_id=rs3.getString("owner_id");
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          String sql3;
          sql3="select * from car where model_id= ?";
          try{
                
                PreparedStatement pst4;
                pst4=conn.prepareStatement(sql3);
                
                pst4.setString(1,temp_car_id);
            
                
                ResultSet rs4;
               
                rs4=pst4.executeQuery();
           
               if(rs4.next()){
                v1.setText(rs4.getString("company"));
                v2.setText(rs4.getString("model"));
                v3.setText(rs4.getString("version"));
                jLabel23.setText(rs4.getString("category"));
                jLabel25.setText(rs4.getString("fuel_type"));

               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          
           String sql4;
          sql4="select * from personal_data where person_id= ?";
          try{
                
                PreparedStatement pst5;
                pst5=conn.prepareStatement(sql4);
                
                pst5.setString(1,temp_person_id);
            
                
                ResultSet rs5;
               
                rs5=pst5.executeQuery();
           
               if(rs5.next()){
                jLabel28.setText(rs5.getString("first_name"));
                jLabel21.setText(rs5.getString("last_name"));
               
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         }
          
          
          
          
          //// second
          i=i+1;
        String sql5="SELECT car_id from  car_info2 order by car_id desc limit 1 offset ?";
        
        try(PreparedStatement pst6 = conn.prepareStatement(sql5)){
            pst6.setInt(1,i);
            ResultSet rs6 = pst6.executeQuery();
            if(rs6.next()){
                index1 =rs6.getString("car_id");
            }
           
            
            
        }

        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
          String sql6;
          sql6="select * from car_info2 where car_id= ?";
          try{
                
                PreparedStatement pst7;
                pst7=conn.prepareStatement(sql6);
                
                pst7.setString(1,index1);
            
                
                ResultSet rs7;
               
                rs7=pst7.executeQuery();
           
               if(rs7.next()){
              // jLabel3.setText(rs3.getString("company"));
              // jLabel5.setText(rs3.getString("model_id"));
              // jLabel4.setText(rs3.getString("model_id"));
               jLabel69.setText(rs7.getString("color"));
              // jLabel23.setText(rs3.getString("category"));
               jLabel71.setText(rs7.getString("KM_driven"));
               jLabel73.setText(rs7.getString("transmission"));
               jLabel74.setText(rs7.getString("purchase_date"));
               jLabel60.setText(rs7.getString("amount"));
               temp_car_id1=rs7.getString("model_id");
               temp_person_id1=rs7.getString("owner_id");
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          String sql7;
          sql7="select * from car where model_id= ?";
          try{
                
                PreparedStatement pst8;
                pst8=conn.prepareStatement(sql7);
                
                pst8.setString(1,temp_car_id1);
            
                
                ResultSet rs8;
               
                rs8=pst8.executeQuery();
           
               if(rs8.next()){
                v32.setText(rs8.getString("company"));
                v34.setText(rs8.getString("model"));
                v33.setText(rs8.getString("version"));
                jLabel70.setText(rs8.getString("category"));
                jLabel72.setText(rs8.getString("fuel_type"));

               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          
           String sql8;
          sql8="select * from personal_data where person_id= ?";
          try{
                
                PreparedStatement pst9;
                pst9=conn.prepareStatement(sql8);
                
                pst9.setString(1,temp_person_id1);
            
                
                ResultSet rs9;
               
                rs9=pst9.executeQuery();
           
               if(rs9.next()){
                jLabel76.setText(rs9.getString("first_name"));
                jLabel68.setText(rs9.getString("last_name"));
               
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         }
          
          
          
          
          
          //third
          i=i+1;
          String sql9="SELECT car_id from  car_info2 order by car_id desc limit 1 offset ?";
        
        try(PreparedStatement pst10 = conn.prepareStatement(sql9)){
            pst10.setInt(1,i);
            ResultSet rs10 = pst10.executeQuery();
            if(rs10.next()){
                index2 =rs10.getString("car_id");
            }
           
            
            
        }

        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
          String sql10;
          sql10="select * from car_info2 where car_id= ?";
          try{
                
                PreparedStatement pst11;
                pst11=conn.prepareStatement(sql10);
                
                pst11.setString(1,index2);
            
                
                ResultSet rs11;
               
                rs11=pst11.executeQuery();
           
               if(rs11.next()){
              // jLabel3.setText(rs3.getString("company"));
              // jLabel5.setText(rs3.getString("model_id"));
              // jLabel4.setText(rs3.getString("model_id"));
               jLabel98.setText(rs11.getString("color"));
              // jLabel23.setText(rs3.getString("category"));
               jLabel100.setText(rs11.getString("KM_driven"));
               jLabel102.setText(rs11.getString("transmission"));
               jLabel103.setText(rs11.getString("purchase_date"));
               jLabel84.setText(rs11.getString("amount"));
               temp_car_id2=rs11.getString("model_id");
               temp_person_id2=rs11.getString("owner_id");
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          String sql11;
          sql11="select * from car where model_id= ?";
          try{
                
                PreparedStatement pst12;
                pst12=conn.prepareStatement(sql11);
                
                pst12.setString(1,temp_car_id2);
            
                
                ResultSet rs12;
               
                rs12=pst12.executeQuery();
           
               if(rs12.next()){
                v41.setText(rs12.getString("company"));
                v43.setText(rs12.getString("model"));
                v42.setText(rs12.getString("version"));
                jLabel99.setText(rs12.getString("category"));
                jLabel101.setText(rs12.getString("fuel_type"));

               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          
           String sql12;
          sql12="select * from personal_data where person_id= ?";
          try{
                
                PreparedStatement pst13;
                pst13=conn.prepareStatement(sql12);
                
                pst13.setString(1,temp_person_id2);
            
                
                ResultSet rs13;
               
                rs13=pst13.executeQuery();
           
               if(rs13.next()){
                jLabel104.setText(rs13.getString("first_name"));
                jLabel97.setText(rs13.getString("last_name"));
               
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         }
          
          //fourth
          
          i=i+1;
          String sql13="SELECT car_id from  car_info2 order by car_id desc limit 1 offset ?";
        
        try(PreparedStatement pst14 = conn.prepareStatement(sql13)){
            pst14.setInt(1,i);
            ResultSet rs14 = pst14.executeQuery();
            if(rs14.next()){
                index3 =rs14.getString("car_id");
            }
           
            
            
        }

        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
          String sql14;
          sql14="select * from car_info2 where car_id= ?";
          try{
                
                PreparedStatement pst15;
                pst15=conn.prepareStatement(sql14);
                
                pst15.setString(1,index3);
            
                
                ResultSet rs15;
               
                rs15=pst15.executeQuery();
           
               if(rs15.next()){
              // jLabel3.setText(rs3.getString("company"));
              // jLabel5.setText(rs3.getString("model_id"));
              // jLabel4.setText(rs3.getString("model_id"));
               jLabel91.setText(rs15.getString("color"));
              // jLabel23.setText(rs3.getString("category"));
               jLabel131.setText(rs15.getString("KM_driven"));
               jLabel133.setText(rs15.getString("transmission"));
               jLabel134.setText(rs15.getString("purchase_date"));
               jLabel79.setText(rs15.getString("amount"));
               temp_car_id3=rs15.getString("model_id");
               temp_person_id3=rs15.getString("owner_id");
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          String sql15;
          sql15="select * from car where model_id= ?";
          try{
                
                PreparedStatement pst16;
                pst16=conn.prepareStatement(sql15);
                
                pst16.setString(1,temp_car_id3);
            
                
                ResultSet rs16;
               
                rs16=pst16.executeQuery();
           
               if(rs16.next()){
                v35.setText(rs16.getString("company"));
                v37.setText(rs16.getString("model"));
                v36.setText(rs16.getString("version"));
                jLabel130.setText(rs16.getString("category"));
                jLabel132.setText(rs16.getString("fuel_type"));

               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          
           String sql16;
          sql16="select * from personal_data where person_id= ?";
          try{
                
                PreparedStatement pst16;
                pst16=conn.prepareStatement(sql16);
                
                pst16.setString(1,temp_person_id3);
            
                
                ResultSet rs17;
               
                rs17=pst16.executeQuery();
           
               if(rs17.next()){
                jLabel135.setText(rs17.getString("first_name"));
                jLabel90.setText(rs17.getString("last_name"));
               
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         }
          
          
          //fifth
          i=i+1;
          String sql17="SELECT car_id from  car_info2 order by car_id desc limit 1 offset ?";
        
        try(PreparedStatement pst17 = conn.prepareStatement(sql17)){
            pst17.setInt(1,i);
            ResultSet rs18 = pst17.executeQuery();
            if(rs18.next()){
                index4 =rs18.getString("car_id");
            }
           
            
            
        }

        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
          String sql18;
          sql18="select * from car_info2 where car_id= ?";
          try{
                
                PreparedStatement pst18;
                pst18=conn.prepareStatement(sql18);
                
                pst18.setString(1,index4);
            
                
                ResultSet rs19;
               
                rs19=pst18.executeQuery();
           
               if(rs19.next()){
              // jLabel3.setText(rs3.getString("company"));
              // jLabel5.setText(rs3.getString("model_id"));
              // jLabel4.setText(rs3.getString("model_id"));
               jLabel183.setText(rs19.getString("color"));
              // jLabel23.setText(rs3.getString("category"));
               jLabel185.setText(rs19.getString("KM_driven"));
               jLabel187.setText(rs19.getString("transmission"));
               jLabel188.setText(rs19.getString("purchase_date"));
               jLabel138.setText(rs19.getString("amount"));
               temp_car_id4=rs19.getString("model_id");
               temp_person_id4=rs19.getString("owner_id");
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          String sql19;
          sql19="select * from car where model_id= ?";
          try{
                
                PreparedStatement pst19;
                pst19=conn.prepareStatement(sql19);
                
                pst19.setString(1,temp_car_id4);
            
                
                ResultSet rs20;
               
                rs20=pst19.executeQuery();
           
               if(rs20.next()){
                v38.setText(rs20.getString("company"));
                v40.setText(rs20.getString("model"));
                v39.setText(rs20.getString("version"));
                jLabel184.setText(rs20.getString("category"));
                jLabel186.setText(rs20.getString("fuel_type"));

               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          
           String sql20;
          sql20="select * from personal_data where person_id= ?";
          try{
                
                PreparedStatement pst20;
                pst20=conn.prepareStatement(sql20);
                
                pst20.setString(1,temp_person_id4);
            
                
                ResultSet rs21;
               
                rs21=pst20.executeQuery();
           
               if(rs21.next()){
                jLabel189.setText(rs21.getString("first_name"));
                jLabel146.setText(rs21.getString("last_name"));
               
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         }
          
          
          //six
          i=i+1;
         String sql21="SELECT car_id from  car_info2 order by car_id desc limit 1 offset ?";
        
        try(PreparedStatement pst21 = conn.prepareStatement(sql21)){
            pst21.setInt(1,i);
            ResultSet rs22 = pst21.executeQuery();
            if(rs22.next()){
                index5 =rs22.getString("car_id");
            }
           
            
            
        }

        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
          String sql22;
          sql22="select * from car_info2 where car_id= ?";
          try{
                
                PreparedStatement pst22;
                pst22=conn.prepareStatement(sql22);
                
                pst22.setString(1,index5);
            
                
                ResultSet rs23;
               
                rs23=pst22.executeQuery();
           
               if(rs23.next()){
              // jLabel3.setText(rs3.getString("company"));
              // jLabel5.setText(rs3.getString("model_id"));
              // jLabel4.setText(rs3.getString("model_id"));
               jLabel219.setText(rs23.getString("color"));
              // jLabel23.setText(rs3.getString("category"));
               jLabel221.setText(rs23.getString("KM_driven"));
               jLabel223.setText(rs23.getString("transmission"));
               jLabel224.setText(rs23.getString("purchase_date"));
               jLabel210.setText(rs23.getString("amount"));
               temp_car_id5=rs23.getString("model_id");
               temp_person_id5=rs23.getString("owner_id");
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          String sql23;
          sql23="select * from car where model_id= ?";
          try{
                
                PreparedStatement pst22;
                pst22=conn.prepareStatement(sql23);
                
                pst22.setString(1,temp_car_id5);
            
                
                ResultSet rs24;
               
                rs24=pst22.executeQuery();
           
               if(rs24.next()){
                v44.setText(rs24.getString("company"));
                v46.setText(rs24.getString("model"));
                v45.setText(rs24.getString("version"));
                jLabel220.setText(rs24.getString("category"));
                jLabel222.setText(rs24.getString("fuel_type"));

               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          
           String sql24;
          sql24="select * from personal_data where person_id= ?";
          try{
                
                PreparedStatement pst23;
                pst23=conn.prepareStatement(sql24);
                
                pst23.setString(1,temp_person_id5);
            
                
                ResultSet rs25;
               
                rs25=pst23.executeQuery();
           
               if(rs25.next()){
                jLabel225.setText(rs25.getString("first_name"));
                jLabel218.setText(rs25.getString("last_name"));
               
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
          
          
          
         //Display notification
         String sql28;
         int count=0;
          sql28="select count(*) from transaction where seller= ?";
          try{
                
                PreparedStatement pst26;
                pst26=conn.prepareStatement(sql28);
                
                pst26.setString(1,Dbms2.g_user_id);
            
                
                ResultSet rs27;
               
                rs27=pst26.executeQuery();
           
                if(rs27.next()){
                    count=rs27.getInt("count(*)");
                   
                          
                }
                
            }  
               
               catch(HeadlessException | SQLException e){
                    JOptionPane.showMessageDialog(null,e);
           }
          
          if(count==0){
                jPanel2.setVisible(false);
          }
         
         
          String sql25,fname = null,lname = null,c_name = null,m_name = null;
          int amount = 0;
          sql25="select * from transaction where seller= ?";
          try{
                
                PreparedStatement pst24;
                pst24=conn.prepareStatement(sql25);
                
                pst24.setString(1,Dbms2.g_user_id);
            
                
                ResultSet rs25;
               
                rs25=pst24.executeQuery();
           
               if(rs25.next()){
                buy_id=rs25.getString("buyer");
                 car_id2=rs25.getString("car_id");
                 //JOptionPane.showMessageDialog(null,buy_id);
                 
                
                 
                    String sql26;
                    sql26="select * from car_info2 where car_id= ?";
                    try{
                
                         PreparedStatement pst25;
                          pst25=conn.prepareStatement(sql26);
                
                           pst25.setString(1,car_id2);
            
                
                        ResultSet rs26;
               
                        rs26=pst25.executeQuery();
           
                        if(rs26.next()){
                            //int buy_id2=rs25.getInt("buyer");
                            int model_id2=rs26.getInt("model_id");
                             amount=rs26.getInt("amount");
                                 //JOptionPane.showMessageDialog(null,amount);
                
                              String sql27;
                              sql27="select * from car where model_id= ?";
                               try{
                
                                     PreparedStatement pst26;
                                    pst26=conn.prepareStatement(sql27);
                
                                    pst26.setInt(1,model_id2);
            
                
                                    ResultSet rs27;
               
                                    rs27=pst26.executeQuery();
           
                                    if(rs27.next()){
                                         c_name=rs27.getString("company");
                                        m_name=rs27.getString("model");
                          
                                    }
                
                                }  
               
                                 catch(HeadlessException | SQLException e){
                                        JOptionPane.showMessageDialog(null,e);
                                 } 
                
               
                    }
                //pst3.executeQuery();
                    }  
               
                    catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
                    
                    
                    
                    
                    
                    String sql27;
                    sql27="select * from personal_data where person_id= ?";
                    try{
                
                         PreparedStatement pst26;
                          pst26=conn.prepareStatement(sql27);
                
                           pst26.setString(1,buy_id);
            
                
                        ResultSet rs28;
               
                        rs28=pst26.executeQuery();
           
                        if(rs28.next()){
                             fname=rs28.getString("first_name");
                             lname=rs28.getString("last_name");
                             
                          
                         }
                
                    }  
               
                    catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
         
                
               
               }
                //pst3.executeQuery();
          }  
               
                catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         } 
         
         
         jLabel1.setText(fname + " " + lname + " has requsted to buy your "+ c_name +" "+ m_name +" at Rs."+ amount + " , Do you want to accept?");
        
         
         
         
         
         
         //profile display
         String fname2 = null,lname2 = null,mobile = null,city = null;
         String sql29;
                    sql29="select * from personal_data where person_id = ?";
                    try{
                
                         PreparedStatement pst28;
                          pst28=conn.prepareStatement(sql29);
                
                           pst28.setString(1,Dbms2.g_user_id);
            
                
                        ResultSet rs29;
               
                        rs29=pst28.executeQuery();
           
                        if(rs29.next()){
                             fname2=rs29.getString("first_name");
                             lname2=rs29.getString("last_name");
                             mobile=rs29.getString("mobile_no");
                             city=rs29.getString("city");
                          
                         }
                        jLabel4.setText(fname2+" "+lname2);
                        jLabel16.setText(mobile);
                        jLabel18.setText(city);
                        
                    }  
               
                    catch(HeadlessException | SQLException e){
                           JOptionPane.showMessageDialog(null,e);
                         }
                    
                    
                    
                    
                    
                    
                    
                    //images
        String path="C:\\Users\\Rohan\\Desktop\\New folder (2)\\"+Dbms2.g_user_id+".jpg";          
        ImageIcon original=new ImageIcon(path);
        Image dabImage=original.getImage();
        Image Modified;
        Modified = dabImage.getScaledInstance(200,200,java.awt.Image.SCALE_SMOOTH);
        jLabel3.setIcon(new ImageIcon(Modified));
        
        
        
        
        
        
        //one
          path="C:\\Users\\Rohan\\Desktop\\New folder (2)\\"+index+".jpg";          
         original=new ImageIcon(path);
         dabImage=original.getImage();
        
        Modified = dabImage.getScaledInstance(90,100,java.awt.Image.SCALE_SMOOTH);
        jLabel2.setIcon(new ImageIcon(Modified));
        
        //two
         path="C:\\Users\\Rohan\\Desktop\\New folder (2)\\"+index1+".jpg";          
         original=new ImageIcon(path);
         dabImage=original.getImage();
        
        Modified = dabImage.getScaledInstance(90,100,java.awt.Image.SCALE_SMOOTH);
        jLabel59.setIcon(new ImageIcon(Modified));
        
        //three
         path="C:\\Users\\Rohan\\Desktop\\New folder (2)\\"+index2+".jpg";          
         original=new ImageIcon(path);
         dabImage=original.getImage();
        
        Modified = dabImage.getScaledInstance(90,100,java.awt.Image.SCALE_SMOOTH);
        jLabel75.setIcon(new ImageIcon(Modified));
  
        //four
         path="C:\\Users\\Rohan\\Desktop\\New folder (2)\\"+index3+".jpg";          
         original=new ImageIcon(path);
         dabImage=original.getImage();
        
        Modified = dabImage.getScaledInstance(90,100,java.awt.Image.SCALE_SMOOTH);
        jLabel78.setIcon(new ImageIcon(Modified));
  
        //five
         path="C:\\Users\\Rohan\\Desktop\\New folder (2)\\"+index4+".jpg";          
         original=new ImageIcon(path);
         dabImage=original.getImage();
        
        Modified = dabImage.getScaledInstance(90,100,java.awt.Image.SCALE_SMOOTH);
        jLabel137.setIcon(new ImageIcon(Modified));
  
        //six
         path="C:\\Users\\Rohan\\Desktop\\New folder (2)\\"+index5+".jpg";          
         original=new ImageIcon(path);
         dabImage=original.getImage();
        
        Modified = dabImage.getScaledInstance(90,100,java.awt.Image.SCALE_SMOOTH);
        jLabel209.setIcon(new ImageIcon(Modified));
  
  
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        v3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        v32 = new javax.swing.JLabel();
        v33 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        v34 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        v35 = new javax.swing.JLabel();
        v36 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        v37 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        v38 = new javax.swing.JLabel();
        v39 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        v40 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel209 = new javax.swing.JLabel();
        v44 = new javax.swing.JLabel();
        v45 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        v46 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        v41 = new javax.swing.JLabel();
        v42 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        v43 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        jLabel9.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setText("Buy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(133, 620, 282, 56);

        jButton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton2.setText("Sell");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(133, 724, 282, 59);

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 300));
        jPanel1.setLayout(null);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(13, 14, 90, 100);

        v1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        v1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(v1);
        v1.setBounds(111, 14, 140, 20);

        v3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        v3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(v3);
        v3.setBounds(110, 60, 140, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(110, 100, 140, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amount :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 80, 91, 16);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 150, 91, 16);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("KM Driven :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 170, 91, 16);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Transmission :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 210, 91, 16);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fuel Type :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 190, 91, 16);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Purchase Date :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 230, 91, 16);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Owner :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 250, 91, 16);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("jLabel21");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(110, 270, 140, 16);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("jLabel21");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(110, 130, 140, 16);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("jLabel21");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(110, 150, 140, 16);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("jLabel21");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(110, 170, 140, 16);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("jLabel21");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(110, 190, 140, 16);

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("jLabel21");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(110, 210, 140, 16);

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("jLabel21");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(110, 230, 140, 16);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("jLabel21");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(110, 250, 140, 16);

        v2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        v2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(v2);
        v2.setBounds(110, 40, 140, 20);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Color :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 130, 91, 16);

        jButton4.setText("Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(80, 310, 71, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(589, 117, 260, 350);

        jPanel12.setBackground(new java.awt.Color(34, 34, 34));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setPreferredSize(new java.awt.Dimension(260, 300));
        jPanel12.setLayout(null);

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.add(jLabel59);
        jLabel59.setBounds(13, 14, 90, 100);

        v32.setBackground(new java.awt.Color(255, 255, 255));
        v32.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        v32.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.add(v32);
        v32.setBounds(111, 14, 140, 20);

        v33.setBackground(new java.awt.Color(255, 255, 255));
        v33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        v33.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.add(v33);
        v33.setBounds(110, 60, 140, 20);

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.add(jLabel60);
        jLabel60.setBounds(110, 100, 140, 20);

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Amount :");
        jPanel12.add(jLabel61);
        jLabel61.setBounds(110, 80, 91, 16);

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Category :");
        jPanel12.add(jLabel62);
        jLabel62.setBounds(10, 150, 91, 16);

        jLabel63.setBackground(new java.awt.Color(255, 255, 255));
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("KM Driven :");
        jPanel12.add(jLabel63);
        jLabel63.setBounds(10, 170, 91, 16);

        jLabel64.setBackground(new java.awt.Color(255, 255, 255));
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Transmission :");
        jPanel12.add(jLabel64);
        jLabel64.setBounds(10, 210, 91, 16);

        jLabel65.setBackground(new java.awt.Color(255, 255, 255));
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Fuel Type :");
        jPanel12.add(jLabel65);
        jLabel65.setBounds(10, 190, 91, 16);

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Purchase Date :");
        jPanel12.add(jLabel66);
        jLabel66.setBounds(10, 230, 91, 16);

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Owner :");
        jPanel12.add(jLabel67);
        jLabel67.setBounds(10, 250, 91, 16);

        jLabel68.setBackground(new java.awt.Color(255, 255, 255));
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("jLabel21");
        jPanel12.add(jLabel68);
        jLabel68.setBounds(110, 270, 140, 16);

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("jLabel21");
        jPanel12.add(jLabel69);
        jLabel69.setBounds(110, 130, 140, 16);

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("jLabel21");
        jPanel12.add(jLabel70);
        jLabel70.setBounds(110, 150, 140, 16);

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("jLabel21");
        jPanel12.add(jLabel71);
        jLabel71.setBounds(110, 170, 140, 16);

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("jLabel21");
        jPanel12.add(jLabel72);
        jLabel72.setBounds(110, 190, 140, 16);

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("jLabel21");
        jPanel12.add(jLabel73);
        jLabel73.setBounds(110, 210, 140, 16);

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("jLabel21");
        jPanel12.add(jLabel74);
        jLabel74.setBounds(110, 230, 140, 16);

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("jLabel21");
        jPanel12.add(jLabel76);
        jLabel76.setBounds(110, 250, 140, 16);

        v34.setBackground(new java.awt.Color(255, 255, 255));
        v34.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        v34.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.add(v34);
        v34.setBounds(110, 40, 140, 20);

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Color :");
        jPanel12.add(jLabel77);
        jLabel77.setBounds(10, 130, 91, 16);

        jButton5.setText("Details");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton5);
        jButton5.setBounds(80, 310, 71, 25);

        getContentPane().add(jPanel12);
        jPanel12.setBounds(923, 117, 260, 350);

        jPanel13.setBackground(new java.awt.Color(34, 34, 34));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setPreferredSize(new java.awt.Dimension(260, 300));
        jPanel13.setLayout(null);

        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.add(jLabel78);
        jLabel78.setBounds(13, 14, 90, 100);

        v35.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        v35.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.add(v35);
        v35.setBounds(110, 10, 140, 20);

        v36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        v36.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.add(v36);
        v36.setBounds(110, 60, 140, 20);

        jLabel79.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.add(jLabel79);
        jLabel79.setBounds(110, 100, 140, 20);

        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Amount :");
        jPanel13.add(jLabel80);
        jLabel80.setBounds(110, 80, 91, 16);

        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Category :");
        jPanel13.add(jLabel81);
        jLabel81.setBounds(10, 150, 91, 16);

        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("KM Driven :");
        jPanel13.add(jLabel82);
        jLabel82.setBounds(10, 170, 91, 16);

        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Transmission :");
        jPanel13.add(jLabel83);
        jLabel83.setBounds(10, 210, 91, 16);

        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Fuel Type :");
        jPanel13.add(jLabel85);
        jLabel85.setBounds(10, 190, 91, 16);

        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Purchase Date :");
        jPanel13.add(jLabel88);
        jLabel88.setBounds(10, 230, 91, 16);

        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("Owner :");
        jPanel13.add(jLabel89);
        jLabel89.setBounds(10, 250, 91, 16);

        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("jLabel21");
        jPanel13.add(jLabel90);
        jLabel90.setBounds(110, 270, 140, 16);

        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("jLabel21");
        jPanel13.add(jLabel91);
        jLabel91.setBounds(110, 130, 140, 16);

        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setText("jLabel21");
        jPanel13.add(jLabel130);
        jLabel130.setBounds(110, 150, 140, 16);

        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("jLabel21");
        jPanel13.add(jLabel131);
        jLabel131.setBounds(110, 170, 140, 16);

        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("jLabel21");
        jPanel13.add(jLabel132);
        jLabel132.setBounds(110, 190, 140, 16);

        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("jLabel21");
        jPanel13.add(jLabel133);
        jLabel133.setBounds(110, 210, 140, 16);

        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("jLabel21");
        jPanel13.add(jLabel134);
        jLabel134.setBounds(110, 230, 140, 16);

        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("jLabel21");
        jPanel13.add(jLabel135);
        jLabel135.setBounds(110, 250, 140, 16);

        v37.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        v37.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.add(v37);
        v37.setBounds(110, 30, 140, 20);

        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("Color :");
        jPanel13.add(jLabel136);
        jLabel136.setBounds(10, 130, 91, 16);

        jButton7.setText("Details");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7);
        jButton7.setBounds(80, 310, 71, 25);

        getContentPane().add(jPanel13);
        jPanel13.setBounds(589, 603, 260, 350);

        jPanel14.setBackground(new java.awt.Color(34, 34, 34));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setPreferredSize(new java.awt.Dimension(260, 300));
        jPanel14.setLayout(null);

        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.add(jLabel137);
        jLabel137.setBounds(13, 14, 90, 100);

        v38.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        v38.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.add(v38);
        v38.setBounds(111, 14, 140, 20);

        v39.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        v39.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.add(v39);
        v39.setBounds(110, 60, 140, 20);

        jLabel138.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.add(jLabel138);
        jLabel138.setBounds(110, 100, 140, 20);

        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setText("Amount :");
        jPanel14.add(jLabel139);
        jLabel139.setBounds(110, 80, 91, 16);

        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setText("Category :");
        jPanel14.add(jLabel140);
        jLabel140.setBounds(10, 150, 91, 16);

        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setText("KM Driven :");
        jPanel14.add(jLabel141);
        jLabel141.setBounds(10, 170, 91, 16);

        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setText("Transmission :");
        jPanel14.add(jLabel142);
        jLabel142.setBounds(10, 210, 91, 16);

        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("Fuel Type :");
        jPanel14.add(jLabel143);
        jLabel143.setBounds(10, 190, 91, 16);

        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setText("Purchase Date :");
        jPanel14.add(jLabel144);
        jLabel144.setBounds(10, 230, 91, 16);

        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setText("Owner :");
        jPanel14.add(jLabel145);
        jLabel145.setBounds(10, 250, 91, 16);

        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("jLabel21");
        jPanel14.add(jLabel146);
        jLabel146.setBounds(110, 270, 140, 16);

        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setText("jLabel21");
        jPanel14.add(jLabel183);
        jLabel183.setBounds(110, 130, 140, 16);

        jLabel184.setForeground(new java.awt.Color(255, 255, 255));
        jLabel184.setText("jLabel21");
        jPanel14.add(jLabel184);
        jLabel184.setBounds(110, 150, 140, 16);

        jLabel185.setForeground(new java.awt.Color(255, 255, 255));
        jLabel185.setText("jLabel21");
        jPanel14.add(jLabel185);
        jLabel185.setBounds(110, 170, 140, 16);

        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setText("jLabel21");
        jPanel14.add(jLabel186);
        jLabel186.setBounds(110, 190, 140, 16);

        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setText("jLabel21");
        jPanel14.add(jLabel187);
        jLabel187.setBounds(110, 210, 140, 16);

        jLabel188.setForeground(new java.awt.Color(255, 255, 255));
        jLabel188.setText("jLabel21");
        jPanel14.add(jLabel188);
        jLabel188.setBounds(110, 230, 140, 16);

        jLabel189.setForeground(new java.awt.Color(255, 255, 255));
        jLabel189.setText("jLabel21");
        jPanel14.add(jLabel189);
        jLabel189.setBounds(110, 250, 140, 16);

        v40.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        v40.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.add(v40);
        v40.setBounds(110, 40, 140, 20);

        jLabel190.setForeground(new java.awt.Color(255, 255, 255));
        jLabel190.setText("Color :");
        jPanel14.add(jLabel190);
        jLabel190.setBounds(10, 130, 91, 16);

        jButton8.setText("Details");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8);
        jButton8.setBounds(80, 310, 71, 25);

        getContentPane().add(jPanel14);
        jPanel14.setBounds(923, 603, 260, 350);

        jPanel16.setBackground(new java.awt.Color(34, 34, 34));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setPreferredSize(new java.awt.Dimension(260, 300));
        jPanel16.setLayout(null);

        jLabel209.setForeground(new java.awt.Color(255, 255, 255));
        jLabel209.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.add(jLabel209);
        jLabel209.setBounds(13, 14, 90, 100);

        v44.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        v44.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.add(v44);
        v44.setBounds(111, 14, 140, 20);

        v45.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        v45.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.add(v45);
        v45.setBounds(110, 60, 140, 20);

        jLabel210.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.add(jLabel210);
        jLabel210.setBounds(110, 100, 140, 20);

        jLabel211.setForeground(new java.awt.Color(255, 255, 255));
        jLabel211.setText("Amount :");
        jPanel16.add(jLabel211);
        jLabel211.setBounds(110, 80, 91, 16);

        jLabel212.setForeground(new java.awt.Color(255, 255, 255));
        jLabel212.setText("Category :");
        jPanel16.add(jLabel212);
        jLabel212.setBounds(10, 150, 91, 16);

        jLabel213.setForeground(new java.awt.Color(255, 255, 255));
        jLabel213.setText("KM Driven :");
        jPanel16.add(jLabel213);
        jLabel213.setBounds(10, 170, 91, 16);

        jLabel214.setForeground(new java.awt.Color(255, 255, 255));
        jLabel214.setText("Transmission :");
        jPanel16.add(jLabel214);
        jLabel214.setBounds(10, 210, 91, 16);

        jLabel215.setForeground(new java.awt.Color(255, 255, 255));
        jLabel215.setText("Fuel Type :");
        jPanel16.add(jLabel215);
        jLabel215.setBounds(10, 190, 91, 16);

        jLabel216.setForeground(new java.awt.Color(255, 255, 255));
        jLabel216.setText("Purchase Date :");
        jPanel16.add(jLabel216);
        jLabel216.setBounds(10, 230, 91, 16);

        jLabel217.setForeground(new java.awt.Color(255, 255, 255));
        jLabel217.setText("Owner :");
        jPanel16.add(jLabel217);
        jLabel217.setBounds(10, 250, 91, 16);

        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setText("jLabel21");
        jPanel16.add(jLabel218);
        jLabel218.setBounds(110, 270, 140, 16);

        jLabel219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel219.setText("jLabel21");
        jPanel16.add(jLabel219);
        jLabel219.setBounds(110, 130, 140, 16);

        jLabel220.setForeground(new java.awt.Color(255, 255, 255));
        jLabel220.setText("jLabel21");
        jPanel16.add(jLabel220);
        jLabel220.setBounds(110, 150, 140, 16);

        jLabel221.setForeground(new java.awt.Color(255, 255, 255));
        jLabel221.setText("jLabel21");
        jPanel16.add(jLabel221);
        jLabel221.setBounds(110, 170, 140, 16);

        jLabel222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel222.setText("jLabel21");
        jPanel16.add(jLabel222);
        jLabel222.setBounds(110, 190, 140, 16);

        jLabel223.setForeground(new java.awt.Color(255, 255, 255));
        jLabel223.setText("jLabel21");
        jPanel16.add(jLabel223);
        jLabel223.setBounds(110, 210, 140, 16);

        jLabel224.setForeground(new java.awt.Color(255, 255, 255));
        jLabel224.setText("jLabel21");
        jPanel16.add(jLabel224);
        jLabel224.setBounds(110, 230, 140, 16);

        jLabel225.setForeground(new java.awt.Color(255, 255, 255));
        jLabel225.setText("jLabel21");
        jPanel16.add(jLabel225);
        jLabel225.setBounds(110, 250, 140, 16);

        v46.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        v46.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.add(v46);
        v46.setBounds(110, 40, 140, 20);

        jLabel226.setForeground(new java.awt.Color(255, 255, 255));
        jLabel226.setText("Color :");
        jPanel16.add(jLabel226);
        jLabel226.setBounds(10, 130, 91, 16);

        jButton9.setText("Details");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton9);
        jButton9.setBounds(80, 310, 71, 25);

        getContentPane().add(jPanel16);
        jPanel16.setBounds(1244, 603, 260, 350);

        jPanel15.setBackground(new java.awt.Color(34, 34, 34));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setPreferredSize(new java.awt.Dimension(260, 300));
        jPanel15.setLayout(null);

        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.add(jLabel75);
        jLabel75.setBounds(13, 14, 90, 100);

        v41.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        v41.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.add(v41);
        v41.setBounds(111, 14, 140, 20);

        v42.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        v42.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.add(v42);
        v42.setBounds(110, 60, 140, 20);

        jLabel84.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.add(jLabel84);
        jLabel84.setBounds(110, 100, 140, 20);

        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Amount :");
        jPanel15.add(jLabel86);
        jLabel86.setBounds(110, 80, 91, 16);

        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Category :");
        jPanel15.add(jLabel87);
        jLabel87.setBounds(10, 150, 91, 16);

        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("KM Driven :");
        jPanel15.add(jLabel92);
        jLabel92.setBounds(10, 170, 91, 16);

        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Transmission :");
        jPanel15.add(jLabel93);
        jLabel93.setBounds(10, 210, 91, 16);

        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Fuel Type :");
        jPanel15.add(jLabel94);
        jLabel94.setBounds(10, 190, 91, 16);

        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("Purchase Date :");
        jPanel15.add(jLabel95);
        jLabel95.setBounds(10, 230, 91, 16);

        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("Owner :");
        jPanel15.add(jLabel96);
        jLabel96.setBounds(10, 250, 91, 16);

        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("jLabel21");
        jPanel15.add(jLabel97);
        jLabel97.setBounds(110, 270, 140, 16);

        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("jLabel21");
        jPanel15.add(jLabel98);
        jLabel98.setBounds(110, 130, 140, 16);

        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("jLabel21");
        jPanel15.add(jLabel99);
        jLabel99.setBounds(110, 150, 140, 16);

        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("jLabel21");
        jPanel15.add(jLabel100);
        jLabel100.setBounds(110, 170, 140, 16);

        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("jLabel21");
        jPanel15.add(jLabel101);
        jLabel101.setBounds(110, 190, 140, 16);

        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("jLabel21");
        jPanel15.add(jLabel102);
        jLabel102.setBounds(110, 210, 140, 16);

        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("jLabel21");
        jPanel15.add(jLabel103);
        jLabel103.setBounds(110, 230, 140, 16);

        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("jLabel21");
        jPanel15.add(jLabel104);
        jLabel104.setBounds(110, 250, 140, 16);

        v43.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        v43.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.add(v43);
        v43.setBounds(110, 40, 140, 20);

        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("Color :");
        jPanel15.add(jLabel105);
        jLabel105.setBounds(10, 130, 91, 16);

        jButton6.setText("Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton6);
        jButton6.setBounds(80, 310, 71, 25);

        getContentPane().add(jPanel15);
        jPanel15.setBounds(1244, 117, 260, 350);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Fisrt name last name requsted to buy your comany model at amount , Do you want to accept ?");

        jButton10.setBackground(new java.awt.Color(0, 255, 0));
        jButton10.setText("Yes");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 0, 0));
        jButton11.setText("No");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addGap(35, 35, 35)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(589, 13, 915, 44);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(164, 117, 200, 200);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name Last Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(133, 360, 291, 36);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Mob. :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(133, 414, 56, 35);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(201, 414, 214, 35);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("City :");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(133, 462, 46, 35);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("jLabel16");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(186, 463, 238, 35);

        jButton12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton12.setText("Update Profile");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(133, 516, 282, 56);

        jButton13.setText("Logout");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(1820, 30, 71, 25);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms2/main_page background 2.jpg"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, -4, 1940, 1080);

        setSize(new java.awt.Dimension(1919, 1075));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Buy s_object = new Buy();
        s_object.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Sell s_object = new Sell();
        s_object.setVisible(true);
      // this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         Dbms2.g_car_id2 =index;
        viewport w=new viewport();
                w.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Dbms2.g_car_id2 =index1;
        viewport w=new viewport();
                w.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Dbms2.g_car_id2 =index2;
        viewport w=new viewport();
                w.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Dbms2.g_car_id2 =index3;
        viewport w=new viewport();
                w.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Dbms2.g_car_id2 =index4;
        viewport w=new viewport();
                w.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Dbms2.g_car_id2 =index4;
        viewport w=new viewport();
                w.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
     
        String query = "DELETE FROM transaction WHERE car_id =? and buyer = ?";
        try (PreparedStatement pst1 = conn.prepareStatement(query)){

                 pst1.setString(1, car_id2);
                 pst1.setString(2, buy_id);
                 pst1.executeUpdate();
                 
        //JOptionPane.showMessageDialog(null,"Deleted Successfully");
        
        
        
            } catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            } 
        
        
         query = "DELETE FROM car_info2 WHERE car_id =? ";
        try (PreparedStatement pst1 = conn.prepareStatement(query)){

                 pst1.setString(1, car_id2);
               
                 pst1.executeUpdate();
                 
        JOptionPane.showMessageDialog(null,"Request Accepted");
        
        
        
            } catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            } 
        
        
        
        
        this.setVisible(false);
        main_page p=new main_page();
        p.setVisible(true);
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
        
        String query = "DELETE FROM transaction WHERE car_id =? and buyer = ?";
        try (PreparedStatement pst1 = conn.prepareStatement(query)){

                 pst1.setString(1, car_id2);
                 pst1.setString(2, buy_id);
                 pst1.executeUpdate();
                 
        JOptionPane.showMessageDialog(null,"Request Denied");
        
        
        
            } catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            } 
        
        main_page p=new main_page();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        update_profile up = new update_profile();
        up.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        login l=new login();
        l.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel12;
    public javax.swing.JPanel jPanel13;
    public javax.swing.JPanel jPanel14;
    public javax.swing.JPanel jPanel15;
    public javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v2;
    private javax.swing.JLabel v3;
    private javax.swing.JLabel v32;
    private javax.swing.JLabel v33;
    private javax.swing.JLabel v34;
    private javax.swing.JLabel v35;
    private javax.swing.JLabel v36;
    private javax.swing.JLabel v37;
    private javax.swing.JLabel v38;
    private javax.swing.JLabel v39;
    private javax.swing.JLabel v40;
    private javax.swing.JLabel v41;
    private javax.swing.JLabel v42;
    private javax.swing.JLabel v43;
    private javax.swing.JLabel v44;
    private javax.swing.JLabel v45;
    private javax.swing.JLabel v46;
    // End of variables declaration//GEN-END:variables
}
