/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textilesproject;

import static com.mycompany.textilesproject.Constants.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Parameters {
    
    public static final String PATH_TO_CSV_FILE = "C:\\91firms_rmrao\\Textile_Data-1.csv";
    
    //if not even this many records, ignore this company
    public static final int MINIMUM_RECORDS_PER_COMPANY = 10 ;
    
    public static final int NUM_CHARECTERS = 14 ;
    
    public static final int START_YEAR = 2000 ;
    public static final int END_YEAR = 2017 ;
   
    public static final  ArrayList<String> companiesOfInterest = new ArrayList<String>() { 
            { 
                add("A P M Industries Ltd."); 
                add("Aarvee Denims & Exports Ltd."); 
                add("Alok Industries Ltd."); 
                add("Alps Industries Ltd."); 
                add("Amarjothi Spinning Mills Ltd.");
                add ( "Ambika Cotton Mills Ltd.");
                add ( "Amit Spinning Inds. Ltd.");
                add("Arex Industries Ltd.");
                add("Arvind Ltd.");
                add("Ashima Ltd.");
                add("Ashnoor Textile Mills Ltd.");
                add("B S L Ltd.");
                add("Bengal Tea & Fabrics Ltd.");
                add("Cheviot Co. Ltd.");
                add (        "Damodar Industries Ltd.");
                add (                "Donear Industries Ltd.");
                  add (                       "Eastern Silk Inds. Ltd.");
                   add (                              "Eskay KNIt (India) Ltd.");
                    add (                                     "Eurotex Industries & Exports Ltd.");
                      add (                                   "Fairdeal Filaments Ltd.");
                       add (                                          "Faze Three Ltd.");
                             add (                                            "Fiberweb (India) Ltd.");
                             add (                                                    "Filatex Fashions Ltd.");
                             add (                                                            "G T N Industries Ltd.");
                add ( "Garware Technical Fibres Ltd.");
                add ( "Ginni Filaments Ltd.");
                add ( "H P Cotton Textile Mills Ltd.");
                add ( "Himatsingka Seide Ltd.");
                      add (   "Indian Card Clothing Co. Ltd.");
                      add (           "Indo Count Inds. Ltd.");
                      add (                   "J C T Ltd.");
                      add (                   "J J Exporters Ltd.");
                      add (                   "Jamshri Ranjitsinghji Spg. & Wvg. Mills Co. Ltd.");
                add ( "Jindal Cotex Ltd.");
                      add (   "K G Denim Ltd.");
                      add (   "K S L & Industries Ltd.");
                      add (           "Kallam Textiles Ltd.");
                      add (                   "Kamadgiri Fashion Ltd.");
                      add (                           "Kandagiri Spinning Mills Ltd.");
                      add (                           "K-Lifestyle & Industries Ltd.");
                      add (                                   "Lakshmi Mills Co. Ltd.");              
                      add (                   "Loyal Textile Mills Ltd.");
                add ( "Ludlow Jute & Specialities Ltd.");
                add (  "Mafatlal Industries Ltd.");
                add (          "Maharaja Shree Umaid Mills Ltd.");
                add ( "Malwa Cotton Spg. Mills Ltd.");                
                add ( "Maral Overseas Ltd.");                        
                add ( "Mayur Uniquoters Ltd.");
                add (         "Mid India Inds. Ltd.");
                add (  "Minaxi Textiles Ltd.");
                add (    "Mohit Industries Ltd.");
                add (          "Mohota Industries Ltd.");
                      add (            "Nahar Spinning Mills Ltd.");
                      add (            "Orbit Exports Ltd.");
                      add (                    "P B M Polytex Ltd.");
                      add (                            "Patspin India Ltd.");
                      add (                                    "Pranavaditya Spinning Mills Ltd.");
                      add (                                    "Premco Global Ltd.");
                      add (                                            "R L F Ltd.");                                                                 
                      add (              "R S W M Ltd.");
                      add (                      "Reliance Chemotex Inds. Ltd.");
                      add (                              "S T I India Ltd.");
                      add (                              "Sambandam Spinning Mills Ltd.");                                                   
                      add (                      "Santosh Fine-Fab Ltd.");                                           
                      add (    "Seasons Textiles Ltd.");                                 
                      add (            "Shiva Texyarn Ltd.");
                      add (             "Shree Bhavya Fabrics Ltd.");
                      add (             "Shree Rajasthan Syntex Ltd.");
                      add (             "Shri Dinesh Mills Ltd.");
                      add (             "Siyaram Silk Mills Ltd.");
                      add (             "Sky Industries Ltd.");                                  
                      add (             "Soma Textiles & Inds. Ltd.");                                          
                      add (   "Spentex Industries Ltd.");
                      add (           "Sri Nachammai Cotton Mills Ltd.");                                        
                      add (        "Super Sales India Ltd.");
                      add (        "Super Spinning Mills Ltd.");
                      add (        "Supertex Industries Ltd.");
                      add (                "Suryajyoti Spinning Mills Ltd.");                                     
                      add (           "Suryalakshmi Cotton Mills Ltd.");
                      add (           "Suryalata Spinning Mills Ltd.");
                      add (           "Suryavanshi Spinning Mills Ltd.");                                
                      add (           "Tamilnadu Jai Bharath Mills Ltd.");                                        
                      add (           "Vardhman Polytex Ltd.");
                      add (                   "Vardhman Textiles Ltd.");                                        
                      add (                   "Vippy Spinpro Ltd.");
                      add (                       "Voith Paper Fabrics India Ltd.");
                      add (                   "Welspun India Ltd.");                                                
                      add (                     "Winsome Textile Inds. Ltd.");
                      add (                      "Winsome Yarns Ltd.");                                          
                      add (                      "Wires & Fabriks (S.A.) Ltd.");                                                   
                      add (                              "Zenith Exports Ltd.");
                      add ("Birla Transasia Carpets Ltd.") ;
                      add ("Cheslind Textiles Ltd. [Merged]") ;
                      add ("D C M Ltd.") ;
                      add ("Digjam Ltd. [Merged]") ;
                      add ("Gangotri Textiles Ltd.") ;
                      add ("Gini Silk Mills Ltd.") ;
                      add ("Gravity (India) Ltd.") ;
                      add ("Hisar Spinning Mills Ltd.") ;
                      add ("Jaybharat Textiles & Real Estate Ltd.") ;
                      add ("Jyoti Overseas Ltd.") ;
                      add ("Kiran Print-Pack Ltd.") ;
                      add ("Kush Industries Ltd.") ;
                      add ("Nahar Industrial Enterprises Ltd.") ;
                      add ("Oxford Industries Ltd.") ;
                      add ("Raghuvir Synthetics Ltd.") ;
                      add ("Rajapalayam Mills Ltd.") ;
                      add ("Raymond Ltd.") ;
                      add ("Ruby Mills Ltd.") ;
                      add ("S Kumars Nationwide Ltd.") ;
                      add ("S R F Ltd.") ;
                      add ("Shalimar Wires Inds. Ltd.") ;
                      add ("Shri Lakshmi Cotsyn Ltd.") ;
                      add ("Sky Industries Ltd.") ;
                      add ("Spentex Industries Ltd.") ;
                      add ("Sri Ramakrishna Mills (Coimbatore) Ltd.") ;
                      add ("Suditi Industries Ltd.") ;
                      add ("Thambbi Modern Spg. Mills Ltd.") ;
                      add ("United Textiles Ltd.") ;
                      add ("Vanasthali Textile Inds. Ltd.") ;
                      add ("Vogue Textiles Ltd.") ;
                                                           
            } 
        }; 
 
    
    
    public static final  ArrayList<String> columnsOfInterest = new ArrayList<String>() { 
            { 
                add("Id"); 
                add("Company Name"); 
                add("Year"); 
                add("Industry"); 
                
                add("Sales"); 
                add("NFA"); 
                add("Debt"); 
                add("Current_Ratio"); 
                add("Total Capital"); 
                add("Net Worth"); 
                add("Debt to Equity Ratio"); 
                add("Retained Profits"); 
                add("Cash Profit"); 
                add("Total Interest Expenses"); 
                add("Export/Sales"); 
                add("GFA"); 
                //add("CA"); 
                add("Cash/CL"); 
                add("Selling and Distribution Expenses"); 
                add("Depreciation"); 
                add("Total Taxes/Total Income"); 
                add("Cumulative Retained Profits"); 
                add("Operating Expenses/Total Expenses"); 
                add("Inventories"); 
                add("Gross Working Capital"); 
                add("Total Liabilities"); 
                add("Borrowings");                  
                add("Total Interest Expenses"); 
                add("Borrowings");  
            } 
        }; 
 
    
  
}
