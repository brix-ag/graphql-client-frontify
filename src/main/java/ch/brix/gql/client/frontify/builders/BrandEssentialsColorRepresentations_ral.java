package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorRepresentations_ral extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.BrandEssentialsColorSystemRepresentation> {
  public BrandEssentialsColorRepresentations_ral() {
    super(new ch.brix.gql.client.Call<>("ral", "BrandEssentialsColorSystemRepresentation"));
  }
  public BrandEssentialsColorRepresentations_ral onBrandEssentialsColorSystemRepresentation(On_BrandEssentialsColorSystemRepresentation typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
