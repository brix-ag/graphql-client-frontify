package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsHslColorValue extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsHslColorValue() {
    super(new ch.brix.gql.client.On("BrandEssentialsHslColorValue"));
  }
  /**
   * **BETA** Hue component of the HSL color space.
   */
  public On_BrandEssentialsHslColorValue hue() {
    _add_field("hue");
    return this;
  }
  /**
   * **BETA** Saturation component of the HSL color space.
   */
  public On_BrandEssentialsHslColorValue saturation() {
    _add_field("saturation");
    return this;
  }
  /**
   * **BETA** Lightness component of the HSL color space.
   */
  public On_BrandEssentialsHslColorValue lightness() {
    _add_field("lightness");
    return this;
  }
}
