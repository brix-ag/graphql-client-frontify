package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_cssVariable extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_cssVariable() {
    super(new ch.brix.gql.client.Call<>("cssVariable", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_cssVariable onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
