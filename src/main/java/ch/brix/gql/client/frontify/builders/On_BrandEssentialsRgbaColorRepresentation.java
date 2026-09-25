package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsRgbaColorRepresentation extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsRgbaColorRepresentation() {
    super(new ch.brix.gql.client.On("BrandEssentialsRgbaColorRepresentation"));
  }
  /**
   * **BETA** The human readable name of the color representation.
   */
  public On_BrandEssentialsRgbaColorRepresentation name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The value of the color representation.
   */
  public On_BrandEssentialsRgbaColorRepresentation value(BrandEssentialsRgbaColorRepresentation_value callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
