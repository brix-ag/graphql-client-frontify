package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsSelfhostedFontStyle extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsSelfhostedFontStyle() {
    super(new ch.brix.gql.client.On("BrandEssentialsSelfhostedFontStyle"));
  }
  /**
   * **BETA** The name of the font style.
   */
  public On_BrandEssentialsSelfhostedFontStyle name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The weight of the font style.
   */
  public On_BrandEssentialsSelfhostedFontStyle weight() {
    _add_field("weight");
    return this;
  }
  /**
   * **BETA** Whether the font style is italic.
   */
  public On_BrandEssentialsSelfhostedFontStyle isItalic() {
    _add_field("isItalic");
    return this;
  }
  /**
   * **BETA** The available formats for this font style.
   */
  public On_BrandEssentialsSelfhostedFontStyle formats(BrandEssentialsSelfhostedFontStyle_formats callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
