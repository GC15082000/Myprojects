package com.dto;

public class CompanyDTO {
		private int cid;
		private String cproduct;
		private String cname;
		private String ccity;
		private String ctype;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCproduct() {
			return cproduct;
		}
		public void setCproduct(String cproduct) {
			this.cproduct = cproduct;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getCcity() {
			return ccity;
		}
		public void setCcity(String ccity) {
			this.ccity = ccity;
		}		
		public String getCtype() {
			return ctype;
		}
		public void setCtype(String ctype) {
			this.ctype = ctype;
		}
		@Override
		public String toString() {
			return "CompanyDTO [cid=" + cid + ", cproduct=" + cproduct + ", cname=" + cname + ", ccity=" + ccity
					+ ", ctype=" + ctype + "]";
		}
}
