package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsSelfhostedFontStyleFormat extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsSelfhostedFontStyleFormat() {
    super(new ch.brix.gql.client.On("BrandEssentialsSelfhostedFontStyleFormat"));
  }
  /**
   * **BETA** The format of the font file.
   */
  public On_BrandEssentialsSelfhostedFontStyleFormat format() {
    _add_field("format");
    return this;
  }
  /**
   * **BETA** The URL of the font file.
   */
  public On_BrandEssentialsSelfhostedFontStyleFormat url() {
    _add_field("url");
    return this;
  }
}
