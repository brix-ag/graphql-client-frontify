package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsGoogleFontStyle extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsGoogleFontStyle() {
    super(new ch.brix.gql.client.On("BrandEssentialsGoogleFontStyle"));
  }
  /**
   * **BETA** The name of the font style.
   */
  public On_BrandEssentialsGoogleFontStyle name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The weight of the font style.
   */
  public On_BrandEssentialsGoogleFontStyle weight() {
    _add_field("weight");
    return this;
  }
  /**
   * **BETA** Whether the font style is italic.
   */
  public On_BrandEssentialsGoogleFontStyle isItalic() {
    _add_field("isItalic");
    return this;
  }
}
