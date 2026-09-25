package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsFontFamily extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsFontFamily() {
    super(new ch.brix.gql.client.On("BrandEssentialsFontFamily"));
  }
  /**
   * **BETA** The unique identifier of the font family.
   */
  public On_BrandEssentialsFontFamily id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The name of the font family.
   */
  public On_BrandEssentialsFontFamily name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The CSS name of the font family.
   */
  public On_BrandEssentialsFontFamily cssName() {
    _add_field("cssName");
    return this;
  }
  /**
   * **BETA** The font provider.
   */
  public On_BrandEssentialsFontFamily provider() {
    _add_field("provider");
    return this;
  }
  /**
   * **BETA** The font styles available for this font family.
   */
  public On_BrandEssentialsFontFamily fontStyles(BrandEssentialsFontFamily_fontStyles callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
