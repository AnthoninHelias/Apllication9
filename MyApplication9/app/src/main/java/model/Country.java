package model;

public class Country {

    private String commonName;         // Nom courant du pays
    private String officialName;       // Nom officiel du pays
    private String capitalCity;        // Capitale
    private String currencyTrigram;    // Code à trois lettres de la monnaie
    private String currencyName;       // Nom de la monnaie
    private String currencySymbol;     // Symbole de la monnaie
    private double latitude;           // Latitude géographique
    private double longitude;          // Longitude géographique
    private String flagUrl;            // URL du drapeau

    // Constructeur complet
    public Country(String commonName, String officialName, String capitalCity,
                   String currencyTrigram, String currencyName, String currencySymbol,
                   double latitude, double longitude, String flagUrl) {
        this.commonName = commonName;
        this.officialName = officialName;
        this.capitalCity = capitalCity;
        this.currencyTrigram = currencyTrigram;
        this.currencyName = currencyName;
        this.currencySymbol = currencySymbol;
        this.latitude = latitude;
        this.longitude = longitude;
        this.flagUrl = flagUrl;
    }

    // Getters
    public String getCommonName() {
        return commonName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public String getCurrencyTrigram() {
        return currencyTrigram;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    // Setters
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public void setCurrencyTrigram(String currencyTrigram) {
        this.currencyTrigram = currencyTrigram;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }
}
