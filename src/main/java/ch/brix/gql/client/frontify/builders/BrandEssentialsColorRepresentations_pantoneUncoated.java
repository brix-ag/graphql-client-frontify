package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_pantoneUncoated extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_pantoneUncoated() {
    super(new ch.brix.gql.client.Call<>("pantoneUncoated", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_pantoneUncoated onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
