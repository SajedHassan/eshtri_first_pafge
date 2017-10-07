package com.example.user.eshtri_first_pafge;

import java.util.ArrayList;

/**
 * Created by pratap.kesaboyina on 30-11-2015.
 */
public class SectionDataModel {

	private String headerTitle;
	private ArrayList<SingleItemModel> allItemsInSection;

	public SectionDataModel() {

	}

	public SectionDataModel(String headerTitle, ArrayList<SingleItemModel> allItemsInSection) {
		this.headerTitle = headerTitle;
		this.allItemsInSection = allItemsInSection;
	}

	public String getHeaderTitle() {
		return this.headerTitle;
	}

	public void setHeaderTitle(String headerTitle) {
		this.headerTitle = headerTitle;
	}

	public ArrayList<SingleItemModel> getAllItemsInSection() {
		return this.allItemsInSection;
	}

	public void setAllItemsInSection(ArrayList<SingleItemModel> allItemsInSection) {
		this.allItemsInSection = allItemsInSection;
	}

}