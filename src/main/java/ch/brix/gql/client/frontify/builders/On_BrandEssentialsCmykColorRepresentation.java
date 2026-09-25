package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsCmykColorRepresentation extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsCmykColorRepresentation() {
    super(new ch.brix.gql.client.On("BrandEssentialsCmykColorRepresentation"));
  }
  /**
   * **BETA** The human readable name of the color representation.
   */
  public On_BrandEssentialsCmykColorRepresentation name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The value of the color representation.
   */
  public On_BrandEssentialsCmykColorRepresentation value(BrandEssentialsCmykColorRepresentation_value callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
