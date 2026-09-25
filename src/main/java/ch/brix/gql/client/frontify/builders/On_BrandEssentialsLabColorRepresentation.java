package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsLabColorRepresentation extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsLabColorRepresentation() {
    super(new ch.brix.gql.client.On("BrandEssentialsLabColorRepresentation"));
  }
  /**
   * **BETA** The human readable name of the color representation.
   */
  public On_BrandEssentialsLabColorRepresentation name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The value of the color representation.
   */
  public On_BrandEssentialsLabColorRepresentation value(BrandEssentialsLabColorRepresentation_value callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
