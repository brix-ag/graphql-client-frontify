package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_oracal extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_oracal() {
    super(new ch.brix.gql.client.Call<>("oracal", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_oracal onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
