/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contracorriente.peripherals.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 *
 * @author Monica Ceron Jimenez
 * @since December 12 2021
 */
@Document(collection = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

@Id
private Integer id;
private String identification;
private String name;
private Date birthtDay;
private String monthBirthtDay;
private String address;
private String cellPhone;
private String email;
private String password;
private String zone;
private String type;

}
