package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsHexColorRepresentation extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsHexColorRepresentation() {
    super(new ch.brix.gql.client.On("BrandEssentialsHexColorRepresentation"));
  }
  /**
   * **BETA** The human readable name of the color representation.
   */
  public On_BrandEssentialsHexColorRepresentation name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The value of the color representation, a hexadecimal color code in the uppercase form `#RRGGBB`, extended to `#RRGGBBAA` when the color is not fully opaque.
   */
  public On_BrandEssentialsHexColorRepresentation value() {
    _add_field("value");
    return this;
  }
}
