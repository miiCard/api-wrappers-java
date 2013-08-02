package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.Qualification;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Qualification", propOrder = {
    "dataProvider",
    "dataProviderUrl",
    "title",
    "type"
})
public class QualificationImpl implements Qualification {

    @XmlElement(name = "DataProvider", nillable = true)
	private String dataProvider;
    
    @XmlElement(name = "DataProviderUrl", nillable = true)
	private String dataProviderUrl;
    
    @XmlElement(name = "Title", nillable = true)
	private String title;
    
    @XmlElement(name = "Type", nillable = true)
	private QualificationType type;

	public String getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(final String dataProvider) {
		this.dataProvider = dataProvider;
	}

	public String getDataProviderUrl() {
		return dataProviderUrl;
	}

	public void setDataProviderUrl(final String dataProviderUrl) {
		this.dataProviderUrl = dataProviderUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public QualificationType getType() {
		return type;
	}

	public void setType(final QualificationType type) {
		this.type = type;
	}
}
