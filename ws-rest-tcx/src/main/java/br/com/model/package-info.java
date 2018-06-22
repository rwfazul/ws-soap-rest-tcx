@XmlSchema( 
    namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", 
    elementFormDefault = XmlNsForm.QUALIFIED) 
package br.com.model;

import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;

/**
 * 
 * @author rhau
 */

/**
 * 
 * Essa classe estabelece que, por default, todos os elementos sao qualificados pelo namespace, 
 * impedindo assim a seguinte exceção: 
 *  Exception in thread "main" javax.xml.bind.UnmarshalException: unexpected element 
 *   (uri:"http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", local:"TrainingCenterDatabase")
 *
 */