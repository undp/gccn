package eu.xfsc.train.tspa.model.trustlist.tsp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import eu.xfsc.train.tspa.model.trustlist.URIType;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPAddessType",propOrder = {"electronicAddress", "postalAddresses"})
public class TSPAddessType {
	
	@XmlElement(name = "ElectronicAddress")
	@JsonProperty("ElectronicAddress")
	private URIType electronicAddress;
	
	@XmlElement(name = "PostalAddresses")
	@JsonProperty("PostalAddresses")
	private List<PostalAddressType> postalAddresses;

}
