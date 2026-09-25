package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsFontFamily_fontStyles extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.BrandEssentialsFontStyle>> {
  public BrandEssentialsFontFamily_fontStyles() {
    super(new ch.brix.gql.client.Call<>("fontStyles", "BrandEssentialsFontStyle"));
  }
  public BrandEssentialsFontFamily_fontStyles onBrandEssentialsAdobeFontStyle(On_BrandEssentialsAdobeFontStyle typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandEssentialsFontFamily_fontStyles onBrandEssentialsGoogleFontStyle(On_BrandEssentialsGoogleFontStyle typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandEssentialsFontFamily_fontStyles onBrandEssentialsMonotypeFontStyle(On_BrandEssentialsMonotypeFontStyle typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandEssentialsFontFamily_fontStyles onBrandEssentialsSelfhostedFontStyle(On_BrandEssentialsSelfhostedFontStyle typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public BrandEssentialsFontFamily_fontStyles onBrandEssentialsFontStyle(On_BrandEssentialsFontStyle typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
