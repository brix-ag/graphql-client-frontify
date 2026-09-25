package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_hks extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_hks() {
    super(new ch.brix.gql.client.Call<>("hks", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_hks onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
