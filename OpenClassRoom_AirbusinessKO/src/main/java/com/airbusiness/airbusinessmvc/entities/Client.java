// com.airbusiness.airbusinessmvc.entities;

package com.airbusiness.airbusinessmvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity   // Added Data Storage Annotation
public class Client {
   @Id   // Added Data Storage Annotation
   @GeneratedValue(strategy = GenerationType.IDENTITY)  // Added Data Storage Annotation
   private long id;
   
   
   @NotBlank(message = "First Name is mandatory")  // Added Data Storage Annotation
   private String firstName;
   
   @NotBlank(message = "Last Name is mandatory")  // Added Data Storage Annotation
   private String lastName;
   private String address;
   private String telephone;
   private double outstandingBalance;
   
   // Added Data Storage Getter and Setter
   public void setId(long id) {
       this.id = id;
   }
   public long getId() {
       return id;
   }
   
   // Added Data Storage Getter and Setter
   public String getFirstName() {
       return firstName;
   }
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   
   // Added Data Storage Getter and Setter
   public String getLastName() {
       return lastName;
   }
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
   
   // Added Data Storage Getter and Setter
   public String getAddress() {
       return address;
   }
   public void setAddress(String address) {
       this.address = address;
   }
   
   // Added Data Storage Getter and Setter
   public String getTelephone() {
       return telephone;
   }
   public void setTelephone(String telephone) {
       this.telephone = telephone;
   }
   
   // Added Data Storage Getter and Setter
   public double getOutstandingBalance() {
       return outstandingBalance;
   }
   public void setOutstandingBalance(double outstandingBalance) {
       this.outstandingBalance = outstandingBalance;
   }
}