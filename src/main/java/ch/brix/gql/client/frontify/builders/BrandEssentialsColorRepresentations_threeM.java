package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_threeM extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_threeM() {
    super(new ch.brix.gql.client.Call<>("threeM", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_threeM onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
