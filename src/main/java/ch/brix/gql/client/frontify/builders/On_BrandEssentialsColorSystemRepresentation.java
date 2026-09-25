package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsColorSystemRepresentation extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsColorSystemRepresentation() {
    super(new ch.brix.gql.client.On("BrandEssentialsColorSystemRepresentation"));
  }
  /**
   * **BETA** The human readable name of the color representation.
   */
  public On_BrandEssentialsColorSystemRepresentation name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The value of the color representation, the name the color carries in the external color system as authored by the brand, for example `2955 C` or `RAL 5002`. The format is not enforced.
   */
  public On_BrandEssentialsColorSystemRepresentation value() {
    _add_field("value");
    return this;
  }
}
