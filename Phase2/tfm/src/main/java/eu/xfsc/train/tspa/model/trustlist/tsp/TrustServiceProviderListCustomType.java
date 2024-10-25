package eu.xfsc.train.tspa.model.trustlist.tsp;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustServiceProviderListCustomType",propOrder = {"trustServiceProvider"})
public class TrustServiceProviderListCustomType {
	
	@XmlElement(name = "TrustServiceProvider")
	private List<TSPCustomType> trustServiceProvider;

	
}