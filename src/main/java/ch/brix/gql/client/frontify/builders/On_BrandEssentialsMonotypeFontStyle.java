package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsMonotypeFontStyle extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsMonotypeFontStyle() {
    super(new ch.brix.gql.client.On("BrandEssentialsMonotypeFontStyle"));
  }
  /**
   * **BETA** The name of the font style.
   */
  public On_BrandEssentialsMonotypeFontStyle name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The weight of the font style.
   */
  public On_BrandEssentialsMonotypeFontStyle weight() {
    _add_field("weight");
    return this;
  }
  /**
   * **BETA** Whether the font style is italic.
   */
  public On_BrandEssentialsMonotypeFontStyle isItalic() {
    _add_field("isItalic");
    return this;
  }
  /**
   * **BETA** The Monotype font ID.
   */
  public On_BrandEssentialsMonotypeFontStyle fontId() {
    _add_field("fontId");
    return this;
  }
  /**
   * **BETA** The CSS URL for the Monotype font.
   */
  public On_BrandEssentialsMonotypeFontStyle cssUrl() {
    _add_field("cssUrl");
    return this;
  }
}
