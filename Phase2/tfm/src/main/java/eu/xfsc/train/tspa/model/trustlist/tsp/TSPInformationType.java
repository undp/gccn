package eu.xfsc.train.tspa.model.trustlist.tsp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.xfsc.train.tspa.model.trustlist.NameType;
import eu.xfsc.train.tspa.model.trustlist.URIType;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPInformationType", propOrder = {
    "tspName",
    "tspType",
    "trustFrameworkName",
    "tspRole",
    "tspLegalName",
    "tspTradeName",
    "tspEntityIdentifierList",
    "tspCertificationLists",
    "tspAddress",
    "tspInformationURI",
    "tspQualifierList",
    "otherTSL"
})
public class TSPInformationType {

    @XmlElement(name = "TSPName")
    @JsonProperty("TSPName")
    private NameType tspName;

    @XmlElement(name = "TSPType")
    @JsonProperty("TSPType")
    private String tspType;

    @XmlElement(name = "TrustFrameworkName")
    @JsonProperty("TrustFrameworkName")
    private NameType trustFrameworkName;

    @XmlElement(name = "TSPRole")
    @JsonProperty("TSPRole")
    private String tspRole;

    @XmlElement(name = "TSPLegalName")
    @JsonProperty("TSPLegalName")
    private NameType tspLegalName;

    @XmlElement(name = "TSPTradeName")
    @JsonProperty("TSPTradeName")
    private NameType tspTradeName;

    @XmlElement(name = "TSPEntityIdentifierList")
    @JsonProperty("TSPEntityIdentifierList")
    private TSPEntityIdentifierType tspEntityIdentifierList;

    @XmlElement(name = "TSPCertificationLists")
    @JsonProperty("TSPCertificationLists")
    private TSPCertificationType tspCertificationLists;

    @XmlElement(name = "TSPAddress")
    @JsonProperty("TSPAddress")
    private TSPAddessType tspAddress;

    @XmlElement(name = "TSPInformationURI")
    @JsonProperty("TSPInformationURI")
    private URIType tspInformationURI;

    @XmlElement(name = "TSPQualifierList")
    @JsonProperty("TSPQualifierList")
    private List<TSPQualifierType> tspQualifierList;

    @XmlElement(name = "OtherTSL")
    @JsonProperty("OtherTSL")
    private String otherTSL;
}
