package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentials extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentials() {
    super(new ch.brix.gql.client.On("BrandEssentials"));
  }
  /**
   * **BETA** The color palettes of the brand essentials.
   */
  public On_BrandEssentials colorPalettes(BrandEssentials_colorPalettes callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The font families of the brand essentials.
   */
  public On_BrandEssentials fontFamilies(BrandEssentials_fontFamilies callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
