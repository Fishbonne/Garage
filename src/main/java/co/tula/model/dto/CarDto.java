package co.tula.model.dto;


public class CarDto {

    private String model;
    private Integer releaseYear;
    private Integer brandId;
    private Integer colorId;
    private Integer countryId;

    public CarDto(String model, Integer releaseYear, Integer brandId, Integer colorId, Integer countryId) {
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

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
}
