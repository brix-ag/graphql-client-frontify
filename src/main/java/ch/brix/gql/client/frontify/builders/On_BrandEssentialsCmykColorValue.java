package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsCmykColorValue extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsCmykColorValue() {
    super(new ch.brix.gql.client.On("BrandEssentialsCmykColorValue"));
  }
  /**
   * **BETA** Cyan component of the CMYK color space.
   */
  public On_BrandEssentialsCmykColorValue cyan() {
    _add_field("cyan");
    return this;
  }
  /**
   * **BETA** Magenta component of the CMYK color space.
   */
  public On_BrandEssentialsCmykColorValue magenta() {
    _add_field("magenta");
    return this;
  }
  /**
   * **BETA** Yellow component of the CMYK color space.
   */
  public On_BrandEssentialsCmykColorValue yellow() {
    _add_field("yellow");
    return this;
  }
  /**
   * **BETA** Black component of the CMYK color space.
   */
  public On_BrandEssentialsCmykColorValue black() {
    _add_field("black");
    return this;
  }
}
