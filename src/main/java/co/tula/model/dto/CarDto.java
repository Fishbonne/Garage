package co.tula.model.dto;


public class CarDto {

    private String model;
    private int releaseYear;
    private int brandId;
    private int colorId;
    private int countryId;

    public CarDto(String model, int releaseYear, int brandId, int colorId, int countryId) {
        this.model = model;
        this.releaseYear = releaseYear;
        this.brandId = brandId;
        this.colorId = colorId;
        this.countryId = countryId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
}
