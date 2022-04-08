public class ogrenci {
	public int id;
	public String ad;
	public String soyad;
	private int yas;
	
	public void bilgileriyazdır() {
		System.out.println("id:"+ id);
		System.out.println("ad:"+ ad);
		System.out.println("soyad:"+soyad);
	}

	public int getYas() {
		return yas*2;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	
}
