package CacViDuMinhHoaOLop;

class Student {
	int id;
    String name;

    public void nhap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void thaydoi(int id, String name) {
        this.id += id;
        this.name = name;
    }

    public void hienthi() {
        System.out.println(id + " " + name);
    }

    public static void main(String []args) {
        Student sv1 = new Student();
        Student sv2 = new Student();

        sv1.nhap(1, "Ngô Văn Lộc");
        sv2.nhap(2, "Hà Đức Kiên");

        sv1.thaydoi(25, "Ngô Lôc");

        sv1.hienthi();
        sv2.hienthi();
    }
}
