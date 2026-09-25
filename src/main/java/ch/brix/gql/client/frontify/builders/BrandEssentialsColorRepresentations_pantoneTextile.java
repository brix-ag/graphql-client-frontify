package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_pantoneTextile extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_pantoneTextile() {
    super(new ch.brix.gql.client.Call<>("pantoneTextile", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_pantoneTextile onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
