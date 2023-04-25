package PDP.Home_Work;

public class Payment {
    PaymentName nameCompany;
    String numberCard;
    String dateCard;

    public Payment(PaymentName nameCompany, String numberCard, String dateCard) {
        this.nameCompany = nameCompany;
        this.numberCard = numberCard;
        this.dateCard = dateCard;
    }

    public PaymentName getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(PaymentName nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getDateCard() {
        return dateCard;
    }

    public void setDateCard(String dateCard) {
        this.dateCard = dateCard;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "nameCompany='" + nameCompany + '\'' +
                ", numberCard='" + numberCard + '\'' +
                ", dateCard='" + dateCard + '\'' +
                '}';
    }
}
