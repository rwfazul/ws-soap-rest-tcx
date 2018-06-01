/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.type;

import javax.xml.bind.annotation.XmlSeeAlso;


/**
 *
 * @author rhau
 */
@XmlSeeAlso(value = {Address.class }) 
public abstract class ContactInfo {
 
}