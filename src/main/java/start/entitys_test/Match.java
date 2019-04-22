package start.entitys_test;

public class Match {
    private Long id = 0L;
    private String nameTour;
    private String city;
    private String date;
    private String place;
    private String numberStart;
    private String title;
    private String fio;
    private String dateBorn;
    private String razr;
    private String raitingRus;
    private String raitingFide;
    private String subject;
    private String idFide;
    private String total;
    private String coeff;

    public Match(long id, String этап_кубка_россии, String барнаул, String s, String s1, String s2, String fm, String ефанов_михаил, String s3, String кмс, String s4, String s5, String алтайский_край, String s6, String s7, String s8) {
        this.id = id;
        this.nameTour = этап_кубка_россии;
        this.city = барнаул;
        this.date = s;
        this.place = s1;
        this.numberStart = s2;
        this.title = fm;
        this.fio = ефанов_михаил;
        this.dateBorn = s3;
        this.razr = кмс;
        this.raitingRus = s4;
        this.raitingFide = s5;
        this.subject = алтайский_край;
        this.idFide = s6;
        this.total = s7;
        this.coeff = s8;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTour() {
        return nameTour;
    }

    public void setNameTour(String nameTour) {
        this.nameTour = nameTour;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNumberStart() {
        return numberStart;
    }

    public void setNumberStart(String numberStart) {
        this.numberStart = numberStart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getRazr() {
        return razr;
    }

    public void setRazr(String razr) {
        this.razr = razr;
    }

    public String getRaitingRus() {
        return raitingRus;
    }

    public void setRaitingRus(String raitingRus) {
        this.raitingRus = raitingRus;
    }

    public String getRaitingFide() {
        return raitingFide;
    }

    public void setRaitingFide(String raitingFide) {
        this.raitingFide = raitingFide;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIdFide() {
        return idFide;
    }

    public void setIdFide(String idFide) {
        this.idFide = idFide;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCoeff() {
        return coeff;
    }

    public void setCoeff(String coeff) {
        this.coeff = coeff;
    }
}
