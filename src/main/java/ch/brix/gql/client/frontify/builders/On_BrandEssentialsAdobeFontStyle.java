package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsAdobeFontStyle extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsAdobeFontStyle() {
    super(new ch.brix.gql.client.On("BrandEssentialsAdobeFontStyle"));
  }
  /**
   * **BETA** The name of the font style.
   */
  public On_BrandEssentialsAdobeFontStyle name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The weight of the font style.
   */
  public On_BrandEssentialsAdobeFontStyle weight() {
    _add_field("weight");
    return this;
  }
  /**
   * **BETA** Whether the font style is italic.
   */
  public On_BrandEssentialsAdobeFontStyle isItalic() {
    _add_field("isItalic");
    return this;
  }
  /**
   * **BETA** The Adobe Typekit ID.
   */
  public On_BrandEssentialsAdobeFontStyle kitId() {
    _add_field("kitId");
    return this;
  }
}
