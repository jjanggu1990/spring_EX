package db_2_mybatis;

public class Zipcode {
	String zipcode;
	String area1;
	String area2;
	String area3;
	String area4;
	public Zipcode(String zipcode, String area1, String area2, String area3, String area4) {
		super();
		this.zipcode = zipcode;
		this.area1 = area1;
		this.area2 = area2;
		this.area3 = area3;
		this.area4 = area4;
	}
	@Override
	public String toString() {
		if(getArea3()==null){
		return zipcode + " :  " + area1 + " " + area2 + " " +  area4;
		}else{
			return zipcode + " :  " + area1 + " " + area2 + " " + area3 +" "+ area4;
		}
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getArea1() {
		return area1;
	}
	public void setArea1(String area1) {
		this.area1 = area1;
	}
	public String getArea2() {
		return area2;
	}
	public void setArea2(String area2) {
		this.area2 = area2;
	}
	public String getArea3() {
		return area3;
	}
	public void setArea3(String area3) {
		this.area3 = area3;
	}
	public String getArea4() {
		return area4;
	}
	public void setArea4(String area4) {
		this.area4 = area4;
	}

}
