package eu.xfsc.train.tspa.model.trustlist.tsp;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPCertificationListType",propOrder = {"tSPCertification"})
public class TSPCertificationListType {
	
	@XmlElement(name = "TSPCertification")
	@JsonProperty("TSPCertification")
	private List<TypeValue> tSPCertification; 

}
