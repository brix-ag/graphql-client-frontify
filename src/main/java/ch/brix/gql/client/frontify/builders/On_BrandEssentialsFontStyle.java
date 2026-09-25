package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsFontStyle extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsFontStyle() {
    super(new ch.brix.gql.client.On("BrandEssentialsFontStyle"));
  }
  /**
   * **BETA** The name of the font style.
   */
  public On_BrandEssentialsFontStyle name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The weight of the font style.
   */
  public On_BrandEssentialsFontStyle weight() {
    _add_field("weight");
    return this;
  }
  /**
   * **BETA** Whether the font style is italic.
   */
  public On_BrandEssentialsFontStyle isItalic() {
    _add_field("isItalic");
    return this;
  }
}
