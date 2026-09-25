package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_pantoneCoated extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_pantoneCoated() {
    super(new ch.brix.gql.client.Call<>("pantoneCoated", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_pantoneCoated onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
