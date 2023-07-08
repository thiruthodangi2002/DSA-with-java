package encapsulation;

class account {

  private long acc_no;
  private String name, email;
  private float amount;

  public long getacc_no() {
    return acc_no;
  }

  public void setacc_no(long acc_no) {
    this.acc_no = acc_no;
  }

  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
  }

  public String getemail() {
    return email;
  }

  public void setemail(String email) {
    this.email = email;
  }

  public float getamount() {
    return this.amount;
  }

  public void setamount(float amount) {
    this.amount = amount;
  }
}

public class bank {

  public static void main(String[] args) {
    account acc = new account();
    acc.setacc_no(123445);
    acc.setname("thiru");
    acc.setemail("thiruthodangi@gmail.com");
    acc.setamount(50000);
    System.out.print(
      acc.getacc_no() +
      " " +
      acc.getname() +
      " " +
      acc.getamount() +
      " " +
      acc.getemail()
    );
  }
}
