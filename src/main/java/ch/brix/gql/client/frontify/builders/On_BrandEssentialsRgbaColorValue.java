package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsRgbaColorValue extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsRgbaColorValue() {
    super(new ch.brix.gql.client.On("BrandEssentialsRgbaColorValue"));
  }
  /**
   * **BETA** Red component of the RGBA color space.
   */
  public On_BrandEssentialsRgbaColorValue red() {
    _add_field("red");
    return this;
  }
  /**
   * **BETA** Green component of the RGBA color space.
   */
  public On_BrandEssentialsRgbaColorValue green() {
    _add_field("green");
    return this;
  }
  /**
   * **BETA** Blue component of the RGBA color space.
   */
  public On_BrandEssentialsRgbaColorValue blue() {
    _add_field("blue");
    return this;
  }
  /**
   * **BETA** Alpha component of the RGBA color space.
   */
  public On_BrandEssentialsRgbaColorValue alpha() {
    _add_field("alpha");
    return this;
  }
}
