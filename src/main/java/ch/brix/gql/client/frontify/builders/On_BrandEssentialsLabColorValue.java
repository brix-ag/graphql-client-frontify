package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsLabColorValue extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsLabColorValue() {
    super(new ch.brix.gql.client.On("BrandEssentialsLabColorValue"));
  }
  /**
   * **BETA** Lightness component of the LAB color space.
   */
  public On_BrandEssentialsLabColorValue lightness() {
    _add_field("lightness");
    return this;
  }
  /**
   * **BETA** A axis component of the LAB color space.
   */
  public On_BrandEssentialsLabColorValue aAxis() {
    _add_field("aAxis");
    return this;
  }
  /**
   * **BETA** B axis component of the LAB color space.
   */
  public On_BrandEssentialsLabColorValue bAxis() {
    _add_field("bAxis");
    return this;
  }
}
