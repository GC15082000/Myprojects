package com.dto;

public class Address {
		private int addCode;
		private String addName;
		private String addCity;
		
		public int getAddCode() {
			return addCode;
		}
		public void setAddCode(int addCode) {
			this.addCode = addCode;
		}
		public String getAddName() {
			return addName;
		}
		public void setAddName(String addName) {
			this.addName = addName;
		}
		public String getAddCity() {
			return addCity;
		}
		public void setAddCity(String addCity) {
			this.addCity = addCity;
		}
		@Override
		public String toString() {
			return "Address [addCode=" + addCode + ", addName=" + addName + ", addCity=" + addCity + "]";
		}
		
}
