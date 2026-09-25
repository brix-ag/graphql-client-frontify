package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsHslColorRepresentation extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsHslColorRepresentation() {
    super(new ch.brix.gql.client.On("BrandEssentialsHslColorRepresentation"));
  }
  /**
   * **BETA** The human readable name of the color representation.
   */
  public On_BrandEssentialsHslColorRepresentation name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The value of the color representation.
   */
  public On_BrandEssentialsHslColorRepresentation value(BrandEssentialsHslColorRepresentation_value callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
